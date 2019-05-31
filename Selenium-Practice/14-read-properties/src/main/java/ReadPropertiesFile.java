import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties ORproperties = new Properties();
		FileInputStream fis_or = new FileInputStream(".\\src\\test\\resources\\properties\\OR.properties");		
		ORproperties.load(fis_or);				
		System.out.println(ORproperties.getProperty("username"));
		System.out.println(ORproperties.getProperty("password"));
		
		Properties CONFIGproperties = new Properties();
		FileInputStream fis_config = new FileInputStream(".\\src\\test\\resources\\properties\\CONFIG.properties");		
		CONFIGproperties.load(fis_config);				
		System.out.println(CONFIGproperties.getProperty("sitename"));
		System.out.println(CONFIGproperties.getProperty("browser"));
	}

}
