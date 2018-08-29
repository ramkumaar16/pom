package RealTime;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MyDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("http://www.tnpsc.gov.in/");
		//driver.manage().window().maximize();
		driver.findElementByLinkText("One-time Registration").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("One Time Registration").click();
		driver.get("https://tnpsconline.in/otr/tfrmregstage.aspx");
		/*driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id=\"ctl00_MainContent_txtInitials\"]").sendKeys("N");
		driver.findElementByXPath("//input[@id=\"ctl00_MainContent_txtName\"]").sendKeys("SARAN");
		//driver.findElementByXPath("//*[@id=\"ctl00_MainContent_txtDOB\"]").sendKeys("");
		Select select = new Select(driver.findElementByClassName("mainheading"));
		select.selectByValue("5");
		select.selectByValue("1993");*/
		http://www.tnpscexams.in/upage.html//driver.findElementByLinkText("One Time Registration").click();
		driver.get("");
		
		

	}

}
