package com.cg.superkeyword;
class Android
{
	Android()
	{
		System.out.println("Lava is Android Mobile");
	}
}
class Lava extends Android
{
	Lava()
	{
		// Android class constructor
		super();
		System.out.println("Hello Everyone");
	}
}

public class SuperConstructor 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Lava l=new Lava();

	}

}
