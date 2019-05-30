package testnglearning;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestngParameters {

	
	@Parameters({"browser","url"})
	@Test
	public void testBrowser(String browser,String url) throws InterruptedException {
		
		System.out.println(browser+"---"+url);
		Date d = new Date();
		System.out.println(d);
		Thread.sleep(2000);
	}
}
