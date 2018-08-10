package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_editLead extends ProjectMethods{
	

	 @BeforeTest
	  public void setData() {
		    browserName = "chrome";
			testCaseName = "TC003";
			testDescription = "ClickEdit to LeafTaps";
			testNodes = "EditLead";
			category = "smoke";
			authors = "sarath"; 
			dataSheetName  = "TC003";
	  }
	
	 @Test(dataProvider="fetchData")
	 public void login(String uName,String pWd,String fName,String lName,String updateName) {
		 new LoginPage()
			.typeUserName(uName)
			.typePassword(pWd)
			.clickLogin().clickCrm().clickLead().findLead()
			.typefname(fName)
			.typelastName(lName).clickfindlead().clickselectLead().clickEdit().updCname(updateName)
			.updateCname().closeBrowser();
	 }

}
