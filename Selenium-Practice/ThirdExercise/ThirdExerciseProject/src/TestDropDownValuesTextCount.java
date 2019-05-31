import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDropDownValuesTextCount {
	
	public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.wikipedia.org/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	
	List<WebElement> options = driver.findElements(By.tagName("option"));
	System.out.println("Number of values in drop down are=>" + options.size());
	
	/*for(int i=0; i<options.size(); i++){
		
		System.out.println(options.get(i).getAttribute("lang"));
		
	}*/
		for(WebElement option: options)
		{
			System.out.println(option.getText() + "--------" + option.getAttribute("value"));
		}
		
	driver.close();
	driver.quit();
	}
}
