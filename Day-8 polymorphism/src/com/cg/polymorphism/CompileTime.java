package com.cg.polymorphism;
class A
{
	// By having the different types of arguments.
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
}
public class CompileTime 
{

	public static void main(String[] args)
	{
		A obj=new A();
		obj.add(5, 5);
		obj.add(3.0f, 4.0f);

	}

}
