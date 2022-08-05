package com.cg.inheritance;
// Program for Single Inheritance
class Parent
{
	protected int roll_no;
	void print()
	{
		System.out.println("Hey Guys! What's going om?");
	}
}
class Child extends Parent
{
	void accept()
	{
		System.out.println("Roll no:"+roll_no);
	}
}

public class SinglrInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.roll_no=120;
		c.accept();
		c.print();
		

	}

}
