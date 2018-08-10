package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHome extends ProjectMethods {
	
	public MyHome() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.LINK_TEXT,using= "Leads")
	WebElement eleLeads;
	public MyLeads clickLead() {
		click(eleLeads);
		return new MyLeads();
	}
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	WebElement eleFind;
	public FindLeads findLead() {
		click(eleFind);
		return new FindLeads();
		
	}
	

}
