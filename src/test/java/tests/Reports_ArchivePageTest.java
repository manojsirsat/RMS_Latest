package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Reports_ArchivePageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Reports_ArchivePageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Reports_ArchivePageFunctional archivepagefunctional = new Reports_ArchivePageFunctional();
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
	
	@Test(description = "Redirect to Reports_Archive listing page")
	public void redirection_To_Reports_ArchiveListing_Page() throws InterruptedException 
	{
		flag = archivepagefunctional.navigate_Reports_ArchiveListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Reports Archive listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Report Descending Sorting functionality from Reports Archive listing page")
	public void verifyReport_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = archivepagefunctional.Report_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Report ascending Sorting functionality from Reports Archive listing page")
	public void verifyReport_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = archivepagefunctional.Report_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name Descending Sorting functionality from Reports Archive listing page")
	public void verifyName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = archivepagefunctional.Name_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name ascending Sorting functionality from Reports Archive listing page")
	public void verifyName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = archivepagefunctional.Name_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Owner Descending Sorting functionality from Reports Archive listing page")
	public void verifyOwner_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = archivepagefunctional.Owner_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Owner ascending Sorting functionality from Reports Archive listing page")
	public void verifyOwner_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = archivepagefunctional.Owner_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RequestedBy Descending Sorting functionality from Reports Archive listing page")
	public void verifyRequestedBy_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = archivepagefunctional.RequestedBy_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RequestedBy ascending Sorting functionality from Reports Archive listing page")
	public void verifyRequestedBy_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = archivepagefunctional.RequestedBy_AscendingSorting();
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
