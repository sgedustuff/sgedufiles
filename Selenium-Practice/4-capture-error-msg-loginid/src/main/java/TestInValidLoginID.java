

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestInValidLoginID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		WebElement loginid = driver.findElement(By.id("identifierId"));
		loginid.sendKeys("!!!!!!!!!!!!!!!!!!!!!!!111");
		//loginid.sendKeys("raajnarora@gmail.com");
		WebElement nextbtn = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
		nextbtn.click();
		
		//1) 1st way to apply wait = applied in all cases, when we find element
		//driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
		//WebElement errmsg1 = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]/div"));
		
		//2) 2nd way = wait for that element, which we are expecting to appear only if error is occured.
			 //if try catch block is not used, then it throws an exception " org.openqa.selenium.NoSuchElementException"
		String errtext = null;
		/*WebDriverWait wait = null;
		WebElement errmsg = null;
		try	
		{
			wait = new WebDriverWait(driver,10L); //explicit wait
			errmsg = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"view_container\\\"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]/div")));
			//errmsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"view_container\\\"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]/div")));
			errtext = errmsg.getText();
		}catch(Exception ex)
		{
			errtext="error not found";
		}*/
		
		//3) fluent wait
		WebElement errmsg = null;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .withMessage("element is not found in 30 seconds")
			       .ignoring(NoSuchElementException.class);

		errmsg = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]/div")));
		
			  
		
		errtext = errmsg.getText();
		
		System.out.println(errtext);
		if (errtext.equals("Enter a valid email or phone number"))
		{
			System.out.println("invalid login test case is passed");
		}
		else
		{
			System.out.println("invalid login test case is failed");
		}
		driver.quit();
	}

}
