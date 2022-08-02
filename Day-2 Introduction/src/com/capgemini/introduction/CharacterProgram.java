package com.capgemini.introduction;
//program for character Input

import java.util.Scanner;

public class CharacterProgram {

	public static void main(String[] args) {
		//compile time input
		//char x='a';
		Scanner s=new Scanner(System.in);
		char x=s.next().charAt(0);
		System.out.println("The character is:"+x);

	}

}
