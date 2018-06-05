package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTest {
	@BeforeTest
	public void bf()
	{
		System.out.println("starting");
	}
  @Test
  public void f() {
	  System.out.println("It's Working");
  }
  
  @Test
  public void Test() {
	  Assert.assertTrue(true);
  }
}
