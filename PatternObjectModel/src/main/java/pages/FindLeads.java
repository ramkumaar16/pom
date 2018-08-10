package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {
	
	public FindLeads() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFname;
	public FindLeads typefname(String Data) {
		type(eleFname,Data);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//input[@name='lastName'])[3]")
	WebElement eleLname;
    public FindLeads typelastName(String Data) {
		type(eleLname,Data);
		return this;
    }
    @FindBy(how=How.XPATH,using="(//button[text()='Find Leads'])")
    WebElement findPath;
    public FindLeads clickfindlead() {
    	click(findPath);
    	return this;
    }
    @FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
    WebElement sPath;
    public FindLeads clickselectLead() {
    	click(sPath);
    	return this;
    }
    @FindBy(how=How.XPATH,using="//a[@class='subMenuButton'][3]")    
    WebElement cEdit;
    public viewLead clickEdit() {
    	click(cEdit);
    	return new viewLead();
    }
}
