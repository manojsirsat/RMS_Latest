package tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.BOLPageFunctional;
import pages.ProviderBOLPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class ProviderBOLPageTest {

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
//	static ProviderBOLPageFunctional bolpagefunctional = new ProviderBOLPageFunctional();
	static loginPage loginpage = new loginPage();
	WebDriverWait wait = new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(15));
	static ProviderBOLPageFunctional providerBOLPageFunctional = new ProviderBOLPageFunctional();
	static BOLPageFunctional bolpagefunctional = new BOLPageFunctional();
	
	/**
	 * This method used to open browser before test start
	 */
	@BeforeTest
	public void Browser_Setup() throws FileNotFoundException, IOException, Exception {
		webDB.Setup(System.getProperty("Platform"));
		// This line used to get data from config properties
		String SiteUrl = webDB.getDataFromProperties("url");
		// This line used to navigate the url in browser
		webDB.enterURL(SiteUrl);
		Thread.sleep(2000);
		webDB.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));

	}
	
	@Test(description = "Verify valid login")
	public void Verify_Valid_Login() throws InterruptedException {
		flag = loginpage.validLogin(webDB.getDataFromProperties("providerusername"), webDB.getDataFromProperties("providerpassword"));
		Assert.assertTrue(flag);
	}

	@Test(description = "Verify add order to BOL functionality")
	public void VerifyCreate_NewBOLFunctionality() throws InterruptedException {
		flag = bolpagefunctional.set_BOL_Flow();
		Assert.assertTrue(flag);
	}

	@Test(description = "Verify create new BOL functionality from provider BOL page")
    public void verifyCreate_BOLFlow_Provider() throws InterruptedException {
        flag = loginpage.validLogin(webDB.getDataFromProperties("providerusername"),
                webDB.getDataFromProperties("providerpassword"));
        if (flag) {
            
            flag = providerBOLPageFunctional.navigate_LocationsListingPage();
            if(flag)
            {
            	flag = providerBOLPageFunctional.createBOLFlow();
            	if(flag)
            	{
            		flag = providerBOLPageFunctional.navigate_BOLPage();
            		if(flag)
            		{
            			flag = providerBOLPageFunctional.set_BOLStatusProvider();
            			if(flag)
            			{
            				bolpagefunctional.fillWipValueAndCompleteBOLFlow();
            			}
            		}
            	}
            }
        }
        Assert.assertTrue(flag);
    }

	@Test(description = "Verify mark BOL to complete functionality")
	public void VerifyMarkBOL_Complete() throws InterruptedException {
		flag = bolpagefunctional.markBOLComplete();
		Assert.assertTrue(flag);
	}

	@AfterTest
	public void Browser_Close() {
		webDB.tearDown();
	}

//	@AfterSuite
//	public void SendMail() throws Exception {
//		Mailer mailer = new Mailer();
//		mailer.execute("RMS");
//	}

}
