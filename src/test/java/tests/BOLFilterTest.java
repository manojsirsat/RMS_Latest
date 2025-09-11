package tests;

import utils.ReportLoger;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BOLFilterTest extends BaseTest
{
    boolean flag;
	static ReportLoger log = new ReportLoger();

    @Test(description = "Regression: BOL listing filters core functionality", priority = 1)
    public void verify_BOL_Filter_Core_Functionality() throws InterruptedException {
        // Always log in at the start
        Assert.assertTrue(loginpage.validLogin(), "Login failed");

        Assert.assertTrue(bolpagefunctional.navigate_BOLPage(), "Failed to navigate to BOL page");

        System.out.println("DEBUG: Right before calling getLatestBOLNumber");
        Thread.sleep(5000);
        // // 1. BOL Filter: Valid (top of table)
        String topBOL = bolpagefunctional.getLatestBOLNumber();
        if (topBOL != null && !topBOL.isEmpty()) {
            Assert.assertTrue(bolpagefunctional.searchBOLNumber(topBOL), "BOL filter (valid) failed");
       
        } else {
            // Table empty, search any should return nothing
            Assert.assertTrue(bolpagefunctional.searchBOLNumber("0"), "BOL filter action failed on empty");
           
        }

        // Test From Location filter
        Assert.assertTrue(bolpagefunctional.resetFilters(), "Failed to reset filters before testing From Location.");
        String firstResult = bolpagefunctional.selectRandomOptionFromDropdown(true);
        log.logging("info", "First Selection Result: " + firstResult);
        Assert.assertNotNull(firstResult, "Failed to select a random From Location.");

        Assert.assertTrue(bolpagefunctional.resetFilters(), "Failed to reset filters before testing From Location.");
        String randomResult = bolpagefunctional.selectRandomOptionFromDropdown(false);
        log.logging("info", "Random Selection Result: " + randomResult);
        Assert.assertNotNull(randomResult, "Failed to select a random From Location.");
        Assert.assertTrue(bolpagefunctional.resetFilters(), "Failed to reset filters before testing From Location.");

        Assert.assertTrue(bolpagefunctional.filterByCompletedDateToday(), "Completed Date filter failed");

        int count = bolpagefunctional.getFilteredResultsCount();
        log.logging("info", "Record count for completed date " + count);

        Assert.assertTrue(count >= 0, "Table did not show a valid count after filtering");
    }

}

