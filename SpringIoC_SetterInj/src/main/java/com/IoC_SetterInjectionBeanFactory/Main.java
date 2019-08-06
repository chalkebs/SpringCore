package com.IoC_SetterInjectionBeanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Main 
{

	public static void main(String[] args) 
	{
		//Read Configuration File
		Resource r = new ClassPathResource("bean.xml");
		
		//Read all the bean defination
		BeanFactory b = new XmlBeanFactory(r);
		
		//get the bean.xml files id
		Details d=(Details)b.getBean("details");
		d.getDetails();
	}

}
