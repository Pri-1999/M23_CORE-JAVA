package com.cg.lambdaexpression;
@FunctionalInterface
interface E
{
	int add(int a,int b);
}

public class FunctionalInterfaceParaDemo {

	public static void main(String[] args) 
	{
		E obj=(int a,int b)->(a+b);
		System.out.println("Addition of a and b is:"+obj.add(15, 15));
	}

}
