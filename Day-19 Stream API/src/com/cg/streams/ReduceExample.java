package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) 
	{
		List<Integer>obj=Arrays.asList(5,11,22,33,5,44);
		Optional<Integer>result=obj.stream().reduce((i,j)->i>j?i:j);
		if(result.isPresent())
		{
			System.out.println("Result is:"+result.get());

		}
	}

}
