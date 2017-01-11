package com.tao.utils;

import java.util.Locale;
import java.util.ResourceBundle;
/**
 * 系统配置文件读取�?
 * @author jason
 *
 */
public class ConfigFileReader {
	private static ResourceBundle bundle = null;
	static {
		bundle = ResourceBundle.getBundle("SysConfig", Locale.getDefault());    
	}
	/**
	 * 通过key读取value
	 * @param key
	 * @return
	 */
	public static String getKey(String key){
		return bundle.getString(key);
	}
	public static void main(String[] args) {
		System.out.println(ConfigFileReader.getKey("url"));
	}
}
