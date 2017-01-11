package com.tao.dbutils.service.impl;

import java.util.List;

import com.tao.dbutils.abstracts.Action;
import com.tao.dbutils.entity.Person;
import com.tao.dbutils.service.PersonService;
import com.tao.utils.PageHelper;

public class PersonServiceImpl extends Action<Person> implements PersonService {
	@Override
	public boolean add(String sql,Object... params) {
		return service.add(sql, params);
	}

	@Override
	public boolean delete(Long id) {
		return service.update("delete from person where id=?;", new Object[]{id});
	}

	@Override
	public List<Person> getList(String sql,Class<Person> c,Object[] params) {
		return service.getList(sql,c,params);
	}

	@Override
	public PageHelper<Person> getPageList(String sql, Class<Person> c,int pageNo,int pageSize,
			Object[] params) {
		return service.getPageList(sql, c, pageNo, pageSize, params);
	}

}
