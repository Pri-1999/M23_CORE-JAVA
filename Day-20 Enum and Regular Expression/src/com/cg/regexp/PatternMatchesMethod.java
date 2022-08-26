package com.cg.regexp;

import java.util.Scanner;

public class PatternMatchesMethod {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String pattern="JAVA PROGRAMMING";
		@SuppressWarnings("unused")
		String input=s.nextLine();
		boolean result=pattern.matches(pattern);
		System.out.println(result);
		s.close();
	}

}
