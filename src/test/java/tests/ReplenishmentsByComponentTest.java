package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
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
	
	@Test(description = "Verify valid login")
	public void verify_Valid_Login() throws InterruptedException 
	{
		flag = loginpage.validLogin();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Redirect to Components listing page")
	public void redirection_To_ComponentsListing_Page() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.navigate_ComponentsListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Replenishments By Components listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provider Loc Code Descending Sorting functionality of Replenishments By Components listing page")
	public void verifyProviderLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ProviderLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provider Loc Code Ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyProviderLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ProviderLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provide Loc Name Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyProvideLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ProviderLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provide Loc Name ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyProvideLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ProviderLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyZone_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.Zone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyZone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.Zone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.LocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.LocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Name Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.LocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Name ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.LocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyCity_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.City_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.City_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify State Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyState_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.State_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify State ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.State_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ZipCode Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyZipCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ZipCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ZipCode ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyZipCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ZipCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU Decending Sorting functionality of Replenishments By Components listing page")
	public void verifySKU_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.SKU_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU ascending Sorting functionality of Replenishments By Components listing page")
	public void verifySKU_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.SKU_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU Name Decending Sorting functionality of Replenishments By Components listing page")
	public void verifySKUName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.SKUName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU Name ascending Sorting functionality of Replenishments By Components listing page")
	public void verifySKUName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.SKUName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FG Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyFG_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.FG_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FG ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyFG_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.FG_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Account Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyAccount_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.Account_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Account ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyAccount_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.Account_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Ship Min Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyShipMin_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ShipMin_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Ship Min ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyShipMin_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ShipMin_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Ship Max Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyShipMax_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ShipMax_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Ship Max ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyShipMax_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ShipMax_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify In Transit Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyInTransit_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.InTransit_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify In Transit ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyInTransit_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.InTransit_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Conf Avail Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyConfAvail_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ConfAvail_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Conf Avail ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyConfAvail_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.ConfAvail_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Region Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyRegion_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.Region_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Region ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyRegion_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.Region_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Below Min Qty Decending Sorting functionality of Replenishments By Components listing page")
	public void verifyBelowMinQty_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.BelowMinQty_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Below Min Qty ascending Sorting functionality of Replenishments By Components listing page")
	public void verifyBelowMinQty_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = replenishmentsbycomponentsfunctional.BelowMinQty_AscendingSorting();
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
