package normal;

import org.openqa.selenium.chrome.ChromeDriver;

public class day4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load U
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//Enter username	
		driver.findElementById("username").sendKeys("Demosalesmanager");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login button
		driver.findElementByClassName("decorativeSubmit").click();
		//click logout
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Find Leads").click();
        driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("k");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(1000);
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
        driver.findElementByLinkText("Edit").click();
        
        
        
	}

}
