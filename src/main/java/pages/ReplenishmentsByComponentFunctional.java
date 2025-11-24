package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.RecoveriesByComponentPageLocators;
import locators.ReplenishmentsByComponentPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class ReplenishmentsByComponentFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Recoveries By Components page
	 * @throws InterruptedException
	 */
	public boolean navigate_ComponentsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPLENISHMENTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPLENISHMENTS_COMPONENTS_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPLENISHMENTS_COMPONENTS_PAGE, ElementType.Xpath, ReplenishmentsByComponentPageLocators.REPLENISHMENTSBYCOMPONENTSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
}
