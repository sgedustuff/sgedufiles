import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSectionLinksCountDisplay {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		WebElement lnkBlock = driver.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[9]/div[2]"));
		List<WebElement> links = lnkBlock.findElements(By.tagName("a"));
		for(WebElement lnk: links)
		{
			System.out.println(lnk.getText()+"-------------"+ lnk.getAttribute("href"));
		}
		
		driver.close();
		driver.quit();
		
		
	}

}
