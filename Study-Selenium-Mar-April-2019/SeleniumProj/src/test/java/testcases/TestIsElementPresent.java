package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {

	public static WebDriver driver;

	public static boolean isElementPresent(By by) {

		try {
			driver.findElement(by);
			return true;
		} catch (Throwable t) {

			return false;
		}

		/*
		 * int size = driver.findElements(By.xpath(xpath)).size();
		 * 
		 * if(size==0) {
		 * 
		 * return false; }else {
		 * 
		 * return true; }
		 */

	}

	/*public static boolean isElementPresentId(String id) {

		try {
			driver.findElement(By.id(id));
			return true;
		} catch (Throwable t) {

			return false;
		}

	}
*/
	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// System.out.println(driver.findElement(By.xpath("//select[@id='searchLanguage']")).isDisplayed());
		// System.out.println(driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[1]/div/div[200]/a")).isDisplayed());

		System.out.println(isElementPresent(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[1]/div/div[200]/a")));
	}

}
