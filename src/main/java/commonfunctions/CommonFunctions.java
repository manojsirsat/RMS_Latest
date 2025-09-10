package commonfunctions;

import com.github.javafaker.Faker;

import locators.BOLPageLocators;
import locators.CommonFunctionsLocators;
import locators.CreateOrderPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class CommonFunctions 
{
	
	private WebDriverBase webDB;
	static ReportLoger log = new ReportLoger();
	boolean flag;
	public String actlink = new String();
	public String acttext = new String();
	public String expectedtext_link = new String();
	Faker faker = new Faker();

	public CommonFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
	}
		
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Orders and BOLs link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnOrdersAndBolsPage () throws InterruptedException
	{
		flag = webDB.waitForElement(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath);
		if(flag)
		{
			webDB.clickAnElement(CommonFunctionsLocators.ORDERSANDBOLS_PAGE_LEFTNAV, ElementType.Xpath);
			// Wait for the BOLS_PAGE link to be visible after the click.
			flag = webDB.waitForElement(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on BOL link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnBOLSPage () throws InterruptedException
	{
		// First, wait for the BOLs page link to be available.
		flag = webDB.waitForElement(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
			// Wait for the heading of the new page to appear.
			flag = webDB.waitForElement(BOLPageLocators.BOLPAGE_HEADING, ElementType.Xpath);
			if (flag) {
				log.logging("info", "BOL listing page is displayed");
			}
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Create order link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnCreateOrderPage () throws InterruptedException
	{
		flag = webDB.waitForElement(CommonFunctionsLocators.CREATEORDER_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.CREATEORDER_PAGE, ElementType.Xpath);
			// Wait for the heading of the new page to appear.
			flag = webDB.waitForElement(CreateOrderPageLocators.CREATEORDER_PAGE_HEADING, ElementType.Xpath);
			if (flag) {
				log.logging("info", "Create order page is displayed");
			}
		}
		
		return flag;
	}
	
}