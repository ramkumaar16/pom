package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class projectmethod extends SeMethods {
	//@BeforeMethod(groups="file")
	@Parameters
	
 public void login1() {
   
	StartApp("chrome", "http://www.leaftaps.com/opentaps");
	WebElement eleUsername = LocateElement("id", "username");
	type(eleUsername, "DemoSalesManager");
	WebElement elepass = LocateElement("id", "password");
	type(elepass, "crmsfa");
	WebElement elelogin = LocateElement("class", "decorativeSubmit");
	click(elelogin);
	WebElement openText  = LocateElement("LinkText","CRM/SFA");
	click(openText);

	
	
	}
@AfterMethod(groups="offer")
	public void closeBrowser()
	{
		closeBrowser();
	}
	}
