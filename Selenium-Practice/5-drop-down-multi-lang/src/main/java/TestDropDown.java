import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		
		dropdown.sendKeys("Dansk");
		dropdown.sendKeys("Eesti");
		
		//don't use send keys with drop down as it type and select that one, so there may chances to get wrong selection.
		//if drop down's text in in multi language, then how to select the text
		//to overcome above two issues use Select class else use sendkeys to select the text.		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Dansk"); 
		select.selectByValue("fa");

		//first way to find option of particular drop down.
		List<WebElement> options = driver.findElements(By.xpath("/html/body/div[2]/form/fieldset/div/div[1]/div/select/option"));
		
		//second way to find options of drop down.
		//this will target all options of all drop down.
		//List<WebElement> ops = dropdown.findElements(By.tagName("option"));
				
		/*
		 * for(WebElement element: ops) { System.out.println(element.getText() + "=>" +
		 * element.getAttribute("lang")); }
		 */
		
				
		
		//print all drop down values and get to know the count of them.
		 
		System.out.println("Number of items in drop down are =>" + String.valueOf(options.size()));		
		
		//1st way to print.
		for(WebElement element: options)
		{
			System.out.println(element.getText() + "=>" + element.getAttribute("lang"));
		}
		
		//2nd way to print.
		for (int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText() + "=>" + options.get(i).getAttribute("lang"));
		}
					
	}

}
