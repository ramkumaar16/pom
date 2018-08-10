package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import wdMethods1.ProjectMethods;


public class Merge extends ProjectMethods{
	@Test
	public void merge() throws InterruptedException {
    //login();
	WebElement openLeads = LocateElement("linkText","Leads");
	click(openLeads);
	WebElement openMerge = LocateElement("linkText","Merge Leads");
	click(openMerge);
	WebElement openWindow = LocateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]");
	click(openWindow);
	Thread.sleep(3000);
	switchToWindow(1);
	WebElement firstName = LocateElement("xpath","//input[@name='firstName']");
	type(firstName,"S");	
	WebElement findLeads = LocateElement("xpath","//button[text()='Find Leads']");
	click(findLeads);
	Thread.sleep(3000);
	WebElement giveName = LocateElement("xpath","//a[@class='linktext']");
	ClickWithoutSnap(giveName);Thread.sleep(3000);
	switchToWindow(0);
	WebElement openWindow2 = LocateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]");
	click(openWindow2);
	switchToWindow(1);
	WebElement firstName1 = LocateElement("xpath","//input[@name='firstName']");
	type(firstName1,"h");	
	WebElement findLeads1 = LocateElement("xpath","//button[text()='Find Leads']");
	click(findLeads1);
	Thread.sleep(3000);
	WebElement giveName2 = LocateElement("xpath","//a[@class='linktext']");
	ClickWithoutSnap(giveName2);
	switchToWindow(0);
	WebElement mergeValue = LocateElement("linkText","Merge");
	ClickWithoutSnap(mergeValue);Thread.sleep(3000);
	getAlertText();
	acceptAlert();

}
}