package com.cg.inheritance;
//Program for Multilevel Inheritance
class Bike
{
	protected int speed;
	void display()
	{
		System.out.println("I Like to drive a Bike");
	}
}
class Pulser extends Bike
{
	protected String color;
	void print()
	{
		System.out.println("Speed is:"+speed);
	}
}
class Pulser125 extends Pulser
{
	void accept()
	{
		System.out.println("Color is:"+color);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Pulser125 p=new Pulser125();
		p.color="Black";
		p.speed=100;
		p.display();
		p.print();
		p.accept();
	

	}

}
