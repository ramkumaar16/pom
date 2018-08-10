package practice;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods1.ProjectMethods;

public class MergePractice extends ProjectMethods{
	
	@Test
	public void mergepractice() throws InterruptedException{
		    login();
			WebElement openLead = LocateElement("linkText","Leads");
		    click(openLead);
		    WebElement openMerge = LocateElement("linkText","Merge Leads");
		    click(openMerge);
		    WebElement openWindow = LocateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
			click(openWindow);
		    Thread.sleep(3000);
		    switchToWindow(1);
		    WebElement firstName = LocateElement("xpath","//input[@name='firstName']");
		    type(firstName,"ar");
		    WebElement findLeads = LocateElement("xpath","//button[text()='Find Leads']");
		    click(findLeads);
		    WebElement giveName = LocateElement("xpath","//a[@class='linktext']");
			ClickWithoutSnap(giveName);
			Thread.sleep(3000);
		   // Thread.sleep(3000);
		    switchToWindow(0);
		    WebElement openWindow2 = LocateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
			click(openWindow2);
		    switchToWindow(1);
		    Thread.sleep(3000);
		    WebElement firstName1 = LocateElement("xpath","//input[@name='firstName']");
		    type(firstName1,"ra");
		    WebElement findleads1 = LocateElement("xpath","//button[text()='Find Leads']");
            click(findleads1);
            WebElement giveName2 = LocateElement("xpath","//a[@class='linktext']");
        	ClickWithoutSnap(giveName2);
            Thread.sleep(3000);
            switchToWindow(0);
            WebElement clickMerge = LocateElement("linktext","Merge");
            ClickWithoutSnap(clickMerge);
            Thread.sleep(3000);
            getAlertText();
        	acceptAlert();
		    


		    
		    

		    
		    
		    
		    
		    
	}

}
