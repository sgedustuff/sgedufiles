import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DemoLaunchBrowser {

	public static String browser = "ie";
	
	public static void main(String[] args) {
		WebDriver driver = null;
		
		switch (browser)
		{
		case "firefox":
			 driver = new FirefoxDriver();	
			 break;
		case "chrome":
			 driver = new ChromeDriver();
			 break;
		case "ie":
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();			  			
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			driver = new InternetExplorerDriver(capabilities);
			break;
		}
						
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();

	}

}
