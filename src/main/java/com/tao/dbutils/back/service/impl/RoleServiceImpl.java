package com.tao.dbutils.back.service.impl;

import java.util.List;

import com.tao.dbutils.abstracts.Action;
import com.tao.dbutils.back.entity.Role;
import com.tao.dbutils.back.service.RoleService;
import com.tao.utils.PageHelper;

public class RoleServiceImpl extends Action<Role> implements RoleService {

	@Override
	public boolean add(String sql, Object... params) {
		return service.add(sql, params);
	}

	@Override
	public boolean update(Long id) {
		return  service.update("delete from Role where r_id=?;", new Object[]{id});
	}
	@Override
	public List<Role> getList(String sql, Class<Role> c, Object[] params) {
		return service.getList(sql,c,params);
	}

	@Override
	public PageHelper<Role> getPageList(String sql, Class<Role> c, int pageNo,
			int pageSize, Object[] params) {
		return service.getPageList(sql, c, pageNo, pageSize, params);
	}

}
