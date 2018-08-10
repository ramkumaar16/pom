package gurupractice;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods1.SeMethods;

public class guru1 extends SeMethods{
	@Test
	public void login() {		
	StartApp("firefox","http://www.demo.guru99.com/V4/");
    WebElement login = LocateElement("name","uid");	
    type(login,"mngr145235");
    WebElement passWord = LocateElement("name","password");
    type(passWord,"UjygAry");
    WebElement lgn = LocateElement("name","btnLogin");
    click(lgn);
	
	
	
	}
}
