package com.IoC_SetterInjectionApplicationContext;

public class Details1 
{
	private String user;
	private String password;
	private String email_id;
	
	public String getUser() 
	{
		return user;
	}
	public void setUser(String user) 
	{
		this.user = user;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getEmail_id()
	{
		return email_id;
	}
	public void setEmail_id(String email_id) 
	{
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
