package rough;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountTags {

	public static void main(String[] args) {
 
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/resizable/");

		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(0));

		WebElement resizeIcon=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

		System.out.println(resizeIcon.getLocation());
		new Actions(driver).dragAndDropBy(resizeIcon, 170, 170).perform();
	        }

	}


