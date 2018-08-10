package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class homewwork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		System.out.println(driver.getTitle());
		Set<String> allWindow = driver.getWindowHandles();
		List<String> allList  = new ArrayList<String>();
		allList.addAll(allWindow);
		driver.switchTo().window(allList.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("aaa");
		driver.findElementByXPath("//button[@class='x-btn-text']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//a[@class='linktext']").click();
		Set<String> allwindow = driver.getWindowHandles();
		List<String> alllist  = new ArrayList<String>();
		alllist.addAll(allwindow);
		driver.switchTo().window(alllist.get(0));
		
		
		
		

	}

}
