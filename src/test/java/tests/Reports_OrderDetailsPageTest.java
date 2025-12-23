package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Reports_OrderDetailsPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Reports_OrderDetailsPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Reports_OrderDetailsPageFunctional orderdetailspagefunctional = new Reports_OrderDetailsPageFunctional();
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
	
	@Test(description = "Redirect to Order Details listing page")
	public void redirection_To_OrderDetailsListing_Page() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.navigate_Reports_OrderDetailsListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Reports Order Details listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLID Descending Sorting functionality from Orders listing page")
	public void verifyBOLID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLID ascending Sorting functionality from Orders listing page")
	public void verifyBOLID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderID Descending Sorting functionality from Orders listing page")
	public void verifyOrderID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderID ascending Sorting functionality from Orders listing page")
	public void verifyOrderID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderStatus Descending Sorting functionality from Orders listing page")
	public void verifyOrderStatus_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderStatus_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderStatus ascending Sorting functionality from Orders listing page")
	public void verifyOrderStatus_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderStatus_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLStatus Descending Sorting functionality from Orders listing page")
	public void verifyBOLStatus_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLStatus_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLStatus ascending Sorting functionality from Orders listing page")
	public void verifyBOLStatus_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLStatus_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderType Descending Sorting functionality from Orders listing page")
	public void verifyOrderType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderType ascending Sorting functionality from Orders listing page")
	public void verifyOrderType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Program Descending Sorting functionality from Orders listing page")
	public void verifyProgram_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.Program_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Program ascending Sorting functionality from Orders listing page")
	public void verifyProgram_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.Program_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CompletedWeek Descending Sorting functionality from Orders listing page")
	public void verifyCompletedWeek_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.CompletedWeek_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CompletedWeek ascending Sorting functionality from Orders listing page")
	public void verifyCompletedWeek_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.CompletedWeek_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderDate Descending Sorting functionality from Orders listing page")
	public void verifyOrderDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderDate ascending Sorting functionality from Orders listing page")
	public void verifyOrderDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderNeedByDate Descending Sorting functionality from Orders listing page")
	public void verifyOrderNeedByDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderNeedByDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderNeedByDate ascending Sorting functionality from Orders listing page")
	public void verifyOrderNeedByDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderNeedByDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderUpdatedDate Descending Sorting functionality from Orders listing page")
	public void verifyOrderUpdatedDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderUpdatedDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderUpdatedDate ascending Sorting functionality from Orders listing page")
	public void verifyOrderUpdatedDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderUpdatedDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLAssignDate Descending Sorting functionality from Orders listing page")
	public void verifyBOLAssignDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLAssignDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLAssignDate ascending Sorting functionality from Orders listing page")
	public void verifyBOLAssignDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLAssignDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLDueDate Descending Sorting functionality from Orders listing page")
	public void verifyBOLDueDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLDueDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLDueDate ascending Sorting functionality from Orders listing page")
	public void verifyBOLDueDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLDueDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCommitDate Descending Sorting functionality from Orders listing page")
	public void verifyBOLCommitDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLCommitDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCommitDate ascending Sorting functionality from Orders listing page")
	public void verifyBOLCommitDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLCommitDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLModifiedCommitDate Descending Sorting functionality from Orders listing page")
	public void verifyBOLModifiedCommitDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLModifiedCommitDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLModifiedCommitDate ascending Sorting functionality from Orders listing page")
	public void verifyBOLModifiedCommitDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLModifiedCommitDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	
	@Test(description = "Verify BOLPickUpDate Descending Sorting functionality from Orders listing page")
	public void verifyBOLPickUpDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLPickUpDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLPickUpDate ascending Sorting functionality from Orders listing page")
	public void verifyBOLPickUpDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLPickUpDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCompletedDate Descending Sorting functionality from Orders listing page")
	public void verifyBOLCompletedDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLCompletedDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCompletedDate ascending Sorting functionality from Orders listing page")
	public void verifyBOLCompletedDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BOLCompletedDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Customer Descending Sorting functionality from Orders listing page")
	public void verifyCustomer_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.Customer_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Customer ascending Sorting functionality from Orders listing page")
	public void verifyCustomer_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.Customer_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemSKU Descending Sorting functionality from Orders listing page")
	public void verifyItemSKU_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ItemSKU_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemSKU ascending Sorting functionality from Orders listing page")
	public void verifyItemSKU_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ItemSKU_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemName Descending Sorting functionality from Orders listing page")
	public void verifyItemName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ItemName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemName ascending Sorting functionality from Orders listing page")
	public void verifyItemName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ItemName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ProgramOwner Descending Sorting functionality from Orders listing page")
	public void verifyProgramOwner_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ProgramOwner_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ProgramOwner ascending Sorting functionality from Orders listing page")
	public void verifyProgramOwner_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ProgramOwner_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	
	@Test(description = "Verify ShipMethod Descending Sorting functionality from Orders listing page")
	public void verifyShipMethod_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ShipMethod_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipMethod ascending Sorting functionality from Orders listing page")
	public void verifyShipMethod_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ShipMethod_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocRefCode Descending Sorting functionality from Orders listing page")
	public void verifyShipperLocRefCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ShipperLocRefCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocRefCode ascending Sorting functionality from Orders listing page")
	public void verifyShipperLocRefCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ShipperLocRefCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocName Descending Sorting functionality from Orders listing page")
	public void verifyShipperLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ShipperLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocName ascending Sorting functionality from Orders listing page")
	public void verifyShipperLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ShipperLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCode Descending Sorting functionality from Orders listing page")
	public void verifyFromLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCode ascending Sorting functionality from Orders listing page")
	public void verifyFromLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocName Descending Sorting functionality from Orders listing page")
	public void verifyFromLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocName ascending Sorting functionality from Orders listing page")
	public void verifyFromLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocAddress Descending Sorting functionality from Orders listing page")
	public void verifyFromLocAddress_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocAddress_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocAddress ascending Sorting functionality from Orders listing page")
	public void verifyFromLocAddress_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocAddress_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCity Descending Sorting functionality from Orders listing page")
	public void verifyFromLocCity_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocCity_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCity ascending Sorting functionality from Orders listing page")
	public void verifyFromLocCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocCity_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocState Descending Sorting functionality from Orders listing page")
	public void verifyFromLocState_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocState_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocState ascending Sorting functionality from Orders listing page")
	public void verifyFromLocState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocState_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocZip Descending Sorting functionality from Orders listing page")
	public void verifyFromLocZip_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocZip_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocZip ascending Sorting functionality from Orders listing page")
	public void verifyFromLocZip_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.FromLocZip_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone Descending Sorting functionality from Orders listing page")
	public void verifyZone_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.Zone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone ascending Sorting functionality from Orders listing page")
	public void verifyZone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.Zone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCode Descending Sorting functionality from Orders listing page")
	public void verifyToLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCode ascending Sorting functionality from Orders listing page")
	public void verifyToLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocName Descending Sorting functionality from Orders listing page")
	public void verifyToLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocName ascending Sorting functionality from Orders listing page")
	public void verifyToLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocAddress Descending Sorting functionality from Orders listing page")
	public void verifyToLocAddress_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocAddress_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocAddress ascending Sorting functionality from Orders listing page")
	public void verifyToLocAddress_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocAddress_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCity Descending Sorting functionality from Orders listing page")
	public void verifyToLocCity_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocCity_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCity ascending Sorting functionality from Orders listing page")
	public void verifyToLocCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocCity_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocState Descending Sorting functionality from Orders listing page")
	public void verifyToLocState_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocState_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocState ascending Sorting functionality from Orders listing page")
	public void verifyToLocState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocState_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocZip Descending Sorting functionality from Orders listing page")
	public void verifyToLocZip_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocZip_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocZip ascending Sorting functionality from Orders listing page")
	public void verifyToLocZip_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.ToLocZip_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CustomerPO Descending Sorting functionality from Orders listing page")
	public void verifyCustomerPO_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.CustomerPO_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CustomerPO ascending Sorting functionality from Orders listing page")
	public void verifyCustomerPO_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.CustomerPO_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderCreatedBy Descending Sorting functionality from Orders listing page")
	public void verifyOrderCreatedBy_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderCreatedBy_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderCreatedBy ascending Sorting functionality from Orders listing page")
	public void verifyOrderCreatedBy_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.OrderCreatedBy_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AutoAssignEligible Descending Sorting functionality from Orders listing page")
	public void verifyAutoAssignEligible_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.AutoAssignEligible_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AutoAssignEligible ascending Sorting functionality from Orders listing page")
	public void verifyAutoAssignEligible_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.AutoAssignEligible_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchFileID Descending Sorting functionality from Orders listing page")
	public void verifyBatchFileID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BatchFileID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchFileID ascending Sorting functionality from Orders listing page")
	public void verifyBatchFileID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BatchFileID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchFileNote Descending Sorting functionality from Orders listing page")
	public void verifyBatchFileNote_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BatchFileNote_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchFileNote ascending Sorting functionality from Orders listing page")
	public void verifyBatchFileNote_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderdetailspagefunctional.BatchFileNote_AscendingSorting();
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
