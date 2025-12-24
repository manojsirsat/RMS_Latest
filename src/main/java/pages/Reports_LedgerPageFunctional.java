package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_LedgerPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_LedgerPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports Ledger page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_LedgerListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_LEDGERPAGE_LEFTNAV, ElementType.Xpath, Reports_LedgerPageLocators.REPORTS_LEDGERPAGE_HEADING, ElementType.Xpath);
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
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_RECID_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_RECID_COLHEADER, Reports_LedgerPageLocators.STRING_RECID_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_RECID_COLDATA);
		return flag;
	}
	
	public boolean RecID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_RECID_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_RECID_COLHEADER, Reports_LedgerPageLocators.STRING_RECID_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_RECID_COLDATA);
		return flag;
	}
	
	public boolean TxID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_TXID_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXID_COLHEADER, Reports_LedgerPageLocators.STRING_TXID_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXID_COLDATA);
		return flag;
	}
	
	public boolean TxID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_TXID_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXID_COLHEADER, Reports_LedgerPageLocators.STRING_TXID_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXID_COLDATA);
		return flag;
	}
	
	public boolean PairID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_PAIRID_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_PAIRID_COLHEADER, Reports_LedgerPageLocators.STRING_PAIRID_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_PAIRID_COLDATA);
		return flag;
	}
	
	public boolean PairID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_PAIRID_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_PAIRID_COLHEADER, Reports_LedgerPageLocators.STRING_PAIRID_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_PAIRID_COLDATA);
		return flag;
	}
	
	public boolean WOID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_WOID_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_WOID_COLHEADER, Reports_LedgerPageLocators.STRING_WOID_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_WOID_COLDATA);
		return flag;
	}
	
	public boolean WOID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_WOID_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_WOID_COLHEADER, Reports_LedgerPageLocators.STRING_WOID_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_WOID_COLDATA);
		return flag;
	}
	
	public boolean BOL_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_BOL_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_BOL_COLHEADER, Reports_LedgerPageLocators.STRING_BOL_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_BOL_COLDATA);
		return flag;
	}
	
	public boolean BOL_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_BOL_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_BOL_COLHEADER, Reports_LedgerPageLocators.STRING_BOL_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_BOL_COLDATA);
		return flag;
	}
	
	public boolean TxDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_TXDATE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXDATE_COLHEADER, Reports_LedgerPageLocators.STRING_TXDATE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXDATE_COLDATA);
		return flag;
	}
	
	public boolean TxDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_TXDATE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXDATE_COLHEADER, Reports_LedgerPageLocators.STRING_TXDATE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXDATE_COLDATA);
		return flag;
	}
	
	public boolean LocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_LOCNAME_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCNAME_COLHEADER, Reports_LedgerPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}
	
	public boolean LocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_LOCNAME_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCNAME_COLHEADER, Reports_LedgerPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}
	
	public boolean LocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_LOCCODE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCCODE_COLHEADER, Reports_LedgerPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}
	
	public boolean LocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_LOCCODE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCCODE_COLHEADER, Reports_LedgerPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}
	
	public boolean SKU_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_SKU_COLHEADER, Reports_LedgerPageLocators.STRING_SKU_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKU_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_SKU_COLHEADER, Reports_LedgerPageLocators.STRING_SKU_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKU1_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_SKU1_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_SKU1_COLHEADER, Reports_LedgerPageLocators.STRING_SKU1_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_SKU1_COLDATA);
		return flag;
	}
	
	public boolean SKU1_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_SKU1_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_SKU1_COLHEADER, Reports_LedgerPageLocators.STRING_SKU1_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_SKU1_COLDATA);
		return flag;
	}
	
	public boolean Stage_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_STAGE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_STAGE_COLHEADER, Reports_LedgerPageLocators.STRING_STAGE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_STAGE_COLDATA);
		return flag;
	}
	
	public boolean Stage_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_STAGE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_STAGE_COLHEADER, Reports_LedgerPageLocators.STRING_STAGE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_STAGE_COLDATA);
		return flag;
	}
	

	public boolean QTY_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_QTY_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_QTY_COLHEADER, Reports_LedgerPageLocators.STRING_QTY_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_QTY_COLDATA);
		return flag;
	}
	
	public boolean QTY_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_QTY_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_QTY_COLHEADER, Reports_LedgerPageLocators.STRING_QTY_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_QTY_COLDATA);
		return flag;
	}
	
	public boolean InvBefore_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_INVBEFORE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_INVBEFORE_COLHEADER, Reports_LedgerPageLocators.STRING_INVBEFORE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_INVBEFORE_COLDATA);
		return flag;
	}
	
	public boolean InvBefore_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_INVBEFORE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_INVBEFORE_COLHEADER, Reports_LedgerPageLocators.STRING_INVBEFORE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_INVBEFORE_COLDATA);
		return flag;
	}
	
	public boolean InvAfter_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_INVAFTER_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_INVAFTER_COLHEADER, Reports_LedgerPageLocators.STRING_INVAFTER_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_INVAFTER_COLDATA);
		return flag;
	}
	
	public boolean InvAfter_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_INVAFTER_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_INVAFTER_COLHEADER, Reports_LedgerPageLocators.STRING_INVAFTER_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_INVAFTER_COLDATA);
		return flag;
	}
	
	public boolean TxType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_TXTYPE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXTYPE_COLHEADER, Reports_LedgerPageLocators.STRING_TXTYPE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXTYPE_COLDATA);
		return flag;
	}
	
	public boolean TxType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_TXTYPE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXTYPE_COLHEADER, Reports_LedgerPageLocators.STRING_TXTYPE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_TXTYPE_COLDATA);
		return flag;
	}
	
	public boolean WOType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_WOTYPE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_WOTYPE_COLHEADER, Reports_LedgerPageLocators.STRING_WOTYPE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_WOTYPE_COLDATA);
		return flag;
	}
	
	public boolean WOType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_WOTYPE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_WOTYPE_COLHEADER, Reports_LedgerPageLocators.STRING_WOTYPE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_WOTYPE_COLDATA);
		return flag;
	}
	
	public boolean Action_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_ACTION_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_ACTION_COLHEADER, Reports_LedgerPageLocators.STRING_ACTION_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_ACTION_COLDATA);
		return flag;
	}
	
	public boolean Action_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_ACTION_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_ACTION_COLHEADER, Reports_LedgerPageLocators.STRING_ACTION_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_ACTION_COLDATA);
		return flag;
	}
	
	public boolean LocType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_LOCTYPE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCTYPE_COLHEADER, Reports_LedgerPageLocators.STRING_LOCTYPE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCTYPE_COLDATA);
		return flag;
	}
	
	public boolean LocType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_LOCTYPE_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCTYPE_COLHEADER, Reports_LedgerPageLocators.STRING_LOCTYPE_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_LOCTYPE_COLDATA);
		return flag;
	}
	
	public boolean Account_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_ACCOUNT_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_ACCOUNT_COLHEADER, Reports_LedgerPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}
	
	public boolean Account_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_ACCOUNT_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_ACCOUNT_COLHEADER, Reports_LedgerPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}
	

	public boolean User_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LedgerPageLocators.STRING_USER_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_USER_COLHEADER, Reports_LedgerPageLocators.STRING_USER_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_USER_COLDATA);
		return flag;
	}
	
	public boolean User_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LedgerPageLocators.STRING_USER_COLHEADER, ElementType.Xpath, Reports_LedgerPageLocators.BY_USER_COLHEADER, Reports_LedgerPageLocators.STRING_USER_COLDATA, ElementType.Xpath, Reports_LedgerPageLocators.BY_USER_COLDATA);
		return flag;
	}
	
	
}
