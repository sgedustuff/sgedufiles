import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestLaunchBrowser {
	
	public static String browser = "chrome";
	
	public static void main(String args[])
	{
		
		
		WebDriver driver = null;
		
		switch (browser)
		{
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("WebDriver.ie.Driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		case "chrome":
			System.setProperty("WebDriver.Chrome.Driver", "chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
	}

}
