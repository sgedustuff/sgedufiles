package DemoTestCases;

import org.testng.annotations.Test;

public class DemoTestCase2 {

/*
 Now scenario is registration test case must be executed first, after then only login test case should be executed
 - To implement this, we use priority parameter
 */
	
	@Test(priority=2)
	public void testLogin()
	{
		System.out.println("DemoTestCase2=>Testing login functionality");
	}
	
	@Test(priority=1)
	public void testRegistration()
	{
		System.out.println("DemoTestCase2=>Testing registartion functionality");
	}
}
