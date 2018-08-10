/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	public RemoteWebDriver driver;

	
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("enter username as (.*)")
	public void username(String Data) {
		driver.findElementById("username").sendKeys(Data);
	}

	@And("enter password as (.*)")
	public void passWord(String Data) {
		driver.findElementById("password").sendKeys(Data);
	}

	@When("click the Login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@When("click the crm and sfa")
	public void openCrm() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@When("click the leads button")
	public void openLeads() {
		driver.findElementByLinkText("Leads").click();
	}

	@When("click the create lead")
	public void createLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("enter companyname as (.*)")
	public void cName(String Data) {
		driver.findElementById("createLeadForm_companyName").sendKeys(Data);
	}

	@And("enter firstname as (.*)")
	public void fName(String Data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(Data);
	}

	@And("enter lastname as (.*)")
	public void lName(String Data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(Data);
	}

	@When("click the lead button")
	public void clickLead() {
		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("close the browser")
	public void browserClose() {
		driver.close();
	}

	@But("verfiy error message")
	public void closeBrowse() {
		String text = driver.findElementById("errorDiv").getText();
		if (text.contains("The Follwing Error Occurred:")) {
			System.out.println("error msg sucessfully");
		} else {
			System.out.println("Your userName and passWord are wrong");
		}
	}
*/