package day5;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load U
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElementByXPath("//iframe");
		driver.switchTo().frame(ele);
		driver.switchTo().parentFrame();
		
		
        driver.findElementByXPath("//button[text()[contains(.,'Close Me')]]").click();
        

	}

}
