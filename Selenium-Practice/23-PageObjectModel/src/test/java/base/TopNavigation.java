package base;

import org.openqa.selenium.By;

import pages.LandingPage;

public class TopNavigation {
	
	public void logOut()
	{
		Page.driver.findElement(By.id("userNavigationLabel")).click();
		Page.driver.findElement(By.xpath("//*[contains(text(),'Log Out')]")).click();
	}
	
	public void doSearch()
	{
	
	}
	
	public LandingPage goToLandingPage()
	{
		//click on "f" icon, to reach on landing page.
		Page.driver.findElement(By.xpath("//*[starts-with(@id,'js_')]/div/div/div[1]/div[1]/h1/a/span")).click();		
		return new LandingPage();
	}
}
