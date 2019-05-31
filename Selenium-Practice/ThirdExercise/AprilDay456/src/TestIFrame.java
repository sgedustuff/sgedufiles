import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class TestIFrame {

	public static void main(String[] args) {


		ProfilesIni listProfile = new ProfilesIni();
		FirefoxProfile profile = listProfile.getProfile("default");
		

		WebDriver driver = new FirefoxDriver(profile);
		driver.navigate().to("http://www.firstcry.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("html/body/div[5]/div[1]/div/div[2]/span[6]")).click();
		//<iframe -- assignment
		
		driver.switchTo().frame("iframe_Login");
		driver.findElement(By.xpath("//*[@id='txtLUNm']")).sendKeys("trainer@way2automation.com");
		driver.switchTo().defaultContent();
		
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		//how many frames are there?
		
		System.out.println("Total frames are : "+frames.size());
		
		
		for(WebElement frame: frames){
			
			
			System.out.println(frame.getAttribute("id"));
			
		}
		
	
		
		//driver.switchTo().window(nameOrHandle)
		
		

	}

}
