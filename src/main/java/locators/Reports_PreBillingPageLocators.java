package locators;

import org.openqa.selenium.By;

public class Reports_PreBillingPageLocators 
{
	
	/**XPATH*/ public static final String REPORTS_PREBILLINGPAGE_HEADING = "//div[text()='Pre-Billing Report']";
	
	// Sorting
	public static final By BY_BOLID_COLHEADER = By.xpath("(//th[contains(.,'BOL ID')])[1]");
	public static final By BY_BOLID_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_BOLID_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_BOLID_COLHEADER = "(//th[contains(.,'BOL ID')])[1]";
	
	public static final By BY_ORDERID_COLHEADER = By.xpath("(//th[contains(.,'Order ID')])[1]");
	public static final By BY_ORDERID_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_ORDERID_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_ORDERID_COLHEADER = "(//th[contains(.,'Order ID')])[1]";
	
	public static final By BY_ORDERTYPE_COLHEADER = By.xpath("(//th[contains(.,'Order Type')])[1]");
	public static final By BY_ORDERTYPE_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_ORDERTYPE_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_ORDERTYPE_COLHEADER = "(//th[contains(.,'Order Type')])[1]";
	
	public static final By BY_PROGRAMOWNER_COLHEADER = By.xpath("(//th[contains(.,'Program Owner')])[1]");
	public static final By BY_PROGRAMOWNER_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_PROGRAMOWNER_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_PROGRAMOWNER_COLHEADER = "(//th[contains(.,'Program Owner')])[1]";
	
	public static final By BY_PROGRAM_COLHEADER = By.xpath("(//th[contains(.,'Program')])[1]");
	public static final By BY_PROGRAM_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_PROGRAM_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_PROGRAM_COLHEADER = "(//th[contains(.,'Program')])[1]";
	
	public static final By BY_COMPLETEDWEEK_COLHEADER = By.xpath("(//th[contains(.,'Completed Week')])[1]");
	public static final By BY_COMPLETEDWEEK_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_COMPLETEDWEEK_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_COMPLETEDWEEK_COLHEADER = "(//th[contains(.,'Completed Week')])[1]";
	
	public static final By BY_ORDERDATE_COLHEADER = By.xpath("(//th[contains(.,'Order Date')])[1]");
	public static final By BY_ORDERDATE_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_ORDERDATE_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_ORDERDATE_COLHEADER = "(//th[contains(.,'Order Date')])[1]";
	
	public static final By BY_BOLASSIGNEDDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Assigned Date')])[1]");
	public static final By BY_BOLASSIGNEDDATE_COLDATA = By.xpath("//table/tbody/tr/td[8]");
	/**XPATH*/ public static final String STRING_BOLASSIGNEDDATE_COLDATA = "//table/tbody/tr/td[8]";
	/**XPATH*/ public static final String STRING_BOLASSIGNEDDATE_COLHEADER = "(//th[contains(.,'BOL Assigned Date')])[1]";
	
	public static final By BY_BOLDUEDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Due Date')])[1]");
	public static final By BY_BOLDUEDATE_COLDATA = By.xpath("//table/tbody/tr/td[9]");
	/**XPATH*/ public static final String STRING_BOLDUEDATE_COLDATA = "//table/tbody/tr/td[9]";
	/**XPATH*/ public static final String STRING_BOLDUEDATE_COLHEADER = "(//th[contains(.,'BOL Due Date')])[1]";
	
	public static final By BY_BOLCOMMITDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Commit Date')])[1]");
	public static final By BY_BOLCOMMITDATE_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/**XPATH*/ public static final String STRING_BOLCOMMITDATE_COLDATA = "//table/tbody/tr/td[10]";
	/**XPATH*/ public static final String STRING_BOLCOMMITDATE_COLHEADER = "(//th[contains(.,'BOL Commit Date')])[1]";
	
	public static final By BY_BOLMODIFIEDCOMMITDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Modified Commit Date')])[1]");
	public static final By BY_BOLMODIFIEDCOMMITDATE_COLDATA = By.xpath("//table/tbody/tr/td[11]");
	/**XPATH*/ public static final String STRING_BOLMODIFIEDCOMMITDATE_COLDATA = "//table/tbody/tr/td[11]";
	/**XPATH*/ public static final String STRING_BOLMODIFIEDCOMMITDATE_COLHEADER = "(//th[contains(.,'BOL Modified Commit Date')])[1]";
	
	public static final By BY_BOLPICKUPDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Pickup Date')])[1]");
	public static final By BY_BOLPICKUPDATE_COLDATA = By.xpath("//table/tbody/tr/td[12]");
	/**XPATH*/ public static final String STRING_BOLPICKUPDATE_COLDATA = "//table/tbody/tr/td[12]";
	/**XPATH*/ public static final String STRING_BOLPICKUPDATE_COLHEADER = "(//th[contains(.,'BOL Pickup Date')])[1]";
	
	public static final By BY_BOLCOMPLETEDDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Completed Date')])[1]");
	public static final By BY_BOLCOMPLETEDDATE_COLDATA = By.xpath("//table/tbody/tr/td[13]");
	/**XPATH*/ public static final String STRING_BOLCOMPLETEDDATE_COLDATA = "//table/tbody/tr/td[13]";
	/**XPATH*/ public static final String STRING_BOLCOMPLETEDDATE_COLHEADER = "(//th[contains(.,'BOL Completed Date')])[1]";
	
	public static final By BY_BOLLATEFLAG_COLHEADER = By.xpath("(//th[contains(.,'BOL Late Flag')])[1]");
	public static final By BY_BOLLATEFLAG_COLDATA = By.xpath("//table/tbody/tr/td[14]");
	/**XPATH*/ public static final String STRING_BOLLATEFLAG_COLDATA = "//table/tbody/tr/td[14]";
	/**XPATH*/ public static final String STRING_BOLLATEFLAG_COLHEADER = "(//th[contains(.,'BOL Late Flag')])[1]";
	
	public static final By BY_CUSTOMER_COLHEADER = By.xpath("(//th[contains(.,'Customer')])[1]");
	public static final By BY_CUSTOMER_COLDATA = By.xpath("//table/tbody/tr/td[15]");
	/**XPATH*/ public static final String STRING_CUSTOMER_COLDATA = "//table/tbody/tr/td[15]";
	/**XPATH*/ public static final String STRING_CUSTOMER_COLHEADER = "(//th[contains(.,'Customer')])[1]";
	
	public static final By BY_CUSTOMERCODE_COLHEADER = By.xpath("(//th[contains(.,'Customer Code')])[1]");
	public static final By BY_CUSTOMERCODE_COLDATA = By.xpath("//table/tbody/tr/td[16]");
	/**XPATH*/ public static final String STRING_CUSTOMERCODE_COLDATA = "//table/tbody/tr/td[16]";
	/**XPATH*/ public static final String STRING_CUSTOMERCODE_COLHEADER = "(//th[contains(.,'Customer Code')])[1]";
	
	public static final By BY_ITEMSKU_COLHEADER = By.xpath("//th[contains(.,'Item Sku')]");
	public static final By BY_ITEMSKU_COLDATA = By.xpath("//table/tbody/tr/td[17]");
	/**XPATH*/ public static final String STRING_ITEMSKU_COLDATA = "//table/tbody/tr/td[17]";
	/**XPATH*/ public static final String STRING_ITEMSKU_COLHEADER = "//th[contains(.,'Item Sku')]";
	
	public static final By BY_ITEMNAME_COLHEADER = By.xpath("//th[contains(.,'Item Name')]");
	public static final By BY_ITEMNAME_COLDATA = By.xpath("//table/tbody/tr/td[18]");
	/**XPATH*/ public static final String STRING_ITEMNAME_COLDATA = "//table/tbody/tr/td[18]";
	/**XPATH*/ public static final String STRING_ITEMNAME_COLHEADER = "//th[contains(.,'Item Name')]";
	
	public static final By BY_ITEMTYPE_COLHEADER = By.xpath("//th[contains(.,'Item Type')]");
	public static final By BY_ITEMTYPE_COLDATA = By.xpath("//table/tbody/tr/td[19]");
	/**XPATH*/ public static final String STRING_ITEMTYPE_COLDATA = "//table/tbody/tr/td[19]";
	/**XPATH*/ public static final String STRING_ITEMTYPE_COLHEADER = "//th[contains(.,'Item Type')]";
	
	public static final By BY_ITEMOWNER_COLHEADER = By.xpath("(//th[contains(.,'Item Owner')])[1]");
	public static final By BY_ITEMOWNER_COLDATA = By.xpath("//table/tbody/tr/td[20]");
	/**XPATH*/ public static final String STRING_ITEMOWNER_COLDATA = "//table/tbody/tr/td[20]";
	/**XPATH*/ public static final String STRING_ITEMOWNER_COLHEADER = "(//th[contains(.,'Item Owner')])[1]";
	
	public static final By BY_ITEMOWNERCODE_COLHEADER = By.xpath("(//th[contains(.,'Item Owner Code')])[1]");
	public static final By BY_ITEMOWNERCODE_COLDATA = By.xpath("//table/tbody/tr/td[21]");
	/**XPATH*/ public static final String STRING_ITEMOWNERCODE_COLDATA = "//table/tbody/tr/td[21]";
	/**XPATH*/ public static final String STRING_ITEMOWNERCODE_COLHEADER = "(//th[contains(.,'Item Owner Code')])[1]";
	
	public static final By BY_ITEMQUANTITY_COLHEADER = By.xpath("(//th[contains(.,'Item Quantity')])[1]");
	public static final By BY_ITEMQUANTITY_COLDATA = By.xpath("//table/tbody/tr/td[22]");
	/**XPATH*/ public static final String STRING_ITEMQUANTITY_COLDATA = "//table/tbody/tr/td[22]";
	/**XPATH*/ public static final String STRING_ITEMQUANTITY_COLHEADER = "(//th[contains(.,'Item Quantity')])[1]";
	
	public static final By BY_ORDERMINAPPLIED_COLHEADER = By.xpath("(//th[contains(.,'Order Min Applied')])[1]");
	public static final By BY_ORDERMINAPPLIED_COLDATA = By.xpath("//table/tbody/tr/td[23]");
	/**XPATH*/ public static final String STRING_ORDERMINAPPLIED_COLDATA = "//table/tbody/tr/td[23]";
	/**XPATH*/ public static final String STRING_ORDERMINAPPLIED_COLHEADER = "(//th[contains(.,'Order Min Applied')])[1]";
	
	public static final By BY_PLANMINQTY_COLHEADER = By.xpath("(//th[contains(.,'Plan Min Qty')])[1]");
	public static final By BY_PLANMINQTY_COLDATA = By.xpath("//table/tbody/tr/td[24]");
	/**XPATH*/ public static final String STRING_PLANMINQTY_COLDATA = "//table/tbody/tr/td[24]";
	/**XPATH*/ public static final String STRING_PLANMINQTY_COLHEADER = "(//th[contains(.,'Plan Min Qty')])[1]";
	
	public static final By BY_ITEMPRICEEACH_COLHEADER = By.xpath("(//th[contains(.,'Item Price Each')])[1]");
	public static final By BY_ITEMPRICEEACH_COLDATA = By.xpath("//table/tbody/tr/td[25]");
	/**XPATH*/ public static final String STRING_ITEMPRICEEACH_COLDATA = "//table/tbody/tr/td[25]";
	/**XPATH*/ public static final String STRING_ITEMPRICEEACH_COLHEADER = "(//th[contains(.,'Item Price Each')])[1]";
	
	public static final By BY_ITEMPRICETOTAL_COLHEADER = By.xpath("(//th[contains(.,'Item Price Total')])[1]");
	public static final By BY_ITEMPRICETOTAL_COLDATA = By.xpath("//table/tbody/tr/td[26]");
	/**XPATH*/ public static final String STRING_ITEMPRICETOTAL_COLDATA = "//table/tbody/tr/td[26]";
	/**XPATH*/ public static final String STRING_ITEMPRICETOTAL_COLHEADER = "(//th[contains(.,'Item Price Total')])[1]";
	
	public static final By BY_ORDERSUBTOTAL_COLHEADER = By.xpath("(//th[contains(.,'Order Subtotal')])[1]");
	public static final By BY_ORDERSUBTOTAL_COLDATA = By.xpath("//table/tbody/tr/td[27]");
	/**XPATH*/ public static final String STRING_ORDERSUBTOTAL_COLDATA = "//table/tbody/tr/td[27]";
	/**XPATH*/ public static final String STRING_ORDERSUBTOTAL_COLHEADER = "(//th[contains(.,'Order Subtotal')])[1]";
	
	public static final By BY_SPOTRATETYPE_COLHEADER = By.xpath("(//th[contains(.,'Spot Rate Type')])[1]");
	public static final By BY_SPOTRATETYPE_COLDATA = By.xpath("//table/tbody/tr/td[28]");
	/**XPATH*/ public static final String STRING_SPOTRATETYPE_COLDATA = "//table/tbody/tr/td[28]";
	/**XPATH*/ public static final String STRING_SPOTRATETYPE_COLHEADER = "(//th[contains(.,'Spot Rate Type')])[1]";
	
	public static final By BY_SPOTRATEPRICE_COLHEADER = By.xpath("(//th[contains(.,'Spot Rate Price')])[1]");
	public static final By BY_SPOTRATEPRICE_COLDATA = By.xpath("//table/tbody/tr/td[29]");
	/**XPATH*/ public static final String STRING_SPOTRATEPRICE_COLDATA = "//table/tbody/tr/td[29]";
	/**XPATH*/ public static final String STRING_SPOTRATEPRICE_COLHEADER = "(//th[contains(.,'Spot Rate Price')])[1]";
	
	public static final By BY_ORDERFUELCOST_COLHEADER = By.xpath("(//th[contains(.,'Order Fuel Cost')])[1]");
	public static final By BY_ORDERFUELCOST_COLDATA = By.xpath("//table/tbody/tr/td[30]");
	/**XPATH*/ public static final String STRING_ORDERFUELCOST_COLDATA = "//table/tbody/tr/td[30]";
	/**XPATH*/ public static final String STRING_ORDERFUELCOST_COLHEADER = "(//th[contains(.,'Order Fuel Cost')])[1]";
	
	public static final By BY_ORDEROTHERCOST_COLHEADER = By.xpath("(//th[contains(.,'Order Other Cost')])[1]");
	public static final By BY_ORDEROTHERCOST_COLDATA = By.xpath("//table/tbody/tr/td[31]");
	/**XPATH*/ public static final String STRING_ORDEROTHERCOST_COLDATA = "//table/tbody/tr/td[31]";
	/**XPATH*/ public static final String STRING_ORDEROTHERCOST_COLHEADER = "(//th[contains(.,'Order Other Cost')])[1]";
	
	public static final By BY_ORDEROTHERNOTES_COLHEADER = By.xpath("(//th[contains(.,'Order Other Notes')])[1]");
	public static final By BY_ORDEROTHERNOTES_COLDATA = By.xpath("//table/tbody/tr/td[32]");
	/**XPATH*/ public static final String STRING_ORDEROTHERNOTES_COLDATA = "//table/tbody/tr/td[32]";
	/**XPATH*/ public static final String STRING_ORDEROTHERNOTES_COLHEADER = "(//th[contains(.,'Order Other Notes')])[1]";
	
	public static final By BY_ORDERTOTAL_COLHEADER = By.xpath("(//th[contains(.,'Order Total')])[1]");
	public static final By BY_ORDERTOTAL_COLDATA = By.xpath("//table/tbody/tr/td[33]");
	/**XPATH*/ public static final String STRING_ORDERTOTAL_COLDATA = "//table/tbody/tr/td[33]";
	/**XPATH*/ public static final String STRING_ORDERTOTAL_COLHEADER = "(//th[contains(.,'Order Total')])[1]";

	public static final By BY_SHIPPERLOCCODE_COLHEADER = By.xpath("(//th[contains(.,'Shipper Loc Code')])[1]");
	public static final By BY_SHIPPERLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[37]");
	/**XPATH*/ public static final String STRING_SHIPPERLOCCODE_COLDATA = "//table/tbody/tr/td[37]";
	/**XPATH*/ public static final String STRING_SHIPPERLOCCODE_COLHEADER = "(//th[contains(.,'Shipper Loc Code')])[1]";
	
	public static final By BY_SHIPPERLOCNAME_COLHEADER = By.xpath("(//th[contains(.,'Shipper Loc Name')])[1]");
	public static final By BY_SHIPPERLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[38]");
	/**XPATH*/ public static final String STRING_SHIPPERLOCNAME_COLDATA = "//table/tbody/tr/td[38]";
	/**XPATH*/ public static final String STRING_SHIPPERLOCNAME_COLHEADER = "(//th[contains(.,'Shipper Loc Name')])[1]";
	
	public static final By BY_FROMLOCCODE_COLHEADER = By.xpath("(//th[contains(.,'From Loc Code')])[1]");
	public static final By BY_FROMLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[39]");
	/**XPATH*/ public static final String STRING_FROMLOCCODE_COLDATA = "//table/tbody/tr/td[39]";
	/**XPATH*/ public static final String STRING_FROMLOCCODE_COLHEADER = "(//th[contains(.,'From Loc Code')])[1]";
	
	public static final By BY_FROMLOCNAME_COLHEADER = By.xpath("(//th[contains(.,'From Loc Name')])[1]");
	public static final By BY_FROMLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[40]");
	/**XPATH*/ public static final String STRING_FROMLOCNAME_COLDATA = "//table/tbody/tr/td[40]";
	/**XPATH*/ public static final String STRING_FROMLOCNAME_COLHEADER = "(//th[contains(.,'From Loc Name')])[1]";
	
	public static final By BY_FROMLOCADDRESS_COLHEADER = By.xpath("(//th[contains(.,'From Loc Address')])[1]");
	public static final By BY_FROMLOCADDRESS_COLDATA = By.xpath("//table/tbody/tr/td[41]");
	/**XPATH*/ public static final String STRING_FROMLOCADDRESS_COLDATA = "//table/tbody/tr/td[41]";
	/**XPATH*/ public static final String STRING_FROMLOCADDRESS_COLHEADER = "(//th[contains(.,'From Loc Address')])[1]";
	
	public static final By BY_FROMLOCCITY_COLHEADER = By.xpath("(//th[contains(.,'From Loc City')])[1]");
	public static final By BY_FROMLOCCITY_COLDATA = By.xpath("//table/tbody/tr/td[42]");
	/**XPATH*/ public static final String STRING_FROMLOCCITY_COLDATA = "//table/tbody/tr/td[42]";
	/**XPATH*/ public static final String STRING_FROMLOCCITY_COLHEADER = "(//th[contains(.,'From Loc City')])[1]";
	
	public static final By BY_FROMLOCSTATE_COLHEADER = By.xpath("(//th[contains(.,'From Loc State')])[1]");
	public static final By BY_FROMLOCSTATE_COLDATA = By.xpath("//table/tbody/tr/td[43]");
	/**XPATH*/ public static final String STRING_FROMLOCSTATE_COLDATA = "//table/tbody/tr/td[43]";
	/**XPATH*/ public static final String STRING_FROMLOCSTATE_COLHEADER = "(//th[contains(.,'From Loc State')])[1]";
	
	public static final By BY_FROMLOCZIP_COLHEADER = By.xpath("(//th[contains(.,'From Loc Zip')])[1]");
	public static final By BY_FROMLOCZIP_COLDATA = By.xpath("//table/tbody/tr/td[44]");
	/**XPATH*/ public static final String STRING_FROMLOCZIP_COLDATA = "//table/tbody/tr/td[44]";
	/**XPATH*/ public static final String STRING_FROMLOCZIP_COLHEADER = "(//th[contains(.,'From Loc Zip')])[1]";
	
	public static final By BY_TOLOCCODE_COLHEADER = By.xpath("(//th[contains(.,'To Loc Code')])[1]");
	public static final By BY_TOLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[45]");
	/**XPATH*/ public static final String STRING_TOLOCCODE_COLDATA = "//table/tbody/tr/td[45]";
	/**XPATH*/ public static final String STRING_TOLOCCODE_COLHEADER = "(//th[contains(.,'To Loc Code')])[1]";
	
	public static final By BY_TOLOCNAME_COLHEADER = By.xpath("(//th[contains(.,'To Loc Name')])[1]");
	public static final By BY_TOLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[46]");
	/**XPATH*/ public static final String STRING_TOLOCNAME_COLDATA = "//table/tbody/tr/td[46]";
	/**XPATH*/ public static final String STRING_TOLOCNAME_COLHEADER = "(//th[contains(.,'To Loc Name')])[1]";
	
	public static final By BY_TOLOCADDRESS_COLHEADER = By.xpath("(//th[contains(.,'To Loc Address')])[1]");
	public static final By BY_TOLOCADDRESS_COLDATA = By.xpath("//table/tbody/tr/td[47]");
	/**XPATH*/ public static final String STRING_TOLOCADDRESS_COLDATA = "//table/tbody/tr/td[47]";
	/**XPATH*/ public static final String STRING_TOLOCADDRESS_COLHEADER = "(//th[contains(.,'To Loc Address')])[1]";
	
	public static final By BY_TOLOCCITY_COLHEADER = By.xpath("(//th[contains(.,'To Loc City')])[1]");
	public static final By BY_TOLOCCITY_COLDATA = By.xpath("//table/tbody/tr/td[48]");
	/**XPATH*/ public static final String STRING_TOLOCCITY_COLDATA = "//table/tbody/tr/td[48]";
	/**XPATH*/ public static final String STRING_TOLOCCITY_COLHEADER = "(//th[contains(.,'To Loc City')])[1]";
	
	public static final By BY_TOLOCSTATE_COLHEADER = By.xpath("(//th[contains(.,'To Loc State')])[1]");
	public static final By BY_TOLOCSTATE_COLDATA = By.xpath("//table/tbody/tr/td[49]");
	/**XPATH*/ public static final String STRING_TOLOCSTATE_COLDATA = "//table/tbody/tr/td[49]";
	/**XPATH*/ public static final String STRING_TOLOCSTATE_COLHEADER = "(//th[contains(.,'To Loc State')])[1]";
	
	public static final By BY_TOLOCZIP_COLHEADER = By.xpath("(//th[contains(.,'To Loc Zip')])[1]");
	public static final By BY_TOLOCZIP_COLDATA = By.xpath("//table/tbody/tr/td[50]");
	/**XPATH*/ public static final String STRING_TOLOCZIP_COLDATA = "//table/tbody/tr/td[50]";
	/**XPATH*/ public static final String STRING_TOLOCZIP_COLHEADER = "(//th[contains(.,'To Loc Zip')])[1]";
	
}
