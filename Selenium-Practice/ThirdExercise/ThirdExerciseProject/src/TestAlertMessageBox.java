import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//how to get message from alert messagbox and click ok button (rediff site)
public class TestAlertMessageBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		WebElement btnGo = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input"));
		btnGo.click();
		Alert msgBox = driver.switchTo().alert();
		System.out.println(msgBox.getText());
		Thread.sleep(1000);
		msgBox.accept();
		
		driver.close();
		driver.quit();

	}

}
