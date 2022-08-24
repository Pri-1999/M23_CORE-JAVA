package com.cg.lambdaexpression;
//To implement the runnable interface method

public class RunnableInterfaceUsingLamda {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		/*Runnable Interface
		@SuppressWarnings("unused")
		Runnable R1=new Runnable()
		{
			public void run()
			{
				System.out.println("Runnable Interface Implementation");
			}
		};*/
		Runnable R1=()->
		{
			System.out.println("Runnable Interface Implementation");
		};
		Thread t=new Thread(R1);
		t.start();
	}

}
