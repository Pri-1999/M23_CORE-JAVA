package com.cg.lambdaexpression;

//functional interface=>contains exactly one abstract method
interface A
{
	void print();
}
//length of code is increased using implementable class B
/*class B implements A
{

	@Override
	public void print() 
	{
		System.out.println("Functional Interface Implementation without lambda expression");
	}
	
}*/
public class FunctionalInterfaceDemo 
{
	public static void main(String[] args)
	{
		/*B b=new B();
		b.print();*/
	
		//1.lambda expression implements the functional interface
		//2.length of the code is decreased using lambda expression
		A obj=()->
		{
			System.out.println("Functional Interface Implementation using "
				+"lambda expression");
		};
		obj.print();
	}
}
