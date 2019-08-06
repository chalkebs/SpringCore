package com.SpringAOP_AfterReturningAdvice;

public class User 
{
	private String username;
	private String password;

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public void printUsername() 
	{
		System.out.println("Username : " + this.username);
	}

	public void printPassword() 
	{
		System.out.println("Password : " + this.password);
	}

	public void printThrowException() 
	{
		throw new IllegalArgumentException();
	}

}
