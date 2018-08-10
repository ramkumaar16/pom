package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class viewLead extends ProjectMethods{
	
	public viewLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleedit;
	public viewLead updCname(String Data) {
		type(eleedit,Data);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
	private WebElement eleupd;
	public viewLead updateCname() {
		click(eleupd);
		return this;
		
	}

}
