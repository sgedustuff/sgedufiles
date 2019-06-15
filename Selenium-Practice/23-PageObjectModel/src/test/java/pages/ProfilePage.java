package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class ProfilePage extends Page {
	
	/*
	 * WebDriver driver; public ProfilePage(WebDriver driver) { this.driver =
	 * driver; }
	 */
	
	public void goToFriends()
	{
		
	}
	
	public void goToAbout()
	{
		
	}
	
	/*public void uploadPhoto()
	{
		driver.findElement(By.xpath("//*[@id=\"u_fetchstream_3_e\"]")).click();
		driver.findElement(By.xpath("(//input[starts-with(@id,'js_')][contains(@title,'file')][contains(@accept, 'image')])[2]")).sendKeys("C:\\Users\\rajan\\Desktop\\GoToWebinar 002.png");
		
		//get upload photo xpath with using array concept as mentioned above
		
		
		  $x("//*[@id='js_az']") [input#js_az._n._5f0v]
		  $x("//a[@data-action-type='upload_photo']/div/input[starts-with(@id, 'js_')]"
		  ) [input#js_az._n._5f0v]
		  $x("//a[@data-action-type='upload_photo']/div/input") [input#js_az._n._5f0v]
		 
	}*/
	
	public ProfilePage uploadPhoto()
	{
		/*
		 * driver.findElement(By.xpath("//*[@id=\"u_fetchstream_3_e\"]")).click();
		 * driver.findElement(By.
		 * xpath("(//input[starts-with(@id,'js_')][contains(@title,'file')][contains(@accept, 'image')])[2]"
		 * )).sendKeys("C:\\Users\\rajan\\Desktop\\GoToWebinar 002.png");
		 */
		//click on save to upload or cancel to cancel the action.
		//click on close, to close the upload pop up.
		//so for the time, just assume, that photo has been uploaded, so commented the above code.
		System.out.println("Photo has been uploaded");		
		return this;
	}
	
}
