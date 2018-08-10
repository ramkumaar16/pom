package wdMethods;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class login extends projectmethod {
	//private String text;
  
	//@Test
	public void login1() throws InterruptedException {

		Login1();
		WebElement openLeads = locateElement("LinkText","Leads");
		click(openLeads);
		WebElement openMerge = locateElement("LinkText","Merge Leads");
		click(openMerge);
		WebElement openWindow = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
		click(openWindow);
		Thread.sleep(3000);
		switchToWindow(1);
		WebElement firstName = locateElement("xpath","//input[@name='firstName']");
		type(firstName,"S");	
		WebElement findLeads = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeads);
		Thread.sleep(3000);
		WebElement giveName = locateElement("xpath","//a[@class='linktext']");
		clickWithNoSnap(giveName);Thread.sleep(3000);
		switchToWindow(0);
		WebElement openWindow2 = locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
		click(openWindow2);
		switchToWindow(1);
		WebElement firstName1 = locateElement("xpath","//input[@name='firstName']");
		type(firstName1,"h");	
		WebElement findLeads1 = locateElement("xpath","//button[text()='Find Leads']");
		click(findLeads1);
		Thread.sleep(3000);
		WebElement giveName2 = locateElement("xpath","//a[@class='linktext']");
		clickWithNoSnap(giveName2);
		switchToWindow(0);
		WebElement mergeValue = locateElement("LinkText","Merge");
		clickWithNoSnap(mergeValue);Thread.sleep(3000);
		getAlertText();
		acceptAlert();
	   // text = locateElement("id","viewLead_firstName_sp").getText();
	    //verifyExactText(mergeValue, text);
		//closeBrowser();

	}

	}

}
