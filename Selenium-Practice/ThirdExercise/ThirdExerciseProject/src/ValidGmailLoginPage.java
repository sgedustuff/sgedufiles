import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidGmailLoginPage {

	public static void main(String[] args) {
		
		String emiladdress = "raajnarora@gmail.com";
		String password = "skrssac1234";
		String expected = null;
		String actual = null;
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(emiladdress);
		driver.findElement(By.id("next")).click();
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		WebElement login = driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a"));
		
		expected = emiladdress;
		actual =login.getAttribute("title");
		
		
		if(actual.contains(expected))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		driver.close();
		driver.quit();
	}

}
