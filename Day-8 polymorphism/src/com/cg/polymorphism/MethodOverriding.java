package com.cg.polymorphism;
class Multiplication
{
	void accept(int a,int b)
	{
		System.out.println(a+b);
	}
}
class Mult extends Multiplication
{
	void accept(int x,int y)
	{
		System.out.println(x*y);
	}
}

public class MethodOverriding
{

	public static void main(String[] args)
	{
		Multiplication m=new Multiplication();
		m.accept(5,5);
		Mult m1=new Mult();
		m1.accept(12, 5);

	}

}
