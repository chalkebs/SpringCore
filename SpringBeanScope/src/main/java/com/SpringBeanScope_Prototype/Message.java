package com.SpringBeanScope_Prototype;

/*import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
*/

/*
 * for declaring scope using annotation
 *  
 * @Service
 * @Scope("prototype")
*/

public class Message 
{
	private String message;
	
	public String getMessage() 
	{
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}
}
