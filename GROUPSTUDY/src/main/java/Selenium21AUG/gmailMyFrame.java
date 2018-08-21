package Selenium21AUG;

import org.openqa.selenium.WebElement;

public class gmailMyFrame extends GmailMySeleniumMethods {


	public void signupgmail() {


		browserlaunch("chrome", "http://gmail.com");
		WebElement selectlocator = Selectlocator("LinkText", "Create account");
		

	}

}
