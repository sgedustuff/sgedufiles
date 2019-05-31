import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDragandDrop {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		
		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
		
		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).perform();

	}

}
