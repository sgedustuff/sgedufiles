package DemoTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestCase3 {

	/*
	 Now scenario, there is test method, that must be executed before and after every actual test methods
	 like before case = lanuch the browser. for this we use "@BeforeMethod"
	 	  in between = actual test method will be executed
	 like after case = quit the browser. for this we use "@AfterMethod"
	 */
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("DemoTestCase3=>Launching browser");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("DemoTestCase3=>Closing broswer");
	}
	
	@Test(priority=2)
	public void testLogin()
	{
		System.out.println("DemoTestCase3=>Testing login functionality");
	}
	
	@Test(priority=1)
	public void testRegistration()
	{
		System.out.println("DemoTestCase3=>Testing registartion functionality");
	}
}
