import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartMenus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rajan\\Selenium-Practice\\10-1-flipkart-menus\\chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		List<WebElement> menuNames = driver.findElements(By.xpath("//*[@id='container']/div/div[2]/div/ul/li"));
		int i=1;
		System.out.println("There are "+ menuNames.size() + " menus.");
		for(WebElement menuName : menuNames)
		{			
			String menuText = menuName.getText();
			Actions actionMenuName = new Actions(driver);
			actionMenuName.moveToElement(menuName).perform();			
			List<WebElement> menuItems = driver.findElements(By.xpath("//*[@id='container']/div/div[2]/div/ul/li["+i+"]/ul//a"));
			System.out.println("Menu =>" + menuText + " has " + menuItems.size() + " menu items" );
			i++;
		}
		
		driver.quit();
				
	}

}
