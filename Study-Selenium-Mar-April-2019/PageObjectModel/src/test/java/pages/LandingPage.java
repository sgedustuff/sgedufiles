package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	
	public WebDriver driver;
	
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void updateStatus() {
		
		
	}
	
	
	public void gotoPages() {
		
		
		
	}
	
	
	public void gotoProfile() {
		
		driver.findElement(By.xpath("//*[@id=\"navItem_100010051393565\"]/a/div")).click();
	}

}
