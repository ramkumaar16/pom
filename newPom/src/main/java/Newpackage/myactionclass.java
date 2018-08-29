package Newpackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myactionclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		WebElement findElementByXPath = driver.findElementByXPath("//span[text()='Women']");
		Actions action = new Actions(driver);
		action.moveToElement(findElementByXPath).perform();
		driver.findElementByXPath("(//a[text()='Jeans'])[2]").click();
		
	}

}
