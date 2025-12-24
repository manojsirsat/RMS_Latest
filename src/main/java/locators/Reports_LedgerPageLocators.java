package locators;

import org.openqa.selenium.By;

public class Reports_LedgerPageLocators 
{
	
	/**XPATH*/ public static final String REPORTS_LEDGERPAGE_HEADING = "//div[text()='Inventory Ledger']";
	
	//Sorting
	public static final By BY_RECID_COLHEADER = By.xpath("(//th[contains(.,'Rec ID')])[1]");
	public static final By BY_RECID_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_RECID_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_RECID_COLHEADER = "(//th[contains(.,'Rec ID')])[1]";
	
	public static final By BY_TXID_COLHEADER = By.xpath("(//th[contains(.,'Tx ID')])[1]");
	public static final By BY_TXID_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_TXID_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_TXID_COLHEADER = "(//th[contains(.,'Tx ID')])[1]";
	
	public static final By BY_PAIRID_COLHEADER = By.xpath("(//th[contains(.,'PairID')])[1]");
	public static final By BY_PAIRID_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_PAIRID_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_PAIRID_COLHEADER = "(//th[contains(.,'PairID')])[1]";
	
	public static final By BY_WOID_COLHEADER = By.xpath("(//th[contains(.,'WO ID')])[1]");
	public static final By BY_WOID_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_WOID_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_WOID_COLHEADER = "(//th[contains(.,'WO ID')])[1]";
	
	public static final By BY_BOL_COLHEADER = By.xpath("(//th[contains(.,'BOL#')])[1]");
	public static final By BY_BOL_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_BOL_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_BOL_COLHEADER = "(//th[contains(.,'BOL#')])[1]";
	
	public static final By BY_TXDATE_COLHEADER = By.xpath("(//th[contains(.,'Tx Date')])[1]");
	public static final By BY_TXDATE_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_TXDATE_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_TXDATE_COLHEADER = "(//th[contains(.,'Tx Date')])[1]";
	
	public static final By BY_LOCNAME_COLHEADER = By.xpath("(//th[contains(.,'Loc Name')])[1]");
	public static final By BY_LOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_LOCNAME_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_LOCNAME_COLHEADER = "(//th[contains(.,'Loc Name')])[1]";
	
	public static final By BY_LOCCODE_COLHEADER = By.xpath("(//th[contains(.,'Loc Code')])[1]");
	public static final By BY_LOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[8]");
	/**XPATH*/ public static final String STRING_LOCCODE_COLDATA = "//table/tbody/tr/td[8]";
	/**XPATH*/ public static final String STRING_LOCCODE_COLHEADER = "(//th[contains(.,'Loc Code')])[1]";
	
	public static final By BY_SKU_COLHEADER = By.xpath("(//th[contains(.,'SKU')])[1]");
	public static final By BY_SKU_COLDATA = By.xpath("//table/tbody/tr/td[9]");
	/**XPATH*/ public static final String STRING_SKU_COLDATA = "//table/tbody/tr/td[9]";
	/**XPATH*/ public static final String STRING_SKU_COLHEADER = "(//th[contains(.,'SKU')])[1]";
	
	public static final By BY_SKU1_COLHEADER = By.xpath("(//th[contains(.,'SKU#')])[1]");
	public static final By BY_SKU1_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/**XPATH*/ public static final String STRING_SKU1_COLDATA = "//table/tbody/tr/td[10]";
	/**XPATH*/ public static final String STRING_SKU1_COLHEADER = "(//th[contains(.,'SKU#')])[1]";
	
	public static final By BY_STAGE_COLHEADER = By.xpath("(//th[contains(.,'Stage')])[1]");
	public static final By BY_STAGE_COLDATA = By.xpath("//table/tbody/tr/td[11]");
	/**XPATH*/ public static final String STRING_STAGE_COLDATA = "//table/tbody/tr/td[11]";
	/**XPATH*/ public static final String STRING_STAGE_COLHEADER = "(//th[contains(.,'Stage')])[1]";
	
	public static final By BY_QTY_COLHEADER = By.xpath("(//th[contains(.,'Qty')])[1]");
	public static final By BY_QTY_COLDATA = By.xpath("//table/tbody/tr/td[12]");
	/**XPATH*/ public static final String STRING_QTY_COLDATA = "//table/tbody/tr/td[12]";
	/**XPATH*/ public static final String STRING_QTY_COLHEADER = "(//th[contains(.,'Qty')])[1]";
	
	public static final By BY_INVBEFORE_COLHEADER = By.xpath("(//th[contains(.,'Inv Before')])[1]");
	public static final By BY_INVBEFORE_COLDATA = By.xpath("//table/tbody/tr/td[13]");
	/**XPATH*/ public static final String STRING_INVBEFORE_COLDATA = "//table/tbody/tr/td[13]";
	/**XPATH*/ public static final String STRING_INVBEFORE_COLHEADER = "(//th[contains(.,'Inv Before')])[1]";
	
	public static final By BY_INVAFTER_COLHEADER = By.xpath("(//th[contains(.,'Inv After')])[1]");
	public static final By BY_INVAFTER_COLDATA = By.xpath("//table/tbody/tr/td[14]");
	/**XPATH*/ public static final String STRING_INVAFTER_COLDATA = "//table/tbody/tr/td[14]";
	/**XPATH*/ public static final String STRING_INVAFTER_COLHEADER = "(//th[contains(.,'Inv After')])[1]";
	
	public static final By BY_TXTYPE_COLHEADER = By.xpath("(//th[contains(.,'Tx Type')])[1]");
	public static final By BY_TXTYPE_COLDATA = By.xpath("//table/tbody/tr/td[15]");
	/**XPATH*/ public static final String STRING_TXTYPE_COLDATA = "//table/tbody/tr/td[15]";
	/**XPATH*/ public static final String STRING_TXTYPE_COLHEADER = "(//th[contains(.,'Tx Type')])[1]";
	
	public static final By BY_WOTYPE_COLHEADER = By.xpath("(//th[contains(.,'WO Type')])[1]");
	public static final By BY_WOTYPE_COLDATA = By.xpath("//table/tbody/tr/td[16]");
	/**XPATH*/ public static final String STRING_WOTYPE_COLDATA = "//table/tbody/tr/td[16]";
	/**XPATH*/ public static final String STRING_WOTYPE_COLHEADER = "(//th[contains(.,'WO Type')])[1]";
	
	public static final By BY_ACTION_COLHEADER = By.xpath("//th[contains(.,'Action')]");
	public static final By BY_ACTION_COLDATA = By.xpath("//table/tbody/tr/td[17]");
	/**XPATH*/ public static final String STRING_ACTION_COLDATA = "//table/tbody/tr/td[17]";
	/**XPATH*/ public static final String STRING_ACTION_COLHEADER = "//th[contains(.,'Action')]";
	
	public static final By BY_LOCTYPE_COLHEADER = By.xpath("//th[contains(.,'Loc Type')]");
	public static final By BY_LOCTYPE_COLDATA = By.xpath("//table/tbody/tr/td[18]");
	/**XPATH*/ public static final String STRING_LOCTYPE_COLDATA = "//table/tbody/tr/td[18]";
	/**XPATH*/ public static final String STRING_LOCTYPE_COLHEADER = "//th[contains(.,'Loc Type')]";
	
	public static final By BY_ACCOUNT_COLHEADER = By.xpath("//th[contains(.,'Account')]");
	public static final By BY_ACCOUNT_COLDATA = By.xpath("//table/tbody/tr/td[19]");
	/**XPATH*/ public static final String STRING_ACCOUNT_COLDATA = "//table/tbody/tr/td[19]";
	/**XPATH*/ public static final String STRING_ACCOUNT_COLHEADER = "//th[contains(.,'Account')]";
	
	public static final By BY_USER_COLHEADER = By.xpath("(//th[contains(.,'User')])[1]");
	public static final By BY_USER_COLDATA = By.xpath("//table/tbody/tr/td[20]");
	/**XPATH*/ public static final String STRING_USER_COLDATA = "//table/tbody/tr/td[20]";
	/**XPATH*/ public static final String STRING_USER_COLHEADER = "(//th[contains(.,'User')])[1]";
	
}
