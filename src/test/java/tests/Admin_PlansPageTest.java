package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Admin_PlansPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Admin_PlansPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Admin_PlansPageFunctional planpagefunctional = new Admin_PlansPageFunctional();
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
	
	
	@Test(description = "Redirect to Plans listing page")
	public void redirection_To_PlansListing_Page() throws InterruptedException 
	{
		flag = planpagefunctional.navigate_Admin_PlansListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Admin Plans listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ID Descending Sorting functionality of Admin Plans listing page")
	public void verifyID_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.ID_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ID ascending Sorting functionality of Admin Plans listing page")
	public void verifyID_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.ID_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name Descending Sorting functionality of Admin Plans listing page")
	public void verifyName_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.Name_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Name ascending Sorting functionality of Admin Plans listing page")
	public void verifyName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.Name_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Program Descending Sorting functionality of Admin Plans listing page")
	public void verifyProgram_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.Program_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Program ascending Sorting functionality of Admin Plans listing page")
	public void verifyProgram_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.Program_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ManagedBy Descending Sorting functionality of Admin Plans listing page")
	public void verifyManagedBy_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.ManagedBy_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ManagedBy ascending Sorting functionality of Admin Plans listing page")
	public void verifyManagedBy_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.ManagedBy_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Type Descending Sorting functionality of Admin Plans listing page")
	public void verifyType_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.Type_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Type ascending Sorting functionality of Admin Plans listing page")
	public void verifyType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.Type_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BasePlan Descending Sorting functionality of Admin Plans listing page")
	public void verifyBasePlan_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.BasePlan_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify BasePlan ascending Sorting functionality of Admin Plans listing page")
	public void verifyBasePlan_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.BasePlan_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ActiveEnd Descending Sorting functionality of Admin Plans listing page")
	public void verifyActiveEnd_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.ActiveEnd_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify ActiveEnd ascending Sorting functionality of Admin Plans listing page")
	public void verifyActiveEnd_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.ActiveEnd_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Disabled Descending Sorting functionality of Admin Plans listing page")
	public void verifyDisabled_DescendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.Disabled_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Disabled ascending Sorting functionality of Admin Plans listing page")
	public void verifyDisabled_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = planpagefunctional.Disabled_AscendingSorting();
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
