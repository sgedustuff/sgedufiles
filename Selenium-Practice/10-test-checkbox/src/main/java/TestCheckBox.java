import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();

		// get checkboxes of particular area
		WebElement block = driver.findElement(By.xpath("//form[@action='dummy']/table[1]"));

		List<WebElement> elements = block.findElements(By.name("Checkbox"));		
		System.out.println("Number of checkboxes are=>" + elements.size());
		
		//access particular checkboox
		WebElement checkbox = elements.get(1);
		System.out.println(checkbox.isSelected() + " " + checkbox.isEnabled() + " " + checkbox.getAttribute("value"));
		
		//checked the unchecked elements
		for (WebElement e : elements) {
			if (!e.isSelected()) {
				e.click();
			}
		}
		
		Thread.sleep(3000);
		
		//unchecked the checked elements through simple for loop
		for(int i=0; i<elements.size(); i++)
		{
			if(elements.get(i).isSelected())
			{
				elements.get(i).click();
			}
		}
		
		
	}

}
