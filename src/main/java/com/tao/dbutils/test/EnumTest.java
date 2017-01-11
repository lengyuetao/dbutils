package com.tao.dbutils.test;

import com.tao.dbutils.enums.ColorTypes;
import com.tao.dbutils.enums.ShowType;

public class EnumTest {
	public static void main(String[] args) {
		System.out.println(ShowType.left);
		System.out.println(ColorTypes.white);
		System.out.println(ColorTypes.red.getName()+":"+ColorTypes.red.getIndex());
		System.out.println();
	}
}
