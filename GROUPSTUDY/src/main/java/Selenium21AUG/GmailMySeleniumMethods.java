package Selenium21AUG;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GmailMySeleniumMethods implements GmailMyInterface {
	public	RemoteWebDriver driver;
	public void browserlaunch(String browser, String url) {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver =  new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		String myURL = "http://gmail.com";
		//driver.navigate().to(myURL);
		driver.get(myURL);
		driver.manage().window().maximize();
	}



	public WebElement Selectlocator(String locator, String locvalue) {
		switch (locator)	{
		case "id":
			return driver.findElementById(locvalue);
		case "classname":
			return driver.findElementByClassName(locvalue);
		case "xpath": return driver.findElementByXPath(locvalue);
		case "LinkText": return driver.findElementByLinkText(locvalue);
		}
		System.out.println("locate element successfully");
		return null;
	}

	public void write(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		System.out.println("element write successfully");
	}

	public void simpleclick(WebElement ele) {
		ele.click();
		System.out.println("element clicked successfully");

	}

	public void quitebrowser() {
		driver.close();


	}



	@Override
	public void quitebrowser(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

}
