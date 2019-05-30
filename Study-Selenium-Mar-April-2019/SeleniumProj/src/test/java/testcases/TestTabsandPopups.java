package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabsandPopups {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		System.out.println("---Generating window ids from first window---");
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterator = winids.iterator();
		String first_window = iterator.next();
		System.out.println(first_window);
		
		driver.findElement(By.className("popupCloseButton")).click();
		
		
		driver.findElement(By.id("loginsubmit")).click();
		
		System.out.println("---Generating window ids from second window----");
		winids = driver.getWindowHandles();
		iterator = winids.iterator();
		
		System.out.println(iterator.next()); // first window
		String second_window = iterator.next(); //second window
		System.out.println(second_window);
		
		driver.switchTo().window(second_window);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("vizury-notification-template");
		driver.findElement(By.id("div-close")).click();
		
		driver.switchTo().window(second_window);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p[3]/a")).click();
		
		
		System.out.println("---Generating window ids from third window----");
		winids = driver.getWindowHandles();
		iterator = winids.iterator();
		
		/*while(iterator.hasNext()) {
			
			iterator.next();
		}*/
		
		System.out.println(iterator.next()); // first window
		System.out.println(iterator.next()); // second window
		String third_window = iterator.next(); //3rd window
		System.out.println(third_window);
		
		driver.switchTo().window(third_window);
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().contains("JetPrivilege HDFC Bank Signature Chip Debit Card"));
		
	/*	driver.close();//3rd
		driver.switchTo().window(second_window);
		driver.close();*/
		driver.quit();
	}

}
