import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestIE {

	public static void main(String[] args) {


		 DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
         ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
true);
         
         
         WebDriver driver = new InternetExplorerDriver(ieCapabilities);
         
	}

}
