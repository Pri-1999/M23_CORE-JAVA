package com.cg.multithreading;
class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Thread Interruption");

	}
}

public class ThreadInterruptedMethod
{

	public static void main(String[] args) 
	{
		Thread2 t1=new Thread2();
		t1.start();
		System.out.println("is thread interrupted"+t1.isInterrupted());
		t1.interrupt();
		System.out.println("is thread interrupted"+t1.isInterrupted());
	}

}
