package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.RecoveriesByLocation_ProgramPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class RecoveriesByLocation_ProgramFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Recoveries By Location-Program page
	 * @throws InterruptedException
	 */
	public boolean navigate_Locations_ProgramsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.RECOVERIES_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.RECOVERIESBYZONES_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.RECOVERIESBYLOCATIONS_PROGRAMS_PAGE, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.RECOVERIESBYLOCATIONS_PROGRAMPAGE_HEADING, ElementType.Xpath);
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
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_PROVIDERLOCCODE_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_PROVIDERLOCCODE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_PROVIDERLOCCODE_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_PROVIDERLOCCODE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_PROVIDERLOCNAME_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_PROVIDERLOCNAME_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_PROVIDERLOCNAME_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_PROVIDERLOCNAME_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean Zone_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_ZONE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Zone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_ZONE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean LocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_LOCCODE_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_LOCCODE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}
	
	public boolean LocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_LOCCODE_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_LOCCODE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}
	
	public boolean LocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_LOCNAME_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_LOCNAME_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}
	
	public boolean LocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_LOCNAME_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_LOCNAME_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}
	
	public boolean City_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_CITY_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean City_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_CITY_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean State_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_STATE_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_STATE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_STATE_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_STATE_COLDATA);
		return flag;
	}
	
	public boolean State_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_STATE_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_STATE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_STATE_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_STATE_COLDATA);
		return flag;
	}
	
	public boolean ZipCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_ZIPCODE_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_ZIPCODE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_ZIPCODE_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_ZIPCODE_COLDATA);
		return flag;
	}
	
	public boolean ZipCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_ZIPCODE_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_ZIPCODE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_ZIPCODE_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_ZIPCODE_COLDATA);
		return flag;
	}
	
	public boolean TTLFG_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_TTLFG_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_TTLFG_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_TTLFG_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_TTLFG_COLDATA);
		return flag;
	}
	
	public boolean TTLFG_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_TTLFG_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_TTLFG_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_TTLFG_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_TTLFG_COLDATA);
		return flag;
	}
	
	public boolean FGRECOVVAL_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_FGRECOVVAL_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_FGRECOVVAL_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_FGRECOVVAL_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_FGRECOVVAL_COLDATA);
		return flag;
	}
	
	public boolean FGRECOVVAL_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_FGRECOVVAL_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_FGRECOVVAL_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_FGRECOVVAL_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_FGRECOVVAL_COLDATA);
		return flag;
	}
	
	public boolean TTLCONFAVAIL_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_TTLCONFAVAIL_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_TTLCONFAVAIL_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_TTLCONFAVAIL_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_TTLCONFAVAIL_COLDATA);
		return flag;
	}
	
	public boolean TTLCONFAVAIL_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_TTLCONFAVAIL_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_TTLCONFAVAIL_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_TTLCONFAVAIL_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_TTLCONFAVAIL_COLDATA);
		return flag;
	}
	
	public boolean LastCall_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(RecoveriesByLocation_ProgramPageLocators.BY_LASTCALL_COLHEADER, RecoveriesByLocation_ProgramPageLocators.BY_LASTCALL_COLDATA);
		return flag;
	}
	
	public boolean LastCall_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(RecoveriesByLocation_ProgramPageLocators.BY_LASTCALL_COLHEADER, RecoveriesByLocation_ProgramPageLocators.BY_LASTCALL_COLDATA);
		return flag;
	}
	
	public boolean LastCount_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(RecoveriesByLocation_ProgramPageLocators.BY_LASTCOUNT_COLHEADER, RecoveriesByLocation_ProgramPageLocators.BY_LASTCOUNT_COLDATA);
		return flag;
	}
	
	public boolean LastCount_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(RecoveriesByLocation_ProgramPageLocators.BY_LASTCOUNT_COLHEADER, RecoveriesByLocation_ProgramPageLocators.BY_LASTCOUNT_COLDATA);
		return flag;
	}
	
	public boolean NextCall_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(RecoveriesByLocation_ProgramPageLocators.BY_NEXTCALL_COLHEADER, RecoveriesByLocation_ProgramPageLocators.BY_NEXTCALL_COLDATA);
		return flag;
	}
	
	public boolean NextCall_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(RecoveriesByLocation_ProgramPageLocators.BY_NEXTCALL_COLHEADER, RecoveriesByLocation_ProgramPageLocators.BY_NEXTCALL_COLDATA);
		return flag;
	}
	
	public boolean BOLDue_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(RecoveriesByLocation_ProgramPageLocators.BY_BOLDUE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.BY_BOLDUE_COLDATA);
		return flag;
	}
	
	public boolean BOLDue_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(RecoveriesByLocation_ProgramPageLocators.BY_BOLDUE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.BY_BOLDUE_COLDATA);
		return flag;
	}
	
	public boolean BOLStatus_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_BOLSTATUS_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_BOLSTATUS_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_BOLSTATUS_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_BOLSTATUS_COLDATA);
		return flag;
	}
	
	public boolean BOLStatus_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByLocation_ProgramPageLocators.STRING_BOLSTATUS_COLHEADER, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_BOLSTATUS_COLHEADER, RecoveriesByLocation_ProgramPageLocators.STRING_BOLSTATUS_COLDATA, ElementType.Xpath, RecoveriesByLocation_ProgramPageLocators.BY_BOLSTATUS_COLDATA);
		return flag;
	}
	
	public boolean LastBOLCompleteDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(RecoveriesByLocation_ProgramPageLocators.BY_LASTBOLCOMPLETEDATE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.BY_LASTBOLCOMPLETEDATE_COLDATA);
		return flag;
	}
	
	public boolean LastBOLCompleteDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(RecoveriesByLocation_ProgramPageLocators.BY_LASTBOLCOMPLETEDATE_COLHEADER, RecoveriesByLocation_ProgramPageLocators.BY_LASTBOLCOMPLETEDATE_COLDATA);
		return flag;
	}

	
}
