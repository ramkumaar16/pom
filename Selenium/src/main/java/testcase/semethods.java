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
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethod {
RemoteWebDriver driver;
	@Override
	public void StartApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
				}
			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			}
			else if(browser.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
				driver = new OperaDriver();
			}
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get(url);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Web Loading Error");
			throw new RuntimeException();
		} catch (NullPointerException e) {
			System.err.println("Driver not Exists");
			throw new RuntimeException();
			
		}
		
	}

	@Override
	public WebElement LocateElement(String locator, String locValue) {
		try {
			switch (locator){
			case "id": return driver.findElementById(locValue);
			//break;
			case "class" :return driver.findElementByClassName(locValue);
			//break;
			case "xpath" :return driver.findElementByXPath(locValue);
			//break;
			case "name" : return driver.findElementByName(locValue);
			//break;
			case "linkText": return driver.findElementByLinkText(locValue);
					//break;
			}
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Element Not Found");
			throw new RuntimeException();
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.err.println("Web Loading Error");
		throw new RuntimeException();
	}
		System.out.println("This Element Loacated Successfully using "+locator);
		return null;
	}

	@Override
	public WebElement LocateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void type(WebElement ele, String Data) {
		ele.clear();
		ele.sendKeys(Data);
		System.out.println("This Element typed Successfully using");
		takesnap();
		
	}

	@Override
	public void click(WebElement ele) {
		ele.click();
		System.out.println("This Element Clicked Successfully using "+ele);
		takesnap();		
	}

	@Override
	public void ClickWithoutSnap(WebElement ele) {
		ele.click();
		System.out.println("This Element Clicked Successfully using "+ele);
		
	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SelectDropDownUsingText(WebElement ele, String Value) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(Value);
		takesnap();
		
	}

	@Override
	public void SelectDropDownUsingIndex(WebElement ele, int Index) {
		Select sel = new Select(ele);
		List<WebElement> alloptions = sel.getOptions();
		int size = alloptions.size();
		sel.selectByIndex(size);
		takesnap();
		
	}

	@Override
	public boolean varifyTitle(String ExpectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String ExpectedText) {
		String A = ele.getText();
		System.out.println(A);
	if(A.equals(ExpectedText))
		{
			System.out.println("VERIFIED");
		}
		else
		{
			System.out.println("NOT VERIFIED_________________"+ ExpectedText);
		}
		
	}

	@Override
	public void varifyPartialText(WebElement ele, String ExpectedValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void varifyExtactAttributes(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void varifyPartialAttributes(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void varifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void varifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToWindow(int index) {
		try {
			Set<String> AllWindows = driver.getWindowHandles();
			List<String> AllList =new ArrayList<String>();
			AllList.addAll(AllWindows);
			driver.switchTo().window(AllList.get(index));
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("No Such Window found");
			throw new RuntimeException();
		}
		catch (WebDriverException e) {
			System.out.println("Webdriver not Found");
			throw new RuntimeException();
		}
		// TODO Auto-generated method stub
	
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptAlert() {
		driver.switchTo().alert().accept();
		
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().getText();
		return null;
	}

	int i = 1;
	public void takesnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dec = new File("./snaps/SeMethodMergeL"+i+".png");
		try {
			FileUtils.copyFile(src, dec);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
		
		
	}

	@Override
	public void closebrowser() {
		// TODO Auto-generated method stub
		driver.close();
		
	}

	@Override
	public void closeAllbrowser() {
		// TODO Auto-generated method stub
		
	}

}

