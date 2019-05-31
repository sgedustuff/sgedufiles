package DemoTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestCase5 {

	/*
	 Now scenario is that, we want to execute particular test method only if dependents test methods are executed
	 - for this we use "dependsOnMethods" parameter
	 - if more than two methods names will be specified to "dependsOnMethods" parameter, then order of execution is alphabetical order. 
	 if priority is not set to test methods, then they will be executed in the order they are written, besides that they will be called first before any test method.
	 - like isSignUpButtonVisible, isWebGuiVisible 
	 
	 */
	
	@BeforeTest
	public void init()
	{
		System.out.println("DemoTestCase5=>Intilization properties, dbmanager, logger, mailing, application logs etc");
	}
	
	@AfterTest
	public void dispose()
	{
		System.out.println("DemoTestCase5=>Deintilization process, quit from browser windows, which are opened in current session");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("DemoTestCase5=>Launching browser");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("DemoTestCase5=>Closing broswer");
	}
	
	@Test(priority=2)
	public void testLogin()
	{
		System.out.println("DemoTestCase5=>Testing login functionality");
	}
	
	@Test
	public void isSignUpButtonVisible()
	{
		System.out.println("DemoTestCase5=>Testing signup button");
	}
	
	@Test
	public void isWebGuiVisible()
	{
		System.out.println("DemoTestCase5=>Testing website GUI");
	}
	
	@Test(dependsOnMethods={"isSignUpButtonVisible"})
	public void isRegistrationGUIVisible()
	{
		System.out.println("DemoTestCase5=>Testing Registration GUI");
	}
	
	@Test(priority=1, dependsOnMethods={"isRegistrationGUIVisible"} )
	public void testRegistration()
	{
		System.out.println("DemoTestCase5=>Testing registartion functionality");
	}
}
