package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.BOLPageFunctional;
import pages.loginPage;
import utils.ReportLoger;

public class BOLPageTest extends BaseTest
{
    ReportLoger log = new ReportLoger();
    boolean flag;
    
    @Test(description = "Verify create new BOL functionality from BOL listing page", priority = 1)
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
                    Assert.assertTrue(flag);
                }
            }
        }
    }
}