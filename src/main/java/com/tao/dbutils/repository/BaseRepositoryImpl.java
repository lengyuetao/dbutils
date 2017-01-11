package com.tao.dbutils.repository;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.tao.utils.C3p0Utils;
import com.tao.utils.PageHelper;
public class BaseRepositoryImpl<T> implements BaseRepository<T> {
	private QueryRunner query;

	@Override
	public boolean add(String sql, Object[] params) {
		query=new QueryRunner(C3p0Utils.getDataSource());
		try {
			return query.update(sql, params)>0?true:false;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean update(String sql, Object[] params) {
		query=new QueryRunner(C3p0Utils.getDataSource());
		try {
			return query.update(sql, params)>0?true:false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public  List<T> getList(String sql,Class<T> c,Object[] params) {
		query=new QueryRunner(C3p0Utils.getDataSource());
		try {
			return query.query(sql,new BeanListHandler<T>(c), params);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public PageHelper<T> getPageList(String sql, Class<T> c,int pageNo,int pageSize,Object[] params) {
		query=new QueryRunner(C3p0Utils.getDataSource());
		try {
			PageHelper<T> pageHelper=new PageHelper<T>();
			int currentPage=pageNo>0?pageNo:0;
			pageHelper.setPageCurrent(currentPage);
			pageHelper.setPageSize(pageSize);
			List<T> list=query.query(sql, new BeanListHandler<T>(c), params);
			pageHelper.setTotalCount(list.size());
			sql+=" limit "+pageNo+","+pageSize;
			pageHelper.setList(query.query(sql, new BeanListHandler<T>(c),params));
			return pageHelper;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
