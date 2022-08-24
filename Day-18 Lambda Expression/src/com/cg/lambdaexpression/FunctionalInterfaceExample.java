package com.cg.lambdaexpression;
//functional interface
@FunctionalInterface
interface D
{
	String display(String str);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) 
	{
		D obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.display("Welcome to Lambda Expression Concept"));
	}

}
