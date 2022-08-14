package com.cg.arrayprograms;
//Program for Array using User Input

import java.util.Scanner;

public class ArrayUserInput
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		//array declaration
		int arr[]=new int[size];
		System.out.println("Enter the values:");
		//to enter the elements in the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+" index");
			arr[i]=s.nextInt();
		}
		//to print the elements in the array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
