package pages;

import commonfunctions.CommonFunctions;
import locators.Admin_CallPriorityTypesPageLocators;
import locators.Admin_CallPriorityTypesPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_CallPriorityTypesPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Admin Call Priority Types page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_CallPriorityTypesListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_CALLPRIORITYTYPESPAGE_LEFTNAV, ElementType.Xpath, Admin_CallPriorityTypesPageLocators.ADMIN_CALLPRIORITYTYPESPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean Type_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_CallPriorityTypesPageLocators.STRING_TYPE_COLHEADER, ElementType.Xpath, Admin_CallPriorityTypesPageLocators.BY_TYPE_COLHEADER, Admin_CallPriorityTypesPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath, Admin_CallPriorityTypesPageLocators.BY_TYPE_COLDATA);
		return flag;
	}
	
	public boolean Type_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_CallPriorityTypesPageLocators.STRING_TYPE_COLHEADER, ElementType.Xpath, Admin_CallPriorityTypesPageLocators.BY_TYPE_COLHEADER, Admin_CallPriorityTypesPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath, Admin_CallPriorityTypesPageLocators.BY_TYPE_COLDATA);
		return flag;
	}
	
	public boolean Active_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_CallPriorityTypesPageLocators.STRING_ACTIVE_COLHEADER, ElementType.Xpath, Admin_CallPriorityTypesPageLocators.BY_ACTIVE_COLHEADER, Admin_CallPriorityTypesPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath, Admin_CallPriorityTypesPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
	
	public boolean Active_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_CallPriorityTypesPageLocators.STRING_ACTIVE_COLHEADER, ElementType.Xpath, Admin_CallPriorityTypesPageLocators.BY_ACTIVE_COLHEADER, Admin_CallPriorityTypesPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath, Admin_CallPriorityTypesPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
	
}
