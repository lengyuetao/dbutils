package com.tao.dbutils.back.member.controller;


import com.tao.dbutils.back.entity.Member;
import com.tao.dbutils.back.entity.User;
import com.tao.dbutils.back.member.service.MemberService;
import com.tao.dbutils.back.member.service.impl.MemberServiceImpl;
import com.tao.dbutils.back.service.UserService;
import com.tao.dbutils.back.service.impl.UserServiceImpl;
import com.tao.utils.DataTablesPojo;
import com.tao.utils.PageHelper;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {
	private static final Logger log=Logger.getLogger(MemberController.class);
	private static MemberService service=new MemberServiceImpl();
	
	@RequestMapping(value = "/back/member/list",produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String  list(
			@RequestParam(value="startTime",required=false)String startTime,
			@RequestParam(value="endTime",required=false)String endTime,
			@RequestParam(value="userName",required=false)String userName,
			@RequestParam(value = "sEcho", required = true) Integer sEcho,
			@RequestParam(value = "start", required = true) Integer start,
			@RequestParam(value = "limit", required = true) Integer limit){
		log.error("会员列表");
		PageHelper<Member> page=service.getPageList("select * from Member",Member.class,start,limit,null);
		List<Member> list=page.getList();
		JSONArray json=new JSONArray();
		for (Member member : list) {
			JSONArray jst=new JSONArray();
			jst.add(member.getId());
			jst.add(member.getMemberName());
			jst.add(member.getSex());
			jst.add(member.getPhone());
			jst.add(member.getEmail());
			jst.add(member.getAddress());
			jst.add(member.getStatus());
			jst.add(member.getAddTime().toString());
			String operate="<a style=\"text-decoration:none\" onClick=\"member_stop(this,'10001')\" href=\"javascript:;\" " +
					"title=\"停用\"><i class=\"Hui-iconfont\">&#xe631;</i></a> <a title=\"编辑\" href=\"javascript:;\" " +
					"onclick=\"member_edit('编辑','member-add.html','4','','510')\" class=\"ml-5\" style=\"text-decoration:none\">" +
					"<i class=\"Hui-iconfont\">&#xe6df;</i></a> <a style=\"text-decoration:none\" class=\"ml-5\" " +
					"onClick=\"change_password('修改密码','change-password.html','10001','600','270')\" href=\"javascript:;\" " +
					"title=\"修改密码\"><i class=\"Hui-iconfont\">&#xe63f;</i></a> <a title=\"删除\" href=\"javascript:;\" " +
					"onclick=\"member_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a>";
			jst.add(operate);
			json.add(jst);
		}
		DataTablesPojo dataTablesPojo = new DataTablesPojo(sEcho,
				page.getTotalCount(), page.getTotalCount(),
				json);
		return JSONObject.fromObject(dataTablesPojo).toString();
	}

	@RequestMapping(value="/back/member/edit")
	public  String edit(){



		return  "";
	}

}
