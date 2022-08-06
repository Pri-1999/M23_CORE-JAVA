package com.cg.operators;
// Program for Increment And Decrement Operator

public class UnaryOperator {

	public static void main(String[] args) {
		int a=5,b=3;
		int x=a++;
		int y=++b;
		int z=a+x;
		int x1=a--;
		int y1=--b;
		int z1=a-x1;
		System.out.println(z);
		System.out.println(z1);

	}

}
