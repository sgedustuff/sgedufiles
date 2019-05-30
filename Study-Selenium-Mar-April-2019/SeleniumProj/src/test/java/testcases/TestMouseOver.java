package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {

	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement menu = driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[2]/div/nav/ul/li[10]/a"));
		WebElement biz = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/nav/ul/li[10]/div/a[1]"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		biz.click();
		

	}

}
