package pages;

import commonfunctions.CommonFunctions;
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
	
	public boolean ProviderLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_PROVIDERLOCCODE_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_PROVIDERLOCCODE_COLHEADER, RecoveriesByComponentPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_PROVIDERLOCCODE_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_PROVIDERLOCCODE_COLHEADER, RecoveriesByComponentPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_PROVIDERLOCNAME_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_PROVIDERLOCNAME_COLHEADER, RecoveriesByComponentPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_PROVIDERLOCNAME_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_PROVIDERLOCNAME_COLHEADER, RecoveriesByComponentPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean Zone_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_ZONE_COLHEADER, RecoveriesByComponentPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Zone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_ZONE_COLHEADER, RecoveriesByComponentPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean LocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_LOCCODE_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCCODE_COLHEADER, RecoveriesByComponentPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}
	
	public boolean LocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_LOCCODE_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCCODE_COLHEADER, RecoveriesByComponentPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}
	
	public boolean LocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_LOCNAME_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCNAME_COLHEADER, RecoveriesByComponentPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}
	
	public boolean LocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_LOCNAME_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCNAME_COLHEADER, RecoveriesByComponentPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}
	
	public boolean City_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_CITY_COLHEADER, RecoveriesByComponentPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean City_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_CITY_COLHEADER, RecoveriesByComponentPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean State_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_STATE_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_STATE_COLHEADER, RecoveriesByComponentPageLocators.STRING_STATE_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_STATE_COLDATA);
		return flag;
	}
	
	public boolean State_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_STATE_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_STATE_COLHEADER, RecoveriesByComponentPageLocators.STRING_STATE_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_STATE_COLDATA);
		return flag;
	}
	
	public boolean ZipCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_ZIPCODE_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_ZIPCODE_COLHEADER, RecoveriesByComponentPageLocators.STRING_ZIPCODE_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_ZIPCODE_COLDATA);
		return flag;
	}
	
	public boolean ZipCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_ZIPCODE_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_ZIPCODE_COLHEADER, RecoveriesByComponentPageLocators.STRING_ZIPCODE_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_ZIPCODE_COLDATA);
		return flag;
	}
	
	public boolean SKU_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_SKU_COLHEADER, RecoveriesByComponentPageLocators.STRING_SKU_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKU_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_SKU_COLHEADER, RecoveriesByComponentPageLocators.STRING_SKU_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKUName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_SKUNAME_COLHEADER, RecoveriesByComponentPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean SKUName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_SKUNAME_COLHEADER, RecoveriesByComponentPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean LastCall_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(RecoveriesByComponentPageLocators.BY_LASTCALL_COLHEADER, RecoveriesByComponentPageLocators.BY_LASTCALL_COLDATA);
		return flag;
	}
	
	public boolean LastCall_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(RecoveriesByComponentPageLocators.BY_LASTCALL_COLHEADER, RecoveriesByComponentPageLocators.BY_LASTCALL_COLDATA);
		return flag;
	}
	
	public boolean LastCount_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(RecoveriesByComponentPageLocators.BY_LASTCOUNT_COLHEADER, RecoveriesByComponentPageLocators.BY_LASTCOUNT_COLDATA);
		return flag;
	}
	
	public boolean LastCount_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(RecoveriesByComponentPageLocators.BY_LASTCOUNT_COLHEADER, RecoveriesByComponentPageLocators.BY_LASTCOUNT_COLDATA);
		return flag;
	}
	
	public boolean NextCall_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(RecoveriesByComponentPageLocators.BY_NEXTCALL_COLHEADER, RecoveriesByComponentPageLocators.BY_NEXTCALL_COLDATA);
		return flag;
	}
	
	public boolean NextCall_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(RecoveriesByComponentPageLocators.BY_NEXTCALL_COLHEADER, RecoveriesByComponentPageLocators.BY_NEXTCALL_COLDATA);
		return flag;
	}
	
	public boolean CommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(RecoveriesByComponentPageLocators.BY_COMMITDATE_COLHEADER, RecoveriesByComponentPageLocators.BY_COMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean CommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(RecoveriesByComponentPageLocators.BY_COMMITDATE_COLHEADER, RecoveriesByComponentPageLocators.BY_COMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLStatus_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_BOLSTATUS_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_BOLSTATUS_COLHEADER, RecoveriesByComponentPageLocators.STRING_BOLSTATUS_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_BOLSTATUS_COLDATA);
		return flag;
	}
	
	public boolean BOLStatus_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_BOLSTATUS_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_BOLSTATUS_COLHEADER, RecoveriesByComponentPageLocators.STRING_BOLSTATUS_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_BOLSTATUS_COLDATA);
		return flag;
	}
	
	public boolean LastBOLCompleteDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(RecoveriesByComponentPageLocators.BY_LASTBOLCOMPLETEDATE_COLHEADER, RecoveriesByComponentPageLocators.BY_LASTBOLCOMPLETEDATE_COLDATA);
		return flag;
	}
	
	public boolean LastBOLCompleteDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(RecoveriesByComponentPageLocators.BY_LASTBOLCOMPLETEDATE_COLHEADER, RecoveriesByComponentPageLocators.BY_LASTBOLCOMPLETEDATE_COLDATA);
		return flag;
	}
	
	public boolean FG_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_FG_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_FG_COLHEADER, RecoveriesByComponentPageLocators.STRING_FG_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_FG_COLDATA);
		return flag;
	}
	
	public boolean FG_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_FG_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_FG_COLHEADER, RecoveriesByComponentPageLocators.STRING_FG_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_FG_COLDATA);
		return flag;
	}
	
	public boolean ConfAvail_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_CONFAVIL_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_CONFAVIL_COLHEADER, RecoveriesByComponentPageLocators.STRING_CONFAVIL_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_CONFAVIL_COLDATA);
		return flag;
	}
	
	public boolean ConfAvail_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_CONFAVIL_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_CONFAVIL_COLHEADER, RecoveriesByComponentPageLocators.STRING_CONFAVIL_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_CONFAVIL_COLDATA);
		return flag;
	}
	
	public boolean Region_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_REGION_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_REGION_COLHEADER, RecoveriesByComponentPageLocators.STRING_REGION_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_REGION_COLDATA);
		return flag;
	}
	
	public boolean Region_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_REGION_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_REGION_COLHEADER, RecoveriesByComponentPageLocators.STRING_REGION_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_REGION_COLDATA);
		return flag;
	}
	
	public boolean LocConfAvailRecovVal_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByComponentPageLocators.STRING_LOCCONFAVAILRECOVVAL_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCCONFAVAILRECOVVAL_COLHEADER, RecoveriesByComponentPageLocators.STRING_LOCCONFAVAILRECOVVAL_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCCONFAVAILRECOVVAL_COLDATA);
		return flag;
	}
	
	public boolean LocConfAvailRecovVal_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByComponentPageLocators.STRING_LOCCONFAVAILRECOVVAL_COLHEADER, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCCONFAVAILRECOVVAL_COLHEADER, RecoveriesByComponentPageLocators.STRING_LOCCONFAVAILRECOVVAL_COLDATA, ElementType.Xpath, RecoveriesByComponentPageLocators.BY_LOCCONFAVAILRECOVVAL_COLDATA);
		return flag;
	}
	
	
	
}
