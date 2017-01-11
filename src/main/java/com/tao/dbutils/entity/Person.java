package com.tao.dbutils.entity;

import java.net.URL;
import java.util.Date;

public class Person {
	private long id;
	private String name;
	private String pwd;
	private String address;
	private String phone;
	private Date addTime;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public static void main(String[] args) {
		System.out.println("***");
		Person p=new Person();
		System.out.println(p.getClass().getResource("tao.txt"));
		URL url=p.getClass().getResource("");
		System.out.println(url.getPath());
		System.out.println(url.getFile());
	}
}
