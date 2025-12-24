package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_InventoryByStagePageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_InventoryByStagePageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports Inventory By Stage page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_InventoryByStageListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_INVENTORYBYSTAGEPAGE_LEFTNAV, ElementType.Xpath, Reports_InventoryByStagePageLocators.REPORTS_INVENTORYBYSTAGEPAGE_HEADING, ElementType.Xpath);
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
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_ZONE_COLHEADER, Reports_InventoryByStagePageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Zone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_ZONE_COLHEADER, Reports_InventoryByStagePageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Region_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_REGION_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_REGION_COLHEADER, Reports_InventoryByStagePageLocators.STRING_REGION_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_REGION_COLDATA);
		return flag;
	}
	
	public boolean Region_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_REGION_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_REGION_COLHEADER, Reports_InventoryByStagePageLocators.STRING_REGION_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_REGION_COLDATA);
		return flag;
	}
	
	public boolean LocationCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_LOCATIONCODE_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONCODE_COLHEADER, Reports_InventoryByStagePageLocators.STRING_LOCATIONCODE_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONCODE_COLDATA);
		return flag;
	}
	
	public boolean LocationCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_LOCATIONCODE_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONCODE_COLHEADER, Reports_InventoryByStagePageLocators.STRING_LOCATIONCODE_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONCODE_COLDATA);
		return flag;
	}
	
	public boolean LocationName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_LOCATIONNAME_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONNAME_COLHEADER, Reports_InventoryByStagePageLocators.STRING_LOCATIONNAME_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONNAME_COLDATA);
		return flag;
	}
	
	public boolean LocationName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_LOCATIONNAME_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONNAME_COLHEADER, Reports_InventoryByStagePageLocators.STRING_LOCATIONNAME_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONNAME_COLDATA);
		return flag;
	}
	

	public boolean DamagedAccountCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_DAMAGEDACCOUNTCODE_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DAMAGEDACCOUNTCODE_COLHEADER, Reports_InventoryByStagePageLocators.STRING_DAMAGEDACCOUNTCODE_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DAMAGEDACCOUNTCODE_COLDATA);
		return flag;
	}
	
	public boolean DamagedAccountCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_DAMAGEDACCOUNTCODE_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DAMAGEDACCOUNTCODE_COLHEADER, Reports_InventoryByStagePageLocators.STRING_DAMAGEDACCOUNTCODE_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DAMAGEDACCOUNTCODE_COLDATA);
		return flag;
	}
	
	public boolean AccountName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_ACCOUNTNAME_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_ACCOUNTNAME_COLHEADER, Reports_InventoryByStagePageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}
	
	public boolean AccountName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_ACCOUNTNAME_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_ACCOUNTNAME_COLHEADER, Reports_InventoryByStagePageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}
	
	public boolean SKU_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SKU_COLHEADER, Reports_InventoryByStagePageLocators.STRING_SKU_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKU_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SKU_COLHEADER, Reports_InventoryByStagePageLocators.STRING_SKU_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKUName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SKUNAME_COLHEADER, Reports_InventoryByStagePageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean SKUName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SKUNAME_COLHEADER, Reports_InventoryByStagePageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean MonitorRecovery_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_MONITORRECOVERY_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_MONITORRECOVERY_COLHEADER, Reports_InventoryByStagePageLocators.STRING_MONITORRECOVERY_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_MONITORRECOVERY_COLDATA);
		return flag;
	}
	
	public boolean MonitorRecovery_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_MONITORRECOVERY_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_MONITORRECOVERY_COLHEADER, Reports_InventoryByStagePageLocators.STRING_MONITORRECOVERY_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_MONITORRECOVERY_COLDATA);
		return flag;
	}
	
	public boolean MonitorReplenish_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_MONITORREPLENISH_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_MONITORREPLENISH_COLHEADER, Reports_InventoryByStagePageLocators.STRING_MONITORREPLENISH_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_MONITORREPLENISH_COLDATA);
		return flag;
	}
	
	public boolean MonitorReplenish_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_MONITORREPLENISH_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_MONITORREPLENISH_COLHEADER, Reports_InventoryByStagePageLocators.STRING_MONITORREPLENISH_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_MONITORREPLENISH_COLDATA);
		return flag;
	}
	
	public boolean LocationType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_LOCATIONTYPE_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONTYPE_COLHEADER, Reports_InventoryByStagePageLocators.STRING_LOCATIONTYPE_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONTYPE_COLDATA);
		return flag;
	}
	
	public boolean LocationType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_LOCATIONTYPE_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONTYPE_COLHEADER, Reports_InventoryByStagePageLocators.STRING_LOCATIONTYPE_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_LOCATIONTYPE_COLDATA);
		return flag;
	}
	
	public boolean InTransit_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_INTRANSIT_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_INTRANSIT_COLHEADER, Reports_InventoryByStagePageLocators.STRING_INTRANSIT_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_INTRANSIT_COLDATA);
		return flag;
	}
	
	public boolean InTransit_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_INTRANSIT_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_INTRANSIT_COLHEADER, Reports_InventoryByStagePageLocators.STRING_INTRANSIT_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_INTRANSIT_COLDATA);
		return flag;
	}
	
	public boolean PendingReceipt_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_PENDINGRECEIPT_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_PENDINGRECEIPT_COLHEADER, Reports_InventoryByStagePageLocators.STRING_PENDINGRECEIPT_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_PENDINGRECEIPT_COLDATA);
		return flag;
	}
	
	public boolean PendingReceipt_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_PENDINGRECEIPT_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_PENDINGRECEIPT_COLHEADER, Reports_InventoryByStagePageLocators.STRING_PENDINGRECEIPT_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_PENDINGRECEIPT_COLDATA);
		return flag;
	}
	
	public boolean WIP_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_WIP_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_WIP_COLHEADER, Reports_InventoryByStagePageLocators.STRING_WIP_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_WIP_COLDATA);
		return flag;
	}
	
	public boolean WIP_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_WIP_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_WIP_COLHEADER, Reports_InventoryByStagePageLocators.STRING_WIP_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_WIP_COLDATA);
		return flag;
	}
	
	public boolean Damaged_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_DAMAGED_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DAMAGED_COLHEADER, Reports_InventoryByStagePageLocators.STRING_DAMAGED_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DAMAGED_COLDATA);
		return flag;
	}
	
	public boolean Damaged_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_DAMAGED_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DAMAGED_COLHEADER, Reports_InventoryByStagePageLocators.STRING_DAMAGED_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DAMAGED_COLDATA);
		return flag;
	}
	

	public boolean Scrap_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_SCRAP_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SCRAP_COLHEADER, Reports_InventoryByStagePageLocators.STRING_SCRAP_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SCRAP_COLDATA);
		return flag;
	}
	
	public boolean Scrap_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_SCRAP_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SCRAP_COLHEADER, Reports_InventoryByStagePageLocators.STRING_SCRAP_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_SCRAP_COLDATA);
		return flag;
	}
	
	public boolean A99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_99_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_99_COLHEADER, Reports_InventoryByStagePageLocators.STRING_99_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_99_COLDATA);
		return flag;
	}
	
	public boolean A99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_99_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_99_COLHEADER, Reports_InventoryByStagePageLocators.STRING_99_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_99_COLDATA);
		return flag;
	}
	
	public boolean WriteOff_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_WRITEOFF_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_WRITEOFF_COLHEADER, Reports_InventoryByStagePageLocators.STRING_WRITEOFF_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_WRITEOFF_COLDATA);
		return flag;
	}
	
	public boolean WriteOff_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_WRITEOFF_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_WRITEOFF_COLHEADER, Reports_InventoryByStagePageLocators.STRING_WRITEOFF_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_WRITEOFF_COLDATA);
		return flag;
	}
	
	public boolean FG_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_FG_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_FG_COLHEADER, Reports_InventoryByStagePageLocators.STRING_FG_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_FG_COLDATA);
		return flag;
	}
	
	public boolean FG_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_FG_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_FG_COLHEADER, Reports_InventoryByStagePageLocators.STRING_FG_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_FG_COLDATA);
		return flag;
	}
	
	public boolean DefaultZoneProviderCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_DEFAULTZONEPROVIDERCODE_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DEFAULTZONEPROVIDERCODE_COLHEADER, Reports_InventoryByStagePageLocators.STRING_DEFAULTZONEPROVIDERCODE_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DEFAULTZONEPROVIDERCODE_COLDATA);
		return flag;
	}
	
	public boolean DefaultZoneProviderCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_DEFAULTZONEPROVIDERCODE_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DEFAULTZONEPROVIDERCODE_COLHEADER, Reports_InventoryByStagePageLocators.STRING_DEFAULTZONEPROVIDERCODE_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DEFAULTZONEPROVIDERCODE_COLDATA);
		return flag;
	}
	
	public boolean DefaultZoneProviderName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryByStagePageLocators.STRING_DEFAULTZONEPROVIDERNAME_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DEFAULTZONEPROVIDERNAME_COLHEADER, Reports_InventoryByStagePageLocators.STRING_DEFAULTZONEPROVIDERNAME_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DEFAULTZONEPROVIDERNAME_COLDATA);
		return flag;
	}
	
	public boolean DefaultZoneProviderName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryByStagePageLocators.STRING_DEFAULTZONEPROVIDERNAME_COLHEADER, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DEFAULTZONEPROVIDERNAME_COLHEADER, Reports_InventoryByStagePageLocators.STRING_DEFAULTZONEPROVIDERNAME_COLDATA, ElementType.Xpath, Reports_InventoryByStagePageLocators.BY_DEFAULTZONEPROVIDERNAME_COLDATA);
		return flag;
	}
	


	
}
