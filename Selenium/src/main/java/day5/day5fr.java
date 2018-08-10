package day5;

import org.openqa.selenium.chrome.ChromeDriver;

public class day5fr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Tony Strak");
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		String name="Tony Strak";
		String actualText  = driver.findElementById("demo").getText();
		
		//WebDriver frame = driver.switchTo().frame("text");
		if(actualText.contains(name))
		{
			
			System.out.println("pass");
		}
		else {
	
	        System.out.println("fail");     
	}

}
}