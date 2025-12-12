package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.ReplenishmentsByComponentPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class ReplenishmentsByComponentFunctional 
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
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPLENISHMENTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPLENISHMENTS_COMPONENTS_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPLENISHMENTS_COMPONENTS_PAGE, ElementType.Xpath, ReplenishmentsByComponentPageLocators.REPLENISHMENTSBYCOMPONENTSPAGE_HEADING, ElementType.Xpath);
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
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_PROVIDERLOCCODE_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_PROVIDERLOCCODE_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_PROVIDERLOCCODE_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_PROVIDERLOCCODE_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_PROVIDERLOCNAME_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_PROVIDERLOCNAME_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_PROVIDERLOCNAME_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_PROVIDERLOCNAME_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean Zone_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ZONE_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Zone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ZONE_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean LocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_LOCCODE_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_LOCCODE_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}
	
	public boolean LocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_LOCCODE_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_LOCCODE_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}
	
	public boolean LocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_LOCNAME_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_LOCNAME_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}
	
	public boolean LocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_LOCNAME_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_LOCNAME_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}
	
	public boolean City_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_CITY_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean City_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_CITY_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean State_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_STATE_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_STATE_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_STATE_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_STATE_COLDATA);
		return flag;
	}
	
	public boolean State_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_STATE_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_STATE_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_STATE_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_STATE_COLDATA);
		return flag;
	}
	
	public boolean ZipCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_ZIPCODE_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ZIPCODE_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_ZIPCODE_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ZIPCODE_COLDATA);
		return flag;
	}
	
	public boolean ZipCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_ZIPCODE_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ZIPCODE_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_ZIPCODE_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ZIPCODE_COLDATA);
		return flag;
	}
	
	public boolean SKU_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SKU_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_SKU_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKU_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SKU_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_SKU_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKUName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SKUNAME_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean SKUName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SKUNAME_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	
	public boolean ShipMin_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_SHIPMIN_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SHIPMIN_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_SHIPMIN_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SHIPMIN_COLDATA);
		return flag;
	}
	
	public boolean ShipMin_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_SHIPMIN_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SHIPMIN_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_SHIPMIN_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SHIPMIN_COLDATA);
		return flag;
	}
	
	public boolean ShipMax_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_SHIPMAX_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SHIPMAX_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_SHIPMAX_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SHIPMAX_COLDATA);
		return flag;
	}
	
	public boolean ShipMax_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_SHIPMAX_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SHIPMAX_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_SHIPMAX_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_SHIPMAX_COLDATA);
		return flag;
	}
	
	public boolean InTransit_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_INTRANSIT_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_INTRANSIT_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_INTRANSIT_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_INTRANSIT_COLDATA);
		return flag;
	}
	
	public boolean InTransit_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_INTRANSIT_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_INTRANSIT_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_INTRANSIT_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_INTRANSIT_COLDATA);
		return flag;
	}
	
	public boolean BelowMinQty_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_BELOWMINQTY_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_BELOWMINQTY_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_BELOWMINQTY_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_BELOWMINQTY_COLDATA);
		return flag;
	}
	
	public boolean BelowMinQty_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_BELOWMINQTY_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_BELOWMINQTY_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_BELOWMINQTY_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_BELOWMINQTY_COLDATA);
		return flag;
	}
	
	public boolean FG_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_FG_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_FG_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_FG_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_FG_COLDATA);
		return flag;
	}
	
	public boolean FG_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_FG_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_FG_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_FG_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_FG_COLDATA);
		return flag;
	}
	
	public boolean ConfAvail_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_CONFAVIL_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_CONFAVIL_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_CONFAVIL_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_CONFAVIL_COLDATA);
		return flag;
	}
	
	public boolean ConfAvail_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_CONFAVIL_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_CONFAVIL_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_CONFAVIL_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_CONFAVIL_COLDATA);
		return flag;
	}
	
	public boolean Region_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_REGION_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_REGION_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_REGION_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_REGION_COLDATA);
		return flag;
	}
	
	public boolean Region_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_REGION_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_REGION_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_REGION_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_REGION_COLDATA);
		return flag;
	}
	
	public boolean Account_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(ReplenishmentsByComponentPageLocators.STRING_ACCOUNT_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ACCOUNT_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}
	
	public boolean Account_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(ReplenishmentsByComponentPageLocators.STRING_ACCOUNT_COLHEADER, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ACCOUNT_COLHEADER, ReplenishmentsByComponentPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath, ReplenishmentsByComponentPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}
	
}
