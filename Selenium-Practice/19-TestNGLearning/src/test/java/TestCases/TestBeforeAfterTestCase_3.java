package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBeforeAfterTestCase_3 {
	
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
