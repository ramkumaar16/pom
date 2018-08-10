package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethod implements WdMethods{
	RemoteWebDriver driver;
	
	

	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();			
			} else if(browser.equalsIgnoreCase("firefox")) {			
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("No Driver Found");
			//throw new RuntimeException(); 
		}

	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id":return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);		
			case "xpath": return driver.findElementByXPath(locValue);
			case "LinkText": return driver.findElementByLinkText(locValue);
			}
			
		}   catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}catch (WebDriverException e) {
			System.err.println("WebDriver Exception has occurecd");
			throw new RuntimeException();
			
			}
		

	//public WebElement locateElement(String locValue) {
		finally {

			takeSnap();
			
		}
		System.out.println("This Element Loacated Successfully using "+locator);
		return null;
	}
	
	public void type(WebElement ele, String data) {	
	    ele.clear();
		ele.sendKeys(data);
		System.out.println("This Element typed Successfully using "+ele);
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("This Element Clicked Successfully using "+ele);
		takeSnap();
	}

	public void clickWithNoSnap(WebElement ele) {
		// TODO Auto-generated method stub
		ele.click();
		System.out.println("This Element Clicked Successfully using "+ele);

	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
        Select sel = new Select(ele);
        sel.selectByVisibleText(value);	
   
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
        Select sel = new Select(ele);
        List<WebElement> allOptions = sel.getOptions();
		int size = allOptions.size();
		sel.selectByIndex(size);
		System.out.println(allOptions.get(size));
		
		}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String A = ele.getText();
		System.out.println();
		if(A.equals(expectedText))
		{
			System.out.println("verified");
			
		}
		else
		{
           System.out.println("not verified");
	}
	}
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
           try {
			Set<String> allWindows = driver.getWindowHandles();
			   List<String> allList = new ArrayList<String>();
			   allList.addAll(allWindows);
			   driver.switchTo().window(allList.get(index));
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("no Window");
			throw new RuntimeException();}
			catch (WebDriverException e) {
		    System.err.println("WebDriver Exception has occurecd");
			throw new RuntimeException();
				
		}
		
           
           
	}
	

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
		

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().getText();		
		return null;
	}
	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		i++;

	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
       driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.close();

	}

	@Override
	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	}





