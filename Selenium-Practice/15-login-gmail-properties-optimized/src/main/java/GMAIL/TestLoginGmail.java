package GMAIL;

import java.io.IOException;

public class TestLoginGmail {
	
		
	String loginMsg = null;	
	ElementAction ea = null;
	
	public TestLoginGmail () throws IOException 
	{	
		ea = new ElementAction();										
	}
	
	public boolean performLogin(String emailid)
	{
		boolean response = false;		
		ea.type("username_id", emailid);		
		ea.click("nextbtn_css");	
		loginMsg = ea.getContent("errorinfo_xpath");		
		if (loginMsg.length()>10)
		{
			response= false;
		}
		else
		{
			response= true;
		}
		//driver.quit();
		return response;
	}
}


