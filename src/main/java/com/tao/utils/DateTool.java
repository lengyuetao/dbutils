package com.tao.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 日期工具类
 * @author jason
 *
 */
public class DateTool {
	/**
	 * 获取当前时间
	 * @return
	 */
	public static String getCurrentTime(){
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime=formatter.format(date);
		return currentTime;
	}
	/**
	 * 获取格式化的当前时间
	 * @param dateType
	 * @return
	 */
	public static String getFormatCurrentTime(String dateType){
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat(dateType);
		String currentTime=formatter.format(date);
		return currentTime;
	}
	
	public static void main(String[] args) {
		System.out.println("****"+getFormatCurrentTime("yyyy/MM/dd hh:mm:ss"));
	}
	
}
