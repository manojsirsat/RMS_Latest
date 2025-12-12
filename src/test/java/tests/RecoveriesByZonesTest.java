package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.RecoveriesByZonesFunctional;
import pages.loginPage;
import utils.ReportLoger;
import utils.WebDriverBase;

public class RecoveriesByZonesTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static RecoveriesByZonesFunctional recoveriesbyzonesfunctional = new RecoveriesByZonesFunctional();
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
		flag = recoveriesbyzonesfunctional.navigate_ZonesListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality from Zones listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provider Loc Code Descending Sorting functionality from Zones listing page")
	public void verifyProviderLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.ProviderLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provider Loc Code Ascending Sorting functionality from Zones listing page")
	public void verifyProviderLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.ProviderLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provide Loc Name Decending Sorting functionality from Zones listing page")
	public void verifyProvideLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.ProviderLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Provide Loc Name ascending Sorting functionality from Zones listing page")
	public void verifyProvideLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.ProviderLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone Decending Sorting functionality from Zones listing page")
	public void verifyZone_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.Zone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone ascending Sorting functionality from Zones listing page")
	public void verifyZone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.Zone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 0_39_RECOVERY Decending Sorting functionality from Zones listing page")
	public void verify0_39_RECOVERY_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A0_39_RECOVERY_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 0_39_RECOVERY ascending Sorting functionality from Zones listing page")
	public void verify0_39_RECOVERY_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A0_39_RECOVERY_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 40_49_RECOVERY Decending Sorting functionality from Zones listing page")
	public void verify40_49_RECOVERY_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A40_49_RECOVERY_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 40_49_RECOVERY ascending Sorting functionality from Zones listing page")
	public void verify40_49_RECOVERY_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A40_49_RECOVERY_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 50_59_RECOVERY Decending Sorting functionality from Zones listing page")
	public void verify50_59_RECOVERY_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A50_59_RECOVERY_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 50_59_RECOVERY ascending Sorting functionality from Zones listing page")
	public void verify50_59_RECOVERY_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A50_59_RECOVERY_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 60_69_RECOVERY Decending Sorting functionality from Zones listing page")
	public void verify60_69_RECOVERY_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A60_69_RECOVERY_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 60_69_RECOVERY ascending Sorting functionality from Zones listing page")
	public void verify60_69_RECOVERY_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A60_69_RECOVERY_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 70_79_RECOVERY Decending Sorting functionality from Zones listing page")
	public void verify70_79_RECOVERY_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A70_79_RECOVERY_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 70_79_RECOVERY ascending Sorting functionality from Zones listing page")
	public void verify70_79_RECOVERY_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A70_79_RECOVERY_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 80_89_RECOVERY Decending Sorting functionality from Zones listing page")
	public void verify80_89_RECOVERY_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A80_89_RECOVERY_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 80_89_RECOVERY ascending Sorting functionality from Zones listing page")
	public void verify80_89_RECOVERY_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A80_89_RECOVERY_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 90_99_RECOVERY Decending Sorting functionality from Zones listing page")
	public void verify90_99_RECOVERY_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A90_99_RECOVERY_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 90_99_RECOVERY ascending Sorting functionality from Zones listing page")
	public void verify90_99_RECOVERY_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A90_99_RECOVERY_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 100_RECOVERY Decending Sorting functionality from Zones listing page")
	public void verify100_RECOVERY_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A100_RECOVERY_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify 100_RECOVERY ascending Sorting functionality from Zones listing page")
	public void verify100_RECOVERY_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = recoveriesbyzonesfunctional.A100_RECOVERY_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@AfterTest
	public void browser_Close() {
		webDB.tearDown();
	}
	
//	@AfterSuite
//	public void SendMail() throws Exception {
//		Mailer mailer = new Mailer();
//		mailer.execute("RMS Automation Report");
//	}

}
