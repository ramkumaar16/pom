package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC0004_mergeLead extends ProjectMethods {


	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC004";
		testDescription = "MergeLead to LeafTaps";
		testNodes = "MergeLead";
		category = "smoke";
		authors = "sarath"; 
		dataSheetName  = "TC004";
	}
	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String fname,String lName,String fname1,String lName1){
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrm() 
		.clickLead()
		.mergeLead()
		.openWindow()
		.findFname(fname)
		.findLname(lName)
		.ClickFindLead()
		.ClickSelect()
		.openWindow1()
		.findFname1(fname1)
		.findLname1(lName1)
		.ClickFindLead1()
		.ClickSelect1()
		.clickMerge();
		//.clickLogOut();
	}
}
