package rough;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Page;
import pages.HomePage;
import pages.LandingPage;
import pages.ProfilePage;

public class LoginTest {

	public static void main(String[] args) {

		// As we land on face book landing page, after login
		// u will see push notifications
		// u will probably see notification bar
		// that says chrome is being controlled by automation testing.
		// so refer below code to disable the above mentioned issues.

		/*
		 * Map<String, Object> prefs = new HashMap<String, Object>();
		 * prefs.put("profile.default_content_setting_values.notifications", 2);
		 * prefs.put("credentials_enable_service", false);
		 * prefs.put("profile.password_manager_enabled", false); ChromeOptions options =
		 * new ChromeOptions(); options.setExperimentalOption("prefs", prefs);
		 * options.addArguments("--disable-extensions");
		 * options.addArguments("--disable-infobars");
		 * 
		 * WebDriver driver = new ChromeDriver(options);
		 * driver.get("http://www.facebook.com"); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		 * 
		 * HomePage hp = new HomePage(driver); hp.doLogin("raajnarora@gmail.com",
		 * "Amrat@006");
		 * 
		 * LandingPage lp = new LandingPage(driver); lp.goToProfile();
		 * 
		 * ProfilePage pp = new ProfilePage(driver); pp.uploadPhoto();
		 */

		// 1)
		// till now code is working fine....
		// now u see ur all types of page class accepting
		// driver class object....so accepting driver class object and
		// assigning inside the respective page class...this process is getting
		// repeated.

		// 2)
		// to avoid create the master class that is "Page" Class
		// do below activities.
		// a) put common code in page class
		// b) all respective page class will inherit page class.
		// c) remove driver assignment process from respective page class

		/*
		 * HomePage hp = new HomePage(); hp.doLogin("raajnarora@gmail.com",
		 * "Amrat@006");
		 * 
		 * LandingPage lp = new LandingPage(); lp.goToProfile();
		 * 
		 * ProfilePage pp = new ProfilePage(); pp.uploadPhoto();
		 */

		// 3)
		/*
		 * a) the code will work for home page, but failure for next page b) because it
		 * instantiate the driver class object again and launch the browser c) u will
		 * see error NoSuchElement. -----------to avoid above mentioned
		 * thing------------- a)make the driver class object as static in "Page" object
		 * b) put the check in "Page" class constructor..if null then initialize
		 */

		// after doing above mentioned amendments
		// the same above mentioned code will start working.

		/*
		 * 4) a) so far, we will create respective page class object based on
		 * requirement. b) this is not good practice. means there is no issue with it c)
		 * but we will not create straight forward objects. ------------what is the main
		 * job of page object model--------- whichever method is responsible to take you
		 * to particular page must be resposible to return the object of that page. for
		 * e..g "do login" method of "home page" class is navigating to the
		 * "landing page", so "do login" method should return an object "landing page"
		 * class object and if any method keep u on the same page, so return the same
		 * class object like "upload photo" method keep u on same page. --------as of
		 * now our main goal is to automate the upload photo test case --------this
		 * involves a) login and move to landing page b) go to profile page from landing
		 * page c) execute "upload photo" functionality
		 */

		/*
		 * HomePage hp = new HomePage(); LandingPage lp =
		 * hp.doLogin("raajnarora@gmail.com", "Amrat@006") ProfilePage pp =
		 * lp.goToProfile(); pp.uploadPhoto();
		 */

		// or

		// new HomePage().doLogin("raajnarora@gmail.com",
		// "Amrat@006").goToProfile().uploadPhoto();

		// but we follow the above mechanism, as we need to perform two test cases
		// one is to perform login test case and other is to perform upload photo test
		// case.

		// so there is again one drawback, because we will have to implement common
		// functionality
		// in all business pages like logout, search.
		// so to overcome above mentioned issue, create class topnavigation,
		// leftnavigation and put
		// the functionality into them.

		// so below thing to understand
		// HomePage IS A PAGE = IS A represents = Inheritance
		// Page HAS A TopNavigation = HAS A represents = Encapsulation.
		// so create the object of TopNavigation class in page class
		//and write below code to call log out after upload photo

		HomePage hp = new HomePage();
		LandingPage lp = hp.doLogin("raajnarora@gmail.com", "Amrat@006");
		ProfilePage pp = lp.goToProfile();
		pp.uploadPhoto();
		Page.tn.logOut();
		
		//so now convert the above code into two test cases.
		//one is login test case.
		//other is uploadphoto test + logout.
	}

}
