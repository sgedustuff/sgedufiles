package testnglearning;
import org.testng.annotations.Test;

public class TestGroups {
	
	@Test(groups = "high")
	public void TestFacebookDashBoard() {
		System.out.println("high test case=>TestFacebookDashBoard");
	}
	
	@Test(groups = {"low", "medium"} )
	public void TestFaceBookLogin() {
		System.out.println("low&medium test case=>TestFaceBookLogin");
	}
	
	@Test(groups = "medium")
	public void TestProfiles()
	{
		System.out.println("medium test case=>TestProfiles");
	}
	
	@Test(groups = "low")
	public void TestFacebookRegistration()
	{
		System.out.println("low test case=>TestFacebookRegistration");
	}
}