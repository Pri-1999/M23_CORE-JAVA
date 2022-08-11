package com.cg.polymorphism;
// Program for Constructor Overloading
class Triber
{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("Renault-Kiger");
	}
	Triber(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is:"+speed+"and engine is on engine:"+engine);
	}
}

public class ConstructorOverloading
{

	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Triber t=new Triber();
		@SuppressWarnings("unused")
		Triber t1=new Triber(20,"Disel");

	}

}
