package com.cg.wrapperclass;
// Example on AutoBoxing

public class WrapperAutoBoxing {

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		float a=65.4f;
		Float b=a;//Converting primitive to wrapper class object.
		Float f=new Float(87.9);
		System.out.println(a+ ""+b+ ""+f);
	}

}
