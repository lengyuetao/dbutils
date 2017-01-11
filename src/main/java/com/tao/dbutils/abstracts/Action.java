package com.tao.dbutils.abstracts;

import com.tao.dbutils.repository.BaseRepositoryImpl;

public abstract class Action<T>{
	 public  BaseRepositoryImpl<T> service=new BaseRepositoryImpl<T>();
}
