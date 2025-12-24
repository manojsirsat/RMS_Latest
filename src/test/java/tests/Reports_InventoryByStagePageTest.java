package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Reports_InventoryByStagePageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Reports_InventoryByStagePageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Reports_InventoryByStagePageFunctional inventorybystagepagefunctional = new Reports_InventoryByStagePageFunctional();
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
	
	@Test(description = "Redirect to InventoryByStage listing page")
	public void redirection_To_InventoryByStageListing_Page() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.navigate_Reports_InventoryByStageListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Reports Inventory By Stage listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyZone_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.Zone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyZone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.Zone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Region Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyRegion_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.Region_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Region ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyRegion_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.Region_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationCode Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyLocationCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.LocationCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationCode ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyLocationCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.LocationCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationName Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyLocationName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.LocationName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationName ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyLocationName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.LocationName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DamagedAccountCode Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyDamagedAccountCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.DamagedAccountCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DamagedAccountCode ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyDamagedAccountCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.DamagedAccountCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountName Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyAccountName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.AccountName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountName ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyAccountName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.AccountName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifySKU_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.SKU_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifySKU_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.SKU_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUName Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifySKUName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.SKUName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUName ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifySKUName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.SKUName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify MonitorRecovery Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyMonitorRecovery_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.MonitorRecovery_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify MonitorRecovery ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyMonitorRecovery_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.MonitorRecovery_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify MonitorReplenish Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyMonitorReplenish_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.MonitorReplenish_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify MonitorReplenish ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyMonitorReplenish_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.MonitorReplenish_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationType Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyLocationType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.LocationType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationType ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyLocationType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.LocationType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify InTransit Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyInTransit_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.InTransit_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify InTransit ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyInTransit_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.InTransit_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PendingReceipt Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyPendingReceipt_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.PendingReceipt_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PendingReceipt ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyPendingReceipt_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.PendingReceipt_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify WIP Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyWIP_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.WIP_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify WIP ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyWIP_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.WIP_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Damaged Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyDamaged_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.Damaged_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Damaged ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyDamaged_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.Damaged_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Scrap Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyScrap_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.Scrap_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Scrap ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyScrap_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.Scrap_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify A99 Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyA99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.A99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify A99 ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyA99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.A99_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify WriteOff Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyWriteOff_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.WriteOff_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify WriteOff ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyWriteOff_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.WriteOff_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FG Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyFG_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.FG_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify FG ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyFG_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.FG_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DefaultZoneProviderCode Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyDefaultZoneProviderCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.DefaultZoneProviderCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DefaultZoneProviderCode ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyDefaultZoneProviderCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.DefaultZoneProviderCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DefaultZoneProviderName Descending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyDefaultZoneProviderName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.DefaultZoneProviderName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify DefaultZoneProviderName ascending Sorting functionality from Reports Inventory By Stage listing page")
	public void verifyDefaultZoneProviderName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventorybystagepagefunctional.DefaultZoneProviderName_AscendingSorting();
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
