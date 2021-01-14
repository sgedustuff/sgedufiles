package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAssertTrue_7 {
	
	@BeforeTest
	public void SetDBConnection()
	{
		System.out.println("set db connection");
	}
	
	@AfterTest
	public void CloseDBConnection()
	{
		System.out.println("close db connection");
	}
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		System.out.println("launch browser");
	}
	
	@AfterMethod
	public void QuitBrowser()
	{
		System.out.println("quit browser");
	}
	
	@Test(priority = 3)
	public void TestFacebookDashBoard() {
		System.out.println("facebook-dashboard");
		Assert.fail("facebook-dashboard test case is failed");
	}
	
	@Test(priority = 2)
	public void TestFaceBookLogin() {
		
		Boolean isLoginSuccessful = false;
		Assert.assertTrue(isLoginSuccessful, "Login Test Failed");		
		System.out.println("facebook-login");
	}
	
	@Test(priority = 4)
	public void TestProfiles()
	{
		System.out.println("facebook-profiles");
	}
	
	@Test(priority = 1)
	public void TestFacebookRegistration()
	{
		String title = "On Facebook Page";
		
		//if not matched, then AssertionError will be thrown
		Assert.assertEquals(title, "On Facebook Page");		
		System.out.println("facebook-registration");
	}
}