package com.SpringAOP_BasicAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean_BasicAnnotations.xml");
		
		Customer customer = (Customer) context.getBean("customer");
		
		//@Before
		customer.addCustomer();
		
		//@After
		customer.addCustomer1();
		
		//@AfterReturning
		customer.addCustomerReturnValue();
		
		//@AfterThrowing
		try 
		{
			customer.addCustomerThrowException();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		//@Around
		customer.addCustomerAround("salina");
	}
}
