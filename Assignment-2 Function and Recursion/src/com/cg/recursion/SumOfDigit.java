package com.cg.recursion;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) 
	{
		int num=0;
		int digit=1;
		int sum=10;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		
		while(num>0)
		{
			sum=sum+digit;
			num=num/10;
			digit=num-sum;
		}
		System.out.println("Sum of Digit="+sum);
		s.close();

	}

}
