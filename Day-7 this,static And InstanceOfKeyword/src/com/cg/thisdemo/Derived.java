package com.cg.thisdemo;

public class Derived extends Base1
{
	Derived()
	{
		System.out.println("Default Constructor For Derived");
	}
	Derived(int i)
	{
		this();
		System.out.println("Parameterized Constructor For Derived");
	}
}
