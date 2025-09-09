package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.BOLPageFunctional;
import pages.CreateOrderPageFunctional;
import pages.loginPage;
import utils.ReportLoger;
import utils.WebDriverBase;

public class MultipleOrderTest extends BaseTest
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
	public void verifyAdd_Order_To_BOL_Flow() throws InterruptedException 
	{
		flag = bolpagefunctional.click_Add_Order_To_BOL_And_CreateBOL_BTN();
		if(flag)
		{
			flag = bolpagefunctional.set_BOLPage_CarrierDetails_CreatingOrderFirst();
		}
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify create multiple order functionality from create order page", priority = 3)
	public void verifyMultiple__Order_Flow() throws InterruptedException 
	{
		flag = createorderpage.complete_MultipleOrderFlow();	
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Add Existing BOL to Order functionality", priority = 4)
	public void verifyAdd_Order_To_Existing_BOL_Flow() throws InterruptedException 
	{
		flag = bolpagefunctional.click_Add_Order_To_BOL_BTN_OrderDetailsPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify create multiple order functionality from create order page", priority = 5, invocationCount = 2)
	public void verifyMultiple_Create_Order_Flow_Final() throws InterruptedException 
	{
		flag = createorderpage.complete_MultipleOrderFlow();
		if(flag)
		{
			flag = bolpagefunctional.click_Add_Order_To_BOL_BTN_OrderDetailsPage();
		}
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL status update functionality", priority = 6)
	public void verifyBOL_Complete_Flow() throws InterruptedException 
	{
		flag = bolpagefunctional.set_BOLStatus();
		Assert.assertTrue(flag);
	}
	
}
