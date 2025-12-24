package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_ArchivePageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_ArchivePageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports Archive page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_ArchiveListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_ARCHIVEPAGE_LEFTNAV, ElementType.Xpath, Reports_ArchivePageLocators.REPORTS_ARCHIVEPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean Report_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_ArchivePageLocators.STRING_REPORT_COLHEADER, ElementType.Xpath, Reports_ArchivePageLocators.BY_REPORT_COLHEADER, Reports_ArchivePageLocators.STRING_REPORT_COLDATA, ElementType.Xpath, Reports_ArchivePageLocators.BY_REPORT_COLDATA);
		return flag;
	}
	
	public boolean Report_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_ArchivePageLocators.STRING_REPORT_COLHEADER, ElementType.Xpath, Reports_ArchivePageLocators.BY_REPORT_COLHEADER, Reports_ArchivePageLocators.STRING_REPORT_COLDATA, ElementType.Xpath, Reports_ArchivePageLocators.BY_REPORT_COLDATA);
		return flag;
	}
	
	public boolean Name_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_ArchivePageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Reports_ArchivePageLocators.BY_NAME_COLHEADER, Reports_ArchivePageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Reports_ArchivePageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Name_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_ArchivePageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Reports_ArchivePageLocators.BY_NAME_COLHEADER, Reports_ArchivePageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Reports_ArchivePageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Owner_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_ArchivePageLocators.STRING_OWNER_COLHEADER, ElementType.Xpath, Reports_ArchivePageLocators.BY_OWNER_COLHEADER, Reports_ArchivePageLocators.STRING_OWNER_COLDATA, ElementType.Xpath, Reports_ArchivePageLocators.BY_OWNER_COLDATA);
		return flag;
	}
	
	public boolean Owner_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_ArchivePageLocators.STRING_OWNER_COLHEADER, ElementType.Xpath, Reports_ArchivePageLocators.BY_OWNER_COLHEADER, Reports_ArchivePageLocators.STRING_OWNER_COLDATA, ElementType.Xpath, Reports_ArchivePageLocators.BY_OWNER_COLDATA);
		return flag;
	}
	
	public boolean RequestedBy_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_ArchivePageLocators.STRING_REQUESTEDBY_COLHEADER, ElementType.Xpath, Reports_ArchivePageLocators.BY_REQUESTEDBY_COLHEADER, Reports_ArchivePageLocators.STRING_REQUESTEDBY_COLDATA, ElementType.Xpath, Reports_ArchivePageLocators.BY_REQUESTEDBY_COLDATA);
		return flag;
	}
	
	public boolean RequestedBy_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_ArchivePageLocators.STRING_REQUESTEDBY_COLHEADER, ElementType.Xpath, Reports_ArchivePageLocators.BY_REQUESTEDBY_COLHEADER, Reports_ArchivePageLocators.STRING_REQUESTEDBY_COLDATA, ElementType.Xpath, Reports_ArchivePageLocators.BY_REQUESTEDBY_COLDATA);
		return flag;
	}
	
	
}
