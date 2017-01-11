package com.tao.dbutils.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileTest {
	public static void main(String[] args) {
		File file=new File("G:\\tao.txt");
		
		try {
			FileOutputStream output=new FileOutputStream(file);
			FileChannel channel=output.getChannel();
			ByteBuffer buffer=ByteBuffer.allocate(1024);
			String str="java nio";
			buffer.put(str.getBytes());
			buffer.flip();
			channel.write(buffer);
			channel.close();
			output.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
