package com.tao.dbutils.repository;

import java.util.List;

import com.tao.utils.PageHelper;
public interface BaseRepository<T> {
	
	public boolean add(String sql,Object[] params);
	
	public boolean update(String sql,Object[] params);
	
	public List<T> getList(String sql,Class<T> c,Object[] params);
	
	public PageHelper<T> getPageList(String sql,Class<T> c,int pageNo,int pageSize,Object[] params);
}
