import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMouseOver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
				
		//mouse mover.
		/*
		 * driver.get("https://www.makemytrip.com/");
		 * driver.manage().window().maximize(); WebElement moremenu =
		 * driver.findElement(By.xpath(
		 * "//*[@id='SW']/div[2]/div[2]/div/div/nav/ul/li[10]/a/span[1]")); WebElement
		 * moremenuSubItem = driver.findElement(By.xpath(
		 * "//*[@id='SW']/div[2]/div[2]/div/div/nav/ul/li[10]/div/a[1]")); Actions
		 * onMoreMenu = new Actions(driver);
		 * onMoreMenu.moveToElement(moremenu).perform(); moremenuSubItem.click();
		 */
		
		//slider
		
		/*
		 * driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); WebElement
		 * sliderBtn = driver.findElement(By.xpath("//*[@id='slider']/span"));
		 * WebElement sliderBar = driver.findElement(By.xpath("//*[@id='slider']"));
		 * Actions moveSliderBtn = new Actions(driver);
		 * moveSliderBtn.dragAndDropBy(sliderBtn, sliderBar.getSize().width/2,
		 * 0).perform();
		 */
		 
		
		//drag and drop
		
		/*
		 * driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * WebElement dragItem = driver.findElement(By.xpath("//*[@id='draggable']"));
		 * WebElement onDropItem =
		 * driver.findElement(By.xpath("//*[@id=\"droppable\"]")); Actions doDragDrop =
		 * new Actions(driver); doDragDrop.dragAndDrop(dragItem, onDropItem).perform();
		 */
		 
		
		
		//resizable
		/*
		 * driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); WebElement
		 * resizeItem = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		 * Actions doResize = new Actions(driver); for(int i=100;i<=400;i+=100) {
		 * doResize.dragAndDropBy(resizeItem, i, i).perform(); Thread.sleep(3000); }
		 */
		
		
		
		//right click = context menu
		/*
		 * driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); WebElement
		 * img = driver.findElement(By.xpath(
		 * "/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"
		 * )); Actions rightClick = new Actions(driver);
		 * rightClick.contextClick(img).perform(); WebElement productItem =
		 * driver.findElement(By.xpath("//*[@id=\"dm2m1i1tdT\"]")); new
		 * Actions(driver).moveToElement(productItem).perform(); new
		 * Actions(driver).moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"dm2m2i1tdT\"]"))).perform(); new
		 * Actions(driver).moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"dm2m3i1tdT\"]"))).perform();
		 * driver.findElement(By.xpath("//*[@id=\"dm2m3i1tdT\"]")).click();
		 */
		
		//intial open the browser window in small size and gradually increase the size.
		
		  int width=100; int height=100;
		  driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		  driver.manage().window().setSize(new Dimension(width,height)); 
		  for(int i=1;i<=5;i++) 
		  { 
			  width+=200; height+=100; 
			  Thread.sleep(2000);
			  driver.manage().window().setSize(new Dimension(width, height)); 
		  }
		 
		
		//press enter key		
		
		/*
		 * driver.get("http://www.gmail.com"); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); WebElement
		 * email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		 * email.sendKeys("raajnarora@gmail.com"); Actions actionEnter = new
		 * Actions(driver); actionEnter.sendKeys(Keys.ENTER).perform();
		 */
		 
		 
		 //select all, copy, paste
		/*
		 * driver.get("http://www.gmail.com"); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * //click outside
		 * driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div")
		 * ).click(); Actions action = new Actions(driver); //select all
		 * action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform(); //do copy
		 * action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		 * 
		 * //use above two actions in one statement, so first build, then only perform
		 * //action.sendKeys(Keys.chord(Keys.CONTROL+"a")).sendKeys(Keys.chord(Keys.
		 * CONTROL+"c")).build().perform();
		 * 
		 * //click in email box driver.findElement(By.id("identifierId")).click();
		 * 
		 * //paste the content action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		 */
	}

}
