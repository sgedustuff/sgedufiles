import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		WebElement dd = driver.findElement(By.xpath("//input[@id='fromCity']"));
		dd.click();		
		
		
		//print name,code and city in one go
		List<WebElement> d = dd.findElements(By.xpath("//*[@id='react-autowhatever-1']//ul[@class='react-autosuggest__suggestions-list']/li"));
		System.out.println(d.size());
		for(WebElement e: d)
		{
			System.out.println(e.getText());
		}
		
		//capture name, code and city seperately		
		/*
		 * List<WebElement> airportNames = dd.findElements(By.
		 * xpath("//*[@id='react-autowhatever-1']//p[@class='font14 grey']"));
		 * List<WebElement> airportCodes = dd.findElements(By.
		 * xpath("//*[@id='react-autowhatever-1']//div[@class='pushRight font14 lightGreyText latoBold']"
		 * )); List<WebElement> airportCities = dd.findElements(By.
		 * xpath("//*[@id='react-autowhatever-1']//p[@class='font16 appendBottom8']"));
		 * 
		 * System.out.println(airportNames.size());
		 * System.out.println(airportCodes.size());
		 * System.out.println(airportCities.size());
		 * 
		 * 
		 * for(int i=0;i<airportNames.size();i++) {
		 * System.out.println(airportNames.get(i).getText() + "-----" +
		 * airportCodes.get(i).getText() + "----" + airportCities.get(i).getText()); }
		 * 
		 * 
		 */
		
		driver.quit();
	}
	

}
