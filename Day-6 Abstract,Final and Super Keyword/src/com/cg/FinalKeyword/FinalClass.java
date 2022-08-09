package com.cg.FinalKeyword;
// If any class is declared as final we can,t override it
// Final class Fruit
class Fruit
{
	Fruit()
	{
		System.out.println("Constructor");
	}
	// If you make any method as final you can't override it
	// final public void accept
	public void accept()
	{
		System.out.println("Parent Class");
	}
}
class Apple extends Fruit
{
	public void accept()
	{
		System.out.println("Parent Class");
	}
}
public class FinalClass {

	public static void main(String[] args)
	{
		Apple a=new Apple();
		a.accept();

	}

}
