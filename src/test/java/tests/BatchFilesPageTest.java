package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.BatchFilesPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class BatchFilesPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static BatchFilesPageFunctional batchfilespagefunctional = new BatchFilesPageFunctional();
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
	
	@Test(description = "Redirect to Batch Files listing page")
	public void redirection_To_BatchFilesListing_Page() throws InterruptedException 
	{
		flag = batchfilespagefunctional.navigate_BatchFilesListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Batch files listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchFileID Descending Sorting functionality of Batch files listing page")
	public void verifyBatchFileID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.BatchFileID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchFileID ascending Sorting functionality of Batch files listing page")
	public void verifyBatchFileID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.BatchFileID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FileName Descending Sorting functionality of Batch files listing page")
	public void verifyFileName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.FileName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FileName ascending Sorting functionality of Batch files listing page")
	public void verifyFileName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.FileName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FileStatus Descending Sorting functionality of Batch files listing page")
	public void verifyFileStatus_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.FileStatus_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FileStatus ascending Sorting functionality of Batch files listing page")
	public void verifyFileStatus_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.FileStatus_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ActionType Descending Sorting functionality of Batch files listing page")
	public void verifyActionType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.ActionType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ActionType ascending Sorting functionality of Batch files listing page")
	public void verifyActionType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.ActionType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchFileLines Descending Sorting functionality of Batch files listing page")
	public void verifyBatchFileLines_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.BatchFileLines_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchFileLines ascending Sorting functionality of Batch files listing page")
	public void verifyBatchFileLines_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.BatchFileLines_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecordsLoaded Descending Sorting functionality of Batch files listing page")
	public void verifyRecordsLoaded_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.RecordsLoaded_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecordsLoaded ascending Sorting functionality of Batch files listing page")
	public void verifyRecordsLoaded_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.RecordsLoaded_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecordsProcessed Descending Sorting functionality of Batch files listing page")
	public void verifyRecordsProcessed_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.RecordsProcessed_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecordsProcessed ascending Sorting functionality of Batch files listing page")
	public void verifyRecordsProcessed_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.RecordsProcessed_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TotalQuantity Descending Sorting functionality of Batch files listing page")
	public void verifyTotalQuantity_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.TotalQuantity_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TotalQuantity ascending Sorting functionality of Batch files listing page")
	public void verifyTotalQuantity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.TotalQuantity_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCount Descending Sorting functionality of Batch files listing page")
	public void verifyLocCount_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.LocCount_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCount ascending Sorting functionality of Batch files listing page")
	public void verifyLocCount_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.LocCount_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Uploaded Descending Sorting functionality of Batch files listing page")
	public void verifyUploaded_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.Uploaded_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Uploaded ascending Sorting functionality of Batch files listing page")
	public void verifyUploaded_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.Uploaded_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Updated Descending Sorting functionality of Batch files listing page")
	public void verifyUpdated_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.Updated_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Updated ascending Sorting functionality of Batch files listing page")
	public void verifyUpdated_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.Updated_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify User Descending Sorting functionality of Batch files listing page")
	public void verifyUser_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.User_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify User ascending Sorting functionality of Batch files listing page")
	public void verifyUser_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = batchfilespagefunctional.User_AscendingSorting();
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
