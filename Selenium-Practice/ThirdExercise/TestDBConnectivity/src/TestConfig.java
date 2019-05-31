

public class TestConfig{


	
	public static String server="smtp.gmail.com";
	public static String from = "raajnarora@gmail.com";
	public static String password = "Rajan1980";
	public static String[] to ={"raajnarora@gmail.com","raajnarora@gmail.com"};
	public static String subject = "Test Mail";
	
	public static String messageBody ="TestMessage";
	public static String attachmentPath="D:/Selenium/test_screenshot.jpg";
	public static String attachmentName="Error.jpeg";
	public static String reportPath = System.getProperty("user.dir")+"//Reports.zip";
	
	
	
	//SQL DATABASE DETAILS	
	public static String driver="net.sourceforge.jtds.jdbc.Driver"; 
	public static String dbConnectionUrl="jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval"; 
	public static String dbUserName="sa"; 
	public static String dbPassword="$ql$!!1"; 
	
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver="com.mysql.cj.jdbc.Driver";
	public static String mysqluserName = "root";
	public static String mysqlpassword = "admin";
	public static String mysqlurl = "jdbc:mysql://localhost:3306/sas";
	
	
	
	
	
	
	
	
	
}
