package TestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkipTestCaseForceFully_10 {
	@Test(priority = 1)
	public void TestFacebookRegistration()
	{
			//Skip execution of this testcase, as registration link is disabled.
			throw new SkipException("Registration link is disabled");
	}
	
	@Test(priority = 2, dependsOnMethods  = "TestFacebookRegistration")
	public void TestFaceBookLogin() {
		
		Boolean isLoginSuccessful = false;
		Assert.assertTrue(isLoginSuccessful, "Login Test Failed");				
	}
}
