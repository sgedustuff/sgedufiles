import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFramePopUps {

	public static void main(String[] args) throws InterruptedException {
		
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		
		System.out.println("on the first window");
		//on first window = close the popup window
		driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img")).click();
		
		//on first window = click on login
		driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]")).click();
		
		System.out.println("on the second window");
		//on second window (popup window) = click on "know more" 
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();

		System.out.println("on the third window");
		//getting the title from the third window
		System.out.println(driver.getTitle());*/
		
		//above code will be stopped working from the second window onwards
		//we have to move the focus from first window to second window
		//after than coode will be stopped working from the third window onwards
		//we have to move the focus from second window to third window.
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//on first window = close the popup window
		try
		{
			driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img")).click();	
		}catch(Exception e)
		{
			
		}
		
		
		
		//till now we are on the first window, will move on second window after login click
		//extract windows ids. they are unqiue, so use set rather than list
		//below loop will run only time, as we are on the first window
		System.out.println("on the first window");
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> it = windowIds.iterator();
		String firstWindowId="", secondWindowId="", thirdWindowId="";
		firstWindowId = it.next();
		System.out.println(firstWindowId);
		//on first window = click on login
		driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]")).click();
		
		//--------------------------second window------------------------------------------------------
		System.out.println("on the second window");
		//now we are on the second window, so loop will run 2 times.
		windowIds = driver.getWindowHandles();		
		it = windowIds.iterator();
		firstWindowId = it.next();
		secondWindowId = it.next();
		System.out.println(firstWindowId);
		System.out.println(secondWindowId);
		
		//move the focus to the second window, so that we can get the elements of them
		driver.switchTo().window(secondWindowId);
		
		//on second window (popup window) = click on "continue to net banking"
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 10L);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[2]/div[1]/a"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div[1]/a"))).click();
		
		
		
		//on second window (popup window) = click on "tranfer money > know more" = that is on frame
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[3]/table/tbody/tr[1]/td/table[2]/tbody/tr/td[1]/p/a")).click();	
		
		
		
		//--------------------------third window------------------------------------------------------
		System.out.println("on the third window");
		windowIds = driver.getWindowHandles();
		System.out.println(windowIds.size());
		it = windowIds.iterator();
		firstWindowId = it.next();
		secondWindowId = it.next();
		thirdWindowId = it.next();
		System.out.println(firstWindowId);
		System.out.println(secondWindowId);
		System.out.println(thirdWindowId);
		driver.switchTo().window(thirdWindowId);
		//getting the title from the third window
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/ul/li[2]/a")).click();
		System.out.println(driver.getTitle());
		
		

		if (driver.getTitle().contains("NEFT Transfer - Use e-Monies National Electronic Funds Transfer facility by HDFC Bank"))
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("unmatched");
		}
		
		driver.close(); //it will close the third win
		driver.switchTo().window(secondWindowId);
		driver.close();
		driver.switchTo().window(firstWindowId);
		driver.close();
		
		//rather than close in above way
		//can u quit method to close all windows in one go.
		//driver.quit();
	}

}
