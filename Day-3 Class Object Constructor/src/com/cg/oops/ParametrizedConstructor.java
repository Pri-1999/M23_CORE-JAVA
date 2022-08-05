package com.cg.oops;
// Program for Default Constructor And Parameterized Constructor
class Pulser
{
	public int speed;
	public String color;
	Pulser()
	{
		System.out.println("Welcome To TechnoServe India");
	}
	Pulser(int sp,String col)
	{
		speed=sp;
		color=col;
	}
	void accept()
	{
		System.out.println("Speed is: "+speed);
		System.out.println("Color is:"+color);
	}
}
public class ParametrizedConstructor {

	public static void main(String[] args) {
		
		Pulser p=new Pulser();
		Pulser p1=new Pulser(45,"Red");
		p1.accept();
		

	}

}
