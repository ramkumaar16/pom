package testcase1;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods1.ProjectMethods;

//import org.testng.annotations.Test;

public class Duplicate extends ProjectMethods{
	
	//@Test(invocationCount=5,invocationTimeOut=1000000)
	public void duplicate(){
		//login();
		//createLead();
		
		WebElement eleduplicate = LocateElement("linkText", "Duplicate Lead");
		click(eleduplicate);
		WebElement eleCompDulicate = LocateElement("id", "createLeadForm_companyName");
		type(eleCompDulicate, "Selenium Testing");
		WebElement eleduplictesubmit = LocateElement("name", "submitButton");
		click(eleduplictesubmit);
		closebrowser();
		
}

}
