package GMAIL;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementAction {
	
	public WebDriver driver = null;
	Properties ORprop = null;
	Properties CONFIGprop = null;
	FileInputStream fisOrProp = null;
	FileInputStream fisConfigProp = null;
	
	public ElementAction() throws IOException
	{
		ORprop = new Properties();
		CONFIGprop = new Properties();
		fisConfigProp = new FileInputStream(".\\src\\test\\resources\\properties\\CONFIG.properties");
		fisOrProp = new FileInputStream(".\\src\\test\\resources\\properties\\OR.properties");
		ORprop.load(fisOrProp);
		CONFIGprop.load(fisConfigProp);
		if (CONFIGprop.getProperty("browser").equals("chrome"))
		{
			driver = new ChromeDriver();	
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driver.get(CONFIGprop.getProperty("sitename"));		
		driver.manage().timeouts().implicitlyWait(Long.parseLong(CONFIGprop.getProperty("waittime")), TimeUnit.SECONDS);
	}
	
	public void click(String key)
	{
		if(!isElementFound(key)) {
			return;
		}
		
		if (key.endsWith("id"))
		{
			driver.findElement(By.id(ORprop.getProperty(key))).click();
		}
		else if(key.endsWith("xpath"))
		{
			driver.findElement(By.xpath(ORprop.getProperty(key))).click();
		}
		else if (key.endsWith("css"))
		{
			driver.findElement(By.cssSelector(ORprop.getProperty(key))).click();
		}
	}
	
	public void type(String key, String text)
	{
		
		if(!isElementFound(key)) {
			return;
		}
		
		if (key.endsWith("id"))
		{
			driver.findElement(By.id(ORprop.getProperty(key))).sendKeys(text);
		}
		else if(key.endsWith("xpath"))
		{
			driver.findElement(By.xpath(ORprop.getProperty(key))).sendKeys(text);
		}
		else if (key.endsWith("css"))
		{
			
			driver.findElement(By.cssSelector(ORprop.getProperty(key))).sendKeys(text);
			
		}
	}
	
	public String getContent(String key)
	{
		if(!isElementFound(key)) {
			return "";
		}
		
		if (key.endsWith("id"))
		{
			return driver.findElement(By.id(ORprop.getProperty(key))).getText();
		}
		else if(key.endsWith("xpath"))
		{
			return driver.findElement(By.xpath(ORprop.getProperty(key))).getText();
		}
		else if (key.endsWith("css"))
		{
			return driver.findElement(By.cssSelector(ORprop.getProperty(key))).getText();
		}	
		return "";
	}
	
	private boolean isElementFound(String key)	
	{	
		List<WebElement> elements = null;
		if (key.endsWith("id"))
		{
			elements = driver.findElements(By.id(ORprop.getProperty(key)));
		}
		else if(key.endsWith("xpath"))
		{
			elements = driver.findElements(By.xpath(ORprop.getProperty(key)));
		}
		else if (key.endsWith("css"))
		{
			elements = driver.findElements(By.cssSelector(ORprop.getProperty(key)));
		}
		
		if(elements.size()>0)
		{
		
			return true;
		}
		else
		{
			return false;
		}
	}
}
