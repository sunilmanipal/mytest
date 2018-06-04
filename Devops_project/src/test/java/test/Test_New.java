package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_New {
	@BeforeTest
	public void bf()
	{
		System.out.println("starting");
	}
  @Test
  public void f() {
	  System.out.println("It's Working");
  }
}
