package com.IoC_ConstructorInjectionBeanFactory;

public class Details 
{
	private String user;
	private String password;
	private String email_id;
	
	public Details(String user, String password, String email_id)
	{
		this.user = user;
		this.password = password;
		this.email_id = email_id;
	}
	
	public void getDetails()
	{
		System.out.println("...Details...");
		System.out.println("User : "+user);
		System.out.println("Password : "+password);
		System.out.println("Email_id : "+email_id);
	}
}
