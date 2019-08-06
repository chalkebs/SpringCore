package com.IoC_Autowiring_byType;

public class A 
{
	public B b;

    public B getB() 
    {
    	System.out.println("1");
		return b;
	}

	public void setB(B b) 
	{
		System.out.println("2");
		this.b = b;
	}

	public void show()
    {
		System.out.println("Class A show() method called");
    	b.disp();
    }
}
