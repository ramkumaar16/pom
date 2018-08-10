package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {
	
	public MyLeads() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	WebElement elecreateLead;
	public CreateLead createLead() {
		click(elecreateLead);
		return new CreateLead();
	}
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	WebElement eleFind;
	public FindLeads findLead() {
		click(eleFind);
		return new FindLeads();
	}
	@FindBy(how=How.XPATH,using="//a[text()='Merge Leads']")
	WebElement eleMerge;
	public MergeLeads mergeLead() {
		click(eleMerge);
		return new MergeLeads();
	}

}
