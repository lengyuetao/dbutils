package com.tao.dbutils.back.service.impl;

import java.util.List;

import com.tao.dbutils.abstracts.Action;
import com.tao.dbutils.back.entity.Resource;
import com.tao.dbutils.back.service.ResourceService;
import com.tao.utils.PageHelper;

public class ResourceServiceImpl extends Action<Resource> implements ResourceService {

	@Override
	public boolean add(String sql, Object... params) {
		return service.add(sql, params);
	}

	@Override
	public boolean update(Long id) {
		return  service.update("delete from Resource where res_id=?;", new Object[]{id});
	}

	@Override
	public List<Resource> getList(String sql, Class<Resource> c, Object[] params) {
		return service.getList(sql,c,params);
	}

	@Override
	public PageHelper<Resource> getPageList(String sql, Class<Resource> c,
			int pageNo, int pageSize, Object[] params) {
		return service.getPageList(sql, c, pageNo, pageSize, params);
	}

}
