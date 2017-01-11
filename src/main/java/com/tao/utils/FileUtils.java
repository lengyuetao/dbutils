package com.tao.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class FileUtils {
	public static void main(String[] args) {
			getResource(null);
			
		}
	public static void readFile(){
		File file=new File("G:\\dogame.sql");
		InputStream input;
		byte[] bytes=new byte[1024];
		try {
			input = new FileInputStream(file);
			input.read(bytes);
			input.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void getResource(String  urlPath){
		File file=new File("C:\\Users\\jason\\Desktop\\tao");
		if(!file.exists()){
			file.mkdir();
		}
		FileOutputStream output;
		try {
			URL url=new URL("http://info.dodonew.com/leftclient/upload/sogo2zp.exe");
			System.out.println(url.getFile().substring(url.getFile().lastIndexOf("/")+1, url.getFile().length()));
			String fileName=url.getFile().substring(url.getFile().lastIndexOf("/")+1, url.getFile().length());
			output = new FileOutputStream(file+"\\"+fileName);
			int size=0;
			
			HttpURLConnection  connection =(HttpURLConnection)url.openConnection();
			BufferedInputStream bis = new BufferedInputStream(connection.getInputStream());
			while((size=bis.read())!=-1){
				output.write(size);
			}
			output.close();
			connection.disconnect();
			System.out.println("****");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
