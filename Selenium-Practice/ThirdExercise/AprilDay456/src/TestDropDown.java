import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {

		//http://qa.way2automation.com/
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		
		//driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("DA");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Dansk");
		select.selectByValue("hi");
		//select.get
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		
		System.out.println("Total values are : "+values.size());
		
		System.out.println(values.get(7).getText());
		
		for(int i=0; i<values.size(); i++){
			
			System.out.println(values.get(i).getAttribute("lang"));
			
			
			
		}
		
		
		System.out.println("----Printing all links-------------");
		
		WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[9]"));
		
		
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		
		System.out.println("Total links are : "+links.size());
		
		
		for(WebElement link: links){
			
			System.out.println(link.getText()+"----"+link.getAttribute("href"));
			
		}
		
		
		
	}

}
