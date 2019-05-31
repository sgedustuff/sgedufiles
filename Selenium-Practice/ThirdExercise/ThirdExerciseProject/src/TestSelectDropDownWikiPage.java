import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TestSelectDropDownWikiPage {
	
	
		public static void main(String[] args) {			
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.wikipedia.org/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
			
			//if dropdown is customized by css then how to select text.
			WebElement dd = driver.findElement(By.xpath(".//*[@id='searchLanguage']"));			
			Select s = new Select(dd);
			s.selectByVisibleText("Dansk"); //text is in english
	
			List<WebElement> values = driver.findElements(By.tagName("option"));
			System.out.println(values.size());
			
			//if select non-english value, then uncomment below code
			//s.selectByValue("el"); //text is non english so use value.
					
			//if we have simple drop down, then how to select text. uncomment below code.
			//driver.get("http://www.echoecho.com/htmlforms11.htm");
			//driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/select")).sendKeys("Milk");
			
			
		}
}
