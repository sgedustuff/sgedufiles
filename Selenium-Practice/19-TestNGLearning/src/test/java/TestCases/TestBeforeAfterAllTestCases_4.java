package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBeforeAfterAllTestCases_4 {
	
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
	}
	
	@Test(priority = 2)
	public void TestFaceBookLogin() {
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
		System.out.println("facebook-registration");
	}
}
