package testcases;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.projectmethod;


public class CreateLead extends projectmethod {
	
	@Test
	public void createLead() throws InterruptedException{
		{
	
		//login();
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
		    //closebrowser();
    
    /*text = locateElement("id","viewLead_firstName_sp").getText();
    verifyExactText(elefirstname,text);*/
    
  //String text1 = elefirstname.getText();
  		//System.out.println(text1);
	}

	}

	
	
}
