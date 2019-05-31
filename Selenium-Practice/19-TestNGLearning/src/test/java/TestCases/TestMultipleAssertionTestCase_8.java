package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestMultipleAssertionTestCase_8 {
	
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
		/*
		 * //here is some code related to title testing code.
		 * Assert.assertEquals("On Facebook Page 1", "On Facebook Page");
		 * 
		 * //here is some code related to matching profile rules.
		 * Assert.assertTrue(false,
		 * "Test Profile test case is failed because of unmacthed rules");
		 * 
		 * //final outcome of profile test case.
		 * Assert.fail("Test Profile test case is failed");
		 */
		
		
		SoftAssert objSoftAssert = new SoftAssert();
		objSoftAssert .assertEquals("On Facebook Page 1", "On Facebook Page");		
		objSoftAssert .assertTrue(false, "Test Profile test case is failed because of unmacthed rules");
		objSoftAssert .fail("Test Profile test case is failed");
		objSoftAssert.assertAll();
		
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
