package com.cg.thisdemo;

public abstract class Base1
{
	// Default Constructor
	Base1()
	{
		this(65);
		System.out.println("Default Constructor For Base1");
	}
	Base1(int i)
	{
		System.out.println("Parameterized Constructor For Base1:"+i);
	}
}
