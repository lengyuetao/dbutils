package com.tao.dbutils.thread;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class WebServerThread extends Thread{
	
	private Socket socket;
	
	public WebServerThread(Socket socket){
		this.socket=socket;
	}
	@Override
	public void run(){
		try {
			InputStreamReader input=new InputStreamReader(socket.getInputStream());
			char[] bs=new char[2048];
			PrintStream out=new PrintStream(socket.getOutputStream());
			StringBuilder msg=new StringBuilder();
			socket.setSoTimeout(5000);
			int len=-1;
			
			while((len=input.read(bs))!=-1){
				msg.append(bs,0,len);
				msg.append("\n");
			}
			 out.println("HTTP/1.1 200 OK");  
			 out.println("Content-Type:text/html;charset:GBK");  
			 out.println();  
			 out.println("<HTML><BODY>"  
			               + "<center>"  
			               + "<H1>HTTPЭ����Է�����,��ǰʱ�䣺"  
			               + new java.util.Date()  
			               + "</h1>"  
			               + "<form method='get'>username:<input type='text' name='username'/>password:<input type='text' name='password'/><input type='submit' value='GET����'/></form><br/>"  
			               + "<form method='post'>username:<input type='text' name='username'/>password:<input type='text' name='password'/><input type='submit' value='POST����'/></form><br/>"  
			               + "<form method='post'  enctype='multipart/form-data'>phototitle:<input type='text' name='phototitle'/>photo:<input type='file' name='photo'/><input type='submit' value='Upload����'/></form>"  
			            + "</center>���ύ����������:<pre>" + msg.toString() + "</pre></BODY></HTML>");  
			 out.flush();  
			 out.close();  
			 input.close();  
			 System.out.println("close");  
			 // �ر�����  
			 socket.close();  

			 out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
