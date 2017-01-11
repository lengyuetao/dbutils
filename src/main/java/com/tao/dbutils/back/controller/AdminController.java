package com.tao.dbutils.back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping("/back/main")
	public String main(){
		return "/back/main";
	}
}
