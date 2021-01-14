package testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseTestClass;
import utilities.TestUtils;

public class OpenAccountTest extends BaseTestClass {

	@Test(dataProvider = "getAccountData")
	public void openAccountTest(String cust, String curr)
	{
		click("open-act-btn_CSS");
		select("customer_CSS", cust);
		select("currency_CSS", curr);
		click("process_CSS");
		
		Alert al = isAlertPresent();
		if (al != null) {
			Assert.assertTrue(al.getText().contains("Account created successfully"), "Acoount Creation test case is failed");
			al.accept();
			
			//delibrately written below line, to see the screen shot link.
			//Assert.fail("Open account test failed forcefully");			
		}
		else
		{
			Assert.fail("Account creation test case is failed- Absence of Alert Box");
		}
		
	}
	
	@DataProvider
	public Object[][] getAccountData()
	{		
		return TestUtils.getData("AccountData");	
	}
}