package Selenium21AUG;

import org.openqa.selenium.WebElement;

public interface GmailMyInterface {

	public void browserlaunch(String browser,String url);

	public WebElement Selectlocator(String locator,String locvalue);


	public void write(WebElement ele,String data );


	public void simpleclick(WebElement ele);
	
	
	public void quitebrowser(WebElement ele);
	



}
