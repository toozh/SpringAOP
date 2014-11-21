package com.hskj.zhangtao.services;

import org.springframework.stereotype.Service;


@Service
public class AopTestServicesImpl  implements AopTestServices{

	public String printAop(){
		System.out.println("printAop");
		return "printAop";
	}

	@Override
	public String add() {
		String result = "5+6";
		System.out.println(result);
		return result;
	}

}
