package com.SpringAOP_BeforeAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_BeforeAdvice.xml");

		User u = (User) context.getBean("customerServiceProxy");

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
