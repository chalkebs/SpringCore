package com.IoC_Autowiring_byConstructor;

public class A 
{
	public B b;

    public A(B b)
    {
    	System.out.println("Class A Constructor");
    	this.b = b;
    }

	public void show()
    {
		System.out.println("Class A show() method called");
    	b.disp();
    }
}
