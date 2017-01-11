package com.tao.dbutils.back.controller;

import com.tao.dbutils.back.entity.Role;
import com.tao.dbutils.back.service.RoleService;
import com.tao.dbutils.back.service.impl.RoleServiceImpl;
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
public class RoleController {
	private  static  final Logger log=Logger.getLogger(RoleController.class);

	@RequestMapping(value = "/back/role/list",produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String roleList(
//			@RequestParam(value="startTime",required=false)String startTime,
//		    @RequestParam(value="endTime",required=false)String endTime,
//		    @RequestParam(value="userName",required=false)String userName,
		    @RequestParam(value = "sEcho", required = true) Integer sEcho,
		    @RequestParam(value = "start", required = true) Integer start,
		    @RequestParam(value = "limit", required = true) Integer limit){
		log.info("进入角色列表");

		RoleService service=new RoleServiceImpl();
		PageHelper<Role> page=service.getPageList("select * from Role",Role.class,start,limit,null);
		List<Role> list=page.getList();
		JSONArray json=new JSONArray();
		for (Role role:list){
			JSONArray jst=new JSONArray();
			jst.add(role.getR_id());
			jst.add(role.getRoleName());
			jst.add(role.getAddTime().toString());
			String oprate="<td class=\"f-14\"><a title=\"编辑\" href=\"javascript:;\" " +
					"onclick=\"admin_role_edit('角色编辑','${contextPath}/back/admin/admin-role-add.jsp','4')\"" +
					" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6df;</i></a> <a title=\"删除\" " +
					"href=\"javascript:;\" onclick=\"admin_role_del(this,'1')\" class=\"ml-5\" " +
					"style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a>";
			jst.add(oprate);
			json.add(jst);
		}
		DataTablesPojo dataTablesPojo = new DataTablesPojo(sEcho,
				page.getTotalCount(), page.getTotalCount(),
				json);
		return JSONObject.fromObject(dataTablesPojo).toString();
	}
}
