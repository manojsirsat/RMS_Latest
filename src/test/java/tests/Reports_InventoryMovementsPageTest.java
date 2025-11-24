package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Reports_CycleCountPageFunctional;
import pages.Reports_InventoryMovementsPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Reports_InventoryMovementsPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Reports_InventoryMovementsPageFunctional inventorymovementpagefunctional = new Reports_InventoryMovementsPageFunctional();
	static loginPage loginpage = new loginPage();
	
	/**
	 * This method used to open browser before test start
	 */
	@BeforeTest
	public void browser_Setup() throws FileNotFoundException, IOException, Exception
	{
		webDB.Setup(System.getProperty("Platform"));
		// This line used to get data from config properties
		String SiteUrl = webDB.getDataFromProperties("url");
		// This line used to navigate the url in browser
		webDB.enterURL(SiteUrl);
		Thread.sleep(2000);
	}
	
	@Test(description = "Verify Pagination functionality of Reports Inventory Movements listing page")
	public void navigate_InventoryMovementsPage() throws InterruptedException 
	{
		flag = loginpage.validLogin();
		if(flag)
		{
		flag = inventorymovementpagefunctional.navigate_Reports_InventoryMovementsListingPage();
		
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
