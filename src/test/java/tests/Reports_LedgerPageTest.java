package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Reports_LedgerPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Reports_LedgerPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Reports_LedgerPageFunctional ledgerpagefunctional = new Reports_LedgerPageFunctional();
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
	
	@Test(description = "Redirect to Ledger listing page")
	public void redirection_To_LedgerListing_Page() throws InterruptedException 
	{
		flag = ledgerpagefunctional.navigate_Reports_LedgerListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Reports Ledger listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecID Descending Sorting functionality from Reports Ledger listing page")
	public void verifyRecID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.RecID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecID ascending Sorting functionality from Reports Ledger listing page")
	public void verifyRecID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.RecID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxID Descending Sorting functionality from Reports Ledger listing page")
	public void verifyTxID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.TxID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxID ascending Sorting functionality from Reports Ledger listing page")
	public void verifyTxID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.TxID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PairID Descending Sorting functionality from Reports Ledger listing page")
	public void verifyPairID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.PairID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PairID ascending Sorting functionality from Reports Ledger listing page")
	public void verifyPairID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.PairID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify WOID Descending Sorting functionality from Reports Ledger listing page")
	public void verifyWOID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.WOID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify WOID ascending Sorting functionality from Reports Ledger listing page")
	public void verifyWOID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.WOID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL Descending Sorting functionality from Reports Ledger listing page")
	public void verifyBOL_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.BOL_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BOL ascending Sorting functionality from Reports Ledger listing page")
	public void verifyBOL_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.BOL_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxDate Descending Sorting functionality from Reports Ledger listing page")
	public void verifyTxDate_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.TxDate_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxDate ascending Sorting functionality from Reports Ledger listing page")
	public void verifyTxDate_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.TxDate_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocName Descending Sorting functionality from Reports Ledger listing page")
	public void verifyLocName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.LocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocName ascending Sorting functionality from Reports Ledger listing page")
	public void verifyLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.LocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode Descending Sorting functionality from Reports Ledger listing page")
	public void verifyLocCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.LocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocCode ascending Sorting functionality from Reports Ledger listing page")
	public void verifyLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.LocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU Descending Sorting functionality from Reports Ledger listing page")
	public void verifySKU_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.SKU_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU ascending Sorting functionality from Reports Ledger listing page")
	public void verifySKU_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.SKU_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU1 Descending Sorting functionality from Reports Ledger listing page")
	public void verifySKU1_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.SKU1_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU1 ascending Sorting functionality from Reports Ledger listing page")
	public void verifySKU1_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.SKU1_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Stage Descending Sorting functionality from Reports Ledger listing page")
	public void verifyStage_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.Stage_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Stage ascending Sorting functionality from Reports Ledger listing page")
	public void verifyStage_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.Stage_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify QTY Descending Sorting functionality from Reports Ledger listing page")
	public void verifyQTY_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.QTY_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify QTY ascending Sorting functionality from Reports Ledger listing page")
	public void verifyQTY_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.QTY_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify InvBefore Descending Sorting functionality from Reports Ledger listing page")
	public void verifyInvBefore_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.InvBefore_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify InvBefore ascending Sorting functionality from Reports Ledger listing page")
	public void verifyInvBefore_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.InvBefore_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify InvAfter Descending Sorting functionality from Reports Ledger listing page")
	public void verifyInvAfter_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.InvAfter_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify InvAfter ascending Sorting functionality from Reports Ledger listing page")
	public void verifyInvAfter_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.InvAfter_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxType Descending Sorting functionality from Reports Ledger listing page")
	public void verifyTxType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.TxType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify TxType ascending Sorting functionality from Reports Ledger listing page")
	public void verifyTxType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.TxType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify WOType Descending Sorting functionality from Reports Ledger listing page")
	public void verifyWOType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.WOType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify WOType ascending Sorting functionality from Reports Ledger listing page")
	public void verifyWOType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.WOType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Action Descending Sorting functionality from Reports Ledger listing page")
	public void verifyAction_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.Action_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Action ascending Sorting functionality from Reports Ledger listing page")
	public void verifyAction_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.Action_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocType Descending Sorting functionality from Reports Ledger listing page")
	public void verifyLocType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.LocType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocType ascending Sorting functionality from Reports Ledger listing page")
	public void verifyLocType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.LocType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Account Descending Sorting functionality from Reports Ledger listing page")
	public void verifyAccount_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.Account_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Account ascending Sorting functionality from Reports Ledger listing page")
	public void verifyAccount_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.Account_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify User Descending Sorting functionality from Reports Ledger listing page")
	public void verifyUser_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.User_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify User ascending Sorting functionality from Reports Ledger listing page")
	public void verifyUser_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = ledgerpagefunctional.User_AscendingSorting();
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
