package testcase1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods1.ProjectMethods;




public class CreateContact extends ProjectMethods {
	@BeforeClass
	
	public void setDate() {
		
		excelFileName ="./data/data2.xlsx";
		
	}
	//@Test(invocationCount=2,timeOut=60000)
	//@Test(groups="good")
	@Test(dataProvider="fetchData")
	public void createcontact(String fName,String lName,String dName,String eId, String mobileNo) throws InterruptedException {
		WebElement eleCrmsfa = LocateElement("linkText","CRM/SFA");
		click(eleCrmsfa);
		Thread.sleep(3000);
		WebElement eleContacts = LocateElement("linkText","Contacts");
		click(eleContacts);
		WebElement eleCreateCon = LocateElement("linkText","Create Contact");
		click(eleCreateCon);
		WebElement eleFirstName = LocateElement("id","firstNameField");
		type(eleFirstName,fName);
		WebElement eleLastName = LocateElement("id","lastNameField");
		type(eleLastName,lName);
		WebElement elefirstlocal = LocateElement("id","createContactForm_firstNameLocal");
		type(elefirstlocal,"Krishna");
		WebElement eleLastlocal = LocateElement("id","createContactForm_lastNameLocal");
		type(eleLastlocal,"kichu");
		WebElement eleSalute = LocateElement("id","createContactForm_personalTitle");
		type(eleSalute,"Mr");
		WebElement eledept = LocateElement("id","createContactForm_departmentName");
		type(eledept,dName);
		WebElement elecurrency = LocateElement("id","createContactForm_preferredCurrencyUomId");
		SelectDropDownUsingText(elecurrency,"EUR - Euro");
		WebElement eleinitialAc = LocateElement("id","createContactForm_accountPartyId");
		type(eleinitialAc,"500");
		WebElement eleCountryCode = LocateElement("id","createContactForm_primaryPhoneCountryCode");
		type(eleCountryCode,"+91");
		WebElement eleAdd1 = LocateElement("id","createContactForm_generalAddress1");
		type(eleAdd1,"NeeraBhai Nivas, Cholegoan");
		WebElement eleAdd2 = LocateElement("id","createContactForm_generalAddress2");
		type(eleAdd2,"Thakurli,Kalyan-Dombivili Muncipal Corporation");
		WebElement eleCity = LocateElement("id","createContactForm_generalCity");
		type(eleCity,"Thane District");
		WebElement elepincode = LocateElement("id","createContactForm_generalPostalCode");
		type(elepincode,eId);
		WebElement eleCountry = LocateElement("id","createContactForm_generalCountryGeoId");
		SelectDropDownUsingText(eleCountry,"India");
		WebElement eleState = LocateElement("id","createContactForm_generalStateProvinceGeoId");
		SelectDropDownUsingText(eleState,"MAHARASHTRA");
		WebElement elePExt = LocateElement("id","createContactForm_generalPostalCodeExt");
		type(elePExt,mobileNo);
		WebElement eleSubmit = LocateElement("name","submitButton");
		click(eleSubmit);
			
	}
	   /* @DataProvider(name="fetchData")
	    public Object[][] getData(){
	    Object[][] data = new Object[2][5];	
	    data[0][0]="TestLeaf";
    	data[0][1]="Ram";
    	data[0][2]="h";
    	data[0][3]="638476";
    	data[0][4]="421";
    	
    	data[1][0]="TestLeaf";
    	data[1][1]="Ramkumaar";
    	data[1][2]="hn";
    	data[1][3]="538476";
    	data[1][4]="422211";
    	return data;*/	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	      	
	    }


