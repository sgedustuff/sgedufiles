package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProfilePage {
	
	
	public WebDriver driver;
	
	
	public MyProfilePage(WebDriver driver) {
		
		this.driver = driver;
	}
	

	
	public void gotoFriends() {
		
		
	}
	
	
	public void gotoAbout() {
		
		
	}
	
	
	public void uploadPhoto() {
		
		driver.findElement(By.xpath("//*[@id=\"u_fetchstream_2_g\"]")).click();
		driver.findElement(By.xpath("//a[@data-action-type='upload_photo']/div/input")).sendKeys("C:\\Users\\WAY2AUTOMATION\\Desktop\\se.png");
		
	}
	
	
}
