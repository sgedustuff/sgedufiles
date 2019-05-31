package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	public static  String USERNAME;
	
	static
	{
		try
		{
			Properties configinfo = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
			configinfo.load(fis);
			USERNAME = configinfo.getProperty("username");		
		}catch(Exception ex){}
	}
	
	
	
}
