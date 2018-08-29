package Newpackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/login/");
		//driver.get("https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Sign up for Facebook").click();
		driver.findElementByXPath("//input[@name='firstname']").sendKeys("ram");
		driver.findElementByXPath("//input[@name='lastname']").sendKeys("kumaar");
		driver.findElementByXPath("//input[@name='reg_email__']").sendKeys("123ramcm@gmail.com");
		driver.findElementByXPath("//input[@name='reg_passwd__']").sendKeys("888855522");
		driver.findElementByXPath("//input[@name='reg_email_confirmation__']").sendKeys("123ramcm@gmail.com");


		WebElement findElementByXPath = driver.findElementByXPath("//select[@id=\"day\"]");
		Select sl = new Select(findElementByXPath);
		sl.selectByValue("16");
		WebElement findElementByXPath2 = driver.findElementByXPath("//select[@id=\"month\"]");
		Select s2 = new Select(findElementByXPath2);
		s2.selectByIndex(6);
		WebElement year = driver.findElementByXPath("//select[@id=\"year\"]");
		Select sel =new Select(year);
		sel.selectByVisibleText("1995");	

		driver.findElementByXPath("(//input[@name='sex'])[2]").click();
		driver.findElementByXPath("//button[@name='websubmit']").click();

	}
*/
	public static void main(String[] args) {
        Dog maltese = new Dog();
        maltese.breed="Maltese";
        maltese.size="Small";
        maltese.age=2;
        maltese.color="white";
        System.out.println(maltese.getInfo());
    }
}
}
