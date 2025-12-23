package pages;

import commonfunctions.CommonFunctions;
import locators.Admin_ProgramsPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_ProgramsPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Admin Programs page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_ProgramsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath, Admin_ProgramsPageLocators.ADMIN_PROGRAMPAGE_HEADING, ElementType.Xpath);
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
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ProgramsPageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Admin_ProgramsPageLocators.BY_NAME_COLHEADER, Admin_ProgramsPageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Admin_ProgramsPageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Name_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ProgramsPageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Admin_ProgramsPageLocators.BY_NAME_COLHEADER, Admin_ProgramsPageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Admin_ProgramsPageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Code_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ProgramsPageLocators.STRING_CODE_COLHEADER, ElementType.Xpath, Admin_ProgramsPageLocators.BY_CODE_COLHEADER, Admin_ProgramsPageLocators.STRING_CODE_COLDATA, ElementType.Xpath, Admin_ProgramsPageLocators.BY_CODE_COLDATA);
		return flag;
	}
	
	public boolean Code_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ProgramsPageLocators.STRING_CODE_COLHEADER, ElementType.Xpath, Admin_ProgramsPageLocators.BY_CODE_COLHEADER, Admin_ProgramsPageLocators.STRING_CODE_COLDATA, ElementType.Xpath, Admin_ProgramsPageLocators.BY_CODE_COLDATA);
		return flag;
	}
	
	public boolean Account_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ProgramsPageLocators.STRING_ACCOUNT_COLHEADER, ElementType.Xpath, Admin_ProgramsPageLocators.BY_ACCOUNT_COLHEADER, Admin_ProgramsPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath, Admin_ProgramsPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}
	
	public boolean Account_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ProgramsPageLocators.STRING_ACCOUNT_COLHEADER, ElementType.Xpath, Admin_ProgramsPageLocators.BY_ACCOUNT_COLHEADER, Admin_ProgramsPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath, Admin_ProgramsPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}
	
	public boolean Locations_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ProgramsPageLocators.STRING_LOCATIONS_COLHEADER, ElementType.Xpath, Admin_ProgramsPageLocators.BY_LOCATIONS_COLHEADER, Admin_ProgramsPageLocators.STRING_LOCATIONS_COLDATA, ElementType.Xpath, Admin_ProgramsPageLocators.BY_LOCATIONS_COLDATA);
		return flag;
	}
	
	public boolean Locations_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ProgramsPageLocators.STRING_LOCATIONS_COLHEADER, ElementType.Xpath, Admin_ProgramsPageLocators.BY_LOCATIONS_COLHEADER, Admin_ProgramsPageLocators.STRING_LOCATIONS_COLDATA, ElementType.Xpath, Admin_ProgramsPageLocators.BY_LOCATIONS_COLDATA);
		return flag;
	}
	
	public boolean SKUS_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ProgramsPageLocators.STRING_SKUS_COLHEADER, ElementType.Xpath, Admin_ProgramsPageLocators.BY_SKUS_COLHEADER, Admin_ProgramsPageLocators.STRING_SKUS_COLDATA, ElementType.Xpath, Admin_ProgramsPageLocators.BY_SKUS_COLDATA);
		return flag;
	}
	
	public boolean SKUS_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ProgramsPageLocators.STRING_SKUS_COLHEADER, ElementType.Xpath, Admin_ProgramsPageLocators.BY_SKUS_COLHEADER, Admin_ProgramsPageLocators.STRING_SKUS_COLDATA, ElementType.Xpath, Admin_ProgramsPageLocators.BY_SKUS_COLDATA);
		return flag;
	}
	
}
