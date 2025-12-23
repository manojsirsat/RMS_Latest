package pages;

import commonfunctions.CommonFunctions;
import locators.Admin_ImportedFilesPageLocators;
import locators.Admin_ImportedFilesPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_ImportedFilesPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Admin Imported Files page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_ImportedFilesListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_IMPORTEDFILESPAGE_LEFTNAV, ElementType.Xpath, Admin_ImportedFilesPageLocators.ADMIN_IMPORTEDFILESPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean ID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ImportedFilesPageLocators.STRING_ID_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_ID_COLHEADER, Admin_ImportedFilesPageLocators.STRING_ID_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_ID_COLDATA);
		return flag;
	}
	
	public boolean ID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ImportedFilesPageLocators.STRING_ID_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_ID_COLHEADER, Admin_ImportedFilesPageLocators.STRING_ID_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_ID_COLDATA);
		return flag;
	}
	
	public boolean ImportType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ImportedFilesPageLocators.STRING_IMPORTTYPE_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_IMPORTTYPE_COLHEADER, Admin_ImportedFilesPageLocators.STRING_IMPORTTYPE_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_IMPORTTYPE_COLDATA);
		return flag;
	}
	
	public boolean ImportType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ImportedFilesPageLocators.STRING_IMPORTTYPE_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_IMPORTTYPE_COLHEADER, Admin_ImportedFilesPageLocators.STRING_IMPORTTYPE_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_IMPORTTYPE_COLDATA);
		return flag;
	}
	
	public boolean TotalLines_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ImportedFilesPageLocators.STRING_TOTALLINES_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_TOTALLINES_COLHEADER, Admin_ImportedFilesPageLocators.STRING_TOTALLINES_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_TOTALLINES_COLDATA);
		return flag;
	}
	
	public boolean TotalLines_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ImportedFilesPageLocators.STRING_TOTALLINES_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_TOTALLINES_COLHEADER, Admin_ImportedFilesPageLocators.STRING_TOTALLINES_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_TOTALLINES_COLDATA);
		return flag;
	}
	
	public boolean Successful_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ImportedFilesPageLocators.STRING_SUCCESSFUL_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_SUCCESSFUL_COLHEADER, Admin_ImportedFilesPageLocators.STRING_SUCCESSFUL_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_SUCCESSFUL_COLDATA);
		return flag;
	}
	
	public boolean Successful_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ImportedFilesPageLocators.STRING_SUCCESSFUL_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_SUCCESSFUL_COLHEADER, Admin_ImportedFilesPageLocators.STRING_SUCCESSFUL_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_SUCCESSFUL_COLDATA);
		return flag;
	}
	
	public boolean Errors_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ImportedFilesPageLocators.STRING_ERRORS_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_ERRORS_COLHEADER, Admin_ImportedFilesPageLocators.STRING_ERRORS_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_ERRORS_COLDATA);
		return flag;
	}
	
	public boolean Errors_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ImportedFilesPageLocators.STRING_ERRORS_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_ERRORS_COLHEADER, Admin_ImportedFilesPageLocators.STRING_ERRORS_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_ERRORS_COLDATA);
		return flag;
	}
	
	public boolean UnProcessed_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ImportedFilesPageLocators.STRING_UNPROCESSED_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_UNPROCESSED_COLHEADER, Admin_ImportedFilesPageLocators.STRING_UNPROCESSED_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_UNPROCESSED_COLDATA);
		return flag;
	}
	
	public boolean UnProcessed_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ImportedFilesPageLocators.STRING_UNPROCESSED_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_UNPROCESSED_COLHEADER, Admin_ImportedFilesPageLocators.STRING_UNPROCESSED_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_UNPROCESSED_COLDATA);
		return flag;
	}
	
	public boolean User_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ImportedFilesPageLocators.STRING_USER_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_USER_COLHEADER, Admin_ImportedFilesPageLocators.STRING_USER_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_USER_COLDATA);
		return flag;
	}
	
	public boolean User_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ImportedFilesPageLocators.STRING_USER_COLHEADER, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_USER_COLHEADER, Admin_ImportedFilesPageLocators.STRING_USER_COLDATA, ElementType.Xpath, Admin_ImportedFilesPageLocators.BY_USER_COLDATA);
		return flag;
	}
	
}
