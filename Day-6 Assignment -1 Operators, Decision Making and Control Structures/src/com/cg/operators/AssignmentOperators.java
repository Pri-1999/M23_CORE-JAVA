package com.cg.operators;
// Program for Assignment Operator

import java.util.Scanner;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		a*=b;//a=a*b
		System.out.println(a);
		s.close();
		

	}

}
