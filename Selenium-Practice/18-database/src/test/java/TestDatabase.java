import java.sql.SQLException;

import utilities.DbManager;

public class TestDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DbManager.setMysqlDbConnection();
		System.out.println(DbManager.getMysqlQuery("select sname from student where rno = 5").get(0));

	}

}