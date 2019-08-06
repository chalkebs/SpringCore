package com.SpringAOP_BasicAnnotations;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;

@Aspect
public class Annotations 
{
		@Before("execution(* com.SpringAOP_BasicAnnotations.Customer.addCustomer(..))")
		public void logBefore(JoinPoint joinPoint) 
		{
			System.out.println("************************");
			System.out.println("logBefore() is running!");
			System.out.println("hijacked : " + joinPoint.getSignature().getName());
		}
	
		@After("execution(* com.SpringAOP_BasicAnnotations.Customer.addCustomer1(..))")
		public void logAfter(JoinPoint joinPoint) 
		{
			System.out.println("logAfter() is running!");
			System.out.println("hijacked : " + joinPoint.getSignature().getName());
			System.out.println("************************\n");
		}
		
		 @AfterReturning(pointcut = "execution"
		 		+ "(* com.SpringAOP_BasicAnnotations.Customer.addCustomerReturnValue(..))",
			      returning= "result")
		public void logAfterReturning(JoinPoint joinPoint, Object result) 
		{
			System.out.println("logAfterReturning() is running!");
			System.out.println("hijacked : " + joinPoint.getSignature().getName());
			System.out.println("Method returned value is : " + result);
			System.out.println("************************\n");
		}
		 
		 @AfterThrowing(pointcut = "execution"
		 		+ "(* com.SpringAOP_BasicAnnotations.Customer.addCustomerThrowException(..))",
			      throwing= "error")
		public void logAfterThrowing(JoinPoint joinPoint, Throwable error) 
		{
			System.out.println("logAfterThrowing() is running!");
			System.out.println("hijacked : " + joinPoint.getSignature().getName());
			System.out.println("Exception : " + error);
			System.out.println("************************\n");
		}
		 
		 @Around("execution(* com.SpringAOP_BasicAnnotations.Customer.addCustomerAround(..))")
		public void logAround(ProceedingJoinPoint joinPoint) throws Throwable 
		{
			System.out.println("************************");
			System.out.println("hijacked method : " + joinPoint.getSignature().getName());
			System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
				
			System.out.println("Around before is running!");
			joinPoint.proceed(); //continue on the intercepted method
			System.out.println("Around after is running!");
			System.out.println("************************\n");
		}
}
