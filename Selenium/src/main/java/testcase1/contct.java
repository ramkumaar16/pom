package testcase1;

import org.openqa.selenium.WebElement;

import wdMethods1.ProjectMethods;

public class contct extends ProjectMethods {
	
	public void contact() {
		WebElement eleContacts = LocateElement("linkText","Contacts");
		click(eleContacts);
		WebElement eleCreateCon = LocateElement("linkText","Create Contact");
		click(eleCreateCon);
		WebElement eleFirstName = LocateElement("id","firstNameField");
		type(eleFirstName,"ram");
		
		
	}

}
