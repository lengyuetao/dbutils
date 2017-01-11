package com.tao.dbutils.wx.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tao.dbutils.secrity.SafeUtils;


@WebServlet("/wx")
public class WxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public WxServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("wx request connect");
		String token="180e0621c2d046eb9b08e850a943d3ee";
		String wx_token=token;
		String signature=request.getParameter("signature");
		String timestamp=request.getParameter("timestamp");
		String nonce=request.getParameter("nonce");
		String echostr=request.getParameter("echostr");
		
		String sign="";
		try {
			sign = SafeUtils.getSHA1(wx_token, timestamp, nonce);
			System.out.println("sign:"+sign);
			System.out.println("signature:"+signature);
			if(sign.equals(signature)){
				response.getWriter().print(echostr);
			}else{
				response.getWriter().print(0);
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			response.getWriter().print(0);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
