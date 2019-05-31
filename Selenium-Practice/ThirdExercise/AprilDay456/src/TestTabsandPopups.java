import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class TestTabsandPopups {

	public static void main(String[] args) {

		ProfilesIni listProfile = new ProfilesIni();
		FirefoxProfile profile = listProfile.getProfile("default");
	

		WebDriver driver = new FirefoxDriver(profile);
		driver.navigate().to("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	
		System.out.println("----Generating window ids from the first window-----");
		
		Set<String> winids = driver.getWindowHandles(); //first window
		Iterator<String> itrate = winids.iterator(); //first window id
		
		String first_window = itrate.next(); //first window
		System.out.println(first_window);
		
		driver.findElement(By.xpath("//*[@id='cee_closeBtn']/img")).click();
		
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		
		System.out.println("----Generating window ids from second window----");
		
		winids = driver.getWindowHandles(); //2 window
		itrate = winids.iterator(); 
		
		
		System.out.println(itrate.next()); //first window id
		String second_window = itrate.next(); //second window
		System.out.println(second_window);
		
		driver.switchTo().window(second_window);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div[1]/ul/li[3]/a")).click();
		
		
		System.out.println("----Generating window ids from third window----");
		
		winids = driver.getWindowHandles(); //2 window
		itrate = winids.iterator(); 
		
		
		System.out.println(itrate.next()); //first window id
		System.out.println(itrate.next()); //second window
		String third_window = itrate.next(); //3rd window
		System.out.println(third_window);
		
		driver.switchTo().window(third_window);
		
		new Select(driver.findElement(By.xpath("//*[@id='eForm_form_applicantPlaceHolder_residenceCity_value']"))).selectByVisibleText("New Delhi");
		
		/*driver.close(); //3rd
		driver.switchTo().window(second_window);
		driver.close();
		driver.switchTo().window(first_window);
		*/
		
		driver.quit();
		
	}

}
