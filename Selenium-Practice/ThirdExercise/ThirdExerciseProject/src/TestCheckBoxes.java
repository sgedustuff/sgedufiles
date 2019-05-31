import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//-check all checkboxes one by one and in one go as well (using for loop with one go) of particular section
//-check all checkboxes and count them in that scenario, where on web page number of checkboxes can be increased or decreased of particular section
//-check all checkboxes in one go without using for and while loop of particular section
//-count those checkboxes which are checked of particular section
public class TestCheckBoxes {

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
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		//First way to detect input checkbox and make it checked.
		//Fail, if number of checkboxes may increase or decrease
		/*for(int i=1; i<=4; i++){
			
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();	
			
		}*/
		
		
		//Second way to detect input checkbox and make it checked.
		//Pass: if number of checkboxes may increase or decrease, but make extra effort to implement it.
		int i=1;
		int count=0;		
		while(isElementPresent("//div[4]/input["+i+"]")){
			
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			i++;
			count++;
			
		}		
		System.out.println("Total checkboxes are : "+count);
		
		
		//Third way = simple and straight.
		
		/*WebElement chkboxSection = driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		List<WebElement> checkboxes = chkboxSection.findElements(By.name("sports"));
		System.out.println("Number of checkboxes are=>" + checkboxes.size());
		
		for(WebElement chk:checkboxes)
		{
			System.out.println("Value=>" + chk.getAttribute("value"));
			chk.click();
			if(chk.isSelected())
			{
				chk.click();
			}
		}*/
		
		driver.close();
		driver.quit();

	}

}
