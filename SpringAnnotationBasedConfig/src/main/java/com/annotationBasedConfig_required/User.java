package com.annotationBasedConfig_required;

import org.springframework.beans.factory.annotation.Required;

public class User 
{
	private String username;
	private String password;
	
	public String getUsername() 
	{
		return username;
	}
	@Required
	public void setUsername(String u) 
	{
		this.username = u;
	}
	
	public String getPassword() 
	{
		return password;
	}
	@Required
	public void setPassword(String p) 
	{
		this.password = p;
	}
}
