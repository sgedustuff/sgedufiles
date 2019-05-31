import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//-count total number of values in drop down and print all texts and values of particular drop down.  (done)

public class TestParticularDropDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlselect.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		WebElement block = driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		List<WebElement> options = block.findElements(By.tagName("option"));
		
		System.out.println("Number of values in drop down are =>" + options.size());
		
		for(WebElement option: options)
		{
			System.out.println(option.getText() + "---------" + option.getAttribute("value"));
		}
		
		
		
		driver.close();
		driver.quit();

	}

}
