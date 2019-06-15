package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterization_FromTestNGXML_13 {
	
	@Parameters({"fnms", "lnms", "mnms"})
	@Test
	public void signup(String fnm, String lnm, String mnm)
	{
		System.out.println(fnm);
		System.out.println(lnm);
		System.out.println(mnm);
	}
}
