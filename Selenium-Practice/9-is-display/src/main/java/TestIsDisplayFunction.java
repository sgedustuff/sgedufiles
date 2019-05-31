import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIsDisplayFunction {

	static WebDriver driver;
	
	//not optimized utility
	public static boolean IsElementExist(String xpath)
	{
		try
		{
			WebElement nextelement = driver.findElement(By.xpath(xpath));
			return true;
		}catch(Exception e)
		{
			return false;
		}
		
	}
	
	//optimized utility
	public static boolean checkElementExistence(By objBy)
	{
		try
		{
			WebElement nextelement = driver.findElement(objBy);
			return true;
		}catch(Exception e)
		{
			return false;
		}
		
	}
	 
	//optimized utility
		public static boolean isElementFound(By objBy)
		{
			
			List<WebElement> elements = driver.findElements(objBy);
			if(elements.size()>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		if (email.isDisplayed()) {
			System.out.println("Element present on dom as well as visible on UI");
		}
		

		WebElement element = driver.findElement(By.xpath("//*[@id='ct']"));
		if (!element.isDisplayed()) {
			System.out.println("Element present on dom but not visible on UI as it is the hidden element");
		}
		

		//wrong id is specified
		//so it throws an exception = NoSuchElement Exception.
		//there is no such utility to handle this, so how to handle it.
		
		//1st Way
		/*
		 * boolean isElementExistOnDom = false; //wheather hidden or non-hidden try {
		 * WebElement nextelement = driver.findElement(By.xpath("//*[@id='ctiii']"));
		 * isElementExistOnDom = true; } catch(Exception e) { isElementExistOnDom =
		 * false; } if (isElementExistOnDom) {
		 * System.out.println("Element exist on DOM"); } else {
		 * System.out.println("Element does not exist on DOM"); }
		 */
		
		//2nd way = developed the utility like IsElementExist
		if (IsElementExist("//*[@id='ctiii']")) {
			System.out.println("Element exist in dom");			
		}
		else
		{
		System.out.println("Element does not exist in dom");
		}
		
		//3rd = write the optimized utility
		if (checkElementExistence(By.xpath("//*[@id='ctiii']")))
		{
			System.out.println("Element exist on dom by id");
		}
		else
		{
			System.out.println("Element does not exist on dom by id");
		}
		
		if (checkElementExistence(By.name("identifier")))
		{
			System.out.println("Element exist on dom by name");
		}
		else
		{
			System.out.println("Element does not exist on dom by name");
		}
		
		
		
		//4th way = check count = without using try catch block
		if (isElementFound(By.xpath("//*[@id='ctiii']")))
		{
			System.out.println("Element exist on dom by id");
		}
		else
		{
			System.out.println("Element does not exist on dom by id");
		}
		
		if (isElementFound(By.name("identifier")))
		{
			System.out.println("Element exist on dom by name");
		}
		else
		{
			System.out.println("Element does not exist on dom by name");
		}
		
		driver.quit();
		
	}

}
