package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DbManager;
import utilities.ExcelReader;
import utilities.MonitoringMail;

public class BaseTest {
	
	/*
	 * WebDriver - done
	 * Waits - Implicit, Explicit - done
	 * Keywords - click, type, isElementPresent - done
	 * Screenshot
	 * Database - done
	 * Mail - done
	 * Reporting
	 * TestNG
	 * Excel - done
	 * Logs - done
	 * Properties - done
	 * Listeners
	 * 
	 * 
	 * 
	 */
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static ExcelReader excel = new ExcelReader("./src/test/resources/excel/testdata.xlsx");
	public static MonitoringMail mail = new MonitoringMail();
	public static Logger log = Logger.getLogger(BaseTest.class);
	public static WebElement dropdown;
	
	public static void click(String key) {
		try {
		if (key.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(key))).click();
		} else if (key.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(key))).click();
		} else if (key.endsWith("_ID")) {
			driver.findElement(By.id(OR.getProperty(key))).click();
		}
		
		log.info("Clicking on an Element : "+key);
		}catch(Throwable t) {
			//captureScreenshot()
			log.error("Error while clicking on an Element : "+key+" error is : "+t.getMessage());
		
		}
		
		

	}

	
	public static boolean isElementPresent(String key) {
		try {
		if (key.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(key)));
		} else if (key.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(key)));
		} else if (key.endsWith("_ID")) {
			driver.findElement(By.id(OR.getProperty(key)));
		}
		
		log.info("Finding an Element : "+key);
		return true;
		}catch(Throwable t) {
			//captureScreenshot()
			log.error("Error while Finding an Element : "+key+" error is : "+t.getMessage());
			return false;
		}
		
		

	}
	
	
	
	
	public static void select(String key, String value) {
		
		
		
		try {
		if (key.endsWith("_XPATH")) {
			dropdown = driver.findElement(By.xpath(OR.getProperty(key)));
		} else if (key.endsWith("_CSS")) {
			dropdown = driver.findElement(By.cssSelector(OR.getProperty(key)));
		} else if (key.endsWith("_ID")) {
			dropdown = driver.findElement(By.id(OR.getProperty(key)));
		}
		
		log.info("Selecting the value from an Element : "+key+" selected value as : "+value);
	
		}catch(Throwable t) {
			//captureScreenshot()
			log.error("Error while selecting value from an Element : "+key+" error is : "+t.getMessage());
		
		}
		
		Select select = new Select(dropdown);
		select.selectByVisibleText(value);
		

	}
	
	
	
	

	
	
	
	
	public static void type(String key, String value) {

		try {
		if (key.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(key))).sendKeys(value);
		} else if (key.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(key))).sendKeys(value);
		} else if (key.endsWith("_ID")) {
			driver.findElement(By.id(OR.getProperty(key))).sendKeys(value);
		}
		
		log.info("Typing in an Element :  "+key+" and entered the value as : "+value);
		}catch(Throwable t) {
			
			log.error("Error while typing in an Element: "+key+" error message is : "+t.getMessage());
		}
		
		}

	
	
	
	
	
	@BeforeSuite
	public void setUp() {
		
		
		
		if(driver==null) {
			
			//logs
			PropertyConfigurator.configure(".\\src\\test\\resources\\properties\\log4j.properties");
			
			//Properties
			try {
				fis = new FileInputStream(".\\src\\test\\resources\\properties\\Config.properties");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Config.load(fis);
				log.info("Config properties loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fis = new FileInputStream(".\\src\\test\\resources\\properties\\OR.properties");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				OR.load(fis);
				log.info("OR properties loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(Config.getProperty("browser").equals("chrome")) {
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				log.info("Chrome browser launched");
			}else if(Config.getProperty("browser").equals("firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				log.info("Firefox browser launched");
			}else if(Config.getProperty("browser").equals("ie")) {
				
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				log.info("IE browser launched");
			}
			
			driver.get(Config.getProperty("testsiteurl"));
			log.info("Navigated to : "+Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")), TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, Integer.parseInt(Config.getProperty("explicit.wait")));
			
			try {
				DbManager.setMysqlDbConnection();
				log.info("Database connection established");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
		
		
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		log.info("Test execution completed !!!");
	}
	
	
	
	
	
}
