

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTypeInGmail {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		
		//1)type email id
		//WebElement username = driver.findElement(By.id("identifierId"));
		//WebElement username = driver.findElement(By.cssSelector("#identifierId"));
		//username.sendKeys("raajnarora@gmail.com");
		
		
		//2)grab all inputs see its displayed, enabled, attribute info.
		driver.get("http://localhost/sample.htm");
		List<WebElement> lstInputs = driver.findElements(By.tagName("input"));
		System.out.println(lstInputs.size());		
		for(WebElement we : lstInputs)
		{			
			System.out.println("IsDisplayed=>" + we.isDisplayed() + "=>Type=>" + we.getAttribute("name") + "=>IsEnabled=>" + we.isEnabled());
		}

		driver.manage().window().maximize();
		driver.quit();
		
		
	}

}
