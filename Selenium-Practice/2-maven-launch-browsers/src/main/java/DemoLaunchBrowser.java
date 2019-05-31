import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoLaunchBrowser {

public static int browser = 3;
	
	public static void main(String[] args) {
		WebDriver driver = null;
		
		switch (browser)
		{
		case 1:
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();	
			 break;
		case 2:
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 break;
		case 3:		
			WebDriverManager.iedriver().setup();
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();			  			
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			capabilities.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(capabilities);
			break;
		}
						
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
}
}
