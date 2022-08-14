package com.cg.arrayprograms;
//Program for Character Array 

public class CharArrayDemo 
{

	public static void main(String[] args) 
	{
		char arr[]= {'a','b','1','?','A',' '};
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
			{
				System.out.println(arr[i]+" is a digit");
			}
			if(Character.isLetter(arr[i]))
			{
				System.out.println(arr[i]+" is a Letter");
			}
			if(Character.isWhitespace(arr[i]))
			{
				System.out.println(arr[i]+" is a whitespace");
			}
			if(Character.isUpperCase(arr[i]))
			{
				System.out.println(arr[i]+" is a Uppercase");
			}
			if(Character.isLowerCase(arr[i]))
			{
				System.out.println(arr[i]+" is a Lowercase");
			}
		}
	}

}
