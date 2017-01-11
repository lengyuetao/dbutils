package com.tao.dbutils.service;

import java.util.List;

import com.tao.dbutils.entity.Person;
import com.tao.utils.PageHelper;

public interface PersonService {
	public boolean add(String sql,Object... params);
	
	public boolean delete(Long id);
	
	public List<Person> getList(String sql,Class<Person> c,Object[] params);
	
	public PageHelper<Person> getPageList(String sql,Class<Person> c,int pageNo,int pageSize,Object[] params);
}
