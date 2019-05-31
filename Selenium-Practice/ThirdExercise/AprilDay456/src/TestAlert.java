import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAlert {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[1]/input")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		System.out.println(alert.getText());
		
		alert.accept();
	
		
		
		

	}

}
