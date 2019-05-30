package testnglearning;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase3 {
	
	
	@Test(priority=1,groups= {"high","med"})
	public void doUserReg() {
		
		System.out.println("Executing User Reg test");
		Assert.fail("User not registered successfully");
		
	}
	
	@Test(priority=2,dependsOnMethods="doUserReg",groups= {"high","med"})
	public void doLogin() {
		
		System.out.println("Executing login test");
		
	}
	
	@Test(priority=3,groups="med")
	public void isSkip() {
		
		throw new SkipException("Skipping the test as the condition is not met");
	}

}
