package com.cg.StaticKeyword;

public class StaticBlock 
{
	static int num;
	static String str;
	// static Block:If you want to initiate the value without using constructor and object creation
	// then use static block
	// and make the variable of the class as static
	static 
	{
		num=15;
		str="Priyanka";
	}

	public static void main(String[] args)
	{
		System.out.println(num);
		System.out.println(str);

	}

}
