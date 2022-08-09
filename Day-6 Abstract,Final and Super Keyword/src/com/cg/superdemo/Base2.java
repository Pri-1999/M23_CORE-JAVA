package com.cg.superdemo;

public class Base2 
{
	Base2()
	{
		super();//call to parent class default constructor
		System.out.println("Default constructor for Base2");
	}
	Base2(int i)
	{
		super();// call to parent class parameterized constructor
		System.out.println("Parametrized constructor for Base2:"+i);
	}
}
