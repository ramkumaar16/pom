package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement eleCname;
	public CreateLead companyName(String Data) {
		type(eleCname,"FirstMan Tech & Sol");
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
    WebElement elefName;	
	public CreateLead firstName(String Data) {
		type(elefName,"Ram");
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
    WebElement elelName;	
	public CreateLead lastName(String Data) {
		type(elelName,"kumaar");
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	WebElement eleSummit;
	public viewLead summitLead() {
		click(eleSummit);
		return new viewLead();
	}
	
}
