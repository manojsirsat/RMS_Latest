package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.OrdersAndBOLS_OrdersPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class OrdersAndBOLS_OrdersPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static OrdersAndBOLS_OrdersPageFunctional orderspagefunctional = new OrdersAndBOLS_OrdersPageFunctional();
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
	
	@Test(description = "Redirect to Orders listing page")
	public void redirection_To_OrdersListing_Page() throws InterruptedException 
	{
		flag = orderspagefunctional.navigate_OrdersListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Orders listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Order Descending Sorting functionality from Orders listing page")
	public void verifyOrder_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.Order_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Order ascending Sorting functionality from Orders listing page")
	public void verifyOrder_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.Order_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderDate Descending Sorting functionality from Orders listing page")
	public void verifyOrderDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.OrderDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderDate ascending Sorting functionality from Orders listing page")
	public void verifyOrderDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.OrderDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify NeedByDate Descending Sorting functionality from Orders listing page")
	public void verifyNeedByDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.NeedByDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify NeedByDate ascending Sorting functionality from Orders listing page")
	public void verifyNeedByDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.NeedByDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	//////////////////////////////////
	
	
	@Test(description = "Verify BOLDueDate Descending Sorting functionality from Orders listing page")
	public void verifyBOLDueDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.BOLDueDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLDueDate ascending Sorting functionality from Orders listing page")
	public void verifyBOLDueDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.BOLDueDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderType Descending Sorting functionality from Orders listing page")
	public void verifyOrderType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.OrderType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderType ascending Sorting functionality from Orders listing page")
	public void verifyOrderType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.OrderType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CustomerPO Descending Sorting functionality from Orders listing page")
	public void verifyCustomerPO_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.CustomerPO_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CustomerPO ascending Sorting functionality from Orders listing page")
	public void verifyCustomerPO_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.CustomerPO_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountCode Descending Sorting functionality from Orders listing page")
	public void verifyAccountCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.AccountCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountCode ascending Sorting functionality from Orders listing page")
	public void verifyAccountCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.AccountCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountName Descending Sorting functionality from Orders listing page")
	public void verifyAccountName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.AccountName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountName ascending Sorting functionality from Orders listing page")
	public void verifyAccountName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.AccountName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCode Descending Sorting functionality from Orders listing page")
	public void verifyFromLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.FromLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCode ascending Sorting functionality from Orders listing page")
	public void verifyFromLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.FromLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocName Descending Sorting functionality from Orders listing page")
	public void verifyFromLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.FromLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocName ascending Sorting functionality from Orders listing page")
	public void verifyFromLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.FromLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCode Descending Sorting functionality from Orders listing page")
	public void verifyToLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.ToLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCode ascending Sorting functionality from Orders listing page")
	public void verifyToLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.ToLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocName Descending Sorting functionality from Orders listing page")
	public void verifyToLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.ToLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocName ascending Sorting functionality from Orders listing page")
	public void verifyToLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.ToLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipMethod Descending Sorting functionality from Orders listing page")
	public void verifyShipMethod_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.ShipMethod_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipMethod ascending Sorting functionality from Orders listing page")
	public void verifyShipMethod_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.ShipMethod_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperCode Descending Sorting functionality from Orders listing page")
	public void verifyShipperCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.ShipperCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperCode ascending Sorting functionality from Orders listing page")
	public void verifyShipperCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.ShipperCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperName Descending Sorting functionality from Orders listing page")
	public void verifyShipperName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.ShipperName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperName ascending Sorting functionality from Orders listing page")
	public void verifyShipperName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.ShipperName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL Descending Sorting functionality from Orders listing page")
	public void verifyBOL_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.BOL_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL ascending Sorting functionality from Orders listing page")
	public void verifyBOL_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.BOL_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderStatus Descending Sorting functionality from Orders listing page")
	public void verifyOrderStatus_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.OrderStatus_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderStatus ascending Sorting functionality from Orders listing page")
	public void verifyOrderStatus_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.OrderStatus_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLStatus Descending Sorting functionality from Orders listing page")
	public void verifyBOLStatus_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.BOLStatus_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLStatus ascending Sorting functionality from Orders listing page")
	public void verifyBOLStatus_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.BOLStatus_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CompletedDate Descending Sorting functionality from Orders listing page")
	public void verifyCompletedDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.CompletedDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CompletedDate ascending Sorting functionality from Orders listing page")
	public void verifyCompletedDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.CompletedDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchFileID Descending Sorting functionality from Orders listing page")
	public void verifyBatchFileID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.BatchFileID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BatchFileID ascending Sorting functionality from Orders listing page")
	public void verifyBatchFileID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = orderspagefunctional.BatchFileID_AscendingSorting();
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
