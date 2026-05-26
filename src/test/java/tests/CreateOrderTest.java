package tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pages.BOLPageFunctional;
import pages.CreateOrderPageFunctional;
import pages.ProviderBOLPageFunctional;
import pages.loginPage;
import utils.Mailer;
import utils.ReportLoger;
import utils.WebDriverBase;

public class CreateOrderTest {

	// This line used to create object for driver base class
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();
	boolean flag;
	// This line used to create object for commonFunction class
	static CommonFunctions commonFunction = new CommonFunctions();
	static BOLPageFunctional bolpagefunctional = new BOLPageFunctional();
	static loginPage loginpage = new loginPage();
	static CreateOrderPageFunctional createorderpage = new CreateOrderPageFunctional();
	
	/**
	 * This method used to open browser before test start
	 */
	@BeforeTest
	public void browser_Setup() throws FileNotFoundException, IOException, Exception {
		webDB.Setup(System.getProperty("Platform"));
		// This line used to get data from config properties
		String SiteUrl = webDB.getDataFromProperties("url");
		// This line used to navigate the url in browser
		webDB.enterURL(SiteUrl);
		Thread.sleep(2000);
		webDB.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));

	}

	@Test(description = "Verify create new order functionality from create order page")
	public void verifyCreate_Order_Flow() throws InterruptedException {
		flag = loginpage.validLogin(webDB.getDataFromProperties("username"), webDB.getDataFromProperties("password"));
		if (flag) {
			flag = createorderpage.complete_CreateOrderFlow();
		}
		Assert.assertTrue(flag);
	}

	@Test(description = "Verify BOL to Order functionality")
	public void verifyAdd_Order_To_BOL_Complete_Flow() throws InterruptedException {
		flag = bolpagefunctional.set_BOL_Flow();
		Assert.assertTrue(flag);
	}
	
	@Test(description = "Verify a Complete order flow")
    public void verifyComplete_Order_flow() throws InterruptedException {
        bolpagefunctional.fillWipValueAndCompleteBOLFlow();
        }
	
	

	@AfterTest
	public void browser_Close() {
		webDB.tearDown();
	}

	@AfterSuite
	public void SendMail() throws Exception {
		Mailer mailer = new Mailer();
		mailer.execute("RMS");
	}

}
