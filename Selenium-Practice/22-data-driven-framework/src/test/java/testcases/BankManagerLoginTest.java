package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTestClass;

public class BankManagerLoginTest extends BaseTestClass {

	@Test
	public void loginAsBankManager()
	{
			click("bnk-mgr-login-btn_CSS");
			Assert.assertTrue(isElementPresent("add-cust-btn_CSS"), "Not login as Bank Manager");
			
			//delibrately written below line, to see the screen shot link.
			//Assert.fail("Bank Manager test failed forcefully");
	}
	
}
