package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_InventoryBy99sPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_InventoryBy99sPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports Inventory 99s page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_Inventory99sListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_INVENTORY99SPAGE_LEFTNAV, ElementType.Xpath, Reports_InventoryBy99sPageLocators.REPORTS_INVENTORY99SPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean RecID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_RECID_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_RECID_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_RECID_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_RECID_COLDATA);
		return flag;
	}
	
	public boolean RecID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_RECID_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_RECID_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_RECID_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_RECID_COLDATA);
		return flag;
	}
	
	public boolean TxID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_TXID_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXID_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_TXID_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXID_COLDATA);
		return flag;
	}
	
	public boolean TxID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_TXID_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXID_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_TXID_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXID_COLDATA);
		return flag;
	}
	
	public boolean PairID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_PAIRID_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_PAIRID_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_PAIRID_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_PAIRID_COLDATA);
		return flag;
	}
	
	public boolean PairID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_PAIRID_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_PAIRID_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_PAIRID_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_PAIRID_COLDATA);
		return flag;
	}
	
	public boolean OrderID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_ORDERID_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ORDERID_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_ORDERID_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ORDERID_COLDATA);
		return flag;
	}
	
	public boolean OrderID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_ORDERID_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ORDERID_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_ORDERID_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ORDERID_COLDATA);
		return flag;
	}
	
	public boolean BOL_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_BOL_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_BOL_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_BOL_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_BOL_COLDATA);
		return flag;
	}
	
	public boolean BOL_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_BOL_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_BOL_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_BOL_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_BOL_COLDATA);
		return flag;
	}
	
	public boolean TxDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_TXDATE_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXDATE_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_TXDATE_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXDATE_COLDATA);
		return flag;
	}
	
	public boolean TxDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_TXDATE_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXDATE_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_TXDATE_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXDATE_COLDATA);
		return flag;
	}
	
	public boolean LocName99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCNAME99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCNAME99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME99_COLDATA);
		return flag;
	}
	
	public boolean LocName99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCNAME99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCNAME99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME99_COLDATA);
		return flag;
	}
	
	public boolean LocCode99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCCODE99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCCODE99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCCODE99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCCODE99_COLDATA);
		return flag;
	}
	
	public boolean LocCode99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCCODE99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCCODE99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCCODE99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCCODE99_COLDATA);
		return flag;
	}
	
	public boolean SKU99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_SKU99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_SKU99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU99_COLDATA);
		return flag;
	}
	
	public boolean SKU99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_SKU99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_SKU99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU99_COLDATA);
		return flag;
	}
	
	public boolean SKU1_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_SKU1_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU1_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_SKU1_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU1_COLDATA);
		return flag;
	}
	
	public boolean SKU1_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_SKU1_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU1_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_SKU1_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU1_COLDATA);
		return flag;
	}
	
	public boolean LocName299_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCNAME299_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME299_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCNAME299_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME299_COLDATA);
		return flag;
	}
	
	public boolean LocName299_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCNAME299_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME299_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCNAME299_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME299_COLDATA);
		return flag;
	}
	

	public boolean Stage99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_STAGE99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_STAGE99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_STAGE99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_STAGE99_COLDATA);
		return flag;
	}
	
	public boolean Stage99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_STAGE99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_STAGE99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_STAGE99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_STAGE99_COLDATA);
		return flag;
	}
	
	public boolean TxType99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_TXTYPE99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXTYPE99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_TXTYPE99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXTYPE99_COLDATA);
		return flag;
	}
	
	public boolean TxType99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_TXTYPE99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXTYPE99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_TXTYPE99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_TXTYPE99_COLDATA);
		return flag;
	}
	
	public boolean OrderType99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_ORDERTYPE99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ORDERTYPE99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_ORDERTYPE99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ORDERTYPE99_COLDATA);
		return flag;
	}
	
	public boolean OrderType99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_ORDERTYPE99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ORDERTYPE99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_ORDERTYPE99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ORDERTYPE99_COLDATA);
		return flag;
	}
	
	public boolean Reason99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_REASON99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_REASON99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_REASON99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_REASON99_COLDATA);
		return flag;
	}
	
	public boolean Reason99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_REASON99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_REASON99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_REASON99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_REASON99_COLDATA);
		return flag;
	}
	
	public boolean QTY99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_QTY99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_QTY99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_QTY99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_QTY99_COLDATA);
		return flag;
	}
	
	public boolean QTY99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_QTY99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_QTY99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_QTY99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_QTY99_COLDATA);
		return flag;
	}
	
	public boolean QTY2_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_QTY2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_QTY2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_QTY2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_QTY2_COLDATA);
		return flag;
	}
	
	public boolean QTY2_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_QTY2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_QTY2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_QTY2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_QTY2_COLDATA);
		return flag;
	}
	
	public boolean Stage2_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_STAGE2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_STAGE2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_STAGE2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_STAGE2_COLDATA);
		return flag;
	}
	
	public boolean Stage2_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_STAGE2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_STAGE2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_STAGE2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_STAGE2_COLDATA);
		return flag;
	}
	
	public boolean LocName2_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCNAME2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCNAME2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME2_COLDATA);
		return flag;
	}
	
	public boolean LocName2_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCNAME2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCNAME2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCNAME2_COLDATA);
		return flag;
	}
	

	public boolean LocCode2_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCCODE2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCCODE2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCCODE2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCCODE2_COLDATA);
		return flag;
	}
	
	public boolean LocCode2_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCCODE2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCCODE2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCCODE2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCCODE2_COLDATA);
		return flag;
	}
	
	public boolean SKU2_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_SKU2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_SKU2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU2_COLDATA);
		return flag;
	}
	
	public boolean SKU2_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_SKU2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_SKU2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU2_COLDATA);
		return flag;
	}
	
	public boolean SKU21_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_SKU21_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU21_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_SKU21_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU21_COLDATA);
		return flag;
	}
	
	public boolean SKU21_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_SKU21_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU21_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_SKU21_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_SKU21_COLDATA);
		return flag;
	}
	
	public boolean Reason2_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_REASON2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_REASON2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_REASON2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_REASON2_COLDATA);
		return flag;
	}
	
	public boolean Reason2_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_REASON2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_REASON2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_REASON2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_REASON2_COLDATA);
		return flag;
	}
	
	public boolean LocType2_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCTYPE2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCTYPE2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCTYPE2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCTYPE2_COLDATA);
		return flag;
	}
	
	public boolean LocType2_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_LOCTYPE2_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCTYPE2_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_LOCTYPE2_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_LOCTYPE2_COLDATA);
		return flag;
	}
	
	public boolean Account99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_ACCOUNT99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ACCOUNT99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_ACCOUNT99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ACCOUNT99_COLDATA);
		return flag;
	}
	
	public boolean Account99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_ACCOUNT99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ACCOUNT99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_ACCOUNT99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_ACCOUNT99_COLDATA);
		return flag;
	}
	
	public boolean Note99_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InventoryBy99sPageLocators.STRING_NOTE99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_NOTE99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_NOTE99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_NOTE99_COLDATA);
		return flag;
	}
	
	public boolean Note99_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InventoryBy99sPageLocators.STRING_NOTE99_COLHEADER, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_NOTE99_COLHEADER, Reports_InventoryBy99sPageLocators.STRING_NOTE99_COLDATA, ElementType.Xpath, Reports_InventoryBy99sPageLocators.BY_NOTE99_COLDATA);
		return flag;
	}
	
}
