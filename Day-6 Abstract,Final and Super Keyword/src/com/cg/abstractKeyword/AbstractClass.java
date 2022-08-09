package com.cg.abstractKeyword;
// Program for Abstract Class

abstract class Flower 
{
	//abstract method
	abstract void print ();
	//non-abstract method
	void accept()
	{
		System.out.println("Demo on abstract Keyword");
	}
}
class Lily extends Flower
{
	void print()
	{
		System.out.println("Hey Folks,I like the Fragrance of Lily");
	}
}
public class AbstractClass
{

	public static void main(String[] args) {
		Lily l=new Lily();
		l.print();
		l.accept();
	}
}
