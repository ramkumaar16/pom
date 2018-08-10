package day7;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load U
		driver.get("https://www.google.co.in/search?ei=wIRFW7eqB8z1vgT2hKfYDA&q=vijay&oq=vijay&gs_l=psy-ab.3..0i67k1l3j0i131k1j0i67k1l2j0l4.1287150.1290025.0.1291452.14.9.0.0.0.0.210.1100.0j4j2.7.0....0...1.1.64.psy-ab..7.7.1315.6..35i39k1j0i10i67k1j0i20i263k1j0i131i67k1.216.mu9zVL7eFVs");
		driver.manage().window().maximize();
		/*List<WebElement> WikiPedia = driver.findElementsByXPath("//a[text()[contains(.,'Ram')]]");
		int size = WikiPedia.size();
		System.out.println(size);
		WikiPedia.get(5).click();*/
		List<WebElement> allLink = driver.findElementsByXPath("//a[text()[contains(.,'Vijay')]]");
		int size = allLink.size();
		System.out.println(size);
		allLink.get(6).click();
		
	}

}
