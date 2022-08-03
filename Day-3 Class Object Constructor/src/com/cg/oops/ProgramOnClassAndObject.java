package com.cg.oops;
class Car
{
	int a;
	void display()
	{
		System.out.println("welcome to M23 Batch");
	}
}

public class ProgramOnClassAndObject {

	public static void main(String[] args) {
		Car obj=new Car();
		obj.display();
		obj.a=55;
		System.out.println(obj.a);

	}

}
