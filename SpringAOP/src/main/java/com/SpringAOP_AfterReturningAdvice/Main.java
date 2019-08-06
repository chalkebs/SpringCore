package com.SpringAOP_AfterReturningAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_AfterReturningAdvice.xml");

		User u = (User) context.getBean("simpleServiceProxy");

		System.out.println("*********************");
		u.printUsername();
		System.out.println("*********************");
		u.printPassword();
		System.out.println("*********************");
		
		try
		{
			u.printThrowException();
		} 
		catch (Exception e) 
		{

		}

	}
}
