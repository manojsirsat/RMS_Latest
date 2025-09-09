package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.BOLPageFunctional;
import pages.CreateOrderPageFunctional;
import pages.loginPage;
import utils.ReportLoger;

public class CreateOrderTest extends BaseTest
{

	ReportLoger log = new ReportLoger();
	boolean flag;

	@Test(description = "Verify create new order functionality from create order page", priority = 1)
	public void verifyCreate_Order_Flow() throws InterruptedException 
	{
		flag = loginpage.validLogin();
		if(flag)
		{
		flag = createorderpage.complete_CreateOrderFlow();
		}
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL to Order functionality", priority = 2)
	public void verifyAdd_Order_To_BOL_Complete_Flow() throws InterruptedException 
	{
		flag = bolpagefunctional.set_BOL_Flow();
		Assert.assertTrue(flag);
	}
}