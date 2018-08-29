package RealTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyIFramegroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		//driver.switchTo().frame(0);
		WebDriver frame = driver.switchTo().frame("demo-frame");
		//WebElement findElementById = driver.findElementById("draggable");
		//driver.switchTo().frame("findElementById");
		//String text = findElementById.getText();
		System.out.println(frame.getTitle());
	}

}
