package com.tao.dbutils.back.service.impl;

import java.util.List;

import com.tao.dbutils.abstracts.Action;
import com.tao.dbutils.back.entity.User;
import com.tao.dbutils.back.service.UserService;
import com.tao.utils.PageHelper;

public class UserServiceImpl extends Action<User> implements UserService {
	 
	@Override
	public boolean add(String sql, Object... params) {
		return service.add(sql, params);
	}

	@Override
	public boolean update(Long id) {
		return  service.update("delete from UserAccount where u_id=?;", new Object[]{id});
	}

	@Override
	public List<User> getList(String sql, Class<User> c, Object[] params) {
		return service.getList(sql,c,params);
	}

	@Override
	public PageHelper<User> getPageList(String sql, Class<User> c, int pageNo,
			int pageSize, Object[] params) {
		return service.getPageList(sql, c, pageNo, pageSize, params);
	}

}
