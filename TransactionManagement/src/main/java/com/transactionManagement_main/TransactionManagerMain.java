package com.transactionManagement_main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transactionManagement_model.Address;
import com.transactionManagement_model.Customer;
import com.transactionManagement_service.CustomerManager;

public class TransactionManagerMain 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		CustomerManager customerManager = (CustomerManager)ctx.getBean("customerManager");

		Customer cust = createDummyCustomer();
		customerManager.createCustomer(cust);

		ctx.close();
	}

	private static Customer createDummyCustomer() 
	{
		Customer customer = new Customer();	
		System.out.print("Enter your Name : ");
		customer.setName(s.next());
		
		Address address = new Address();
		System.out.print("\nEnter your Country : ");
		address.setCountry(s.next());
		
		// setting value more than 20 chars, so that SQLException occurs
		System.out.print("\nEnter your Address : ");
		address.setAddress(s.next());
		customer.setAddress(address);
		
		return customer;
	}
}

