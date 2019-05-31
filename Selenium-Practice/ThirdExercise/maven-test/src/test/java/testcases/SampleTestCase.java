package testcases;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import utilities.ReadConfig;
public class SampleTestCase {

	@Test
	public void testReadPropertiesFile()
	{
		//ReadConfig obj = new ReadConfig();
		System.out.println(ReadConfig.USERNAME);
	}
	
	@Test
	public void testGenerateApplicationLog()
	{
		Logger log = Logger.getLogger("devpinoyLogger");
		log.debug("OR Properties loaded");
		log.debug("Config Properties loaded");
		
	}

}
