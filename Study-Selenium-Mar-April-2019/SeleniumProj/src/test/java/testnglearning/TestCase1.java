package testnglearning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void createDbConn() {
		
		System.out.println("Create db conn");
	}
	
	@AfterTest
	public void closeDbConn() {
		
		System.out.println("Close db conn");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		
		System.out.println("Launching browser");
	}
	
	@AfterMethod
	public void quitBrowser() {
		
		System.out.println("Quitting the browser");
	}
	
	@Test(priority=1,groups="high")
	public void doUserReg() {
		
		System.out.println("Executing User Reg test");
		
	}
	
	@Test(priority=2,groups="low")
	public void doLogin() {
		
		System.out.println("Executing login test");
		
	}
	
	
	

	
}
