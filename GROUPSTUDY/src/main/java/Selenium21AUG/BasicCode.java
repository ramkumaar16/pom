package Selenium21AUG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		//driver.get("http://gmail.com");
		String url = "http://gmail.com";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		//driver.findElementByLinkText("Create account");
		driver.findElementByXPath("//span[text()='Create account']").click();
		driver.findElementById("firstName").sendKeys("KARTHY");
		driver.findElementById("lastName").sendKeys("KUTTY");
		driver.findElementById("username").sendKeys("KarthyKutty1234");
		driver.findElementByName("Passwd").sendKeys("Karthy@1234");
		driver.findElementByName("ConfirmPasswd").sendKeys("Karthy@1234");
		driver.findElementByLinkText("Next").click();
		
	}

}
