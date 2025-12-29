package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Admin_ProgramsPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Admin_ProgramsPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Admin_ProgramsPageFunctional programpagefunctional = new Admin_ProgramsPageFunctional();
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
	
	@Test(description = "Redirect to Programs listing page")
	public void redirection_To_ProgramsListing_Page() throws InterruptedException 
	{
		flag = programpagefunctional.navigate_Admin_ProgramsListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Admin Programs listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name Descending Sorting functionality of Admin Programs listing page")
	public void verifyName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = programpagefunctional.Name_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name ascending Sorting functionality of Admin Programs listing page")
	public void verifyName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = programpagefunctional.Name_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Code Descending Sorting functionality of Admin Programs listing page")
	public void verifyCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = programpagefunctional.Code_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Code ascending Sorting functionality of Admin Programs listing page")
	public void verifyCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = programpagefunctional.Code_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Account Descending Sorting functionality of Admin Programs listing page")
	public void verifyAccount_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = programpagefunctional.Account_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Account ascending Sorting functionality of Admin Programs listing page")
	public void verifyAccount_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = programpagefunctional.Account_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Locations Descending Sorting functionality of Admin Programs listing page")
	public void verifyLocations_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = programpagefunctional.Locations_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Locations ascending Sorting functionality of Admin Programs listing page")
	public void verifyLocations_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = programpagefunctional.Locations_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUS Descending Sorting functionality of Admin Programs listing page")
	public void verifySKUS_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = programpagefunctional.SKUS_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUS ascending Sorting functionality of Admin Programs listing page")
	public void verifySKUS_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = programpagefunctional.SKUS_AscendingSorting();
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
