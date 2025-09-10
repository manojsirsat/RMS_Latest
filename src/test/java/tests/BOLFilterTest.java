package tests;

import locators.BOLFilterLocators;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class BOLFilterTest extends BaseTest
{
    boolean flag;

    @Test(description = "Regression: BOL listing filters core functionality", priority = 1)
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
}
