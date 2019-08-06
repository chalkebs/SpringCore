package com.beanLifeCycle_init_destroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("init_destroy.xml");
			
		Customer cust = (Customer)context.getBean("customer");
		    	
		System.out.println(cust.hashCode());
		    	
		context.close();
	}
}
