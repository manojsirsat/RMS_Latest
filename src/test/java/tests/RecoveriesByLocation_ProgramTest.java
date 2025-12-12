package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.RecoveriesByLocation_ProgramFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class RecoveriesByLocation_ProgramTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static RecoveriesByLocation_ProgramFunctional recoveriesbylocation_programfunctional = new RecoveriesByLocation_ProgramFunctional();
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
	
	@Test(description = "Redirect to Locations_Programs listing page")
	public void redirection_To_Locations_ProgramsListing_Page() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.navigate_Locations_ProgramsListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Recoveries By Locations-Programs listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provider Loc Code Descending Sorting functionality from Zones listing page")
	public void verifyProviderLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.ProviderLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provider Loc Code Ascending Sorting functionality from Zones listing page")
	public void verifyProviderLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.ProviderLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provide Loc Name Decending Sorting functionality from Zones listing page")
	public void verifyProvideLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.ProviderLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provide Loc Name ascending Sorting functionality from Zones listing page")
	public void verifyProvideLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.ProviderLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone Decending Sorting functionality from Zones listing page")
	public void verifyZone_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.Zone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone ascending Sorting functionality from Zones listing page")
	public void verifyZone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.Zone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode Decending Sorting functionality from Zones listing page")
	public void verifyLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.LocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode ascending Sorting functionality from Zones listing page")
	public void verifyLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.LocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Name Decending Sorting functionality from Zones listing page")
	public void verifyLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.LocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Name ascending Sorting functionality from Zones listing page")
	public void verifyLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.LocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City Decending Sorting functionality from Zones listing page")
	public void verifyCity_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.City_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City ascending Sorting functionality from Zones listing page")
	public void verifyCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.City_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify State Decending Sorting functionality from Zones listing page")
	public void verifyState_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.State_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify State ascending Sorting functionality from Zones listing page")
	public void verifyState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.State_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ZipCode Decending Sorting functionality from Zones listing page")
	public void verifyZipCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.ZipCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ZipCode ascending Sorting functionality from Zones listing page")
	public void verifyZipCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.ZipCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TTLFG Decending Sorting functionality from Zones listing page")
	public void verifyTTLFG_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.TTLFG_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TTLFG ascending Sorting functionality from Zones listing page")
	public void verifyTTLFG_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.TTLFG_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FGRECOVVAL Decending Sorting functionality from Zones listing page")
	public void verifyFGRECOVVAL_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.FGRECOVVAL_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FGRECOVVAL ascending Sorting functionality from Zones listing page")
	public void verifyFGRECOVVAL_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.FGRECOVVAL_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TTLCONFAVAIL Decending Sorting functionality from Zones listing page")
	public void verifyTTLCONFAVAIL_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.TTLCONFAVAIL_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TTLCONFAVAIL ascending Sorting functionality from Zones listing page")
	public void verifyTTLCONFAVAIL_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.TTLCONFAVAIL_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last call Decending Sorting functionality from Zones listing page")
	public void verifyLastCall_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.LastCall_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last call ascending Sorting functionality from Zones listing page")
	public void verifyLastCall_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.LastCall_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last count Decending Sorting functionality from Zones listing page")
	public void verifyLastCount_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.LastCount_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last count ascending Sorting functionality from Zones listing page")
	public void verifyLastCount_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.LastCount_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Next call Decending Sorting functionality from Zones listing page")
	public void verifyNextCall_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.NextCall_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Next call ascending Sorting functionality from Zones listing page")
	public void verifyNextCall_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.NextCall_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL Due Decending Sorting functionality from Zones listing page")
	public void verifyBOLDue_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.BOLDue_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL Due ascending Sorting functionality from Zones listing page")
	public void verifyBOLDue_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.BOLDue_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL Status Decending Sorting functionality from Zones listing page")
	public void verifyBOLStatus_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.BOLStatus_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL Status ascending Sorting functionality from Zones listing page")
	public void verifyBOLStatus_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.BOLStatus_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last BOL Complete Date Decending Sorting functionality from Zones listing page")
	public void verifyLastBOLCompleteDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.LastBOLCompleteDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Last BOL Complete Date ascending Sorting functionality from Zones listing page")
	public void verifyLastBOLCompleteDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbylocation_programfunctional.LastBOLCompleteDate_AscendingSorting();
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
