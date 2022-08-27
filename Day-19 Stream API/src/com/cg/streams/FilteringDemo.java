package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo {

	public static void main(String[] args) 
	{
		List<Integer>obj=Arrays.asList(5,11,22,33,44,5);
		obj.stream().filter(i->i>25).forEach((i)->System.out.println(i+" "));
		System.out.println(obj);
		System.out.println("The distinct elements are:");
		obj.stream().distinct().forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The Limit is:");
		obj.stream().limit(3).forEach((i)->System.out.print(i+" "));
		System.out.println();
		System.out.println("The discarded element is:");
		obj.stream().skip(3).forEach((i)->System.out.print(i+" "));
	}
}