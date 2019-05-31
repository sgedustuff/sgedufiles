package TestCases;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestTryCatchScreenShot_11 {
	
	
	@Test(priority = 1)
	public void TesCaseTryCatchFailedForScreenShot()
	{
		
		try {
			Assert.fail("TesCaseTryCatchFailedForScreenShot Test Case is failed.");
		} catch (Exception e) {
			Reporter.log("<a target='_blank' href='D:\\Rajan\\Selenium-Practice\\19-TestNGLearning\\src\\test\\resources\\screenshots\\failure\\fail-login-test.jpg'><img src='D:\\Rajan\\Selenium-Practice\\19-TestNGLearning\\src\\test\\resources\\screenshots\\failure\\fail-login-test.jpg' height=50 width=50/></a>");
		}
		
	}

}
