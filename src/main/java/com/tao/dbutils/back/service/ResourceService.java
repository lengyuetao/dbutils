package com.tao.dbutils.back.service;

import java.util.List;

import com.tao.dbutils.back.entity.Resource;
import com.tao.utils.PageHelper;

public interface ResourceService {
	public boolean add(String sql,Object... params);
	
	public boolean update(Long id);
	
	public List<Resource> getList(String sql,Class<Resource> c,Object[] params);
	
	public PageHelper<Resource> getPageList(String sql,Class<Resource> c,int pageNo,int pageSize,Object[] params);
}
