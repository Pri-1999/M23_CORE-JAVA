package com.cg.enums;

import java.util.Scanner;

//Example on enum with switch-case
enum Movie
{
	//enums constants
	KGF2,BRAHMASTRA,PUSHPA,MAJOR;
}

public class EnumWithSwitchCase 
{
	// enum variable
	Movie movie;
	//constructor for the"EnumWithSwitchCase"
	public EnumWithSwitchCase(Movie movie) 
	{
		super();
		this.movie = movie;
	}	
	public void display()
	{
		switch(movie)
		{
		case KGF2:
			System.out.println("Yash and Srinidhi Shetty");
			break;
		case BRAHMASTRA:
			System.out.println("Ranbir Kapoor and Alia Kapoor");
			break;	
		case PUSHPA:
			System.out.println("Allu Arjun and Rashmika Mandhna");
			break;
		case MAJOR:
			System.out.println("Adivi sesh and Saiee Manjrekar");
			break;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the movie name that u want tp display");
		String str=s.nextLine();
		EnumWithSwitchCase e=new EnumWithSwitchCase(Movie.valueOf(str));
		e.display();
		
	}
	

}
