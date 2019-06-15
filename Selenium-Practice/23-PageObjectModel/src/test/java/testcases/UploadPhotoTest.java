package testcases;

import org.testng.annotations.Test;

import base.Page;
import pages.LandingPage;
import pages.ProfilePage;

public class UploadPhotoTest {

	@Test
	public void uploadPhtoto()
	{
		LandingPage lp = Page.tn.goToLandingPage();
		//or
		//LandingPage lp = new LandingPage();
		
		ProfilePage pp = lp.goToProfile();
		pp.uploadPhoto();
		Page.tn.logOut();
	}
}
