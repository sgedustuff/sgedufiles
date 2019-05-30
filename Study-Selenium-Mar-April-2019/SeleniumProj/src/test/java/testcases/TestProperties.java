package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.MonitoringMail;
import utilities.TestConfig;

public class TestProperties {

	/*
	 * Log4j.jar - done
	 * Logger  - getLogger() - done
	 * INFO, ERROR, DEBUG - done
	 * Appenders -  log4j.properties - done 
	 * 
	 */
	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger(TestProperties.class);
	public static MonitoringMail mail = new MonitoringMail();
	
	

	public static void click(String key) throws AddressException, MessagingException {
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
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, t.getMessage(), TestConfig.attachmentPath, TestConfig.attachmentName);

		}
		
		

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

	public static void main(String[] args) throws IOException, AddressException, MessagingException {

		
		PropertyConfigurator.configure(".\\src\\test\\resources\\properties\\log4j.properties");
		
		fis = new FileInputStream(".\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		log.info("OR properties loaded");

		fis = new FileInputStream(".\\src\\test\\resources\\properties\\Config.properties");
		Config.load(fis);
		log.info("Config properties loaded");

		if (Config.getProperty("browser").equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("Firefox launched");

		} else if (Config.getProperty("browser").equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Chrome launched");

		} else if (Config.getProperty("browser").equals("ie")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			log.info("IE launched");

		}

		driver.get(Config.getProperty("testsiteurl"));
		log.info("Navigated to : "+Config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")),
				TimeUnit.SECONDS);

		// driver.findElement(By.cssSelector(OR.getProperty("username_CSS"))).sendKeys("trainer@way2automation.com");
		// driver.findElement(By.xpath(OR.getProperty("nxtBtn_XPATH"))).click();
		
		type("username_CSS", "trainer@way2automation.com");
		click("nxtBtn_XPATH");

		driver.quit();
		log.info("Test Execution Completed !!!");

		/*
		 * //driver.findElement(By.xpath(OR.getProperty("username_XPATH")).click();
		 * System.out.println(OR.getProperty("username_XPATH"));
		 * 
		 * //driver.get(Config.getProperty("testsiteurl"))
		 * System.out.println(Config.getProperty("testsiteurl"));
		 */
	}

}
