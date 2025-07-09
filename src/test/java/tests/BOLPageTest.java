package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.BOLPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class BOLPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static BOLPageFunctional bolpagefunctional = new BOLPageFunctional();
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

//	/**
//	 * This method used to perform user login
//	 */
//	@BeforeMethod
//	public void user_Login() throws InterruptedException
//	{
//		loginpage.validLogin();
//	}

	
	@Test(description = "Verify create new BOL functionality from BOL listing page")
	public void verifyCreate_BOL_Flow() throws InterruptedException 
	{
		flag = loginpage.validLogin();
		if(flag)
		{
		flag = bolpagefunctional.navigate_BOLPage();
		if(flag)
		{
			flag = bolpagefunctional.set_BOLPage_CarrierDetails();
		}
		}
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify add order to BOL functionality")
	public void verifyAdd_Order_To_BOL_Flow() throws InterruptedException 
	{
		flag = bolpagefunctional.set_AddOrderToBOL();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify update BOL status functionality")
	public void verifySet_BOL_Status() throws InterruptedException 
	{
//		flag = loginpage.validLogin();
//		if(flag)
//		{
		flag = bolpagefunctional.set_BOLStatus();
//		}
		Assert.assertTrue(flag);
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
