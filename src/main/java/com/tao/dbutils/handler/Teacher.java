package com.tao.dbutils.handler;

public class Teacher implements Pepole {

	@Override
	public void speak() {
		System.out.println("hello");
	}

	@Override
	public void work() {
		System.out.println("work");
	}

}
