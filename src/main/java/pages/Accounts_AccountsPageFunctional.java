package pages;

import commonfunctions.CommonFunctions;
import locators.Accounts_AccountsPageLocators;
import locators.CommonFunctionsLocators;
import locators.Reports_ArchivePageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Accounts_AccountsPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Accounts page
	 * @throws InterruptedException
	 */
	public boolean navigate_AccountsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ACCOUNTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ACCOUNTS_ACCOUNTS_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ACCOUNTS_ACCOUNTS_PAGE, ElementType.Xpath, Accounts_AccountsPageLocators.ACCOUNTS_ACCOUNTSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
}
