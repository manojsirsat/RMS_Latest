package tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.BOLPageFunctional;
import pages.loginPage;
import utils.ReportLoger;
import utils.WebDriverBase;

public class BOLPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static BOLPageFunctional bolpagefunctional = new BOLPageFunctional();
	static loginPage loginpage = new loginPage();
	WebDriverWait wait = new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(15));
	
	
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
	
	@Test(description = "Verify create new BOL functionality from BOL listing page")
	public void verifyCreate_BOL_Flow() throws InterruptedException 
	{
		flag = loginpage.validLogin();
		if(flag)
		{
		flag = bolpagefunctional.navigate_BOLPage();
		if(flag)
		{
			flag = bolpagefunctional.click_CreateNewBOL_Button();
			if(flag)
			{
				flag = bolpagefunctional.set_BOLPage_CarrierDetails();
			}
		}
		}
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify add order to BOL functionality")
	public void verifyAdd_Order_To_BOL_Flow() throws InterruptedException 
	{
		flag = bolpagefunctional.set_AddOrderToBOL();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify update BOL status functionality")
	public void verifySet_BOL_Status() throws InterruptedException 
	{
		flag = bolpagefunctional.set_BOLStatus();
		Assert.assertTrue(flag);
		
	}
	
	@Test(description = "Verify mark BOL to complete functionality")
	public void verifyMarkBOL_Complete() throws InterruptedException 
	{
		flag = bolpagefunctional.markBOLComplete();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify the pagination functionality")
	public void verifyPagination() throws InterruptedException 
	{
		flag = commonFunction.clickOnBOLSPage();
		if(flag)
		{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
		}
		
	}
	
	
	@Test(description = "Verify the Sorting functionality")
	public void verifySorting() throws InterruptedException 
	{
		
		flag = loginpage.validLogin();
		if(flag)
		{
		flag = webDB.navigateToUrl("https://qa.rms.reusability.com/recoveries-by-zone");
		Thread.sleep(4000);
		if(flag)
		{
//		commonFunction.validatePaginatedStringSorting();
		}
		}
		
	}
	
	@Test(description = "Verify BOL Decending Sorting functionality from BOL listing page")
	public void verifyBOL_DecendingSorting_Functionality() throws InterruptedException 
	{
//		flag = loginpage.validLogin();
//		if(flag)
//		{
		flag = webDB.navigateToUrl("https://qa.rms.reusability.com/bills-of-lading");
		Thread.sleep(4000);
		if(flag)
		{
		flag = bolpagefunctional.BOL_DecendingSorting();
		}
//		}
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL ascending Sorting functionality from BOL listing page")
	public void verifyBOL_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.BOL_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Type Decending Sorting functionality from BOL listing page")
	public void verifyType_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.Type_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Type ascending Sorting functionality from BOL listing page")
	public void verifyType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.Type_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CurrentStatus Decending Sorting functionality from BOL listing page")
	public void verifyCurrentStatus_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.CurrentStatus_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CurrentStatus ascending Sorting functionality from BOL listing page")
	public void verifyCurrentStatus_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.CurrentStatus_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DueDate Decending Sorting functionality from BOL listing page")
	public void verifyDueDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.DueDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DueDate ascending Sorting functionality from BOL listing page")
	public void verifyDueDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.DueDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipMethod Decending Sorting functionality from BOL listing page")
	public void verifyShipMethod_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ShipMethod_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShipMethod ascending Sorting functionality from BOL listing page")
	public void verifyShipMethod_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ShipMethod_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShippedByLocCode Decending Sorting functionality from BOL listing page")
	public void verifyShippedByLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ShippedByLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShippedByLocCode ascending Sorting functionality from BOL listing page")
	public void verifyShippedByLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ShippedByLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShippedByLocName Decending Sorting functionality from BOL listing page")
	public void verifyShippedByLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ShippedByLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShippedByLocName ascending Sorting functionality from BOL listing page")
	public void verifyShippedByLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ShippedByLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DefaultZone Decending Sorting functionality from BOL listing page")
	public void verifyDefaultZone_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.DefaultZone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DefaultZone ascending Sorting functionality from BOL listing page")
	public void verifyDefaultZone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.DefaultZone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCode Decending Sorting functionality from BOL listing page")
	public void verifyFromLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.FromLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCode ascending Sorting functionality from BOL listing page")
	public void verifyFromLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.FromLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocName Decending Sorting functionality from BOL listing page")
	public void verifyFromLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.FromLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocName ascending Sorting functionality from BOL listing page")
	public void verifyFromLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.FromLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCity Decending Sorting functionality from BOL listing page")
	public void verifyFromLocCity_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.FromLocCity_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocCity ascending Sorting functionality from BOL listing page")
	public void verifyFromLocCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.FromLocCity_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocState Decending Sorting functionality from BOL listing page")
	public void verifyFromLocState_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.FromLocState_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FromLocState ascending Sorting functionality from BOL listing page")
	public void verifyFromLocState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.FromLocState_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCode Decending Sorting functionality from BOL listing page")
	public void verifyToLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ToLocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocCode ascending Sorting functionality from BOL listing page")
	public void verifyToLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ToLocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocName Decending Sorting functionality from BOL listing page")
	public void verifyToLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ToLocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ToLocName ascending Sorting functionality from BOL listing page")
	public void verifyToLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ToLocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AssignDate Decending Sorting functionality from BOL listing page")
	public void verifyAssignDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.AssignDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AssignDate ascending Sorting functionality from BOL listing page")
	public void verifyAssignDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.AssignDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CommitDate Decending Sorting functionality from BOL listing page")
	public void verifyCommitDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.CommitDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CommitDate ascending Sorting functionality from BOL listing page")
	public void verifyCommitDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.CommitDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ModCommitDate Decending Sorting functionality from BOL listing page")
	public void verifyModCommitDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ModCommitDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ModCommitDate ascending Sorting functionality from BOL listing page")
	public void verifyModCommitDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ModCommitDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ScheduleShipDate Decending Sorting functionality from BOL listing page")
	public void verifyScheduleShipDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ScheduleShipDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ScheduleShipDate ascending Sorting functionality from BOL listing page")
	public void verifyScheduleShipDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ScheduleShipDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PickupDate Decending Sorting functionality from BOL listing page")
	public void verifyPickupDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.PickupDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PickupDate ascending Sorting functionality from BOL listing page")
	public void verifyPickupDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.PickupDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify EstimatedDeliveryDate Decending Sorting functionality from BOL listing page")
	public void verifyEstimatedDeliveryDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.EstimatedDeliveryDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify EstimatedDeliveryDate ascending Sorting functionality from BOL listing page")
	public void verifyEstimatedDeliveryDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.EstimatedDeliveryDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DeliveredDate Decending Sorting functionality from BOL listing page")
	public void verifyDeliveredDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.DeliveredDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DeliveredDate ascending Sorting functionality from BOL listing page")
	public void verifyDeliveredDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.DeliveredDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CompleteDate Decending Sorting functionality from BOL listing page")
	public void verifyCompleteDate_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.CompleteDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CompleteDate ascending Sorting functionality from BOL listing page")
	public void verifyCompleteDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.CompleteDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Quote Decending Sorting functionality from BOL listing page")
	public void verifyQuote_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.Quote_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Quote ascending Sorting functionality from BOL listing page")
	public void verifyQuote_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.Quote_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Tender Decending Sorting functionality from BOL listing page")
	public void verifyTender_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.Tender_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Tender ascending Sorting functionality from BOL listing page")
	public void verifyTender_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.Tender_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Shipment Decending Sorting functionality from BOL listing page")
	public void verifyShipment_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.Shipment_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Shipment ascending Sorting functionality from BOL listing page")
	public void verifyShipment_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.Shipment_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AutoAssignEligible Decending Sorting functionality from BOL listing page")
	public void verifyAutoAssignEligible_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.AutoAssignEligible_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AutoAssignEligible ascending Sorting functionality from BOL listing page")
	public void verifyAutoAssignEligible_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.AutoAssignEligible_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShippedByAccount Decending Sorting functionality from BOL listing page")
	public void verifyShippedByAccount_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ShippedByAccount_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ShippedByAccount ascending Sorting functionality from BOL listing page")
	public void verifyShippedByAccount_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.ShippedByAccount_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	
//	@Test(description = "Regression: BOL listing filters core functionality")
//    public void verify_BOL_Filter_Core_Functionality() throws InterruptedException {
//        // Always log in at the start
//        Assert.assertTrue(loginpage.validLogin(), "Login failed");
//
//        Assert.assertTrue(bolpagefunctional.navigate_BOLPage(), "Failed to navigate to BOL page");
//
//        System.out.println("DEBUG: Right before calling getLatestBOLNumber");
//        Thread.sleep(5000);
//        // 1. BOL Filter: Valid (top of table)
//        String topBOL = bolpagefunctional.getLatestBOLNumber();
//        if (topBOL != null && !topBOL.isEmpty()) {
//            Assert.assertTrue(bolpagefunctional.searchBOLNumber(topBOL), "BOL filter (valid) failed");
//            // List<String> bolResults = bolpagefunctional.getDisplayedBOLNumbers();
//            // Assert.assertTrue(bolResults.size() > 0 && bolResults.get(0).equals(topBOL),
//            //         "Table result for BOL filter not as expected.");
//        } else {
//            // Table empty, search any should return nothing
//            Assert.assertTrue(bolpagefunctional.searchBOLNumber("0"), "BOL filter action failed on empty");
//            // Assert.assertTrue(bolpagefunctional.isNoResultsDisplayed(), "Expected no results with empty table");
//        }
//
//        /*
//        // 1b. BOL Filter: Invalid (10 digits)
//        Assert.assertTrue(bolpagefunctional.searchBOLNumber("1234567890"), "BOL filter (invalid) failed");
//        Assert.assertTrue(bolpagefunctional.isNoResultsDisplayed(), "Expected no data for invalid BOL input.");
//
//        // 2. Current Status filter – random select, check all rows
//        String status = bolpagefunctional.selectRandomOptionFromDropdown(BOLFilterLocators.FILTER_CURRENT_STATUS);
//        Assert.assertTrue(bolpagefunctional.applyCurrentStatusFilter(status), "Current Status filter failed");
//        bolpagefunctional.verifyEveryRowValue("Current Status", status);
//
//        // 3. Program filter – random select, check all rows
//        String program = bolpagefunctional.selectRandomOptionFromDropdown(BOLFilterLocators.FILTER_PROGRAM);
//        Assert.assertTrue(bolpagefunctional.applyProgramFilter(program), "Program filter failed");
//        bolpagefunctional.verifyEveryRowValue("Program", program);
//
//        // 4. Type filter – random select, check all rows
//        String type = bolpagefunctional.selectRandomOptionFromDropdown(BOLFilterLocators.FILTER_TYPE);
//        Assert.assertTrue(bolpagefunctional.applyTypeFilter(type), "Type filter failed");
//        bolpagefunctional.verifyEveryRowValue("Type", type);
//
//        // 5. From Loc filter – random select, check all rows
//        String fromLoc = bolpagefunctional.selectRandomOptionFromDropdown(BOLFilterLocators.FILTER_FROM_LOC);
//        Assert.assertTrue(bolpagefunctional.applyFromLocFilter(fromLoc), "From Loc filter failed");
//        bolpagefunctional.verifyEveryRowValue("From Loc", fromLoc);
//
//        // 6. To Loc filter – random select, check all rows
//        String toLoc = bolpagefunctional.selectRandomOptionFromDropdown(BOLFilterLocators.FILTER_TO_LOC);
//        Assert.assertTrue(bolpagefunctional.applyToLocFilter(toLoc), "To Loc filter failed");
//        bolpagefunctional.verifyEveryRowValue("To Loc", toLoc);
//
//        // 7. Completed Date filter – today's date for demonstration
//        String date = bolpagefunctional.getTodayDateString();
//        Assert.assertTrue(bolpagefunctional.applyCompletedDateFilter(date), "Completed Date filter failed");
//        bolpagefunctional.verifyEveryRowValue("Completed Date", date);
//        */
//    }
	
	@Test
	public void verifyBOLFilter() throws InterruptedException {
		loginpage.validLogin();

        bolpagefunctional.navigate_BOLPage();
        flag = bolpagefunctional.verify_InputBOLFilter();
		Assert.assertTrue(flag);
	}


	@AfterTest
	public void browser_Close() {
		webDB.tearDown();
	}

//	// For customized email addresses
//	@AfterSuite
//	public void SendMail() throws Exception {
//		Mailer2 mailer = new Mailer2();
//		mailer.execute("RMS Automation Report");
//		
//	}
	
//	@AfterSuite
//	public void SendMail() throws Exception {
//		Mailer mailer = new Mailer();
//		mailer.execute("RMS Automation Report");
//	}

}
