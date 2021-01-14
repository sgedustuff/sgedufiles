import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFrame {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onclick");
		
		System.out.println("main window=>" + driver.getTitle());
		

		
		//see, below code will not work, as button is on the frame
		//u will have to switch to frame from main window
		//as of now our focus is on the main window		
		//error = driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		
		
		//here how it works
		//driver.switchTo().alert(); //switch to java script alert box
		
		//below are ways to switch to frame, use accordingly one of them.
		
		//driver.switchTo().frame(1); //switch to frame by index, if id & name or nothing is mentioned against frame tag
		
		//driver.switchTo().frame("iframeResult"); //switch to frame by name from main window
		
		//driver.switchTo().frame(driver.findElements(By.xpath("//iframe")).get(1)); //switch to frame by getting element from list of web elements		
		
		//driver.switchTo().frame(driver.findElements(By.xpath("(//iframe[1])[2]")).get(1)); //As there are four elements at index 1, so get 2nd element.
		
		
		//driver.findElement(By.xpath("/html/body/button")).click();
		 
		//instead of click on above mentioned button
		//we can call the java script function, which is called internally, when we click on button
		//we can embed own javascript to highlight the button
		//how?
		
		WebElement button = driver.findElement(By.xpath("/html/body/button"));		
		((JavascriptExecutor)driver).executeScript("myFunction()");
		JavascriptExecutor js =  (JavascriptExecutor)driver;		
		js.executeScript("arguments[0].style.border= 'solid 5px red'", button);
		
		
		
		
		//assume there is an error and u want to take screen shot
		Date d1 = new Date(); 
		String filename = d1.toString().replace(":", "_").replace(" ", "_") + ".jpg";		
		TakesScreenshot tss = (TakesScreenshot) driver;
		File fss = tss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fss, new File("./screenshot/" + filename));
		
		
		System.out.println("on frame window=>" + driver.getTitle());
		//now we want to access the main window
		//so move the focus back to main window from frame.
		//if main window contains frames only, then use defaultContent method for switching to main window
		//if main window contains popup or (popus and frames both), then use getWindowHandles. see next example.
		driver.switchTo().defaultContent();
		System.out.println("main window=>" + driver.getTitle());
		
		//click on run button belongs to main window
		driver.findElement(By.xpath("/html/body/div[5]/div/button")).click();
		
		//driver.quit();
		
	}

}