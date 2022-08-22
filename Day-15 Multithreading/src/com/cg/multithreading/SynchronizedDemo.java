package com.cg.multithreading;
class Test
{
	public static synchronized void display()
	{
		System.out.println("Current thread"+Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"i-"+i);
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
 class ValueDemo implements Runnable
{
	Thread t;
	Test val;
	ValueDemo(Test val)
	{
		this.val=val;
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() 
	{
		val.display();
	}
	
}

public class SynchronizedDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Test obj1=new Test();
		Test obj2=new Test();
		@SuppressWarnings("unused")
		ValueDemo t1=new ValueDemo(obj1);
		ValueDemo t2=new ValueDemo(obj2);
	}

}
