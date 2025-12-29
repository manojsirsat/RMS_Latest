package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Reports_LateNotificationPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Reports_LateNotificationPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Reports_LateNotificationPageFunctional latenotificationspagefunctional = new Reports_LateNotificationPageFunctional();
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
	
	@Test(description = "Redirect to Late Notification listing page")
	public void redirection_To_LateNotificationListing_Page() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.navigate_Reports_LateNotificationListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Reports Late Notification listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLID Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLID ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderID Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyOrderID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.OrderID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderID ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyOrderID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.OrderID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchID Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyBatchID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BatchID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchID ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyBatchID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BatchID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLStatus Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLStatus_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLStatus_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLStatus ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLStatus_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLStatus_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderType Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyOrderType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.OrderType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderType ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyOrderType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.OrderType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Program Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyProgram_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.Program_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Program ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyProgram_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.Program_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CompletedWeek Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyCompletedWeek_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.CompletedWeek_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CompletedWeek ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyCompletedWeek_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.CompletedWeek_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderDate Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyOrderDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.OrderDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderDate ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyOrderDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.OrderDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderNeedByDate Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyOrderNeedByDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.OrderNeedByDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderNeedByDate ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyOrderNeedByDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.OrderNeedByDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderCreatedDate Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyOrderCreatedDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.OrderCreatedDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderCreatedDate ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyOrderCreatedDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.OrderCreatedDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLAssignDate Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLAssignDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLAssignDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLAssignDate ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLAssignDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLAssignDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLDueDate Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLDueDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLDueDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLDueDate ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLDueDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLDueDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCommitDate Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLCommitDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLCommitDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCommitDate ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLCommitDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLCommitDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLModifiedCommitDate Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLModifiedCommitDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLModifiedCommitDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLModifiedCommitDate ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLModifiedCommitDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLModifiedCommitDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	
	@Test(description = "Verify BOLPickUpDate Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLPickUpDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLPickUpDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLPickUpDate ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLPickUpDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLPickUpDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCompletedDate Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLCompletedDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLCompletedDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCompletedDate ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyBOLCompletedDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.BOLCompletedDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Customer Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyCustomer_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.Customer_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Customer ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyCustomer_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.Customer_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemSKU Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyItemSKU_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ItemSKU_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemSKU ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyItemSKU_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ItemSKU_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemName Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyItemName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ItemName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemName ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyItemName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ItemName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemOwner Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyItemOwner_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ItemOwner_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemOwner ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyItemOwner_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ItemOwner_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocRefCode Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyShipperLocRefCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ShipperLocRefCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocRefCode ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyShipperLocRefCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ShipperLocRefCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocName Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyShipperLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ShipperLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocName ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyShipperLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ShipperLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCode Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCode ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocName Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocName ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocAddress Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocAddress_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocAddress_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocAddress ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocAddress_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocAddress_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCity Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocCity_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocCity_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCity ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocCity_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocState Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocState_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocState_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocState ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocState_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocZip Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocZip_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocZip_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocZip ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyFromLocZip_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.FromLocZip_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCode Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCode ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocName Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocName ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocAddress Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocAddress_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocAddress_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocAddress ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocAddress_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocAddress_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCity Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocCity_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocCity_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCity ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocCity_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocState Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocState_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocState_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocState ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocState_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocZip Descending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocZip_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocZip_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocZip ascending Sorting functionality of Reports Late Notification listing page")
	public void verifyToLocZip_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = latenotificationspagefunctional.ToLocZip_AscendingSorting();
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
