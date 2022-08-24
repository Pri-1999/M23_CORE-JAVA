package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void division()
	{
		System.setProperty("Priyanka", "Krutika");
		Assumptions.assumeTrue("Krutika".equals(System.getProperty("Priyanka")));
		//if Assumption is true then printing statement will print otherwise not
		System.out.println("Assumption is True");
	}
}
