package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.RecoveriesByComponentFunctional;
import pages.ReplenishmentsByComponentFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class ReplenishmentsByComponentTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static ReplenishmentsByComponentFunctional replenishmentsbycomponentsfunctional = new ReplenishmentsByComponentFunctional();
	static loginPage loginpage = new loginPage();
	
	/**
	 * This method used to open browser before test start
	 */
	@BeforeTest
	public void browser_Setup() throws FileNotFoundException, IOException, Exception
	{
		webDB.Setup(System.getProperty("Platform"));
		String SiteUrl = webDB.getDataFromProperties("url");
		webDB.enterURL(SiteUrl);
		Thread.sleep(2000);
	}
	
	@Test(description = "Verify Pagination functionality of Replenishments By Components listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = loginpage.validLogin();
		if(flag)
		{
		flag = replenishmentsbycomponentsfunctional.navigate_ComponentsListingPage();
		if(flag)
		{
			flag = replenishmentsbycomponentsfunctional.verifypagination();
		}
		Assert.assertTrue(flag);
		}
	}
	
	@AfterTest
	public void browser_Close() {
		webDB.tearDown();
	}
	
	@AfterSuite
	public void SendMail() throws Exception {
		Mailer mailer = new Mailer();
		mailer.execute("RMS Automation Report");
	}

}
