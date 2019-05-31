package DemoTestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DemoTestCase6 {

	
	
	/*
	- if testng.xml looks like, then it means the testsuite is collection of one testing module.
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
	<suite name="DemoTestSuite">
	  <test name="TestFirstModule">
	    <classes>
	      <class name="DemoTestCases.DemoTestCase1"/>
	      <class name="DemoTestCases.DemoTestCase2"/>
	      <class name="DemoTestCases.DemoTestCase3"/>
	      <class name="DemoTestCases.DemoTestCase4"/>
	      <class name="DemoTestCases.DemoTestCase5"/>
	      <class name="DemoTestCases.DemoTestCase6"/>
	    </classes>
	  </test> <!-- TestFirstModule --> 
	</suite> <!-- DemoTestSuite -->
	
	
	- if testng.xml looks like, then it means, testsuite is collection of two test modules
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
	<suite name="DemoTestSuite">
	  <test name="TestFirstModule">
	    <classes>
	      <class name="DemoTestCases.DemoTestCase1"/>
	      <class name="DemoTestCases.DemoTestCase2"/>
	      <class name="DemoTestCases.DemoTestCase3"/>
	    </classes>
	  </test> <!-- TestFirstModule -->
	  
	  <test name="TestSecondModule">
	    <classes>
	      <class name="DemoTestCases.DemoTestCase4"/>
	      <class name="DemoTestCases.DemoTestCase5"/>
	      <class name="DemoTestCases.DemoTestCase6"/>
	    </classes>
	  </test> <!-- TestSecondModule -->
	  
	</suite> <!-- DemoTestSuite --> 
	
	
	- To run complete suite
		right click on testng.xml
		run as
		TestNG Suite.
	
	
	*/



	
	/*
	 Here how to pass, fail and skip the test methods
	 */
	
	@Test
	public void demoPassTest()
	{
		String actualContent = "DemoTestCase6_hello";
		String expectedContent = "DemoTestCase6_hello";
		Assert.assertEquals(actualContent, expectedContent);
		
	}

	@Test
	public void demoFailTest()
	{
		String actualContent = "DemoTestCase6_hello";
		String expectedContent = "DemoTestCase6_bye";
		Assert.assertEquals(actualContent, expectedContent);
	}
	
	@Test
	public void demoSkipTest()
	{
		throw new SkipException("DemoTestCase6=>This test has been skipped, as of now, it is not in use");
	}
	
	@Test
	public void demoFailAnotherTest()
	{
		Assert.assertTrue(false,"DemoTestCase6=>It has been failed, because condition is not met");
	}
}
