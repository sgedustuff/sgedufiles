package base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Page {

	// WebDriver driver;
	public static WebDriver driver;
	public static TopNavigation tn;
	public Page() {

		// 1)
		/*
		 * Map<String, Object> prefs = new HashMap<String, Object>();
		 * prefs.put("profile.default_content_setting_values.notifications", 2);
		 * prefs.put("credentials_enable_service", false);
		 * prefs.put("profile.password_manager_enabled", false); ChromeOptions options =
		 * new ChromeOptions(); options.setExperimentalOption("prefs", prefs);
		 * options.addArguments("--disable-extensions");
		 * options.addArguments("--disable-infobars");
		 * 
		 * driver = new ChromeDriver(options); driver.get("http://www.facebook.com");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		 */

		if (driver == null) {
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			driver = new ChromeDriver(options);
			driver.get("http://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			
			tn = new TopNavigation();
		}
	}
}
