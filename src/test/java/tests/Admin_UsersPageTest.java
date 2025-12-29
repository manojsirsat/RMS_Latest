package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Admin_UsersPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Admin_UsersPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Admin_UsersPageFunctional userpagefunctional = new Admin_UsersPageFunctional();
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
	
	
	@Test(description = "Redirect to Users listing page")
	public void redirection_To_UsersListing_Page() throws InterruptedException 
	{
		flag = userpagefunctional.navigate_Admin_UsersListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Admin Users listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify UserID Descending Sorting functionality of Admin Users listing page")
	public void verifyUserID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = userpagefunctional.UserID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify UserID ascending Sorting functionality of Admin Users listing page")
	public void verifyUserID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = userpagefunctional.UserID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name Descending Sorting functionality of Admin Users listing page")
	public void verifyName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = userpagefunctional.Name_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name ascending Sorting functionality of Admin Users listing page")
	public void verifyName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = userpagefunctional.Name_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Email Descending Sorting functionality of Admin Users listing page")
	public void verifyEmail_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = userpagefunctional.Email_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Email ascending Sorting functionality of Admin Users listing page")
	public void verifyEmail_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = userpagefunctional.Email_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountName Descending Sorting functionality of Admin Users listing page")
	public void verifyAccountName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = userpagefunctional.AccountName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountName ascending Sorting functionality of Admin Users listing page")
	public void verifyAccountName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = userpagefunctional.AccountName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Active Descending Sorting functionality of Admin Users listing page")
	public void verifyActive_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = userpagefunctional.Active_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Active ascending Sorting functionality of Admin Users listing page")
	public void verifyActive_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = userpagefunctional.Active_AscendingSorting();
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
