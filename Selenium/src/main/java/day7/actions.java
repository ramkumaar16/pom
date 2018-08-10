package day7;

import static org.junit.Assert.assertArrayEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load U
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//a[text()='Selectable']").click();
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		System.out.println(driver.getTitle());
		WebElement clickLinks  = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement clickLinks2 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement clickLinks3 = driver.findElementByXPath("//li[text()='Item 5']");
		System.out.println(driver.getTitle());
		Actions builder = new Actions(driver);
        builder.keyDown(Keys.CONTROL).click(clickLinks).click(clickLinks2).click(clickLinks3).perform();		
        System.out.println(driver.getTitle());

	}

}
