package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{
	
	public MergeLeads() {
		PageFactory.initElements(driver,this);
	}
    @FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	WebElement oWindow;
	public MergeLeads openWindow() {
		click(oWindow);
		switchToWindow(1);
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement fName;
	public MergeLeads findFname(String Data) {
		type(fName,Data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement lName;
	public MergeLeads findLname(String Data) {
		type(lName,Data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement cfLead;
	public MergeLeads ClickFindLead() {
		click(cfLead);
		return this;
	}
	@FindBy(how=How.XPATH,using="//a[@class='linktext']")
	WebElement cSelect;
	public MergeLeads ClickSelect() {
		click(cSelect);
		switchToWindow(0);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	WebElement oWindows;
	public MergeLeads openWindow1() {
		click(oWindows);
		switchToWindow(1);
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	WebElement fName1;
	public MergeLeads findFname1(String Data) {
		type(fName1,Data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	WebElement lName1;
	public MergeLeads findLname1(String Data) {
		type(lName1,Data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement cfLead1;
	public MergeLeads ClickFindLead1() {
		click(cfLead1);
		return this;
	}
	@FindBy(how=How.XPATH,using="//a[@class='linktext']")
	WebElement cSelect1;
	public MergeLeads ClickSelect1() {
		click(cSelect1);
		switchToWindow(0);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//a[@class='buttonDangerous'])")
	WebElement cMerge;
	public MergeLeads clickMerge() {
		click(cMerge);
		getAlertText();
		acceptAlert();
		return this;
	}
	
	

	
}
