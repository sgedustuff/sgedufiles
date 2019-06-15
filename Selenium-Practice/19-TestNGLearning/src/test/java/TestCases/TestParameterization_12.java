package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization_12 {

	@Test(dataProvider = "getCredentials")
	public void login(String unm, String pass) {
		System.out.println(unm);
		System.out.println(pass);
	}

	@DataProvider
	public Object[][] getCredentials()
	{
		//3 rows and 2 columns.
		//3 records and each record has username and password.
		Object[][] data = new Object[3][2];
		
		data[0][0] = "username1";
		data[0][1] = "password1";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		
		data[2][0] = "username3";
		data[2][1] = "password3";
		
		return data;
	}

}
