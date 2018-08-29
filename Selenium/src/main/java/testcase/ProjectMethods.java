package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wdMethods1.SeMethods;

public class ProjectMethods extends SeMethods {
     @Test(invocationCount=5,successPercentage=80)
	@BeforeMethod
	public void login() {
		StartApp("firefox","http://www.leaftaps.com/opentaps");
		WebElement eleUserName = LocateElement("id","username");
		type(eleUserName,"DemoSalesManager");
		WebElement elePassword = LocateElement("id","password");
		type(elePassword,"crmsfa");
		WebElement eleLogin = LocateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleCrmsfa = LocateElement("linkText","CRM/SFA");
		click(eleCrmsfa);
	}
/*//@Test(dependsOnMethods="login",invocationCount=5,successPercentage=80)
	@Test
	public void createLead() throws InterruptedException {
		WebElement eleLeads = LocateElement("linkText","Leads");
		click(eleLeads);
		WebElement eleCreateLead = LocateElement("linkText", "Create Lead");
		click(eleCreateLead);
		WebElement elecompanyname = LocateElement("id", "createLeadForm_companyName");
		elecompanyname.sendKeys("Butterfly");
		WebElement elefirstname = LocateElement("id", "createLeadForm_firstName");
		type(elefirstname,"Krishnakumar");
		WebElement eleLastname = LocateElement("id", "createLeadForm_lastName");
		eleLastname.sendKeys("Sivaraman");
		Thread.sleep(3000);
		WebElement elesource = LocateElement("id", "createLeadForm_dataSourceId");
		SelectDropDownUsingText(elesource,"Employee");
		
		WebElement eleMarketing = LocateElement("id", "createLeadForm_marketingCampaignId");
		SelectDropDownUsingText(eleMarketing,"Automobile");
		
		WebElement elefirstName1 = LocateElement("id", "createLeadForm_firstNameLocal");
		elefirstName1.sendKeys("Kichu");
		WebElement elelastname1 = LocateElement("id", "createLeadForm_lastNameLocal");
		elelastname1.sendKeys("kishna");
		WebElement elesalutation = LocateElement("id", "createLeadForm_personalTitle");
		elesalutation.sendKeys("Writer");
		WebElement eleTitle = LocateElement("id","createLeadForm_generalProfTitle" );
		eleTitle.sendKeys("Mr");
		WebElement eleDept = LocateElement("id","createLeadForm_departmentName" );
		eleDept.sendKeys("Production");
		WebElement eleAnnualRevenue = LocateElement("id","createLeadForm_annualRevenue" );
		eleAnnualRevenue.sendKeys("2,00,000");
		WebElement elecurrency = LocateElement("id", "createLeadForm_currencyUomId");
		SelectDropDownUsingText(elecurrency,"DZD - Algerian Dinar");

		WebElement eleIndustry = LocateElement("id", "createLeadForm_industryEnumId");
		SelectDropDownUsingText(eleIndustry,"Manufacturing");
		WebElement eleEmployees = LocateElement("id", "createLeadForm_numberEmployees");
		eleEmployees.sendKeys("156");

		WebElement eleOwnership = LocateElement("id", "createLeadForm_ownershipEnumId");
		SelectDropDownUsingText(eleOwnership,"Partnership");

		WebElement elesicode = LocateElement("id", "createLeadForm_sicCode");
		elesicode.sendKeys("12489286003154DSFG");
		WebElement eleTicketer = LocateElement("id", "createLeadForm_tickerSymbol");
		eleTicketer.sendKeys("1244589");
		WebElement eleDescp = LocateElement("id", "createLeadForm_description");
		eleDescp.sendKeys("Hello Friends");
		WebElement eleImport = LocateElement("id", "createLeadForm_importantNote");
		eleImport.sendKeys("List of Holidays in 2018");
		WebElement elePhone = LocateElement("id", "createLeadForm_primaryPhoneNumber");
		elePhone.sendKeys("9940183078");
		WebElement eleAreaCode = LocateElement("id", "createLeadForm_primaryPhoneAreaCode");
		eleAreaCode.sendKeys("015");
		WebElement eleExtension = LocateElement("id", "createLeadForm_primaryPhoneExtension");
		eleExtension.sendKeys("251");
		WebElement eleAsk = LocateElement("id", "createLeadForm_primaryPhoneAskForName");
		eleAsk.sendKeys("4410");
		WebElement eleMail = LocateElement("id", "createLeadForm_primaryEmail");
		eleMail.sendKeys("xyz@gmail.com");
		WebElement eleUrl = LocateElement("id", "createLeadForm_primaryWebUrl");
		eleUrl.sendKeys("www.xyz.com");
		WebElement eleGenerel = LocateElement("id","createLeadForm_generalToName");
		eleGenerel.sendKeys("Kishore");;
		WebElement eleGenAtt = LocateElement("id","createLeadForm_generalAttnName");
		eleGenAtt.sendKeys("Jayshree Rout");;
		WebElement eleadd1 = LocateElement("id","createLeadForm_generalAddress1");
		eleadd1.sendKeys("Cholegaon");
		WebElement eleadd2 = LocateElement("id","createLeadForm_generalAddress2");
		eleadd2.sendKeys("Thakurkli");
		WebElement elecity = LocateElement("id","createLeadForm_generalCity");
		elecity.sendKeys("Mumbai");
		WebElement elezip = LocateElement("id","createLeadForm_generalPostalCode");
		type(elezip,"421201");
		WebElement elecountry = LocateElement("id","createLeadForm_generalCountryGeoId");
		SelectDropDownUsingText(elecountry,"India");
		Thread.sleep(3000);
		WebElement elestate = LocateElement("id","createLeadForm_generalStateProvinceGeoId");
		SelectDropDownUsingText(elestate,"MAHARASHTRA");
		WebElement elezipext = LocateElement("id","createLeadForm_generalPostalCodeExt");
		type(elezipext,"40");
		WebElement eleSubmit = LocateElement("name", "submitButton");
	    click(eleSubmit);
	}
//@Test(dependsOnMethods="merge",invocationCount=5,successPercentage=80)
	@Test
public void duplicate() {
	WebElement eleduplicate = LocateElement("linkText", "Duplicate Lead");
	click(eleduplicate);
	WebElement eleCompDulicate = LocateElement("id", "createLeadForm_companyName");
	type(eleCompDulicate, "Selenium Testing");
	WebElement eleduplictesubmit = LocateElement("name", "submitButton");
	click(eleduplictesubmit);
	//closebrowser();
}
//@Test(dependsOnMethods="createLead",invocationCount=5,successPercentage=80)
	@Test
public void merge() throws InterruptedException {
	WebElement eleLeads = LocateElement("linkText", "Leads");
	click(eleLeads);
	WebElement eleMergeLeads = LocateElement("linkText", "Merge Leads");
	click(eleMergeLeads);
	WebElement eleImg = LocateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[1]");
	click(eleImg);
	switchToWindow(1);
	WebElement eleMergeFirst = LocateElement("xpath", "//input[@name='firstName']");
	type(eleMergeFirst, "k");
	WebElement eleFind = LocateElement("xpath", "//button[text()='Find Leads']");
	click(eleFind);
	Thread.sleep(3000);
	WebElement eleListMerge = LocateElement("xpath", "//a[@class='linktext']");
	ClickWithoutSnap(eleListMerge);
	Thread.sleep(3000);
	switchToWindow(0);
	WebElement eleimg= LocateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
	click(eleimg);
	switchToWindow(1);
	WebElement eleMergefirst = LocateElement("xpath", "//input[@name='firstName']");
	type(eleMergefirst, "n");
	WebElement elefind = LocateElement("xpath", "//button[text()='Find Leads']");
	click(elefind);
	Thread.sleep(3000);
	WebElement elelistMerge = LocateElement("xpath", "//a[@class='linktext']");
	ClickWithoutSnap(elelistMerge);
	switchToWindow(0);
	WebElement eleMergebutton = LocateElement("linkText", "Merge");
	ClickWithoutSnap(eleMergebutton);
	getAlertText();
	acceptAlert();
	WebElement eleduplicate = LocateElement("linkText", "Duplicate Lead");
	click(eleduplicate);
	WebElement eleCompDulicate = LocateElement("id", "createLeadForm_companyName");
	type(eleCompDulicate, "Selenium Testing");
	WebElement eleduplictesubmit = LocateElement("name", "submitButton");
	click(eleduplictesubmit);
   
}*/
@AfterMethod
 public void closeBrowser() {
	closebrowser(); }
}

