package com.cg.thiskeyword;
class Z
{
	public int x;
	// Default Constructor
	Z()
	{
		this(23);
		System.out.println("Default Consturctor");
	}
	Z(int x)
	{
		System.out.println("Value is:"+x);
	}
}


public class InvokeConsturctor 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Z obj=new Z();

	}

}
