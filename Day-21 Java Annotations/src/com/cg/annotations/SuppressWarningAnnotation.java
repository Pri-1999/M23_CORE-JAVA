package com.cg.annotations;
class Animal
{
	//Non-Parameterized Constructor
	Animal()
	{
		System.out.println("Lion");
	}
	/*public void sound()
	{
		System.out.println("Roars");

	}*/
}

public class SuppressWarningAnnotation {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Animal a=new Animal();
	}

}
