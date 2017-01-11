package com.tao.dbutils.back.service;

import java.util.List;

import com.tao.dbutils.back.entity.Module;
import com.tao.utils.PageHelper;

public interface ModuleService {
	public boolean add(String sql,Object... params);
	
	public boolean update(Long id);
	
	public List<Module> getList(String sql,Class<Module> c,Object[] params);
	
	public PageHelper<Module> getPageList(String sql,Class<Module> c,int pageNo,int pageSize,Object[] params);

}
