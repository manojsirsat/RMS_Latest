package tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
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
	
	@Test(description = "Verify BOL Decending Sorting functionality from Zones listing page")
	public void verifyBOL_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = loginpage.validLogin();
		if(flag)
		{
		flag = webDB.navigateToUrl("https://qa.rms.reusability.com/bills-of-lading");
		Thread.sleep(4000);
		if(flag)
		{
		flag = bolpagefunctional.BOL_DecendingSorting();
		}
		}
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL ascending Sorting functionality from Zones listing page")
	public void verifyBOL_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = bolpagefunctional.BOL_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	
	
	@Test(description = "Regression: BOL listing filters core functionality")
    public void verify_BOL_Filter_Core_Functionality() throws InterruptedException {
        // Always log in at the start
        Assert.assertTrue(loginpage.validLogin(), "Login failed");

        Assert.assertTrue(bolpagefunctional.navigate_BOLPage(), "Failed to navigate to BOL page");

        System.out.println("DEBUG: Right before calling getLatestBOLNumber");
        Thread.sleep(5000);
        // 1. BOL Filter: Valid (top of table)
        String topBOL = bolpagefunctional.getLatestBOLNumber();
        if (topBOL != null && !topBOL.isEmpty()) {
            Assert.assertTrue(bolpagefunctional.searchBOLNumber(topBOL), "BOL filter (valid) failed");
            // List<String> bolResults = bolpagefunctional.getDisplayedBOLNumbers();
            // Assert.assertTrue(bolResults.size() > 0 && bolResults.get(0).equals(topBOL),
            //         "Table result for BOL filter not as expected.");
        } else {
            // Table empty, search any should return nothing
            Assert.assertTrue(bolpagefunctional.searchBOLNumber("0"), "BOL filter action failed on empty");
            // Assert.assertTrue(bolpagefunctional.isNoResultsDisplayed(), "Expected no results with empty table");
        }

        /*
        // 1b. BOL Filter: Invalid (10 digits)
        Assert.assertTrue(bolpagefunctional.searchBOLNumber("1234567890"), "BOL filter (invalid) failed");
        Assert.assertTrue(bolpagefunctional.isNoResultsDisplayed(), "Expected no data for invalid BOL input.");

        // 2. Current Status filter – random select, check all rows
        String status = bolpagefunctional.selectRandomOptionFromDropdown(BOLFilterLocators.FILTER_CURRENT_STATUS);
        Assert.assertTrue(bolpagefunctional.applyCurrentStatusFilter(status), "Current Status filter failed");
        bolpagefunctional.verifyEveryRowValue("Current Status", status);

        // 3. Program filter – random select, check all rows
        String program = bolpagefunctional.selectRandomOptionFromDropdown(BOLFilterLocators.FILTER_PROGRAM);
        Assert.assertTrue(bolpagefunctional.applyProgramFilter(program), "Program filter failed");
        bolpagefunctional.verifyEveryRowValue("Program", program);

        // 4. Type filter – random select, check all rows
        String type = bolpagefunctional.selectRandomOptionFromDropdown(BOLFilterLocators.FILTER_TYPE);
        Assert.assertTrue(bolpagefunctional.applyTypeFilter(type), "Type filter failed");
        bolpagefunctional.verifyEveryRowValue("Type", type);

        // 5. From Loc filter – random select, check all rows
        String fromLoc = bolpagefunctional.selectRandomOptionFromDropdown(BOLFilterLocators.FILTER_FROM_LOC);
        Assert.assertTrue(bolpagefunctional.applyFromLocFilter(fromLoc), "From Loc filter failed");
        bolpagefunctional.verifyEveryRowValue("From Loc", fromLoc);

        // 6. To Loc filter – random select, check all rows
        String toLoc = bolpagefunctional.selectRandomOptionFromDropdown(BOLFilterLocators.FILTER_TO_LOC);
        Assert.assertTrue(bolpagefunctional.applyToLocFilter(toLoc), "To Loc filter failed");
        bolpagefunctional.verifyEveryRowValue("To Loc", toLoc);

        // 7. Completed Date filter – today's date for demonstration
        String date = bolpagefunctional.getTodayDateString();
        Assert.assertTrue(bolpagefunctional.applyCompletedDateFilter(date), "Completed Date filter failed");
        bolpagefunctional.verifyEveryRowValue("Completed Date", date);
        */
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
