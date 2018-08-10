package wdMethods1;

import org.openqa.selenium.WebElement;

public interface WdMethod {

	
	public void StartApp(String browser , String url);
	public  WebElement LocateElement(String locator, String locValue);
	public  WebElement LocateElement(String locValue); 
	public void type(WebElement ele, String Data);
	public void click(WebElement ele);
	public void ClickWithoutSnap(WebElement ele);
	public String getText(WebElement ele);
	public void SelectDropDownUsingText(WebElement ele, String Value);
	public void SelectDropDownUsingIndex(WebElement ele, int Index);
	public boolean varifyTitle(String ExpectedTitle);
	public void verifyExactText(WebElement ele,String ExpectedValue);
	public void varifyPartialText(WebElement ele,String ExpectedValue);
	public void varifyExtactAttributes(WebElement ele,String attribute, String value);
	public void varifyPartialAttributes(WebElement ele ,String attribute, String value);
	public void varifySelected(WebElement ele);
	public void varifyDisplayed(WebElement ele);
	public void switchToWindow(int index);
	public void switchToFrame(WebElement ele);
	public void acceptAlert();
	public void dismissAlert();
	public String getAlertText() ;
	public void takesnap();
	public void closebrowser();
	public void closeAllbrowser();
	
	
	
}
