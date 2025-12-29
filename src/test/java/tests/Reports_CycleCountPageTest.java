package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Reports_CycleCountPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Reports_CycleCountPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Reports_CycleCountPageFunctional cyclecountpagefunctional = new Reports_CycleCountPageFunctional();
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
	
	@Test(description = "Redirect to CycleCount listing page")
	public void redirection_To_CycleCountListing_Page() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.navigate_Reports_CycleCountListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Reports Cycle Count listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountName Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyAccountName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.AccountName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountName ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyAccountName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.AccountName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountCode Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyAccountCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.AccountCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify AccountCode ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyAccountCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.AccountCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationCode Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyLocationCode_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.LocationCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify LocationCode ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyLocationCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.LocationCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUName Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifySKUName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.SKUName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKUName ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifySKUName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.SKUName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifySKU_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.SKU_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify SKU ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifySKU_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.SKU_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CurrentWIP Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyCurrentWIP_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.CurrentWIP_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CurrentWIP ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyCurrentWIP_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.CurrentWIP_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PhysicalWIP Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyPhysicalWIP_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.PhysicalWIP_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PhysicalWIP ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyPhysicalWIP_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.PhysicalWIP_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify VarianceWIP Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyVarianceWIP_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.VarianceWIP_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify VarianceWIP ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyVarianceWIP_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.VarianceWIP_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CurrentFG Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyCurrentFG_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.CurrentFG_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CurrentFG ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyCurrentFG_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.CurrentFG_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PhysicalFG Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyPhysicalFG_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.PhysicalFG_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PhysicalFG ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyPhysicalFG_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.PhysicalFG_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify VarianceFG Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyVarianceFG_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.VarianceFG_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify VarianceFG ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyVarianceFG_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.VarianceFG_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CurrentDamaged Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyCurrentDamaged_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.CurrentDamaged_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CurrentDamaged ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyCurrentDamaged_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.CurrentDamaged_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PhysicalDamaged Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyPhysicalDamaged_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.PhysicalDamaged_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PhysicalDamaged ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyPhysicalDamaged_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.PhysicalDamaged_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify VarianceDamaged Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyVarianceDamaged_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.VarianceDamaged_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify VarianceDamaged ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyVarianceDamaged_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.VarianceDamaged_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CurrentScrap Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyCurrentScrap_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.CurrentScrap_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify CurrentScrap ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyCurrentScrap_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.CurrentScrap_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PhysicalScrap Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyPhysicalScrap_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.PhysicalScrap_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify PhysicalScrap ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyPhysicalScrap_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.PhysicalScrap_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify VarianceScrap Descending Sorting functionality of Reports Cycle Count listing page")
	public void verifyVarianceScrap_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.VarianceScrap_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify VarianceScrap ascending Sorting functionality of Reports Cycle Count listing page")
	public void verifyVarianceScrap_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = cyclecountpagefunctional.VarianceScrap_AscendingSorting();
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
