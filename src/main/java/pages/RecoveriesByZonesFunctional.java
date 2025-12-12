package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.RecoveriesByZonesPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class RecoveriesByZonesFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Recoveries By Zones page
	 * @throws InterruptedException
	 */
	public boolean navigate_ZonesListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.RECOVERIES_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.RECOVERIESBYZONES_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.RECOVERIESBYZONES_PAGE, ElementType.Xpath, RecoveriesByZonesPageLocators.RECOVERIESBYZONESPAGE_HEADING, ElementType.Xpath);
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
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_PROVIDERLOCCODE_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_PROVIDERLOCCODE_COLHEADER, RecoveriesByZonesPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_PROVIDERLOCCODE_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_PROVIDERLOCCODE_COLHEADER, RecoveriesByZonesPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_PROVIDERLOCNAME_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_PROVIDERLOCNAME_COLHEADER, RecoveriesByZonesPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ProviderLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_PROVIDERLOCNAME_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_PROVIDERLOCNAME_COLHEADER, RecoveriesByZonesPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean Zone_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_ZONE_COLHEADER, RecoveriesByZonesPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Zone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_ZONE_COLHEADER, RecoveriesByZonesPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean A0_39_RECOVERY_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_0_39_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_0_39_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_0_39_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_0_39_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A0_39_RECOVERY_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_0_39_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_0_39_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_0_39_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_0_39_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A40_49_RECOVERY_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_40_49_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_40_49_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_40_49_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_40_49_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A40_49_RECOVERY_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_40_49_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_40_49_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_40_49_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_40_49_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A50_59_RECOVERY_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_50_59_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_50_59_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_50_59_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_50_59_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A50_59_RECOVERY_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_50_59_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_50_59_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_50_59_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_50_59_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A60_69_RECOVERY_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_60_69_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_60_69_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_60_69_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_60_69_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A60_69_RECOVERY_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_60_69_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_60_69_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_60_69_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_60_69_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A70_79_RECOVERY_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_70_79_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_70_79_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_70_79_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_70_79_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A70_79_RECOVERY_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_70_79_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_70_79_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_70_79_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_70_79_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A80_89_RECOVERY_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_80_89_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_80_89_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_80_89_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_80_89_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A80_89_RECOVERY_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_80_89_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_80_89_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_80_89_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_80_89_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A90_99_RECOVERY_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_90_99_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_90_99_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_90_99_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_90_99_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A90_99_RECOVERY_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_90_99_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_90_99_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_90_99_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_90_99_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A100_RECOVERY_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(RecoveriesByZonesPageLocators.STRING_100_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_100_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_100_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_100_RECOVERY_COLDATA);
		return flag;
	}
	
	public boolean A100_RECOVERY_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(RecoveriesByZonesPageLocators.STRING_100_RECOVERY_COLHEADER, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_100_RECOVERY_COLHEADER, RecoveriesByZonesPageLocators.STRING_100_RECOVERY_COLDATA, ElementType.Xpath, RecoveriesByZonesPageLocators.BY_100_RECOVERY_COLDATA);
		return flag;
	}
	
	
}
