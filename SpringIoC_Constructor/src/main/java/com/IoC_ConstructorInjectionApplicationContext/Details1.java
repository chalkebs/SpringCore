package com.IoC_ConstructorInjectionApplicationContext;

public class Details1 
{
	private String user;
	private String password;
	private String email_id;
	
	public Details1(String u, String p, String e)
	{
		this.user = u;
		this.password = p;
		this.email_id = e;
	}

	public void getDetails() 
	{
		System.out.println("...Details...");
		System.out.println("User : "+user);
		System.out.println("Password : "+password);
		System.out.println("Email_id : "+email_id);
	}
}
