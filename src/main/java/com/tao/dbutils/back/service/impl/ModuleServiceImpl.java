package com.tao.dbutils.back.service.impl;

import java.util.List;

import com.tao.dbutils.abstracts.Action;
import com.tao.dbutils.back.entity.Module;
import com.tao.dbutils.back.service.ModuleService;
import com.tao.utils.PageHelper;

public class ModuleServiceImpl extends Action<Module> implements ModuleService {

	@Override
	public boolean add(String sql, Object... params) {
		return service.add(sql, params);
	}

	@Override
	public boolean update(Long id) {
		return  service.update("delete from Module where m_id=?;", new Object[]{id});
	}

	@Override
	public List<Module> getList(String sql, Class<Module> c, Object[] params) {
		return service.getList(sql,c,params);
	}

	@Override
	public PageHelper<Module> getPageList(String sql, Class<Module> c,
			int pageNo, int pageSize, Object[] params) {
		return service.getPageList(sql, c, pageNo, pageSize, params);
	}

}
