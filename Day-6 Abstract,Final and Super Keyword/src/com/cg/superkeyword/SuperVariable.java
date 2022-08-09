package com.cg.superkeyword;
class color
{
	protected String name="Orange";
}
class Blue extends color
{
	public String name="Blue";
	public void display()
	{
		System.out.println(name);
		//Super Keyword is used to refer the parent class variables
		System.out.println(super.name);
	}
}

public class SuperVariable 
{

	public static void main(String[] args) 
	{
		Blue b=new Blue();
		b.display();

	}

}
