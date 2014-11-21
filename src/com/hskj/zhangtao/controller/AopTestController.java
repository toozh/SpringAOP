package com.hskj.zhangtao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hskj.zhangtao.services.AopTestServices;

@Controller
public class AopTestController {
	@Autowired
	private AopTestServices aopTestServices;
	
	@RequestMapping("test.do")
	public String test(){
		aopTestServices.printAop();
		aopTestServices.add();
		return "index";
	}
	
}
