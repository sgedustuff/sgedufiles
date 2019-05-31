import java.sql.SQLException;

import org.testng.annotations.Test;

public class TestDBFunctionality {

	@Test
	public void TestDBSelectResult() throws ClassNotFoundException, SQLException
	{
		DbManager.setMysqlDbConnection();
		System.out.println(DbManager.getMysqlQuery("select address from student where name = 'ajay'").get(0));
	}
	
}
