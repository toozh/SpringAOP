package com.hskj.zhangtao.util;



/** 
 * XML 配置方式
 * 基于配置文件的AOP日志示例 
 * 
 */  
public class AopLog {
	
    public void beforeMethod(){
    	System.out.println("the method begin ...");
    }
	
	public void afterMethod(){
		System.out.println("the method ends ...");
	}
      
}  