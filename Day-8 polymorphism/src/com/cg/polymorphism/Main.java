package com.cg.polymorphism;
// Method Overriding
class Parent
{
	void m1()
	{
		System.out.println("Parent-M1");
	}
}
public class Main extends Parent
{
	void m1()
	{
		System.out.println("Child-M1");
	}
	void m2()
	{
		System.out.println("Child-M2");
	}

	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.m1();
		Main m=new Main();
		m.m2();
	}

}
