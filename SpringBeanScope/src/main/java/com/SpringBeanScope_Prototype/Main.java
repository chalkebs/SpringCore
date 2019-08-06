package com.SpringBeanScope_Prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_prototype.xml");

		Message m1 = (Message)context.getBean("message");
		m1.setMessage("Message by A");
		System.out.println("Message : " + m1.getMessage());
		    	
		//retrieve it again
		Message m2 = (Message)context.getBean("message");
		System.out.println("Message : " + m2.getMessage());
	}
}
