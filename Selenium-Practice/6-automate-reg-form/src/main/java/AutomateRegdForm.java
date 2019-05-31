import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateRegdForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		
		

		//refer unique element without index value at the end, by referring parent.		
		//WebElement nm = driver.findElement(By.xpath("//*[@id='load_form']/fieldset[1]/input/../../../form[@class='ajaxsubmit']/fieldset[1]/input[@name='name']"));
		
		//refer unique element with index value at the end		
		WebElement nm = driver.findElement(By.xpath("(//*[@id='load_form']/fieldset[1]/input)[2]"));
		
		nm.sendKeys("Rajan Arora");
		
		WebElement email = driver.findElement(By.xpath("//*[@id='load_form']/fieldset[3]/input"));
		email.sendKeys("raajnarora@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("(//*[@id='load_form']/fieldset[2]/input)[2]"));
		phone.sendKeys("9899688029");
		
		WebElement ddcountry = driver.findElement(By.xpath("//*[@id='load_form']/fieldset[4]/select"));
		Select selDdCountry = new Select(ddcountry);
		selDdCountry.selectByVisibleText("Guyana");
		
		WebElement city = driver.findElement(By.xpath("//*[@id='load_form']/fieldset[5]/input"));
		city.sendKeys("cityguyana");
		
		
		WebElement username = driver.findElement(By.xpath("//*[@id='load_form']/fieldset[6]/input"));
		username.sendKeys("userrajanarora");
		
		
		WebElement password = driver.findElement(By.xpath("//*[@id='load_form']/fieldset[7]/input"));
		password.sendKeys("userrajanarora");
		
		WebElement submit = driver.findElement(By.xpath("(//*[@id='load_form']/div/div[2]/input)[2]"));
		submit.click();
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,10L); 
		WebElement error = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='alert']")));		
		String errText = error.getText();
		System.out.println("error=>" + errText);
		if(errText.length()>0)
		{
			WebElement signin = driver.findElement(By.xpath("(//*[@id='load_form']/div/div[1]/p/a)[2]"));
			signin.click();		
			
			

			WebElement s_username = driver.findElement(By.xpath("(//*[@id='load_form']/fieldset[1]/input)[2]"));
			s_username.sendKeys("userrajanarora@gmail.com");
			
			
			WebElement s_password = driver.findElement(By.xpath("(//*[@id='load_form']/fieldset[2]/input)[2]"));
			s_password.sendKeys("userrajanarora");
			
						
		}
				
	}

}
