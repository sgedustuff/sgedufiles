import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseOver {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.jabong.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		WebElement menu = driver.findElement(By.xpath("//*[@id='mainTopNav']/li[2]/a"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		driver.findElement(By.linkText("Boots")).click();
		
	
		
		

	}

}
