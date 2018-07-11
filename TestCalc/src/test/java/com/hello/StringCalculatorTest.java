package com.hello;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

public class StringCalculatorTest {
	
	@BeforeTest
	public void sun()
	{
		System.out.println("Start");
	}

	@Test
	public void testAdd() {
		StringCalculator.add("3,2");
		System.out.println("It should start after before");
		System.out.println("this is good");
	}

	@Test(expected = RuntimeException.class)
	public void testIsNumberLengthGreaterThanTwo() {
		StringCalculator.add("1,2,3");
		System.out.println("It should start after Test1");
		//System.out.println("this is ");
	}

	
	
	/*@Test
	public void testIsNumberEmpty() {
		fail("Not yet implemented");
	}*/

}
