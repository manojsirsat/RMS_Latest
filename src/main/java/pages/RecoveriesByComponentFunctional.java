package pages;

import commonfunctions.CommonFunctions;
import locators.BOLPageLocators;
import locators.CommonFunctionsLocators;
import locators.RecoveriesByComponentPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class RecoveriesByComponentFunctional 
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
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.RECOVERIES_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.RECOVERIESBYZONES_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.RECOVERIESBYCOMPONENTS_PAGE, ElementType.Xpath, RecoveriesByComponentPageLocators.RECOVERIESBYCOMPONENTSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
}
