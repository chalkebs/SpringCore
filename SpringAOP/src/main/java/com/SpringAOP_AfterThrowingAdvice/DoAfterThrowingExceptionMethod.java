package com.SpringAOP_AfterThrowingAdvice;

import org.springframework.aop.ThrowsAdvice;

public class DoAfterThrowingExceptionMethod implements ThrowsAdvice 
{
    public void afterThrowing(IllegalArgumentException e) throws Throwable 
    {
    	System.out.println("After Throwing Exception Method() called");
    }
}