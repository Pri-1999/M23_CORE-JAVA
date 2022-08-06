package com.cg.operators;
// Program for Relational Operators

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		//boolean res=a>b;
		boolean res=a<b;
		//int res=(a=b);
		System.out.println(res);
		s.close();
		

	}

}
