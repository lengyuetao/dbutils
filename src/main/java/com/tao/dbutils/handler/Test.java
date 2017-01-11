package com.tao.dbutils.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		Pepole t=new Teacher();
		InvocationHandler handler=new DemoHandler(t);
		Pepole p=(Pepole) Proxy.newProxyInstance(t.getClass().getClassLoader(),t.getClass().getInterfaces(),handler);
		p.speak();
		p.work();
	}
}
