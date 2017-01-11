package com.tao.dbutils.back.service;

import java.util.List;

import com.tao.dbutils.back.entity.OperateLog;
import com.tao.utils.PageHelper;

public interface OperateLogService {
	public boolean add(String sql,Object... params);
	
	public boolean update(Long id);
	
	public List<OperateLog> getList(String sql,Class<OperateLog> c,Object[] params);
	
	public PageHelper<OperateLog> getPageList(String sql,Class<OperateLog> c,int pageNo,int pageSize,Object[] params);
}
