package com.tao.utils;

import java.util.List;

public class PageHelper<T>{
	
	private int pageNo;//下一页
	
	private int pageCurrent;//当前页
	
	private int totalCount;//总条数
	
	private int pageSize;//每页大小
	
	private int pageCount;//总页数
	
	private List<T> list;//记录

	public int getPageNo() {
		if(pageNo<=0){
			return 1;
		}else{
			return pageNo>pageCount?pageCount:pageNo;  
		}
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageCurrent() {
		return pageCurrent;
	}

	public void setPageCurrent(int pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		resetPageNo();
		return pageCount;
	}

	public void resetPageNo() {
		pageNo=pageCount+1;
		pageCount=totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	
}
