package com.SpringAOP_BasicAnnotations;

public class CustomerImpl implements Customer
{
	public void addCustomer()
	{
		System.out.println("addCustomer() is running ");
		System.out.println("************************\n");
	}
	
	public void addCustomer1() 
	{
		System.out.println("\n************************");
		System.out.println("addCustomer1() is running ");
	}
	
	public String addCustomerReturnValue()
	{
		System.out.println("\n************************");
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}
	
	public void addCustomerThrowException() throws Exception 
	{
		System.out.println("\n************************");
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}
	
	public void addCustomerAround(String name)
	{
		System.out.println("addCustomerAround() is running, args : " + name);
	}

}
