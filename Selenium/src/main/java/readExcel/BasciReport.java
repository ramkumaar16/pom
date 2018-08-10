package readExcel;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BasciReport {
	
	
    @Test()
	public  void main() throws IOException {
		
			ExtentHtmlReporter html = new ExtentHtmlReporter("./reporters/results.html");
			html.setAppendExisting(true);
			
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(html);
		
		ExtentTest suiteTest = extent.createTest("TC001_CreateLead","New Contact Createcd in Contacts");
		ExtentTest test = suiteTest.createNode("Leads");
		test.assignAuthor("Ramkumaar");
		test.assignCategory("smoke");
		
		test.pass("The DataSalesManager entered Sucessfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("The crmsfa entered sucessfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.fail("The element login nt click",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img10.png").build());
		
		extent.flush();
		
		
	}	
		
		
		
		
		
	}

	