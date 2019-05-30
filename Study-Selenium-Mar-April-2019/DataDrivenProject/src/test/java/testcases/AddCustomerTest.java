package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.TestUtil;

public class AddCustomerTest extends BaseTest{
	
	
	@Test(dataProvider="getData")
	public void addCustomer(String f, String l, String p) throws InterruptedException {
		
		
		click("addCustBtn_CSS");
		type("firstName_CSS",f);
		type("lastName_CSS",l);
		type("postCode_CSS",p);
		click("addCustomer_CSS");
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains("Customer added successfully"),"Customer not added successfully");
		alert.accept();
		
		Assert.fail("Add Customer Test Failed");
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		
		return TestUtil.getData("AddCustomerTest");
		
	}
	
		
	}


