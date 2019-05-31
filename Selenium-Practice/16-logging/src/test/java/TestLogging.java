import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogging {

	public static void main(String[] args) {

		/*steps to implement logging
		1) refer log4j jar file
		2) refer log4j.properties file
		3) load the properties
		4) create the object of logger by calling getLogger Method
		5) call method(like info, debug, error) on the object of logger for logging the message*/
		
	//load log4j properties.
		PropertyConfigurator.configure(
				"D:\\Rajan\\Selenium-Practice\\16-logging\\src\\test\\resources\\properties\\log4j.properties");
		
		Logger log = Logger.getLogger(TestLogging.class);

		log.info("1-info-message");		
		log.error("3-error-message");
		
		try
		{
			int res=10/0;
			
		}catch(Throwable t)
		{
			log.error("error in try block", t);
		}

	}

}
