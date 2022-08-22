package com.cg.generics;
//Generic class Example

public class GenericClassExample <T>
{
	T num;
	public void show()
	{
		System.out.println(num.getClass().getName());
	}
	public static void main(String[] args) 
	{
		//instead of collections i have used generic class name and generic concept
		GenericClassExample <Double> obj=new GenericClassExample<>();
		obj.num=13.0;
		obj.show();
	}

}
