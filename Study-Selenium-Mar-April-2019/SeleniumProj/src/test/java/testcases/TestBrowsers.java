package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {
	
	
	public static String browser = "firefox"; //excel
	public static WebDriver driver;
	

	public static void main(String[] args) {


		/*
		 * JDK
		 * Eclipse
		 * Maven
		 * browser - auto
		 * jars - auto
		 * browser exe - 
		 * 
		 * 
		 * 
		 * /
		 */
		
		if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}
		
		
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		//driver.close(); //current browser window
		driver.quit(); //close browser window - current + all related windows opened in current session
		
		
	}

}
