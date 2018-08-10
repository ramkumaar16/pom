package utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class Report {
	
	public ExtentReports extent;
	public ExtentTest suiteTest,test;
	public abstract void takesnap();

	//BeforeSuite
	public void beginSuite() {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reporters/results.html");
		html.setAppendExisting(true);
		
	    extent = new ExtentReports();
		extent.attachReporter(html);
		}
	//BeforeClass
	public void startclass() {
	    suiteTest = extent.createTest("TC001_CreateLead","New Contact Createcd in Contacts");
		
	}
	//BeforeMethod
	public void StartSubCaseMethod() {
		ExtentTest test = suiteTest.createNode("Leads");
		test.assignAuthor("Ramkumaar");
		test.assignCategory("smoke");	
	}
	
	//afterMethod
	public void endMethode() {
		extent.flush();
	}
	
	public void report(String decs, String status) {
		try {
			if (status.equalsIgnoreCase(status)) {
				test.pass(decs,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
				}else if(status.equalsIgnoreCase(status)) {
				test.fail(decs,MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());  	
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 

}
