package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Accounts_AccountsPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Accounts_AccountsPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Accounts_AccountsPageFunctional accountspagefunctional = new Accounts_AccountsPageFunctional();
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
	
	@Test(description = "Verify valid login")
	public void verify_Valid_Login() throws InterruptedException 
	{
		flag = loginpage.validLogin();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Redirect to Accounts listing page")
	public void redirection_To_AccountListing_Page() throws InterruptedException 
	{
		flag = accountspagefunctional.navigate_AccountsListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Accounts listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Acct Code Descending Sorting functionality from Account listing page")
	public void verifyAcctCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.AcctCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Acct Code Asending Sorting functionality from Account listing page")
	public void verifyAcctCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.AcctCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name Descending Sorting functionality from Account listing page")
	public void verifyName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Name_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name Asending Sorting functionality from Account listing page")
	public void verifyName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Name_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Short Descending Sorting functionality from Account listing page")
	public void verifyShort_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Short_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Short Asending Sorting functionality from Account listing page")
	public void verifySort_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Short_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City Descending Sorting functionality from Account listing page")
	public void verifyCity_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.City_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City Asending Sorting functionality from Account listing page")
	public void verifyCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.City_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Admin Descending Sorting functionality from Account listing page")
	public void verifyAdmin_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Admin_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Admin Asending Sorting functionality from Account listing page")
	public void verifyAdmin_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Admin_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Customer Descending Sorting functionality from Account listing page")
	public void verifyCustomer_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Customer_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Customer Asending Sorting functionality from Account listing page")
	public void verifyCustomer_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Customer_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provider Descending Sorting functionality from Account listing page")
	public void verifyProvider_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Provider_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provider Asending Sorting functionality from Account listing page")
	public void verifyProvider_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Provider_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Carrier Descending Sorting functionality from Account listing page")
	public void verifyCarrier_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Carrier_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Carrier Asending Sorting functionality from Account listing page")
	public void verifyCarrier_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Carrier_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Network Descending Sorting functionality from Account listing page")
	public void verifyNetwork_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Network_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Network Asending Sorting functionality from Account listing page")
	public void verifyNetwork_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Network_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Active Descending Sorting functionality from Account listing page")
	public void verifyActive_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Active_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Active Asending Sorting functionality from Account listing page")
	public void verifyActive_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = accountspagefunctional.Active_AscendingSorting();
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
