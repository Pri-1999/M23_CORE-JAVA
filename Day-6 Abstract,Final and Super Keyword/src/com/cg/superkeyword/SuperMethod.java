package com.cg.superkeyword;
class A
{
	public int pin;
	public void display(int pin)
	{
		System.out.println("Pin is:"+pin);
	}
}
class B extends A
{
	public int pin;
	public void display(int pin)
	{
		System.out.println("Pin is:"+pin);
	}
	void print()
	{
		display(3122);// Child class method
		super.display(4122);// Parent class method
	}
}

public class SuperMethod
{
	public static void main(String[] args) 
	{
		B b=new B();
		b.print();
	}

}
