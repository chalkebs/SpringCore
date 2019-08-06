package com.annotationBasedConfig_required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User u = (User) context.getBean("user");
		System.out.println("Username : " + u.getUsername());
		System.out.println("Password : " + u.getPassword());
	}
}
