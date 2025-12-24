package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Reports_PreBillingPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Reports_PreBillingPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Reports_PreBillingPageFunctional prebillingpagefunctional = new Reports_PreBillingPageFunctional();
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
	
	@Test(description = "Redirect to Pre Billing listing page")
	public void redirection_To_PreBillingListing_Page() throws InterruptedException 
	{
		flag = prebillingpagefunctional.navigate_Reports_PreBillingListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Reports Pre Billing listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLID Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLID ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderID Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderID ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderType Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderType ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ProgramOwner Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyProgramOwner_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ProgramOwner_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ProgramOwner ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyProgramOwner_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ProgramOwner_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Program Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyProgram_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.Program_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Program ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyProgram_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.Program_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CompletedWeek Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyCompletedWeek_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.CompletedWeek_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CompletedWeek ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyCompletedWeek_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.CompletedWeek_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderDate Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderDate ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLAssignDate Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLAssignDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLAssignDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLAssignDate ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLAssignDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLAssignDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLDueDate Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLDueDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLDueDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLDueDate ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLDueDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLDueDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCommitDate Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLCommitDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLCommitDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCommitDate ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLCommitDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLCommitDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLModifiedCommitDate Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLModifiedCommitDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLModifiedCommitDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLModifiedCommitDate ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLModifiedCommitDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLModifiedCommitDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLPickUpDate Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLPickUpDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLPickUpDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLPickUpDate ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLPickUpDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLPickUpDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCompletedDate Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLCompletedDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLCompletedDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOLCompletedDate ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyBOLCompletedDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.BOLCompletedDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Customer Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyCustomer_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.Customer_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Customer ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyCustomer_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.Customer_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CustomerCode Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyCustomerCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.CustomerCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CustomerCode ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyCustomerCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.CustomerCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemSKU Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemSKU_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemSKU_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemSKU ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemSKU_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemSKU_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemName Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemName ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemType Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemType ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemOwner Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemOwner_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemOwner_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemOwner ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemOwner_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemOwner_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemOwnerCode Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemOwnerCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemOwnerCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemOwnerCode ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemOwnerCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemOwnerCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemQuantity Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemQuantity_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemQuantity_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemQuantity ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemQuantity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemQuantity_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderMinApplied Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderMinApplied_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderMinApplied_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderMinApplied ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderMinApplied_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderMinApplied_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PlanMinQty Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyPlanMinQty_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.PlanMinQty_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PlanMinQty ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyPlanMinQty_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.PlanMinQty_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemPriceEach Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemPriceEach_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemPriceEach_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemPriceEach ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemPriceEach_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemPriceEach_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemPriceTotal Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemPriceTotal_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemPriceTotal_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ItemPriceTotal ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyItemPriceTotal_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ItemPriceTotal_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderSubtotal Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderSubtotal_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderSubtotal_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderSubtotal ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderSubtotal_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderSubtotal_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SpotRateType Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifySpotRateType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.SpotRateType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SpotRateType ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifySpotRateType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.SpotRateType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SpotRatePrice Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifySpotRatePrice_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.SpotRatePrice_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SpotRatePrice ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifySpotRatePrice_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.SpotRatePrice_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderFuelCost Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderFuelCost_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderFuelCost_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderFuelCost ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderFuelCost_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderFuelCost_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderOtherCost Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderOtherCost_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderOtherCost_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderOtherCost ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderOtherCost_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderOtherCost_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderOtherNotes Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderOtherNotes_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderOtherNotes_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderOtherNotes ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderOtherNotes_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderOtherNotes_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderTotal Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderTotal_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderTotal_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderTotal ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyOrderTotal_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.OrderTotal_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocCode Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyShipperLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ShipperLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocCode ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyShipperLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ShipperLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocName Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyShipperLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ShipperLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipperLocName ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyShipperLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ShipperLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCode Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCode ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocName Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocName ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocAddress Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocAddress_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocAddress_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocAddress ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocAddress_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocAddress_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCity Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocCity_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocCity_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCity ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocCity_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocState Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocState_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocState_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocState ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocState_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocZip Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocZip_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocZip_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocZip ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyFromLocZip_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.FromLocZip_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCode Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCode ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocName Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocName ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocAddress Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocAddress_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocAddress_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocAddress ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocAddress_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocAddress_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCity Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocCity_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocCity_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCity ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocCity_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocState Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocState_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocState_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocState ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocState_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocZip Descending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocZip_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocZip_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocZip ascending Sorting functionality from Reports Pre Billing listing page")
	public void verifyToLocZip_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = prebillingpagefunctional.ToLocZip_AscendingSorting();
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
