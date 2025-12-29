package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Admin_SKUManagementsPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Admin_SKUManagementsPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Admin_SKUManagementsPageFunctional skumanagementpagefunctional = new Admin_SKUManagementsPageFunctional();
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
	
	
	@Test(description = "Redirect to SKU Managements listing page")
	public void redirection_To_SKUManagementsListing_Page() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.navigate_Admin_SKUManagementsListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Admin SKU Managements listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifySKU_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.SKU_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifySKU_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.SKU_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUName Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifySKUName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.SKUName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUName ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifySKUName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.SKUName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Type Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Type_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Type ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Type_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Account Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyAccount_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Account_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Account ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyAccount_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Account_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecoveryValue Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyRecoveryValue_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.RecoveryValue_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecoveryValue ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyRecoveryValue_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.RecoveryValue_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecoveryValueOverride Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyRecoveryValueOverride_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.RecoveryValueOverride_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify RecoveryValueOverride ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyRecoveryValueOverride_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.RecoveryValueOverride_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Length Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyLength_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Length_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Length ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyLength_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Length_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Width Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyWidth_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Width_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Width ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyWidth_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Width_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Height Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyHeight_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Height_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Height ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyHeight_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Height_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Weight Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyWeight_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Weight_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Weight ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyWeight_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Weight_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Notifiable Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyNotifiable_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Notifiable_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Notifiable ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyNotifiable_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Notifiable_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Orderable Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyOrderable_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Orderable_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Orderable ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyOrderable_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Orderable_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Confirmable Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyConfirmable_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Confirmable_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Confirmable ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyConfirmable_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.Confirmable_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LastUpdatedBy Descending Sorting functionality of Admin SKU Managements listing page")
	public void verifyLastUpdatedBy_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.LastUpdatedBy_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LastUpdatedBy ascending Sorting functionality of Admin SKU Managements listing page")
	public void verifyLastUpdatedBy_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = skumanagementpagefunctional.LastUpdatedBy_AscendingSorting();
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
