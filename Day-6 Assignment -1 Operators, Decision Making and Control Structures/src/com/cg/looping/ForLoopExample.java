package com.cg.looping;
// Program For For Loop Statement
import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			s.close();
		}

	}

}
