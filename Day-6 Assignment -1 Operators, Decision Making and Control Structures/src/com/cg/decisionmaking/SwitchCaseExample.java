package com.cg.decisionmaking;

import java.util.Scanner;

// Program For Switch Case Statement

public class SwitchCaseExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Hello!!");
			break;
		case 2:
			System.out.println("Priyanka!!");
			break;
		case 3:
			System.out.println("Priya!!");
			break;
		default:
			System.out.println("Invalid Input!!");
			s.close();
		}
		

	}

}
