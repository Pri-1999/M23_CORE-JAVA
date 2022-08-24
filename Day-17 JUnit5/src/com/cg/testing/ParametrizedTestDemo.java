package com.cg.testing;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTestDemo 
{
	@ParameterizedTest
	@ValueSource(strings= {"Priyanka","Monika"})
	void print(String word)
	{
		assertNotNull(word);
	}
}
