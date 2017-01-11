package com.tao.dbutils.enums;

public enum ColorTypes {
	red("红色",1),yellow("黄色",2),blank("黑色",3),white("白色",4);
	
	private String name;
	private int index;
	
	ColorTypes(String name,int index){
		this.name=name;
		this.index=index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	@Override
	public String toString(){
		return String.valueOf(this.name+":"+this.index);
	}
}
