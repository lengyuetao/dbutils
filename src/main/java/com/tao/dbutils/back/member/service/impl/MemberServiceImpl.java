package com.tao.dbutils.back.member.service.impl;

import com.tao.dbutils.abstracts.Action;
import com.tao.dbutils.back.entity.Member;
import com.tao.dbutils.back.member.service.MemberService;
import com.tao.utils.PageHelper;

import java.util.List;

/**
 * Created by zhangantao on 2016/10/13.
 */
public class MemberServiceImpl extends Action<Member> implements MemberService {

    @Override
    public boolean add(String sql, Object... params) {
        return service.add(sql,params);
    }

    @Override
    public boolean delete(Long id) {
        return  service.update("update Member set status=0  where id=?;", new Object[]{id});
    }

    @Override
    public List<Member> getList(String sql, Class<Member> c, Object[] params) {
        return service.getList(sql,c,params);
    }

    @Override
    public PageHelper<Member> getPageList(String sql, Class<Member> c, int pageNo, int pageSize, Object[] params) {
        return service.getPageList(sql, c, pageNo, pageSize, params);
    }

    @Override
    public boolean update(String sql, Object... params) {
        return service.update(sql,params);
    }
}
