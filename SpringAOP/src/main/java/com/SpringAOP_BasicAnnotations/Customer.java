package com.SpringAOP_BasicAnnotations;

public interface Customer 
{
	void addCustomer();
	
	String addCustomerReturnValue();
	
	void addCustomerThrowException() throws Exception;
	
	void addCustomerAround(String name);

	void addCustomer1();
}
