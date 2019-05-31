package TestGmail;

import java.io.IOException;

import GMAIL.TestLoginGmail;

public class LoginGmail {

	public static void main(String[] args) throws IOException {			
		TestLoginGmail objTestLoginGmail = new TestLoginGmail();		
		System.out.println(objTestLoginGmail.performLogin("raajnarora@gmail.com"));
	}

}
