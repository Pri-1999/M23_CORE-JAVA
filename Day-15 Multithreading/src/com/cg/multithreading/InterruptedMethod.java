package com.cg.multithreading;
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread Interruption");

	}
}

public class InterruptedMethod {

	public static void main(String[] args) 
	{
		Thread1 t=new Thread1();
		t.start();
		t.interrupt();
	}

}
