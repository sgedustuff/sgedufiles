import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestRegistrationForm {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		driver.findElements(By.xpath(".//*[@id='load_form']/fieldset[1]/input")).get(1).sendKeys("Meenakshi Arora");
		driver.findElements(By.xpath(".//*[@id='load_form']/fieldset[2]/input")).get(1).sendKeys("9899148452");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[3]/input")).sendKeys("marora1983@gmail.com");
		WebElement country = driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[4]/select"));
		Select ctry = new Select(country);
		ctry.selectByValue("India");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[5]/input")).sendKeys("Delhi");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[6]/input")).sendKeys("TestUserName");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[7]/input")).sendKeys("TestUserName@123");
		driver.findElements(By.xpath(".//*[@id='load_form']/div/div[2]/input")).get(1).click();
		
		
		driver.quit();
		driver.close();
		
		
		
	}

}
