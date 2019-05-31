import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InValidPasswordGmailLoginPage {

	public static void main(String[] args) {
		
		String emailAddress = "raajnarora@gmail.com";
		String password = "1234";
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys(emailAddress);
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10L);
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='errormsg_0_Passwd']")));
		
		String actual = e.getText();
		String expected = "The email and password you entered don't match.";
		
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

