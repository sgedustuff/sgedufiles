import java.util.concurrent.TimeUnit;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;

public class TestAuthenticationAlert {

	public static void main(String[] args) {

		//Registeration page - 2 elements with same xpath, id, name
		//findElement - findElements -list index 0.click, 1.sendkeys
		//
		
		//WebTables
		
		//http://www.espncricinfo.com/indian-premier-league-2016/engine/match/980909.html
		//http://www.timeanddate.com/worldclock/

		

		WebDriver driver = new FirefoxDriver();

		
		driver.navigate().to("http://getproactiv-ca.stg01.grdev.com/");
		
		//driver.switchTo().alert().authenticateUsing((Credentials) new UsernamePasswordCredentials("grcdev", "nearlythere"));


	}

}
