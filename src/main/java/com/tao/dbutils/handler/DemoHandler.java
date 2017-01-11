package com.tao.dbutils.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DemoHandler implements InvocationHandler{
	
	private Object obj;
	
	public  DemoHandler(Object obj) {
		this.obj=obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("************");
		System.out.println("method:"+method);
		method.invoke(obj, args);
		System.out.println("------------");
		return null;
	}

}
