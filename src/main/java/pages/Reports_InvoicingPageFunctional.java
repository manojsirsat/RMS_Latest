package pages;

import commonfunctions.CommonFunctions;
import locators.Accounts_AccountsPageLocators;
import locators.CommonFunctionsLocators;
import locators.Reports_InvoicingPageLocators;
import locators.Reports_LateNotificationPageLocators;
import locators.Reports_OrderDetailsPageLocators;
import locators.Reports_PreBillingPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_InvoicingPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports invoicing page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_InvoicingListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_INVOICINGPAGE_LEFTNAV, ElementType.Xpath, Reports_InvoicingPageLocators.REPORTS_INVOICINGPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
}
