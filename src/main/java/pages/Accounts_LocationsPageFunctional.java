package pages;

import commonfunctions.CommonFunctions;
import locators.Accounts_AccountsPageLocators;
import locators.Accounts_LocationsPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Accounts_LocationsPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Locations page
	 * @throws InterruptedException
	 */
	public boolean navigate_LocationsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ACCOUNTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ACCOUNTS_ACCOUNTS_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ACCOUNTS_LOCATIONS_PAGE, ElementType.Xpath, Accounts_LocationsPageLocators.ACCOUNTS_LOCATIONSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
}
