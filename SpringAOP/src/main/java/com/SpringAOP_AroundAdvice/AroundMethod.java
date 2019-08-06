package com.SpringAOP_AroundAdvice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundMethod implements MethodInterceptor 
{
    public Object invoke(MethodInvocation methodInvocation) throws Throwable 
    {
       
    	System.out.println("Method name : "
				+ methodInvocation.getMethod().getName());
		System.out.println("Method arguments : "
				+ Arrays.toString(methodInvocation.getArguments()));

		System.out.println("AroundMethod : Before method execution");

		try {
			Object result = methodInvocation.proceed();
			System.out.println("AroundMethod : Before after execution");

			return result;

		} catch (IllegalArgumentException e) {

			System.out.println("AroundMethod : Throw exception");
			throw e;
		}
    }

}