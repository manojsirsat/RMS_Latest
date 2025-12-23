package pages;

import commonfunctions.CommonFunctions;
import locators.Admin_ZonesPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_ZonesPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Admin Zones page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_ZonesListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_ZONESPAGE_LEFTNAV, ElementType.Xpath, Admin_ZonesPageLocators.ADMIN_ZONESPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean Zone_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ZonesPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, Admin_ZonesPageLocators.BY_ZONE_COLHEADER, Admin_ZonesPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, Admin_ZonesPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Zone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ZonesPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, Admin_ZonesPageLocators.BY_ZONE_COLHEADER, Admin_ZonesPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, Admin_ZonesPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Description_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ZonesPageLocators.STRING_DESCRIPTION_COLHEADER, ElementType.Xpath, Admin_ZonesPageLocators.BY_DESCRIPTION_COLHEADER, Admin_ZonesPageLocators.STRING_DESCRIPTION_COLDATA, ElementType.Xpath, Admin_ZonesPageLocators.BY_DESCRIPTION_COLDATA);
		return flag;
	}
	
	public boolean Description_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ZonesPageLocators.STRING_DESCRIPTION_COLHEADER, ElementType.Xpath, Admin_ZonesPageLocators.BY_DESCRIPTION_COLHEADER, Admin_ZonesPageLocators.STRING_DESCRIPTION_COLDATA, ElementType.Xpath, Admin_ZonesPageLocators.BY_DESCRIPTION_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ZonesPageLocators.STRING_PROVIDERLOCCODE_COLHEADER, ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCCODE_COLHEADER, Admin_ZonesPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ZonesPageLocators.STRING_PROVIDERLOCCODE_COLHEADER, ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCCODE_COLHEADER, Admin_ZonesPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ZonesPageLocators.STRING_PROVIDERLOCNAME_COLHEADER, ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCNAME_COLHEADER, Admin_ZonesPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ZonesPageLocators.STRING_PROVIDERLOCNAME_COLHEADER, ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCNAME_COLHEADER, Admin_ZonesPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean LocationsCount_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ZonesPageLocators.STRING_LOCATIONSCOUNT_COLHEADER, ElementType.Xpath, Admin_ZonesPageLocators.BY_LOCATIONSCOUNT_COLHEADER, Admin_ZonesPageLocators.STRING_LOCATIONSCOUNT_COLDATA, ElementType.Xpath, Admin_ZonesPageLocators.BY_LOCATIONSCOUNT_COLDATA);
		return flag;
	}
	
	public boolean LocationsCount_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ZonesPageLocators.STRING_LOCATIONSCOUNT_COLHEADER, ElementType.Xpath, Admin_ZonesPageLocators.BY_LOCATIONSCOUNT_COLHEADER, Admin_ZonesPageLocators.STRING_LOCATIONSCOUNT_COLDATA, ElementType.Xpath, Admin_ZonesPageLocators.BY_LOCATIONSCOUNT_COLDATA);
		return flag;
	}
	
	
	
	
	
}
