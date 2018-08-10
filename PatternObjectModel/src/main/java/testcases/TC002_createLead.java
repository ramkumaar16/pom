	package testcases;

import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import pages.CreateLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_createLead extends ProjectMethods{
	
	 @BeforeTest
	  public void setData() {
		    browserName = "chrome";
			testCaseName = "TC002";
			testDescription = "CreateLead to LeafTaps";
			testNodes = "CreateLeads";
			category = "smoke";
			authors = "sarath";
			dataSheetName  = "TC002";
	  }
	
	
	 @Test(dataProvider="fetchData")
		public void login(String uName,String pwd,String cName,String fName,String lName ) {
			new LoginPage()
			.typeUserName(uName)
			.typePassword(pwd)
			.clickLogin().clickCrm().clickLead().createLead()
			.companyName(cName).firstName(fName).lastName(lName)
			.summitLead()
			.closeBrowser();
		}
	
	
	
	
	/* @Test(dataProvider="fetchData",dependsOnMethods="login")
	public void createLead(String cName,String fName,String lName) {
		 
		new 
		CreateLead()
		.companyName("")
		.firstName("")
		.lastName("")
		.summitLead().*/

	}
	

