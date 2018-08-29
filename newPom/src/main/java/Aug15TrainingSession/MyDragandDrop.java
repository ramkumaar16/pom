package Aug15TrainingSession;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyDragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		WebElement myiframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(myiframe);
		WebElement src = driver.findElementById("draggable");
		WebElement des = driver.findElementByTagName("position: relative; left: 352px; top: 6px;");
		String text = src.getText();
		System.out.println(text);
		Actions action = new Actions(driver);
		action.dragAndDrop(src, des).build().perform();
		//action.dragAndDropBy(src, 122, 225).build().perform();
		//action.moveToElement(src, 324, 47).build().perform();
		
	}

}
