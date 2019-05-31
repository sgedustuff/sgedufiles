import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLinksCountDisplayURL {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links=>" + links.size());
		for(WebElement link: links)
		{
			System.out.println(link.getText() + "----" + link.getAttribute("href"));
		}
		
		
	}
}
