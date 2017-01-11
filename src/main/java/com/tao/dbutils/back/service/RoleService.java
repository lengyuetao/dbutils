package com.tao.dbutils.back.service;

import java.util.List;

import com.tao.dbutils.back.entity.Role;
import com.tao.utils.PageHelper;

public interface RoleService{
	public boolean add(String sql,Object... params);
	
	public boolean update(Long id);
	
	public List<Role> getList(String sql,Class<Role> c,Object[] params);
	
	public PageHelper<Role> getPageList(String sql,Class<Role> c,int pageNo,int pageSize,Object[] params);
}
