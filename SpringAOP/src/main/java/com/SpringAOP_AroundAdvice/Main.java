package com.SpringAOP_AroundAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_AroundMethod.xml");

		User u = (User) context.getBean("sampleServiceProxy");

		System.out.println("*********************");
		u.printUsername();
		System.out.println("*********************");
		u.printPassword();
		System.out.println("*********************");

	}
}
