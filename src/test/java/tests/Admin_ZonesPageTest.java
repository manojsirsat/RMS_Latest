package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Admin_ZonesPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Admin_ZonesPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Admin_ZonesPageFunctional zonepagefunctional = new Admin_ZonesPageFunctional();
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
	
	@Test(description = "Redirect to Zones listing page")
	public void redirection_To_ZonesListing_Page() throws InterruptedException 
	{
		flag = zonepagefunctional.navigate_Admin_ZonesListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Admin Zones listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone Descending Sorting functionality from Zone listing page")
	public void verifyZone_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = zonepagefunctional.Zone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone ascending Sorting functionality from Zone listing page")
	public void verifyZone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = zonepagefunctional.Zone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Description Descending Sorting functionality from Zone listing page")
	public void verifyDescription_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = zonepagefunctional.Description_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Description ascending Sorting functionality from Zone listing page")
	public void verifyDescription_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = zonepagefunctional.Description_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ProviderLocCode Descending Sorting functionality from Zone listing page")
	public void verifyProviderLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = zonepagefunctional.ProviderLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ProviderLocCode ascending Sorting functionality from Zone listing page")
	public void verifyProviderLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = zonepagefunctional.ProviderLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ProviderLocName Descending Sorting functionality from Zone listing page")
	public void verifyProviderLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = zonepagefunctional.ProviderLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ProviderLocName ascending Sorting functionality from Zone listing page")
	public void verifyProviderLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = zonepagefunctional.ProviderLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationsCount Descending Sorting functionality from Zone listing page")
	public void verifyLocationsCount_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = zonepagefunctional.LocationsCount_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationsCount ascending Sorting functionality from Zone listing page")
	public void verifyLocationsCount_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = zonepagefunctional.LocationsCount_AscendingSorting();
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
