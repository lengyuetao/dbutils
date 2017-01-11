package com.tao.dbutils.back.service;

import java.util.List;

import com.tao.dbutils.back.entity.User;
import com.tao.utils.PageHelper;

public interface UserService {
	
	public boolean add(String sql,Object... params);
	
	public boolean update(Long id);
	
	public List<User> getList(String sql,Class<User> c,Object[] params);
	
	public PageHelper<User> getPageList(String sql,Class<User> c,int pageNo,int pageSize,Object[] params);
	
}
