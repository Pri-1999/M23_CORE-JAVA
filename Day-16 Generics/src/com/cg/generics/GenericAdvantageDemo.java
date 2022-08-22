package com.cg.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// demo on advantages of generic concept

public class GenericAdvantageDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		List<Integer> obj=new LinkedList<>();
		obj.add(12);
		//1.Type Safety
		//obj.add("Priyanka");
		System.out.println(obj);
		//2.Type Casting is not required
		List<Integer> obj2=new ArrayList<>();
		obj2.add(15);
		System.out.println(obj2);
		//3.Compile-time checking
		Integer d=obj.get(0);
	}

}
