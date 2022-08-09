package com.capgemini.introduction;
//program for double input

import java.util.Scanner;

public class DoubleInput {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x");
		double x=s.nextDouble();
		System.out.println(x);

	}

}
