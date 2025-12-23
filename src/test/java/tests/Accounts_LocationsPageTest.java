package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.Accounts_LocationsPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class Accounts_LocationsPageTest 
{

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static Accounts_LocationsPageFunctional locationspagefunctional = new Accounts_LocationsPageFunctional();
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
	
	@Test(description = "Redirect to Locations listing page")
	public void redirection_To_LocationsListing_Page() throws InterruptedException 
	{
		flag = locationspagefunctional.navigate_LocationsListingPage();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Pagination functionality of Locations listing page")
	public void verifyPagination_Functionality() throws InterruptedException 
	{
		flag = commonFunction.verifyPagination();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Code Descending Sorting functionality from Location listing page")
	public void verifyLocCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.LocCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Code Asending Sorting functionality from Locations listing page")
	public void verifyLocCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.LocCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Name Descending Sorting functionality from Location listing page")
	public void verifyLocName_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.LocName_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Name Asending Sorting functionality from Locations listing page")
	public void verifyLocName_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.LocName_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Type Descending Sorting functionality from Location listing page")
	public void verifyLocType_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.LocType_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Loc Type Asending Sorting functionality from Locations listing page")
	public void verifyLocType_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.LocType_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Acct Code Descending Sorting functionality from Location listing page")
	public void verifyAcctCode_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.AcctCode_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Acct Code Asending Sorting functionality from Locations listing page")
	public void verifyAcctCode_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.AcctCode_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Monitor Recoveries Descending Sorting functionality from Location listing page")
	public void verifyMonitor_Recoveries_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Monitor_Recoveries_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Monitor Recoveries Asending Sorting functionality from Locations listing page")
	public void verifyMonitor_Recoveries_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Monitor_Recoveries_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Monitor Replenishments Descending Sorting functionality from Location listing page")
	public void verifyMonitor_Replenishments_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Monitor_Replenishments_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Monitor Replenishments Asending Sorting functionality from Locations listing page")
	public void verifyMonitor_Replenishments_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Monitor_Replenishments_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Notifiable Descending Sorting functionality from Location listing page")
	public void verifyNotifiable_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Notifiable_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Notifiable Asending Sorting functionality from Locations listing page")
	public void verifyNotifiable_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Notifiable_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zone Descending Sorting functionality from Location listing page")
	public void verifyZone_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Zone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Notifiable Asending Sorting functionality from Locations listing page")
	public void verifyZone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Zone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Region Descending Sorting functionality from Location listing page")
	public void verifyRegion_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Region_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Region Asending Sorting functionality from Locations listing page")
	public void verifyRegion_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Region_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Address Descending Sorting functionality from Location listing page")
	public void verifyAddress_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Address_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Address Asending Sorting functionality from Locations listing page")
	public void verifyAddress_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Address_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City Descending Sorting functionality from Location listing page")
	public void verifyCity_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.City_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify City Asending Sorting functionality from Locations listing page")
	public void verifyCity_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.City_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify State Descending Sorting functionality from Location listing page")
	public void verifyState_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.State_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify State Asending Sorting functionality from Locations listing page")
	public void verifyState_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.State_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zip Descending Sorting functionality from Location listing page")
	public void verifyZip_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Zip_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Zip Asending Sorting functionality from Locations listing page")
	public void verifyZip_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Zip_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Def Prov Loc Code Descending Sorting functionality from Location listing page")
	public void verifyDef_Prov_Loc_Code_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Def_Prov_Loc_Code_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Def Prov Loc Code Asending Sorting functionality from Locations listing page")
	public void verifyDef_Prov_Loc_Code_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Def_Prov_Loc_Code_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Def Prov Loc Descending Sorting functionality from Location listing page")
	public void verifyDef_Prov_Loc_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Def_Prov_Loc_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Def Prov Loc Asending Sorting functionality from Locations listing page")
	public void verifyDef_Prov_Loc_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Def_Prov_Loc_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Call Priority Descending Sorting functionality from Location listing page")
	public void verifyCall_Priority_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Call_Priority_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Call Priority Asending Sorting functionality from Locations listing page")
	public void verifyCall_Priority_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Call_Priority_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Short Name Descending Sorting functionality from Location listing page")
	public void verifyShort_Name_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Short_Name_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Short Name Asending Sorting functionality from Locations listing page")
	public void verifyShort_Name_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Short_Name_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Name Descending Sorting functionality from Location listing page")
	public void verifyContact_Name_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Name_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Name Asending Sorting functionality from Locations listing page")
	public void verifyCotact_Name_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Name_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Phone Country Code Descending Sorting functionality from Location listing page")
	public void verifyContact_Phone_Country_Code_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Phone_Country_Code_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Phone Country Code Asending Sorting functionality from Locations listing page")
	public void verifyContact_Phone_Country_Code_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Phone_Country_Code_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Phone Descending Sorting functionality from Location listing page")
	public void verifyContact_Phone_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Phone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Phone Asending Sorting functionality from Locations listing page")
	public void verifyContact_Phone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Phone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Email Descending Sorting functionality from Location listing page")
	public void verifyContact_Email_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Email_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Email Asending Sorting functionality from Locations listing page")
	public void verifyContact_Email_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Email_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Business Phone Country Code Descending Sorting functionality from Location listing page")
	public void verifyContact_Business_Phone_Country_Code_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Business_Phone_Country_Code_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Business Phone Country Code Asending Sorting functionality from Locations listing page")
	public void verifyContact_Business_Phone_Country_Code_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Business_Phone_Country_Code_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Business Phone Descending Sorting functionality from Location listing page")
	public void verifyContact_Business_Phone_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Business_Phone_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Business Phone Asending Sorting functionality from Locations listing page")
	public void verifyContact_Business_Phone_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Business_Phone_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Business Phone EXT Descending Sorting functionality from Location listing page")
	public void verifyContact_Business_Phone_EXT_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Business_Phone_EXT_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Contact Business Phone EXT Asending Sorting functionality from Locations listing page")
	public void verifyContact_Business_Phone_EXT_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Contact_Business_Phone_EXT_AscendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Active Descending Sorting functionality from Location listing page")
	public void verifyActive_DecendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Active_DecendingSorting();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify Active Asending Sorting functionality from Locations listing page")
	public void verifyActive_AscendingSorting_Functionality() throws InterruptedException 
	{
		flag = locationspagefunctional.Active_AscendingSorting();
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
