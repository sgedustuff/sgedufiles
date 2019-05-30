package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	/*
	 * 
	 * Logs
	 * Excel - DataProvider
	 * Properties
	 * Keywords
	 * 
	 */
	
	public WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
	}


	public void doLogin(String username, String password) {
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		
	}
	
	
	public void createAccount(String firstName, String lastName, String email) {
		
		
	}
	
	
	public void validateLinks() {
		
		
	}

}
