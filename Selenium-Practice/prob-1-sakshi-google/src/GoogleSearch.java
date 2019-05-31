
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        
      
       

        //WebElement dropdown = driver.findElement(By.name("q"));
        
        WebElement dropdown = driver.findElement(By.name("q"));

       

        dropdown.sendKeys("selenium");

       

        Thread.sleep(3000);

        
        //searched elements are coming up in "li" tag. the ul is parent tag of li tag
        //so u have accessed ul tag, we need to make up Css selector in this way, so that
        //we can select all "li" tags comes under the UL tag
        //List <WebElement> dropdownlist = driver.findElements(By.cssSelector("ul[role='listbox']"));

        
        
        //Here is the CSS Selector
        //$$("ul[role='listbox'] > li")

        //Here is the correct statement
        List <WebElement> dropdownlist = driver.findElements(By.cssSelector("ul[role='listbox'] > li"));
              

        //rest ur code is fine
        for(WebElement element : dropdownlist)

        {

               System.out.println(element.getText());

              

        }

       

        driver.close();

       

                    

                    

       

        /*

        --------------------------------------------------------------------------

       

       

        /*System.out.println("Matching words are :"+values);

       

       

        /*System.out.println(values.get(7).getText());

        driver.findElement(By.name("btnK")).click();*/

	}

}
