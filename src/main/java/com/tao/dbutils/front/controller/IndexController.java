package com.tao.dbutils.front.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
	private final static Logger log=Logger.getLogger(IndexController.class);
	@RequestMapping("/index")
	public String toIndex(){
		log.error("进入首页");
		return "/front/blog";
	}
}
