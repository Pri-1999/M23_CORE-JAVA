package com.cg.lambdaexpression;
interface C
{
	//lambda expression will only work for functional interface Implementation
	void display();
	//void accept();
}

public class InterfaceImp {

	public static void main(String[] args) 
	{
		//The target type of this expression must be a functional interface
		C obj=()->
		{
			System.out.println("Functional Interface Implementation using lambda expression");
		};
		obj.display();
	}

}
