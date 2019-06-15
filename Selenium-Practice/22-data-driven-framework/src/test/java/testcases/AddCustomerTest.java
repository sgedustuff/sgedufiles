package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTestClass;
import utilities.TestUtils;

public class AddCustomerTest extends BaseTestClass {

	@Test(dataProvider = "getCustData")
	public void addCustomer(String fnm, String lnm, String pcode) throws InterruptedException {
	
		click("add-cust-btn_CSS");
		type("first-nm_CSS", fnm);
		type("last-nm_CSS", lnm);
		type("post-code_CSS", pcode);
		click("add-act-cust-btn_CSS");
		Thread.sleep(2000);
		
		// wait as per suggest time in config for appearing alert box
		Alert al = isAlertPresent();
		if (al != null) {
			Assert.assertTrue(al.getText().contains("Customer added successfully"), "Add customer test case is failed");
			al.accept();
			
			//delibrately written below line, to see the screen shot link.
			//Assert.fail("Add customer test failed forcefully");
			
		}
		else
		{
			Assert.fail("Add customer test case is failed- Absence of Alert Box");
		}
		
		
	}

	@DataProvider
	public Object[][] getCustData() {		
		return TestUtils.getData("CustomerData");
	}
}
