package com.cg.StaticKeyword;

public class StaticBox 
{
	double width;
	double height;
	static int count=7;
	// Parameterized Constructor
	public StaticBox(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	public StaticBox()
	{
		super();
		int cnt=0;
		cnt++;
		System.out.println("Cnt is:"+cnt);
		count=16;
		count++;
		System.out.println("Count is:"+count);
	}
	public static void main(String[] args)
	{
		StaticBox s=new StaticBox();
		s.width=23;
		s.height=6;
		System.out.println(s.width);

	}

}
