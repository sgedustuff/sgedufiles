package testnglearning;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Case2 {
	
	
	@Test(groups="high")
	public void validateTitles() {
		
		
		String actual_title = "Gmail.com";
		String expected_title = "Yahoo.com";
		
	/*	if(actual_title.equals(expected_title)) {
			
			System.out.println("Test case pass");
		}else {
			
			System.out.println("Test case fail");
		}*/
		/*System.out.println("Beginning");
	
		
		
		
		System.out.println("Ending");*/
		System.out.println("Beginning");
		boolean isPresent = false;
		
		SoftAssert softAssert = new SoftAssert();
		
	/*	Assert.assertEquals(actual_title, expected_title);
		Assert.assertTrue(isPresent,"Element not found");
		Assert.fail("Test failed as the condition is not met");
	*/	
		
		softAssert.assertEquals(actual_title, expected_title);
		softAssert.assertTrue(isPresent,"Element not found");
		softAssert.fail("Test failed as the condition is not met");
		
		System.out.println("Ending");
		
		softAssert.assertAll();
		
		
		
	}

}
