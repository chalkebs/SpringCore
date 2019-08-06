package com.annotationBasedConfig_qualifire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		 ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
         Profile profile = (Profile) context.getBean("profile");
         profile.printUsername();
         profile.printPassword();
	}
}
