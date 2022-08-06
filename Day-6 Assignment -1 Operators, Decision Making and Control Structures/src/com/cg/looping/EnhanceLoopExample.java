package com.cg.looping;
//Program to use enhanced for loop example in java.

import java.util.ArrayList;
import java.util.List;

public class EnhanceLoopExample {
	
		static void enhancedForLoopTest(List<String> arrayList){
			//Enhanced For loop test
			for (String name : arrayList) {
				System.out.println(name);
			}
		}	
	 
		public static void main(String args[]){ 
			//Create ArrayList object. 
			List<String> arrayList = new ArrayList<String>();   
			//Add objects to the HashSet. 
			arrayList.add("Priyanka"); 
			arrayList.add("Dhanashree"); 
			arrayList.add("Nikita"); 
			arrayList.add("Pari"); 
			enhancedForLoopTest(arrayList); 
		}
	

}
