package com.cg.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		Map<Integer,String>s=new HashMap<Integer,String>();
		s.put(11, "Priyanka");
		s.put(12, null);
		s.remove(12);
		System.out.println(s);
	}

}
