package com.tao.dbutils.back.controller;


import java.util.List;
import java.util.TreeMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tao.dbutils.back.entity.User;
import com.tao.dbutils.back.service.UserService;
import com.tao.dbutils.back.service.impl.UserServiceImpl;
import com.tao.utils.DataTablesPojo;
import com.tao.utils.PageHelper;

@SuppressWarnings("all")
@Controller
public class UserController {
	private static final Logger log=Logger.getLogger(UserController.class);
	private static UserService service=new UserServiceImpl();
	
	@RequestMapping(value = "/back/user/list",produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String  list(
			@RequestParam(value="startTime",required=false)String startTime,
			@RequestParam(value="endTime",required=false)String endTime,
			@RequestParam(value="userName",required=false)String userName,
			@RequestParam(value = "sEcho", required = true) Integer sEcho,
			@RequestParam(value = "start", required = true) Integer start,
			@RequestParam(value = "limit", required = true) Integer limit){
		log.error("用户列表");
		String userNames=userName;
		StringBuilder sql=new StringBuilder("select * from UserAccount where 1=1");
		TreeMap<String,String> map=new TreeMap<>();
		if(startTime!=null&&!"".equals(startTime)){
			sql.append(" and addTime>=? ");
			map.put("startTime",startTime+" 00:00:00");
		}
		if(endTime!=null&&!"".equals(endTime)){
			sql.append(" and addTime<=? ");
			map.put("endTime",endTime+" 23:59:59");
		}
		if(userNames!=null&&!"".equals(userNames)){
			sql.append(" and userName=? ");
			map.put("userName",userNames);
		}
		PageHelper<User> page;
		if(map.size()>0){
			Object[] params=new Object[map.size()];
			int i=0;
			for (String key:map.keySet()){
				params[i]=map.get(key);
				i++;
			}
			page=service.getPageList(sql.toString(),User.class,start,limit,params);
		}else{
			page=service.getPageList(sql.toString(),User.class,start,limit,null);
		}
		List<User> list=page.getList();
		JSONArray json=new JSONArray();
		for (User user : list) {
			JSONArray jst=new JSONArray();
			jst.add(user.getU_id());
			jst.add(user.getR_id());
			jst.add(user.getUserName());
			jst.add(user.getPwd());
			jst.add(user.getPhone());
			jst.add(user.getEmail());
			jst.add(user.getStatus());
			jst.add(user.getAddTime().toString());
			String operate="<a style=\"text-decoration:none\" onClick=\"admin_stop(this,'10001')\" href=\"javascript:;\" title=\"停用\">"
								+ "<i class=\"Hui-iconfont\">&#xe631;</i>"
							+ "</a> "
							+ "<a title=\"编辑\" href=\"javascript:;\" onclick=\"admin_edit('管理员编辑','admin-add.jsp','1','800','500')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6df;</i>"
							+ "</a> <a title=\"删除\" href=\"javascript:;\" onclick=\"admin_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a>";
			jst.add(operate);
			json.add(jst);
		}
		DataTablesPojo dataTablesPojo = new DataTablesPojo(sEcho,
				page.getTotalCount(), page.getTotalCount(),
				json);
		return JSONObject.fromObject(dataTablesPojo).toString();
	}

	@RequestMapping(value="/back/user/edit")
	public  String edit(){
		return  "";
	}

}
