package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LandingPage;

public class LoginTest {

	@Test
	public void logIn() {
		HomePage hp = new HomePage();
		hp.doLogin("raajnarora@gmail.com", "Amrat@006");
	}
	
}
