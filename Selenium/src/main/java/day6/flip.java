package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class  flip {
	@Test

	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				//load U
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				driver.getKeyboard().sendKeys(Keys.ESCAPE);
				//driver.findElementByXPath("//button[text()='✕']").click();
				WebElement men = driver.findElementByXPath("//span[text()='Men']");
				Actions builder = new Actions(driver);
				builder.moveToElement(men).perform();
				Thread.sleep(2000);
				driver.findElementByXPath("//span[text()='Shirts']").click();
				Thread.sleep(3000);	
				WebElement Women = driver.findElementByXPath("//span[text()='Women']");
				Actions builder1 = new Actions(driver);
				builder1.moveToElement(Women).perform();
				Thread.sleep(3000);
				driver.findElementByXPath("//span[text()='Flats']").click();
				Thread.sleep(2000);

		}

	}
 

