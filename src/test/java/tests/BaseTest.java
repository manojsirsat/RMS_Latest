package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utils.Mailer;
import utils.WebDriverBase;
import commonfunctions.CommonFunctions;
import pages.BOLPageFunctional;
import pages.CreateOrderPageFunctional;
import pages.loginPage;

/**
 * BaseTest class contains common setup and teardown methods for all test classes.
 * All test classes should extend this class.
 */
public class BaseTest {

    protected static WebDriverBase webDB;
    protected static CommonFunctions commonFunction;
    protected static loginPage loginpage;
    protected static BOLPageFunctional bolpagefunctional;
    protected static CreateOrderPageFunctional createorderpage;

    @BeforeSuite
    public void browser_Setup() throws FileNotFoundException, IOException, Exception {
        System.out.println("Starting browser setup...");
        
        try {
            System.out.println("Initializing WebDriverBase...");
            webDB = new WebDriverBase();
            
            System.out.println("Getting platform property...");
            String platform = webDB.getDataFromProperties("platform");
            System.out.println("Platform: " + platform);
            
            System.out.println("Setting up WebDriver...");
            webDB.Setup(platform);
            
            System.out.println("Getting URL property...");
            String SiteUrl = webDB.getDataFromProperties("url");
            System.out.println("URL: " + SiteUrl);
            
            System.out.println("Navigating to URL...");
            webDB.enterURL(SiteUrl);
            Thread.sleep(2000);
            
            System.out.println("Initializing page objects...");
            commonFunction = new CommonFunctions(webDB);
            loginpage = new loginPage(webDB);
            bolpagefunctional = new BOLPageFunctional(webDB, commonFunction);
            createorderpage = new CreateOrderPageFunctional(webDB, commonFunction);
            
            System.out.println("Browser setup completed successfully!");
            
        } catch (Exception e) {
            System.err.println("Browser setup failed: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * This method runs once after the entire test suite has finished.
     * It closes the browser and releases the WebDriver instance.
     */
    @AfterSuite
    public void browser_Close() {
        webDB.tearDown();
    }

    /**
     * This method also runs after the suite to email the test report.
     */
    @AfterSuite
    public void SendMail() throws Exception {
        Mailer mailer = new Mailer();
        mailer.execute("RMS Automation Report");
    }
}
