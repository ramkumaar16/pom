package day7;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load U
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
		WebElement Samsung = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		Actions builder = new Actions(driver);
		builder.moveToElement(Samsung).perform();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("Samsung").click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		WebElement minValue = driver.findElementByXPath("//select[@class='fPjUPw']");
		Select sel = new Select(minValue);
		sel.selectByIndex(3);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		/*List<WebElement> allOptions = sel.getOptions();
		int size = allOptions.size();
		sel.selectByIndex(size-5);
		Thread.sleep(3000);*/
		WebElement maxValue = driver.findElementByXPath("//select[@class='fPjUPw'][1]");
		Select sel2 = new Select(maxValue);
		sel.selectByIndex(1);
		System.out.println(driver.getTitle());
		
		   

		
		
		

	}

}
