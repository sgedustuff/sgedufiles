package DemoTestCases;

import org.testng.annotations.Test;

public class DemoTestCase1 {

	/*
	 Annotations
	 1. @Test = This will run the method, earlier we need main method to create an object and call the method
	 2. test-output = On refresh project, u will get such folder and underneath such folder, two special reports are created
	 	1. index.html
	 	2. emailable-report.html
	 3. When u will bring up such reports, you will find some default things
	 	1. testng-customsuite.xml = This contains name of test suite i.e. Default Suite
	 	2. Suite is collection of test cases
	 	3. Default test case name is "Default Test"
	 	4. test cases is collection of test classes.
	 */
	   
	
	@Test
	public void testLogin()
	{
		System.out.println("DemoTestCase1=>Testing login functionality");
	}
	
	@Test
	public void testRegistration()
	{
		System.out.println("DemoTestCase1=>Testing registartion functionality");
	}
}
