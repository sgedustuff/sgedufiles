import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTryIt {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	
		
		
		driver.switchTo().frame("iframeResult");
		
		//((JavascriptExecutor) driver).executeScript("");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='mySubmit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='6px groove green'", element);
		
		/*
		 * 
		 * 
		 * 
		 */
		
		

	}

}
