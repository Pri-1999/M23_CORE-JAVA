package com.cg.decisionmaking;
// Program For Nested If Else Condition

public class NestedIfElseExample {

	public static void main(String[] args) {
		int age=15,weight=55;
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110)
				{
					System.out.println("Eligible For Bunjee Jumping");
				}
				else
				{
					System.out.println("Extra Ropes Will Added");
				}
				
			}else
			{
				System.out.println("Not Eligible For Bunjee Jumping");
			}
		}else
		{
			System.out.println("Not Eligible For Bunjee Jumping");
		}
		

	}

}
