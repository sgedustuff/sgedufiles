import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//bringup google and type selenium and print the count and matching texts.

public class TestCountEnteriesOnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=a6ddV4rRHMuL8QekjKD4Aw&gws_rd=ssl");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		WebElement txtBox = driver.findElement(By.xpath(".//*[@name='q']"));
		txtBox.click();
		txtBox.sendKeys("selenium");
		
		WebElement entriesBox = driver.findElement(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]"));
		List<WebElement> enteries = entriesBox.findElements(By.className("sbqs_c"));
		for (WebElement entry : enteries) {
			System.out.println(entry.getText());
		}
		//driver.quit();
		//driver.close();
	}

}
