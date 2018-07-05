package com.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testAdd() {
		StringCalculator.add("1,2");
	}

	@Test(expected = RuntimeException.class)
	public void testIsNumberLengthGreaterThanTwo() {
		StringCalculator.add("1,2,3");
	}

	/*@Test
	public void testIsNumberEmpty() {
		fail("Not yet implemented");
	}*/

}
