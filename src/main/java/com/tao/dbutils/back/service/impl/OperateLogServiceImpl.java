package com.tao.dbutils.back.service.impl;

import java.util.List;

import com.tao.dbutils.abstracts.Action;
import com.tao.dbutils.back.entity.OperateLog;
import com.tao.dbutils.back.service.OperateLogService;
import com.tao.utils.PageHelper;

public class OperateLogServiceImpl extends Action<OperateLog> implements
		OperateLogService {

	@Override
	public boolean add(String sql, Object... params) {
		return service.add(sql, params);
	}

	@Override
	public boolean update(Long id) {
		return  service.update("delete from OperateLog where op_id=?;", new Object[]{id});
	}

	@Override
	public List<OperateLog> getList(String sql, Class<OperateLog> c,
			Object[] params) {
		return service.getList(sql,c,params);
	}

	@Override
	public PageHelper<OperateLog> getPageList(String sql, Class<OperateLog> c,
			int pageNo, int pageSize, Object[] params) {
		return service.getPageList(sql, c, pageNo, pageSize, params);
	}

}
