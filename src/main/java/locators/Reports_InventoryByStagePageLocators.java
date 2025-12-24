package locators;

import org.openqa.selenium.By;

public class Reports_InventoryByStagePageLocators 
{
	
	/**XPATH*/ public static final String REPORTS_INVENTORYBYSTAGEPAGE_HEADING = "//div[text()='Inventory By Stage']";
	
	//Sorting
	public static final By BY_ZONE_COLHEADER = By.xpath("(//th[contains(.,'Zone')])[1]");
	public static final By BY_ZONE_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_ZONE_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_ZONE_COLHEADER = "(//th[contains(.,'Zone')])[1]";
	
	public static final By BY_REGION_COLHEADER = By.xpath("(//th[contains(.,'Region')])[1]");
	public static final By BY_REGION_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_REGION_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_REGION_COLHEADER = "(//th[contains(.,'Region')])[1]";
	
	public static final By BY_LOCATIONCODE_COLHEADER = By.xpath("(//th[contains(.,'Location Code')])[1]");
	public static final By BY_LOCATIONCODE_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_LOCATIONCODE_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_LOCATIONCODE_COLHEADER = "(//th[contains(.,'Location Code')])[1]";
	
	public static final By BY_LOCATIONNAME_COLHEADER = By.xpath("(//th[contains(.,'Location Name')])[1]");
	public static final By BY_LOCATIONNAME_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_LOCATIONNAME_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_LOCATIONNAME_COLHEADER = "(//th[contains(.,'Location Name')])[1]";
	
	public static final By BY_DAMAGEDACCOUNTCODE_COLHEADER = By.xpath("(//th[contains(.,'DAMAGED Account Code')])[1]");
	public static final By BY_DAMAGEDACCOUNTCODE_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_DAMAGEDACCOUNTCODE_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_DAMAGEDACCOUNTCODE_COLHEADER = "(//th[contains(.,'DAMAGED Account Code')])[1]";
	
	public static final By BY_ACCOUNTNAME_COLHEADER = By.xpath("(//th[contains(.,'Account Name')])[1]");
	public static final By BY_ACCOUNTNAME_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_ACCOUNTNAME_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_ACCOUNTNAME_COLHEADER = "(//th[contains(.,'Account Name')])[1]";
	
	public static final By BY_SKU_COLHEADER = By.xpath("(//th[contains(.,'SKU #')])[1]");
	public static final By BY_SKU_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_SKU_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_SKU_COLHEADER = "(//th[contains(.,'SKU #')])[1]";
	
	public static final By BY_SKUNAME_COLHEADER = By.xpath("(//th[contains(.,'SKU Name')])[1]");
	public static final By BY_SKUNAME_COLDATA = By.xpath("//table/tbody/tr/td[8]");
	/**XPATH*/ public static final String STRING_SKUNAME_COLDATA = "//table/tbody/tr/td[8]";
	/**XPATH*/ public static final String STRING_SKUNAME_COLHEADER = "(//th[contains(.,'SKU Name')])[1]";
	
	public static final By BY_MONITORRECOVERY_COLHEADER = By.xpath("(//th[contains(.,'Monitor Recovery')])[1]");
	public static final By BY_MONITORRECOVERY_COLDATA = By.xpath("//table/tbody/tr/td[9]");
	/**XPATH*/ public static final String STRING_MONITORRECOVERY_COLDATA = "//table/tbody/tr/td[9]";
	/**XPATH*/ public static final String STRING_MONITORRECOVERY_COLHEADER = "(//th[contains(.,'Monitor Recovery')])[1]";
	
	public static final By BY_MONITORREPLENISH_COLHEADER = By.xpath("(//th[contains(.,'Monitor Replenish')])[1]");
	public static final By BY_MONITORREPLENISH_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/**XPATH*/ public static final String STRING_MONITORREPLENISH_COLDATA = "//table/tbody/tr/td[10]";
	/**XPATH*/ public static final String STRING_MONITORREPLENISH_COLHEADER = "(//th[contains(.,'Monitor Replenish')])[1]";
	
	public static final By BY_LOCATIONTYPE_COLHEADER = By.xpath("(//th[contains(.,'Location Type')])[1]");
	public static final By BY_LOCATIONTYPE_COLDATA = By.xpath("//table/tbody/tr/td[11]");
	/**XPATH*/ public static final String STRING_LOCATIONTYPE_COLDATA = "//table/tbody/tr/td[11]";
	/**XPATH*/ public static final String STRING_LOCATIONTYPE_COLHEADER = "(//th[contains(.,'Location Type')])[1]";
	
	public static final By BY_INTRANSIT_COLHEADER = By.xpath("(//th[contains(.,'In Transit')])[1]");
	public static final By BY_INTRANSIT_COLDATA = By.xpath("//table/tbody/tr/td[12]");
	/**XPATH*/ public static final String STRING_INTRANSIT_COLDATA = "//table/tbody/tr/td[12]";
	/**XPATH*/ public static final String STRING_INTRANSIT_COLHEADER = "(//th[contains(.,'In Transit')])[1]";
	
	public static final By BY_PENDINGRECEIPT_COLHEADER = By.xpath("(//th[contains(.,'Pending Receipt')])[1]");
	public static final By BY_PENDINGRECEIPT_COLDATA = By.xpath("//table/tbody/tr/td[13]");
	/**XPATH*/ public static final String STRING_PENDINGRECEIPT_COLDATA = "//table/tbody/tr/td[13]";
	/**XPATH*/ public static final String STRING_PENDINGRECEIPT_COLHEADER = "(//th[contains(.,'Pending Receipt')])[1]";
	
	public static final By BY_WIP_COLHEADER = By.xpath("(//th[contains(.,'WIP')])[1]");
	public static final By BY_WIP_COLDATA = By.xpath("//table/tbody/tr/td[14]");
	/**XPATH*/ public static final String STRING_WIP_COLDATA = "//table/tbody/tr/td[14]";
	/**XPATH*/ public static final String STRING_WIP_COLHEADER = "(//th[contains(.,'WIP')])[1]";
	
	public static final By BY_DAMAGED_COLHEADER = By.xpath("(//th[contains(.,'Damaged')])[1]");
	public static final By BY_DAMAGED_COLDATA = By.xpath("//table/tbody/tr/td[15]");
	/**XPATH*/ public static final String STRING_DAMAGED_COLDATA = "//table/tbody/tr/td[15]";
	/**XPATH*/ public static final String STRING_DAMAGED_COLHEADER = "(//th[contains(.,'Damaged')])[1]";
	
	public static final By BY_SCRAP_COLHEADER = By.xpath("(//th[contains(.,'Scrap')])[1]");
	public static final By BY_SCRAP_COLDATA = By.xpath("//table/tbody/tr/td[16]");
	/**XPATH*/ public static final String STRING_SCRAP_COLDATA = "//table/tbody/tr/td[16]";
	/**XPATH*/ public static final String STRING_SCRAP_COLHEADER = "(//th[contains(.,'Scrap')])[1]";
	
	public static final By BY_99_COLHEADER = By.xpath("//th[contains(.,'99')]");
	public static final By BY_99_COLDATA = By.xpath("//table/tbody/tr/td[17]");
	/**XPATH*/ public static final String STRING_99_COLDATA = "//table/tbody/tr/td[17]";
	/**XPATH*/ public static final String STRING_99_COLHEADER = "//th[contains(.,'99')]";
	
	public static final By BY_WRITEOFF_COLHEADER = By.xpath("//th[contains(.,'Write Off')]");
	public static final By BY_WRITEOFF_COLDATA = By.xpath("//table/tbody/tr/td[18]");
	/**XPATH*/ public static final String STRING_WRITEOFF_COLDATA = "//table/tbody/tr/td[18]";
	/**XPATH*/ public static final String STRING_WRITEOFF_COLHEADER = "//th[contains(.,'Write Off')]";
	
	public static final By BY_FG_COLHEADER = By.xpath("//th[contains(.,'FG')]");
	public static final By BY_FG_COLDATA = By.xpath("//table/tbody/tr/td[19]");
	/**XPATH*/ public static final String STRING_FG_COLDATA = "//table/tbody/tr/td[19]";
	/**XPATH*/ public static final String STRING_FG_COLHEADER = "//th[contains(.,'FG')]";
	
	public static final By BY_DEFAULTZONEPROVIDERCODE_COLHEADER = By.xpath("(//th[contains(.,'Default Zone Provider Code')])[1]");
	public static final By BY_DEFAULTZONEPROVIDERCODE_COLDATA = By.xpath("//table/tbody/tr/td[20]");
	/**XPATH*/ public static final String STRING_DEFAULTZONEPROVIDERCODE_COLDATA = "//table/tbody/tr/td[20]";
	/**XPATH*/ public static final String STRING_DEFAULTZONEPROVIDERCODE_COLHEADER = "(//th[contains(.,'Default Zone Provider Code')])[1]";
	
	public static final By BY_DEFAULTZONEPROVIDERNAME_COLHEADER = By.xpath("(//th[contains(.,'Default Zone Provider Name')])[1]");
	public static final By BY_DEFAULTZONEPROVIDERNAME_COLDATA = By.xpath("//table/tbody/tr/td[21]");
	/**XPATH*/ public static final String STRING_DEFAULTZONEPROVIDERNAME_COLDATA = "//table/tbody/tr/td[21]";
	/**XPATH*/ public static final String STRING_DEFAULTZONEPROVIDERNAME_COLHEADER = "(//th[contains(.,'Default Zone Provider Name')])[1]";
	
	
}
