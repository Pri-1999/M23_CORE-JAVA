package com.cg.generics;

public class GenericMethodExample 
{
	//when we use generic method we can pass ant types of arguments in method
	public static <E> void printArray(E[] elem)
	{
		for(E itr:elem)
		{
			System.out.println(itr.getClass().getName());
			System.out.println(itr);
		}
	}

	public static void main(String[] args) 
	{
		Integer[] arr1= {10,20,30};
		Character [] arr2= {'a','b','c'};
		System.out.println("Printing array for Integer");
		printArray(arr1);
		System.out.println("Printing array for Character");
		printArray(arr2);
	}

}
