package com.IoC_SetterInjectionApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 
{
	public static void main(String[] args) 
	{
		//ApplicationContext
		//Read Configuration File
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean.xml files id
		Details1 d=(Details1)ac.getBean("details1");
		d.getDetails();
		
	}

}
