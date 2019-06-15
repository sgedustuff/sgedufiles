package pages;

import org.openqa.selenium.By;

import base.Page;

public class HomePage extends Page {
	
	/*
	 * WebDriver driver;
	 * 
	 * public HomePage(WebDriver driver) { this.driver = driver; }
	 */
	
	
		/*public void doLogin(String unm, String pass)
		{
			driver.findElement(By.id("email")).sendKeys(unm);
			driver.findElement(By.id("pass")).sendKeys(pass);
			driver.findElement(By.id("loginbutton")).click();
		}*/
		
		public LandingPage doLogin(String unm, String pass)
		{
			driver.findElement(By.id("email")).sendKeys(unm);
			driver.findElement(By.id("pass")).sendKeys(pass);
			driver.findElement(By.id("loginbutton")).click();			
			return new LandingPage();
		}
		
		public void createAccount(String fnm, String lnm)
		{
			
		}
		
		public void validateLinks()
		{
			
		}
	
}
