package com.cg.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClassExample {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile("and");
		System.out.println("Enter the String:");
		Matcher m=p.matcher(s.nextLine());
		while(m.find())
		{
			System.out.println("Pattern found from"+m.start()+"to"+(m.end()-1));
		}
		s.close();
	}

}
