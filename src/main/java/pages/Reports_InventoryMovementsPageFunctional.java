package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_InventoryMovementsPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_InventoryMovementsPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports Inventory Movements page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_InventoryMovementsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_INVENTORYMOVENTSPAGE_LEFTNAV, ElementType.Xpath, Reports_InventoryMovementsPageLocators.REPORTS_INVENTORYMOVEMENTSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
}
