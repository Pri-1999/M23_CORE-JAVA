package com.cg.function;

import java.util.Scanner;

// Program for Find Factorial of Number.

public class Factorial {
	//Function Definition
	static int factorial(int n)
	{
		int fact=1;
		for(int i=0;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
		
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(factorial(n));// Function Call
		s.close();

	}

}
