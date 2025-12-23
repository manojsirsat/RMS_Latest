package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_CurrentInventoryByLocationPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_CurrentInventoryByLocationPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports Current inventory by locations listing page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_CurrentInventoryByLocationListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_CURRENTINVENTORYBYLOCATIONPAGE_LEFTNAV, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.REPORTS_CURRENTINVENTORYBYLOCATIONPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean AccountName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_ACCOUNTNAME_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACCOUNTNAME_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}
	
	public boolean AccountName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_ACCOUNTNAME_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACCOUNTNAME_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}
	
	public boolean AccountCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_ACCOUNTCODE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACCOUNTCODE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_ACCOUNTCODE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACCOUNTCODE_COLDATA);
		return flag;
	}
	
	public boolean AccountCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_ACCOUNTCODE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACCOUNTCODE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_ACCOUNTCODE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACCOUNTCODE_COLDATA);
		return flag;
	}
	
	public boolean LocationCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONCODE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONCODE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONCODE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONCODE_COLDATA);
		return flag;
	}
	
	public boolean LocationCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONCODE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONCODE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONCODE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONCODE_COLDATA);
		return flag;
	}
	
	public boolean LocationName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONNAME_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONNAME_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONNAME_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONNAME_COLDATA);
		return flag;
	}
	
	public boolean LocationName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONNAME_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONNAME_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONNAME_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONNAME_COLDATA);
		return flag;
	}
	
	public boolean LocationType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONTYPE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONTYPE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONTYPE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONTYPE_COLDATA);
		return flag;
	}
	
	public boolean LocationType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONTYPE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONTYPE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_LOCATIONTYPE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_LOCATIONTYPE_COLDATA);
		return flag;
	}
	
	public boolean City_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_CITY_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean City_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_CITY_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean State_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_STATE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_STATE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_STATE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_STATE_COLDATA);
		return flag;
	}
	
	public boolean State_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_STATE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_STATE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_STATE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_STATE_COLDATA);
		return flag;
	}
	
	public boolean Active_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_ACTIVE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACTIVE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
	
	public boolean Active_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_ACTIVE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACTIVE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
	
	public boolean SKUName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_SKUNAME_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean SKUName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_SKUNAME_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean SKUNumber_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_SKUNUMBER_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_SKUNUMBER_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_SKUNUMBER_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_SKUNUMBER_COLDATA);
		return flag;
	}
	
	public boolean SKUNumber_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_SKUNUMBER_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_SKUNUMBER_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_SKUNUMBER_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_SKUNUMBER_COLDATA);
		return flag;
	}
	
	public boolean Stage_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_STAGE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_STAGE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_STAGE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_STAGE_COLDATA);
		return flag;
	}
	
	public boolean Stage_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_STAGE_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_STAGE_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_STAGE_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_STAGE_COLDATA);
		return flag;
	}
	
	public boolean Quantity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_QUANTITY_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_QUANTITY_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_QUANTITY_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_QUANTITY_COLDATA);
		return flag;
	}
	
	public boolean Quantity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CurrentInventoryByLocationPageLocators.STRING_QUANTITY_COLHEADER, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_QUANTITY_COLHEADER, Reports_CurrentInventoryByLocationPageLocators.STRING_QUANTITY_COLDATA, ElementType.Xpath, Reports_CurrentInventoryByLocationPageLocators.BY_QUANTITY_COLDATA);
		return flag;
	}
	
	
}
