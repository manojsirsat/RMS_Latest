package pages;

import commonfunctions.CommonFunctions;
import locators.Admin_UsersPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_UsersPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Admin Users page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_UsersListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_USERSPAGE_LEFTNAV, ElementType.Xpath, Admin_UsersPageLocators.ADMIN_USERSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean UserID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_UsersPageLocators.STRING_USERID_COLHEADER, ElementType.Xpath, Admin_UsersPageLocators.BY_USERID_COLHEADER, Admin_UsersPageLocators.STRING_USERID_COLDATA, ElementType.Xpath, Admin_UsersPageLocators.BY_USERID_COLDATA);
		return flag;
	}
	
	public boolean UserID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_UsersPageLocators.STRING_USERID_COLHEADER, ElementType.Xpath, Admin_UsersPageLocators.BY_USERID_COLHEADER, Admin_UsersPageLocators.STRING_USERID_COLDATA, ElementType.Xpath, Admin_UsersPageLocators.BY_USERID_COLDATA);
		return flag;
	}
	
	public boolean Name_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_UsersPageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Admin_UsersPageLocators.BY_NAME_COLHEADER, Admin_UsersPageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Admin_UsersPageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Name_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_UsersPageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Admin_UsersPageLocators.BY_NAME_COLHEADER, Admin_UsersPageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Admin_UsersPageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Email_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_UsersPageLocators.STRING_EMAIL_COLHEADER, ElementType.Xpath, Admin_UsersPageLocators.BY_EMAIL_COLHEADER, Admin_UsersPageLocators.STRING_EMAIL_COLDATA, ElementType.Xpath, Admin_UsersPageLocators.BY_EMAIL_COLDATA);
		return flag;
	}
	
	public boolean Email_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_UsersPageLocators.STRING_EMAIL_COLHEADER, ElementType.Xpath, Admin_UsersPageLocators.BY_EMAIL_COLHEADER, Admin_UsersPageLocators.STRING_EMAIL_COLDATA, ElementType.Xpath, Admin_UsersPageLocators.BY_EMAIL_COLDATA);
		return flag;
	}
	
	public boolean AccountName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_UsersPageLocators.STRING_ACCOUNTNAME_COLHEADER, ElementType.Xpath, Admin_UsersPageLocators.BY_ACCOUNTNAME_COLHEADER, Admin_UsersPageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath, Admin_UsersPageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}
	
	public boolean AccountName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_UsersPageLocators.STRING_ACCOUNTNAME_COLHEADER, ElementType.Xpath, Admin_UsersPageLocators.BY_ACCOUNTNAME_COLHEADER, Admin_UsersPageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath, Admin_UsersPageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}
	
	public boolean Active_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_UsersPageLocators.STRING_ACTIVE_COLHEADER, ElementType.Xpath, Admin_UsersPageLocators.BY_ACTIVE_COLHEADER, Admin_UsersPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath, Admin_UsersPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
	
	public boolean Active_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_UsersPageLocators.STRING_ACTIVE_COLHEADER, ElementType.Xpath, Admin_UsersPageLocators.BY_ACTIVE_COLHEADER, Admin_UsersPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath, Admin_UsersPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
	
	
}
