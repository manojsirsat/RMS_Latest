package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Reports_CurrentInventoryByLocationPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Reports_CurrentInventoryByLocationPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Reports_CurrentInventoryByLocationPageFunctional currentinventorybylocationfunctional = new Reports_CurrentInventoryByLocationPageFunctional();
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
	
	@Test(description = "Redirect to Reports_CurrentInventoryByLocation listing page")
	public void redirection_To_Reports_CurrentInventoryByLocationListing_Page() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.navigate_Reports_CurrentInventoryByLocationListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Reports Current inventory by locations listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountName Descending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyAccountName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.AccountName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountName Ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyAccountName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.AccountName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountCode Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyAccountCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.AccountCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountCode ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyAccountCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.AccountCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationCode Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyLocationCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.LocationCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationCode ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyLocationCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.LocationCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationName Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyLocationName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.LocationName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationName ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyLocationName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.LocationName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationType Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyLocationType_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.LocationType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationType ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyLocationType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.LocationType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyCity_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.City_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.City_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify State Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyState_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.State_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify State ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.State_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Active Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyActive_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.Active_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Active ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyActive_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.Active_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUName Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifySKUName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.SKUName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUName ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifySKUName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.SKUName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUNumber Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifySKUNumber_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.SKUNumber_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUNumber ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifySKUNumber_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.SKUNumber_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Stage Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyStage_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.Stage_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Stage ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyStage_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.Stage_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Quantity Decending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyQuantity_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.Quantity_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Quantity ascending Sorting functionality of Reports Current inventory by locations listing page")
	public void verifyQuantity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = currentinventorybylocationfunctional.Quantity_AscendingSorting();
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
