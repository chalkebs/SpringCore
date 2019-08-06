package com.annotationBasedConfig_qualifire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile 
{
	@Autowired
    @Qualifier("user1")
    private User u;
    
	public Profile()
	{
          System.out.println("Inside Profile constructor.");
	}
	
	public void printUsername() 
	{
		System.out.println("Username : " + u.getUsername() );
	}
	
	public void printPassword() 
	{
		System.out.println("Password : " + u.getPassword() );
	}
}
