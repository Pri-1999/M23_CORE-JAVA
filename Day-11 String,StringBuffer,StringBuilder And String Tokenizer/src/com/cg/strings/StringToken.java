package com.cg.strings;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) 
	{
		StringTokenizer st= new StringTokenizer("Let's try this");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		

	}

}
