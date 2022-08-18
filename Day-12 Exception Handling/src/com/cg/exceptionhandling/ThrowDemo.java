package com.cg.exceptionhandling;

public class ThrowDemo
{
	public static void display(int age,int weight) throws Exception
	{
		if(age>18 && weight>45)
			System.out.println("Eligible To Donate Blood");
		else
		{
			// To throw an exception explicitly
			throw new RuntimeException("Exception Caught");
		}
	}
	public static void main(String[] args) throws Exception 
	{
		try
		{
			display(15,64);
		}
		catch(RuntimeException e)
		{
			System.out.println(e);
		}
	}

}
