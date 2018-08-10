package homeirctc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeDriverService;

//import org.openqa.selenium.chrome.ChromeDriver;


public class irctc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("userRegistrationForm:userName").sendKeys("ram7895");
		driver.findElementById("userRegistrationForm:password").sendKeys("9750036521@ram");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("9750036521@ram");
		WebElement source = driver.findElementById("userRegistrationForm:securityQ");
		Select sel = new Select(source);
		sel.selectByIndex(7);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("honda");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Ramkumaar");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Murugesan");
		driver.findElementByXPath("//label[text()=' Male']").click();
		driver.findElementByXPath("//label[text()=' Unmarried']").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("16");
		/*WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
		Select sel = new Select(month);
		sel.selectByIndex(6);
		WebElement birth = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select sel = new Select(birth);
		sel.selectByIndex(6);
		*/
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("JUN");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1995");
        WebElement work = driver.findElementById("userRegistrationForm:occupation");
        Select sel1 = new Select(work);
        sel1.selectByVisibleText("Private");
        WebElement country = driver.findElementById("userRegistrationForm:countries");  
        Select sel2 =new Select(country);
        sel2.selectByVisibleText("India");
        driver.findElementById("userRegistrationForm:email").sendKeys("123@gmail.com");
        driver.findElementById("userRegistrationForm:mobile").sendKeys("8526749111");
        WebElement national = driver.findElementById("userRegistrationForm:nationalityId");
        Select sel3 =new Select(national);
        sel3.selectByVisibleText("India");
        
		
		
		
		
		
		
		

	}

}
