package com.cg.exceptionhandling;

public class ArrayIndexOutOfBound 
{
	public static void print(int[] arr)
	{
		System.out.println(arr[1]);
		System.out.println("Fourth Element Successfully Displayed");
	}

	public static void main(String[] args) 
	{
		System.out.println("First Line");
		System.out.println("Second Line");
		try
		{
			int[] myIntArray=new int[] {1,2,3};
			print(myIntArray);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Third Line");
	}

}
