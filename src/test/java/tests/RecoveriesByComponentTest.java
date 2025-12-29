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
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class RecoveriesByComponentTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static RecoveriesByComponentFunctional recoveriesbycomponentsfunctional = new RecoveriesByComponentFunctional();
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
	
	@Test(description = "Redirect to Components listing page")
	public void redirection_To_ComponentsListing_Page() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.navigate_ComponentsListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Recoveries By Components listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provider Loc Code Descending Sorting functionality of Recoveries By Components listing page")
	public void verifyProviderLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.ProviderLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provider Loc Code Ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyProviderLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.ProviderLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provide Loc Name Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyProvideLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.ProviderLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provide Loc Name ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyProvideLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.ProviderLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyZone_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.Zone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyZone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.Zone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Name Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Name ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyCity_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.City_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.City_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify State Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyState_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.State_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify State ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.State_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ZipCode Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyZipCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.ZipCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ZipCode ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyZipCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.ZipCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU Decending Sorting functionality of Recoveries By Components listing page")
	public void verifySKU_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.SKU_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU ascending Sorting functionality of Recoveries By Components listing page")
	public void verifySKU_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.SKU_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU Name Decending Sorting functionality of Recoveries By Components listing page")
	public void verifySKUName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.SKUName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU Name ascending Sorting functionality of Recoveries By Components listing page")
	public void verifySKUName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.SKUName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FG Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyFG_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.FG_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FG ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyFG_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.FG_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Conf Avail Recov Val Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyLocConfAvailRecovVal_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LocConfAvailRecovVal_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Conf Avail Recov Val ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyLocConfAvailRecovVal_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LocConfAvailRecovVal_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last call Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyLastCall_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LastCall_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last call ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyLastCall_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LastCall_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last count Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyLastCount_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LastCount_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last count ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyLastCount_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LastCount_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Next call Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyNextCall_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.NextCall_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Next call ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyNextCall_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.NextCall_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL Due Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyCommitDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.CommitDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL Due ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyCommitDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.CommitDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Current Status Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyBOLStatus_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.BOLStatus_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Current Status ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyBOLStatus_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.BOLStatus_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Conf Avail Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyConfAvail_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.ConfAvail_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Conf Avail ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyConfAvail_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.ConfAvail_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Region Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyRegion_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.Region_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Region ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyRegion_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.Region_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last BOL Complete Date Decending Sorting functionality of Recoveries By Components listing page")
	public void verifyLastBOLCompleteDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LastBOLCompleteDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last BOL Complete Date ascending Sorting functionality of Recoveries By Components listing page")
	public void verifyLastBOLCompleteDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbycomponentsfunctional.LastBOLCompleteDate_AscendingSorting();
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
