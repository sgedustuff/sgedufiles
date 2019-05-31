import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("(//*[@id='tsf']//input)[@name='q']"));
		search.sendKeys("aws");
		
		
		Thread.sleep(10000);
		
		List<WebElement> searchValues = driver.findElements(By.xpath("//*[@id='tsf']//ul[@class='erkvQe']//li"));

		System.out.println("Number of expected values are=>" + searchValues.size());
		int i=0;
		for(WebElement value: searchValues)
		{
			i++;
			System.out.println(i + " value is=>" +   value.getText());			
		}
				
		driver.quit();
	}

}
