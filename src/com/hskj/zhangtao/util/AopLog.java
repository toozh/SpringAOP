package com.hskj.zhangtao.util;



/** 
 * XML ���÷�ʽ
 * ���������ļ���AOP��־ʾ�� 
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