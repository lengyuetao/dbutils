package com.tao.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Logger {
	
	/**
	 * 向控制台输出日志
	 * @param str
	 */
	public static  void  debug(String str){
		System.out.println("["+DateTool.getCurrentTime()+"]:"+str);
	}
	
	/**
	 * 读取日志输出到控制台
	 */
	public static void logReader(){
		FileReader r;
		try {
				r = new FileReader("d://file//log//20150326.txt");
				BufferedReader re=new BufferedReader(r);
				String tempString = null;
				int line = 1;
				while((tempString = re.readLine()) != null){
					System.out.println("line " + line + ": " + tempString);
	                line++;
				}
				re.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 将日志保存到指定的路径下
	 * @param strInfo
	 */
	public static void saveLog(String strInfo){
		try {
			File file=new File(ConfigFileReader.getKey("logurl"));
			if(!file.exists()){
				file.mkdir();
			}
			RandomAccessFile f=new RandomAccessFile(file+"//"+DateTool.getFormatCurrentTime("yyyyMMdd")+".txt","rw");
			f.seek(f.length());
			if(f.length()>0){
				f.writeBytes("\r");
			}
			f.writeBytes("\n["+DateTool.getCurrentTime()+"]"+strInfo);
			f.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 输出到指定目录下，会覆盖之前的内�?
	 */
	public static void writeLog(){
		try {
			FileWriter f=new FileWriter("d://a.txt");
			f.write("["+DateTool.getCurrentTime()+"]sdfsdf");
			f.flush();
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		logReader();
	}
}
