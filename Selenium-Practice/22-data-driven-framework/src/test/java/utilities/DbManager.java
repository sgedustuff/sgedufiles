package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class DbManager
{
	private static Connection con = null; //sql
	private static Connection conn = null; //mysql

	//SQL Server
	public static void setDbConnection() throws SQLException, ClassNotFoundException
	{
		try{
		Class.forName(DBConfig.driver);
		con =	DriverManager.getConnection(DBConfig.dbConnectionUrl, DBConfig.dbUserName, DBConfig.dbPassword);
		
		if(!con.isClosed())
			System.out.println("Successfully connected to SQL server");
			
	}catch(Exception e){
		System.err.println("Exception: " + e.getMessage());

		//monitoringMail.sendMail(DBConfig.server, DBConfig.from, DBConfig.to, DBConfig.subject+" - (Script failed with Error, Datamart database used for reports, connection not established)", DBConfig.messageBody, DBConfig.attachmentPath, DBConfig.attachmentName);			
		}
		
		
	}
	
	public static void setMysqlDbConnection() throws SQLException, ClassNotFoundException
    {
    try
    {
        
        Class.forName (DBConfig.mysqldriver);
        conn = DriverManager.getConnection (DBConfig.mysqlurl, DBConfig.mysqluserName, DBConfig.mysqlpassword);
        if(!conn.isClosed())
			System.out.println("Successfully connected to MySQL server");
        
	
    }
    catch (Exception e)
    {
        System.err.println ("Cannot connect to database server");
       
       // monitoringMail.sendMail(DBConfig.server, DBConfig.from, DBConfig.to, DBConfig.subject+" - (Script failed with Error, Datamart database used for reports, connection not established)", DBConfig.messageBody, DBConfig.attachmentPath, DBConfig.attachmentName);
    }
   

}
	
	
	
	
		
	public static List<String> getQuery(String query) throws SQLException{
		
		//String Query="select top 10* from ev_call";
		Statement St = con.createStatement();
		ResultSet rs = St.executeQuery(query);
		List<String> values = new ArrayList<String>();
		while(rs.next()){
		
			values.add(rs.getString(1));
			
		}
		return values;
	}
	
	public static List<String> getMysqlQuery(String query) throws SQLException{
		
		
		Statement St = conn.createStatement();
		ResultSet rs = St.executeQuery(query);
		List<String> values1 = new ArrayList<String>();
		while(rs.next()){
			
			values1.add(rs.getString(1));
			
			
		}
		return values1;
	}
	
	
	
	
	
	
	
	
	public static Connection getConnection()
	{
		return con;
			}
}
