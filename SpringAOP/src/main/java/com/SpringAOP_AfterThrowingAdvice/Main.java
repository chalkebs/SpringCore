package com.SpringAOP_AfterThrowingAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_AfterThrowingAdvice.xml");

		User u = (User) context.getBean("simpleServiceProxy");

		try
		{
			u.printThrowException();
		} 
		catch (Exception e) 
		{

		}
		
		System.out.println("*********************");
		u.printUsername();
		System.out.println("*********************");
		u.printPassword();
		System.out.println("*********************");

	}
}
