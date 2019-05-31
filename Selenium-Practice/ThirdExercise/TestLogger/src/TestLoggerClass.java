import org.apache.log4j.Logger;

public class TestLoggerClass {
	
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static void main(String[] args)
	{
		
		log.debug("OR Properties loaded");
		log.debug("Config Properties loaded");
	}
}
