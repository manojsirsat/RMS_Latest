package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Reports_InventoryBy99sPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Reports_InventoryBy99sPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Reports_InventoryBy99sPageFunctional inventory99spagefunctional = new Reports_InventoryBy99sPageFunctional();
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
	
	@Test(description = "Redirect to Inventory99s listing page")
	public void redirection_To_Inventory99sListing_Page() throws InterruptedException 
	{
		flag = inventory99spagefunctional.navigate_Reports_Inventory99sListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Reports Inventory 99s listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecID Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyRecID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.RecID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecID ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyRecID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.RecID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxID Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyTxID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.TxID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxID ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyTxID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.TxID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PairID Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyPairID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.PairID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PairID ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyPairID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.PairID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderID Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyOrderID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.OrderID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderID ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyOrderID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.OrderID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyBOL_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.BOL_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyBOL_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.BOL_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxDate Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyTxDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.TxDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxDate ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyTxDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.TxDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocName99 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyLocName99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocName99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocName99 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyLocName99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocName99_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode99 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyLocCode99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocCode99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode99 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyLocCode99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocCode99_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU99 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifySKU99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.SKU99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU99 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifySKU99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.SKU99_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU1 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifySKU1_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.SKU1_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU1 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifySKU1_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.SKU1_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocName299 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyLocName299_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocName299_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocName299 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyLocName299_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocName299_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Stage99 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyStage99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Stage99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Stage99 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyStage99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Stage99_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxType99 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyTxType99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.TxType99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxType99 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyTxType99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.TxType99_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderType99 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyOrderType99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.OrderType99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify OrderType99 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyOrderType99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.OrderType99_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Reason99 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyReason99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Reason99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Reason99 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyReason99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Reason99_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify QTY99 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyQTY99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.QTY99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify QTY99 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyQTY99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.QTY99_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify QTY2 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyQTY2_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.QTY2_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify QTY2 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyQTY2_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.QTY2_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Stage2 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyStage2_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Stage2_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Stage2 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyStage2_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Stage2_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocName2 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyLocName2_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocName2_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocName2 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyLocName2_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocName2_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode2 Descending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyLocCode2_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocCode2_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode2 ascending Sorting functionality from Reports Inventory 99s listing page")
	public void verifyLocCode2_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocCode2_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU2 Descending Sorting functionality from Reports Ledger listing page")
	public void verifySKU2_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.SKU2_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU2 ascending Sorting functionality from Reports Ledger listing page")
	public void verifySKU2_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.SKU2_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU21 Descending Sorting functionality from Reports Ledger listing page")
	public void verifySKU21_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.SKU21_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU21 ascending Sorting functionality from Reports Ledger listing page")
	public void verifySKU21_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.SKU21_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Reason2 Descending Sorting functionality from Reports Ledger listing page")
	public void verifyReason2_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Reason2_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Reason2 ascending Sorting functionality from Reports Ledger listing page")
	public void verifyReason2_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Reason2_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocType2 Descending Sorting functionality from Reports Ledger listing page")
	public void verifyLocType2_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocType2_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocType2 ascending Sorting functionality from Reports Ledger listing page")
	public void verifyLocType2_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.LocType2_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Account99 Descending Sorting functionality from Reports Ledger listing page")
	public void verifyAccount99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Account99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Account99 ascending Sorting functionality from Reports Ledger listing page")
	public void verifyAccount99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Account99_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Note99 Descending Sorting functionality from Reports Ledger listing page")
	public void verifyNote99_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Note99_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Note99 ascending Sorting functionality from Reports Ledger listing page")
	public void verifyNote99_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = inventory99spagefunctional.Note99_AscendingSorting();
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
