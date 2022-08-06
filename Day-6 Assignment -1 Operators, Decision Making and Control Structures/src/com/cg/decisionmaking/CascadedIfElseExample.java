package com.cg.decisionmaking;

public class CascadedIfElseExample {
	// Program for Cascading If Else Conditions

	public static void main(String[] args) {
		int a=11,b=7,c=23;
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}


	}

}
