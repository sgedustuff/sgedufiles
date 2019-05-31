package DemoTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestCase4 {

	/*
	 Now scenario, we need those method which must invoke once in life cycle i.e in the beg and at the end
	 */
	
	@BeforeTest
	public void init()
	{
		System.out.println("DemoTestCase4=>Intilization properties, dbmanager, logger, mailing, application logs etc");
	}
	
	@AfterTest
	public void dispose()
	{
		System.out.println("DemoTestCase4=>Deintilization process, quit from browser windows, which are opened in current session");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("DemoTestCase4=>Launching browser");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("DemoTestCase4=>Closing broswer");
	}
	
	@Test(priority=2)
	public void testLogin()
	{
		System.out.println("DemoTestCase4=>Testing login functionality");
	}
	
	@Test(priority=1)
	public void testRegistration()
	{
		System.out.println("DemoTestCase4=>Testing registartion functionality");
	}
}
