package com.cg.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		Set s=new LinkedHashSet();
		s.add(11);
		s.add(null);
		System.out.println(s);
	}

}
