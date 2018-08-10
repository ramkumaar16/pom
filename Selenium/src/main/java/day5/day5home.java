package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class day5home {

	public static void main(String[] args) {
		
					System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
					ChromeDriver driver = new ChromeDriver();
					//load U
					driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
					driver.manage().window().maximize();
				driver.findElementByLinkText("AGENT LOGIN").click();
                driver.findElementByXPath("//a[text()[contains(.,'Contact Us')]]").click();
                driver.manage().window().maximize();
                System.out.println(driver.getTitle());
                driver.close();
                Set<String> allWindow = driver.getWindowHandles();
                List<String> allList = new ArrayList<String>();
                allList.addAll(allWindow);
                driver.switchTo().window(allList.get(0));
                System.out.println(driver.getTitle());
               // driver.close();
                	 
               
	
                
	}
	
	

}
