package locators;

import org.openqa.selenium.By;

public class OrdersAndBOLS_OrdersPageLocators 
{
	
	/**XPATH*/ public static final String ORDERSPAGE_HEADING = "//div[text()='Orders']";
	
	//Sorting
	/**By*/ public static final By BY_ORDER_COLHEADER = By.xpath("//th[contains(.,'Order #')]");
	/**By*/ public static final By BY_ORDER_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_ORDER_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_ORDER_COLHEADER = "//th[contains(.,'Order #')]";
	
	/**By*/ public static final By BY_ORDERDATE_COLHEADER = By.xpath("//th[contains(.,'Order Date')]");
	/**By*/ public static final By BY_ORDERDATE_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_ORDERDATE_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_ORDERDATE_COLHEADER = "//th[contains(.,'Order #')]";
	
	/**By*/ public static final By BY_NEEDBYDATE_COLHEADER = By.xpath("//th[contains(.,'Need By Date')]");
	/**By*/ public static final By BY_NEEDBYDATE_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_NEEDBYDATE_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_NEEDBYDATE_COLHEADER = "//th[contains(.,'Need By Date')]";
	
	/**By*/ public static final By BY_BOLDUEDATE_COLHEADER = By.xpath("//th[contains(.,'BOL Due Date')]");
	/**By*/ public static final By BY_BOLDUEDATE_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_BOLDUEDATE_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_BOLDUEDATE_COLHEADER = "//th[contains(.,'BOL Due Date')]";
	
	/**By*/ public static final By BY_ORDERTYPE_COLHEADER = By.xpath("//th[contains(.,'Order Type')]");
	/**By*/ public static final By BY_ORDERTYPE_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_ORDERTYPE_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_ORDERTYPE_COLHEADER = "//th[contains(.,'Order Type')]";
	
	/**By*/ public static final By BY_CUSTOMERPO_COLHEADER = By.xpath("//th[contains(.,'Customer PO #')]");
	/**By*/ public static final By BY_CUSTOMERPO_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_CUSTOMERPO_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_CUSTOMERPO_COLHEADER = "//th[contains(.,'Customer PO #')]";
	
	/**By*/ public static final By BY_ACCOUNTCODE_COLHEADER = By.xpath("//th[contains(.,'Account Code')]");
	/**By*/ public static final By BY_ACCOUNTCODE_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_ACCOUNTCODE_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_ACCOUNTCODE_COLHEADER = "//th[contains(.,'Account Code')]";
	
	/**By*/ public static final By BY_ACCOUNTNAME_COLHEADER = By.xpath("//th[contains(.,'Account Name')]");
	/**By*/ public static final By BY_ACCOUNTNAME_COLDATA = By.xpath("//table/tbody/tr/td[8]");
	/**XPATH*/ public static final String STRING_ACCOUNTNAME_COLDATA = "//table/tbody/tr/td[8]";
	/**XPATH*/ public static final String STRING_ACCOUNTNAME_COLHEADER = "//th[contains(.,'Account Name')]";
	
	/**By*/ public static final By BY_FROMLOCCODE_COLHEADER = By.xpath("//th[contains(.,'From Loc Code')]");
	/**By*/ public static final By BY_FROMLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[9]");
	/**XPATH*/ public static final String STRING_FROMLOCCODE_COLDATA = "//table/tbody/tr/td[9]";
	/**XPATH*/ public static final String STRING_FROMLOCCODE_COLHEADER = "//th[contains(.,'From Loc Code')]";
	
	/**By*/ public static final By BY_FROMLOCNAME_COLHEADER = By.xpath("//th[contains(.,'From Loc Name')]");
	/**By*/ public static final By BY_FROMLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/**XPATH*/ public static final String STRING_FROMLOCNAME_COLDATA = "//table/tbody/tr/td[10]";
	/**XPATH*/ public static final String STRING_FROMLOCNAME_COLHEADER = "//th[contains(.,'From Loc Name')]";
	
	/**By*/ public static final By BY_TOLOCCODE_COLHEADER = By.xpath("//th[contains(.,'To Loc Code')]");
	/**By*/ public static final By BY_TOLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[11]");
	/**XPATH*/ public static final String STRING_TOLOCCODE_COLDATA = "//table/tbody/tr/td[11]";
	/**XPATH*/ public static final String STRING_TOLOCCODE_COLHEADER = "//th[contains(.,'To Loc Code')]";
	
	/**By*/ public static final By BY_TOLOCNAME_COLHEADER = By.xpath("//th[contains(.,'To Loc Name')]");
	/**By*/ public static final By BY_TOLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[12]");
	/**XPATH*/ public static final String STRING_TOLOCNAME_COLDATA = "//table/tbody/tr/td[12]";
	/**XPATH*/ public static final String STRING_TOLOCNAME_COLHEADER = "//th[contains(.,'To Loc Name')]";
	
	/**By*/ public static final By BY_SHIPMETHOD_COLHEADER = By.xpath("//th[contains(.,'Ship Method')]");
	/**By*/ public static final By BY_SHIPMETHOD_COLDATA = By.xpath("//table/tbody/tr/td[13]");
	/**XPATH*/ public static final String STRING_SHIPMETHOD_COLDATA = "//table/tbody/tr/td[13]";
	/**XPATH*/ public static final String STRING_SHIPMETHOD_COLHEADER = "//th[contains(.,'Ship Method')]";
	
	/**By*/ public static final By BY_SHIPPERCODE_COLHEADER = By.xpath("//th[contains(.,'Shipper Code')]");
	/**By*/ public static final By BY_SHIPPERCODE_COLDATA = By.xpath("//table/tbody/tr/td[14]");
	/**XPATH*/ public static final String STRING_SHIPPERCODE_COLDATA = "//table/tbody/tr/td[14]";
	/**XPATH*/ public static final String STRING_SHIPPERCODE_COLHEADER = "//th[contains(.,'Shipper Code')]";
	
	/**By*/ public static final By BY_SHIPPERNAME_COLHEADER = By.xpath("//th[contains(.,'Shipper Name')]");
	/**By*/ public static final By BY_SHIPPERNAME_COLDATA = By.xpath("//table/tbody/tr/td[15]");
	/**XPATH*/ public static final String STRING_SHIPPERNAME_COLDATA = "//table/tbody/tr/td[15]";
	/**XPATH*/ public static final String STRING_SHIPPERNAME_COLHEADER = "//th[contains(.,'Shipper Name')]";
	
	/**By*/ public static final By BY_BOL_COLHEADER = By.xpath("//th[contains(.,'BOL #')]");
	/**By*/ public static final By BY_BOL_COLDATA = By.xpath("//table/tbody/tr/td[16]");
	/**XPATH*/ public static final String STRING_BOL_COLDATA = "//table/tbody/tr/td[16]";
	/**XPATH*/ public static final String STRING_BOL_COLHEADER = "//th[contains(.,'BOL #')]";
	
	/**By*/ public static final By BY_ORDERSTATUS_COLHEADER = By.xpath("//th[contains(.,'Order Status')]");
	/**By*/ public static final By BY_ORDERSTATUS_COLDATA = By.xpath("//table/tbody/tr/td[17]");
	/**XPATH*/ public static final String STRING_ORDERSTATUS_COLDATA = "//table/tbody/tr/td[17]";
	/**XPATH*/ public static final String STRING_ORDERSTATUS_COLHEADER = "//th[contains(.,'Order Status')]";
	
	/**By*/ public static final By BY_BOLSTATUS_COLHEADER = By.xpath("//th[contains(.,'BOL Status')]");
	/**By*/ public static final By BY_BOLSTATUS_COLDATA = By.xpath("//table/tbody/tr/td[18]");
	/**XPATH*/ public static final String STRING_BOLSTATUS_COLDATA = "//table/tbody/tr/td[18]";
	/**XPATH*/ public static final String STRING_BOLSTATUS_COLHEADER = "//th[contains(.,'BOL Status')]";
	
	/**By*/ public static final By BY_COMPLETEDDATE_COLHEADER = By.xpath("//th[contains(.,'Completed Date')]");
	/**By*/ public static final By BY_COMPLETEDDATE_COLDATA = By.xpath("//table/tbody/tr/td[19]");
	/**XPATH*/ public static final String STRING_COMPLETEDDATE_COLDATA = "//table/tbody/tr/td[19]";
	/**XPATH*/ public static final String STRING_COMPLETEDDATE_COLHEADER = "//th[contains(.,'Completed Date')]";
	
	/**By*/ public static final By BY_BATCHFILEID_COLHEADER = By.xpath("//th[contains(.,'Batch File ID')]");
	/**By*/ public static final By BY_BATCHFILEID_COLDATA = By.xpath("//table/tbody/tr/td[20]");
	/**XPATH*/ public static final String STRING_BATCHFILEID_COLDATA = "//table/tbody/tr/td[20]";
	/**XPATH*/ public static final String STRING_BATCHFILEID_COLHEADER = "//th[contains(.,'Batch File ID')]";
	
	
}
