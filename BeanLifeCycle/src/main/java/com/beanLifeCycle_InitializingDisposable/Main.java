package com.beanLifeCycle_InitializingDisposable;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("InitializingDisposable.xml");
		
		Customer cust = (Customer)context.getBean("customer");
	    	
	    System.out.println(cust.hashCode());
	    
	    context.close();
	}
}
