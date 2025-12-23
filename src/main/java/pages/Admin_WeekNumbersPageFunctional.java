package pages;

import commonfunctions.CommonFunctions;
import locators.Admin_WeekNumbersPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_WeekNumbersPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Admin Week Numbers page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_WeekNumbersListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_WEEKNUMBERSPAGE_LEFTNAV, ElementType.Xpath, Admin_WeekNumbersPageLocators.ADMIN_WEEKNUMBERSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean Name_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_WeekNumbersPageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Admin_WeekNumbersPageLocators.BY_NAME_COLHEADER, Admin_WeekNumbersPageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Admin_WeekNumbersPageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Name_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_WeekNumbersPageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Admin_WeekNumbersPageLocators.BY_NAME_COLHEADER, Admin_WeekNumbersPageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Admin_WeekNumbersPageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean StartDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Admin_WeekNumbersPageLocators.BY_STARTDATE_COLHEADER, Admin_WeekNumbersPageLocators.BY_STARTDATE_COLDATA);
		return flag;
	}
	
	public boolean StartDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Admin_WeekNumbersPageLocators.BY_STARTDATE_COLHEADER, Admin_WeekNumbersPageLocators.BY_STARTDATE_COLDATA);
		return flag;
	}
	
	public boolean LastUpdatedBy_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_WeekNumbersPageLocators.STRING_LASTUPDATEDBY_COLHEADER, ElementType.Xpath, Admin_WeekNumbersPageLocators.BY_LASTUPDATEDBY_COLHEADER, Admin_WeekNumbersPageLocators.STRING_LASTUPDATEDBY_COLDATA, ElementType.Xpath, Admin_WeekNumbersPageLocators.BY_LASTUPDATEDBY_COLDATA);
		return flag;
	}
	
	public boolean LastUpdatedBy_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_WeekNumbersPageLocators.STRING_LASTUPDATEDBY_COLHEADER, ElementType.Xpath, Admin_WeekNumbersPageLocators.BY_LASTUPDATEDBY_COLHEADER, Admin_WeekNumbersPageLocators.STRING_LASTUPDATEDBY_COLDATA, ElementType.Xpath, Admin_WeekNumbersPageLocators.BY_LASTUPDATEDBY_COLDATA);
		return flag;
	}
	
}
