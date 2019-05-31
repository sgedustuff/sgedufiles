import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InValidLoginGmailLoginPage {
	
	public static void main(String[] args) {
		
		String emailAddress = "hhhhh";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		//during asynchrnous, there might be scenario, element will be presented in html and visible on UI
		//until asynchronos call is completed.
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(emailAddress);
		driver.findElement(By.xpath(".//*[@id='next']"))click();
		
		
				
		WebDriverWait wait = new WebDriverWait(driver,10L);
		//Element is presented in html, but visible only until validation process is completed.
		WebElement errMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='errormsg_0_Email']")));
		
		String actual = errMsg.getText();
		String expected = "Sorry, Google doesn't recognize that email.";
				
		
		
		if(actual.equals(expected))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		driver.close();
		driver.quit();
		
	}

}
