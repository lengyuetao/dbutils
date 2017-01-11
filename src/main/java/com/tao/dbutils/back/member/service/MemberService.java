package com.tao.dbutils.back.member.service;

import com.tao.dbutils.back.entity.Member;
import com.tao.utils.PageHelper;

import java.util.List;

public interface MemberService {
	
	public boolean add(String sql, Object... params);
	
	public boolean delete(Long id);

	public boolean update(String sql,Object... params);
	
	public List<Member> getList(String sql, Class<Member> c, Object[] params);
	
	public PageHelper<Member> getPageList(String sql, Class<Member> c, int pageNo, int pageSize, Object[] params);
	
}
