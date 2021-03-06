import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMMTDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://makemytrip.com");

		driver.findElement(By.xpath("//*[@id='fromCity']")).click();

		//WebElement dropdown = driver.findElement(By.cssSelector("ul[role='listbox']"));

		//dropdown.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();

		//List<WebElement> dropdownlist = driver.findElements(By.cssSelector("ul[role = 'listbox')"));

		
		//$$("ul[role='listbox'] > li")
		List<WebElement> dropdownlist = driver.findElements(By.cssSelector("ul[role='listbox'] > li"));

		for (WebElement element1 : dropdownlist)

		{

			System.out.println(element1.getText());

		}

		driver.close();

	}

}
