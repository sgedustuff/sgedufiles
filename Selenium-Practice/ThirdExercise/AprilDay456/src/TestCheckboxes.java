import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCheckboxes {
	
public static WebDriver driver;
	
	public static boolean isElementPresent(String xpath){
		
		/*try{
			
		driver.findElement(By.xpath(xpath));
		return true;
		
		}catch(Exception e){
			
			return false;
			
		}*/
		
		int size = driver.findElements(By.xpath(xpath)).size();
		
		if(size==0){
			
			return false;
		}else{
			
			return true;
		}
		
	}


	public static void main(String[] args) {


		driver = new FirefoxDriver();
		driver.navigate().to("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		/*
		for(int i=1; i<=4; i++){
		
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			
			
		}
		
		//public static boolean isElementPresent(String xpath)
	
		
		int i=1;
		int count=0;
		
		
		while(isElementPresent("//div[4]/input["+i+"]")){
			
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			i++;
			count++;
			
		}
		
		System.out.println("Total checkboxes are : "+count);
		
		*/
		
		WebElement block = driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		
		List<WebElement> checkboxes = block.findElements(By.name("sports"));
		
		
		for(WebElement checkbox: checkboxes){
			
			System.out.println(checkbox.isSelected());
			checkbox.click();
			System.out.println(checkbox.isSelected());
		}
		
		
		System.out.println("Total checkboxes are : "+checkboxes.size());

	}

}
