package com.IoC_Autowiring_byType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Main 
{
	public static void main(String[] args) 
	{
		//Read the configuration file
        Resource resource = new ClassPathResource("bean_byType.xml");
        
        //Read all the bean definition
        BeanFactory bf = new XmlBeanFactory(resource);
        
        //Get the Bean1 instance
        A a1 = (A)bf.getBean("a");
        
        //Lets call the show() method
        a1.show();
	}
}
