package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Admin_WeekNumbersPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Admin_WeekNumbersPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Admin_WeekNumbersPageFunctional weeknumberspagefunctional = new Admin_WeekNumbersPageFunctional();
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
	
	@Test(description = "Redirect to Week Numbers listing page")
	public void redirection_To_WeekNumbersListing_Page() throws InterruptedException 
	{
		flag = weeknumberspagefunctional.navigate_Admin_WeekNumbersListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Admin Week Numbers listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name Descending Sorting functionality of Admin Week Numbers listing page")
	public void verifyName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = weeknumberspagefunctional.Name_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name ascending Sorting functionality of Admin Week Numbers listing page")
	public void verifyName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = weeknumberspagefunctional.Name_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify StartDate Descending Sorting functionality of Admin Week Numbers listing page")
	public void verifyStartDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = weeknumberspagefunctional.StartDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify StartDate ascending Sorting functionality of Admin Week Numbers listing page")
	public void verifyStartDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = weeknumberspagefunctional.StartDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LastUpdatedBy Descending Sorting functionality of Admin Week Numbers listing page")
	public void verifyLastUpdatedBy_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = weeknumberspagefunctional.LastUpdatedBy_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LastUpdatedBy ascending Sorting functionality of Admin Week Numbers listing page")
	public void verifyLastUpdatedBy_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = weeknumberspagefunctional.LastUpdatedBy_AscendingSorting();
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
