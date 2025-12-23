package locators;

import org.openqa.selenium.By;

public class Reports_OrderDetailsPageLocators 
{
	
	/**XPATH*/ public static final String REPORTS_ORDERDETAILSPAGE_HEADING = "//div[text()='Order Details Report']";
	
	//Sorting
	public static final By BY_BOLID_COLHEADER = By.xpath("(//th[contains(.,'BOL ID')])[1]");
	public static final By BY_BOLID_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_BOLID_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_BOLID_COLHEADER = "(//th[contains(.,'BOL ID')])[1]";
	
	public static final By BY_ORDERID_COLHEADER = By.xpath("(//th[contains(.,'Order ID')])[1]");
	public static final By BY_ORDERID_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_ORDERID_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_ORDERID_COLHEADER = "(//th[contains(.,'Order ID')])[1]";
	
	public static final By BY_ORDERSTATUS_COLHEADER = By.xpath("(//th[contains(.,'Order Status')])[1]");
	public static final By BY_ORDERSTATUS_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_ORDERSTATUS_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_ORDERSTATUS_COLHEADER = "(//th[contains(.,'Order Status')])[1]";
	
	public static final By BY_BOLSTATUS_COLHEADER = By.xpath("(//th[contains(.,'BOL Status')])[1]");
	public static final By BY_BOLSTATUS_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_BOLSTATUS_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_BOLSTATUS_COLHEADER = "(//th[contains(.,'BOL Status')])[1]";
	
	public static final By BY_ORDERTYPE_COLHEADER = By.xpath("(//th[contains(.,'Order Type')])[1]");
	public static final By BY_ORDERTYPE_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_ORDERTYPE_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_ORDERTYPE_COLHEADER = "(//th[contains(.,'Order Type')])[1]";
	
	public static final By BY_PROGRAM_COLHEADER = By.xpath("(//th[contains(.,'Program')])[1]");
	public static final By BY_PROGRAM_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_PROGRAM_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_PROGRAM_COLHEADER = "(//th[contains(.,'Program')])[1]";
	
	public static final By BY_COMPLETEDWEEK_COLHEADER = By.xpath("(//th[contains(.,'Completed Week')])[1]");
	public static final By BY_COMPLETEDWEEK_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_COMPLETEDWEEK_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_COMPLETEDWEEK_COLHEADER = "(//th[contains(.,'Completed Week')])[1]";
	
	public static final By BY_ORDERDATE_COLHEADER = By.xpath("(//th[contains(.,'Order Date')])[1]");
	public static final By BY_ORDERDATE_COLDATA = By.xpath("//table/tbody/tr/td[8]");
	/**XPATH*/ public static final String STRING_ORDERDATE_COLDATA = "//table/tbody/tr/td[8]";
	/**XPATH*/ public static final String STRING_ORDERDATE_COLHEADER = "(//th[contains(.,'Order Date')])[1]";
	
	public static final By BY_ORDERNEEDBYDATE_COLHEADER = By.xpath("(//th[contains(.,'Order Need By Date')])[1]");
	public static final By BY_ORDERNEEDBYDATE_COLDATA = By.xpath("//table/tbody/tr/td[9]");
	/**XPATH*/ public static final String STRING_ORDERNEEDBYDATE_COLDATA = "//table/tbody/tr/td[9]";
	/**XPATH*/ public static final String STRING_ORDERNEEDBYDATE_COLHEADER = "(//th[contains(.,'Order Need By Date')])[1]";
	
	public static final By BY_ORDERUPDATEDDATE_COLHEADER = By.xpath("(//th[contains(.,'Order Updated Date')])[1]");
	public static final By BY_ORDERUPDATEDDATE_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/**XPATH*/ public static final String STRING_ORDERUPDATEDDATE_COLDATA = "//table/tbody/tr/td[10]";
	/**XPATH*/ public static final String STRING_ORDERUPDATEDDATE_COLHEADER = "(//th[contains(.,'Order Updated Date')])[1]";
	
	public static final By BY_PREBILLINGOVERRIDEMINQTY_COLHEADER = By.xpath("(//th[contains(.,'Pre-Billing Override Min Qty')])[1]");
	public static final By BY_PREBILLINGOVERRIDEMINQTY_COLDATA = By.xpath("//table/tbody/tr/td[11]");
	/**XPATH*/ public static final String STRING_PREBILLINGOVERRIDEMINQTY_COLDATA = "//table/tbody/tr/td[11]";
	/**XPATH*/ public static final String STRING_PREBILLINGOVERRIDEMINQTY_COLHEADER = "(//th[contains(.,'Pre-Billing Override Min Qty')])[1]";
	
	public static final By BY_PREBILLINGOVERRIDEMINQTYREASON_COLHEADER = By.xpath("(//th[contains(.,'Pre-Billing Override Min Qty Reason')])[1]");
	public static final By BY_PREBILLINGOVERRIDEMINQTYREASON_COLDATA = By.xpath("//table/tbody/tr/td[12]");
	/**XPATH*/ public static final String STRING_PREBILLINGOVERRIDEMINQTYREASON_COLDATA = "//table/tbody/tr/td[12]";
	/**XPATH*/ public static final String STRING_PREBILLINGOVERRIDEMINQTYREASON_COLHEADER = "(//th[contains(.,'Pre-Billing Override Min Qty Reason')])[1]";
	
	public static final By BY_BOLASSIGNEDDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Assigned Date')])[1]");
	public static final By BY_BOLASSIGNEDDATE_COLDATA = By.xpath("//table/tbody/tr/td[13]");
	/**XPATH*/ public static final String STRING_BOLASSIGNEDDATE_COLDATA = "//table/tbody/tr/td[13]";
	/**XPATH*/ public static final String STRING_BOLASSIGNEDDATE_COLHEADER = "(//th[contains(.,'BOL Assigned Date')])[1]";
	
	public static final By BY_BOLDUEDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Due Date')])[1]");
	public static final By BY_BOLDUEDATE_COLDATA = By.xpath("//table/tbody/tr/td[14]");
	/**XPATH*/ public static final String STRING_BOLDUEDATE_COLDATA = "//table/tbody/tr/td[14]";
	/**XPATH*/ public static final String STRING_BOLDUEDATE_COLHEADER = "(//th[contains(.,'BOL Due Date')])[1]";
	
	public static final By BY_BOLCOMMITDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Commit Date')])[1]");
	public static final By BY_BOLCOMMITDATE_COLDATA = By.xpath("//table/tbody/tr/td[15]");
	/**XPATH*/ public static final String STRING_BOLCOMMITDATE_COLDATA = "//table/tbody/tr/td[15]";
	/**XPATH*/ public static final String STRING_BOLCOMMITDATE_COLHEADER = "(//th[contains(.,'BOL Commit Date')])[1]";
	
	public static final By BY_BOLMODIFIEDCOMMITDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Modified Commit Date')])[1]");
	public static final By BY_BOLMODIFIEDCOMMITDATE_COLDATA = By.xpath("//table/tbody/tr/td[16]");
	/**XPATH*/ public static final String STRING_BOLMODIFIEDCOMMITDATE_COLDATA = "//table/tbody/tr/td[16]";
	/**XPATH*/ public static final String STRING_BOLMODIFIEDCOMMITDATE_COLHEADER = "(//th[contains(.,'BOL Modified Commit Date')])[1]";
	
	public static final By BY_BOLPICKUPDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Pickup Date')])[1]");
	public static final By BY_BOLPICKUPDATE_COLDATA = By.xpath("//table/tbody/tr/td[17]");
	/**XPATH*/ public static final String STRING_BOLPICKUPDATE_COLDATA = "//table/tbody/tr/td[17]";
	/**XPATH*/ public static final String STRING_BOLPICKUPDATE_COLHEADER = "(//th[contains(.,'BOL Pickup Date')])[1]";
	
	public static final By BY_BOLCOMPLETEDDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Completed Date')])[1]");
	public static final By BY_BOLCOMPLETEDDATE_COLDATA = By.xpath("//table/tbody/tr/td[18]");
	/**XPATH*/ public static final String STRING_BOLCOMPLETEDDATE_COLDATA = "//table/tbody/tr/td[18]";
	/**XPATH*/ public static final String STRING_BOLCOMPLETEDDATE_COLHEADER = "(//th[contains(.,'BOL Completed Date')])[1]";
	
	public static final By BY_BOLLATEFLAG_COLHEADER = By.xpath("(//th[contains(.,'BOL Late Flag')])[1]");
	public static final By BY_BOLLATEFLAG_COLDATA = By.xpath("//table/tbody/tr/td[19]");
	/**XPATH*/ public static final String STRING_BOLLATEFLAG_COLDATA = "//table/tbody/tr/td[19]";
	/**XPATH*/ public static final String STRING_BOLLATEFLAG_COLHEADER = "(//th[contains(.,'BOL Late Flag')])[1]";
	
	public static final By BY_BOLCREATEDDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Created Date')])[1]");
	public static final By BY_BOLCREATEDDATE_COLDATA = By.xpath("//table/tbody/tr/td[20]");
	/**XPATH*/ public static final String STRING_BOLCREATEDDATE_COLDATA = "//table/tbody/tr/td[20]";
	/**XPATH*/ public static final String STRING_BOLCREATEDDATE_COLHEADER = "(//th[contains(.,'BOL Created Date')])[1]";
	
	public static final By BY_BOLUPDATEDDATE_COLHEADER = By.xpath("(//th[contains(.,'BOL Updated Date')])[1]");
	public static final By BY_BOLUPDATEDDATE_COLDATA = By.xpath("//table/tbody/tr/td[21]");
	/**XPATH*/ public static final String STRING_BOLUPDATEDDATE_COLDATA = "//table/tbody/tr/td[21]";
	/**XPATH*/ public static final String STRING_BOLUPDATEDDATE_COLHEADER = "(//th[contains(.,'BOL Updated Date')])[1]";
	
	public static final By BY_CUSTOMER_COLHEADER = By.xpath("(//th[contains(.,'Customer')])[1]");
	public static final By BY_CUSTOMER_COLDATA = By.xpath("//table/tbody/tr/td[22]");
	/**XPATH*/ public static final String STRING_CUSTOMER_COLDATA = "//table/tbody/tr/td[22]";
	/**XPATH*/ public static final String STRING_CUSTOMER_COLHEADER = "(//th[contains(.,'Customer')])[1]";
	
	public static final By BY_ITEMSKU_COLHEADER = By.xpath("//th[contains(.,'Item Sku')]");
	public static final By BY_ITEMSKU_COLDATA = By.xpath("//table/tbody/tr/td[23]");
	/**XPATH*/ public static final String STRING_ITEMSKU_COLDATA = "//table/tbody/tr/td[23]";
	/**XPATH*/ public static final String STRING_ITEMSKU_COLHEADER = "//th[contains(.,'Item Sku')]";
	
	public static final By BY_ITEMNAME_COLHEADER = By.xpath("//th[contains(.,'Item Name')]");
	public static final By BY_ITEMNAME_COLDATA = By.xpath("//table/tbody/tr/td[24]");
	/**XPATH*/ public static final String STRING_ITEMNAME_COLDATA = "//table/tbody/tr/td[24]";
	/**XPATH*/ public static final String STRING_ITEMNAME_COLHEADER = "//th[contains(.,'Item Name')]";
	
	public static final By BY_PROGRAMOWNER_COLHEADER = By.xpath("(//th[contains(.,'Program Owner')])[1]");
	public static final By BY_PROGRAMOWNER_COLDATA = By.xpath("//table/tbody/tr/td[25]");
	/**XPATH*/ public static final String STRING_PROGRAMOWNER_COLDATA = "//table/tbody/tr/td[25]";
	/**XPATH*/ public static final String STRING_PROGRAMOWNER_COLHEADER = "(//th[contains(.,'Program Owner')])[1]";
	
	public static final By BY_PROGRAMOWNERCODE_COLHEADER = By.xpath("(//th[contains(.,'Program Owner Code')])[1]");
	public static final By BY_PROGRAMOWNERCODE_COLDATA = By.xpath("//table/tbody/tr/td[26]");
	/**XPATH*/ public static final String STRING_PROGRAMOWNERCODE_COLDATA = "//table/tbody/tr/td[26]";
	/**XPATH*/ public static final String STRING_PROGRAMOWNERCODE_COLHEADER = "(//th[contains(.,'Program Owner Code')])[1]";
	
	public static final By BY_REQUESTEDQUANTITY_COLHEADER = By.xpath("(//th[contains(.,'Requested Quantity')])[1]");
	public static final By BY_REQUESTEDQUANTITY_COLDATA = By.xpath("//table/tbody/tr/td[27]");
	/**XPATH*/ public static final String STRING_REQUESTEDQUANTITY_COLDATA = "//table/tbody/tr/td[27]";
	/**XPATH*/ public static final String STRING_REQUESTEDQUANTITY_COLHEADER = "(//th[contains(.,'Requested Quantity')])[1]";
	
	public static final By BY_PICKEDQUANTITY_COLHEADER = By.xpath("(//th[contains(.,'Picked Quantity')])[1]");
	public static final By BY_PICKEDQUANTITY_COLDATA = By.xpath("//table/tbody/tr/td[28]");
	/**XPATH*/ public static final String STRING_PICKEDQUANTITY_COLDATA = "//table/tbody/tr/td[28]";
	/**XPATH*/ public static final String STRING_PICKEDQUANTITY_COLHEADER = "(//th[contains(.,'Picked Quantity')])[1]";
	
	public static final By BY_DELIVEREDQUANTITY_COLHEADER = By.xpath("(//th[contains(.,'Delivered Quantity')])[1]");
	public static final By BY_DELIVEREDQUANTITY_COLDATA = By.xpath("//table/tbody/tr/td[29]");
	/**XPATH*/ public static final String STRING_DELIVEREDQUANTITY_COLDATA = "//table/tbody/tr/td[29]";
	/**XPATH*/ public static final String STRING_DELIVEREDQUANTITY_COLHEADER = "(//th[contains(.,'Delivered Quantity')])[1]";
	
	public static final By BY_BOLCLOSED_COLHEADER = By.xpath("(//th[contains(.,'BOL Closed %')])[1]");
	public static final By BY_BOLCLOSED_COLDATA = By.xpath("//table/tbody/tr/td[30]");
	/**XPATH*/ public static final String STRING_BOLCLOSED_COLDATA = "//table/tbody/tr/td[30]";
	/**XPATH*/ public static final String STRING_BOLCLOSED_COLHEADER = "(//th[contains(.,'BOL Closed %')])[1]";
	
	public static final By BY_BOLREASONLABEL_1_COLHEADER = By.xpath("(//th[contains(.,'BOL Reason Label 1')])[1]");
	public static final By BY_BOLREASONLABEL_1_COLDATA = By.xpath("//table/tbody/tr/td[31]");
	/**XPATH*/ public static final String STRING_BOLREASONLABEL_1_COLDATA = "//table/tbody/tr/td[31]";
	/**XPATH*/ public static final String STRING_BOLREASONLABEL_1_COLHEADER = "(//th[contains(.,'BOL Reason Label 1')])[1]";
	
	public static final By BY_BOLREASONVALUE_1_COLHEADER = By.xpath("(//th[contains(.,'BOL Reason Value 1')])[1]");
	public static final By BY_BOLREASONVALUE_1_COLDATA = By.xpath("//table/tbody/tr/td[32]");
	/**XPATH*/ public static final String STRING_BOLREASONVALUE_1_COLDATA = "//table/tbody/tr/td[32]";
	/**XPATH*/ public static final String STRING_BOLREASONVALUE_1_COLHEADER = "(//th[contains(.,'BOL Reason Value 1')])[1]";
	
	public static final By BY_BOLREASONLABEL_2_COLHEADER = By.xpath("(//th[contains(.,'BOL Reason Label 2')])[1]");
	public static final By BY_BOLREASONLABEL_2_COLDATA = By.xpath("//table/tbody/tr/td[33]");
	/**XPATH*/ public static final String STRING_BOLREASONLABEL_2_COLDATA = "//table/tbody/tr/td[33]";
	/**XPATH*/ public static final String STRING_BOLREASONLABEL_2_COLHEADER = "(//th[contains(.,'BOL Reason Label 2')])[1]";
	
	public static final By BY_BOLREASONVALUE_2_COLHEADER = By.xpath("(//th[contains(.,'BOL Reason Value 2')])[1]");
	public static final By BY_BOLREASONVALUE_2_COLDATA = By.xpath("//table/tbody/tr/td[34]");
	/**XPATH*/ public static final String STRING_BOLREASONVALUE_2_COLDATA = "//table/tbody/tr/td[34]";
	/**XPATH*/ public static final String STRING_BOLREASONVALUE_2_COLHEADER = "(//th[contains(.,'BOL Reason Value 2')])[1]";
	
	public static final By BY_BOLREASONLABEL_3_1_COLHEADER = By.xpath("(//th[contains(.,'BOL Reason Label 3.1')])[1]");
	public static final By BY_BOLREASONLABEL_3_1_COLDATA = By.xpath("//table/tbody/tr/td[35]");
	/**XPATH*/ public static final String STRING_BOLREASONLABEL_3_1_COLDATA = "//table/tbody/tr/td[35]";
	/**XPATH*/ public static final String STRING_BOLREASONLABEL_3_1_COLHEADER = "(//th[contains(.,'BOL Reason Label 3.1')])[1]";
	
	public static final By BY_BOLREASONVALUE_3_1_COLHEADER = By.xpath("(//th[contains(.,'BOL Reason Value 3.1')])[1]");
	public static final By BY_BOLREASONVALUE_3_1_COLDATA = By.xpath("//table/tbody/tr/td[36]");
	/**XPATH*/ public static final String STRING_BOLREASONVALUE_3_1_COLDATA = "//table/tbody/tr/td[36]";
	/**XPATH*/ public static final String STRING_BOLREASONVALUE_3_1_COLHEADER = "(//th[contains(.,'BOL Reason Value 3.1')])[1]";
	
	public static final By BY_BOLREASONLABEL_3_2_COLHEADER = By.xpath("(//th[contains(.,'BOL Reason Label 3.2')])[1]");
	public static final By BY_BOLREASONLABEL_3_2_COLDATA = By.xpath("//table/tbody/tr/td[37]");
	/**XPATH*/ public static final String STRING_BOLREASONLABEL_3_2_COLDATA = "//table/tbody/tr/td[37]";
	/**XPATH*/ public static final String STRING_BOLREASONLABEL_3_2_COLHEADER = "(//th[contains(.,'BOL Reason Label 3.2')])[1]";
	
	public static final By BY_BOLREASONVALUE_3_2_COLHEADER = By.xpath("(//th[contains(.,'BOL Reason Value 3.2')])[1]");
	public static final By BY_BOLREASONVALUE_3_2_COLDATA = By.xpath("//table/tbody/tr/td[38]");
	/**XPATH*/ public static final String STRING_BOLREASONVALUE_3_2_COLDATA = "//table/tbody/tr/td[38]";
	/**XPATH*/ public static final String STRING_BOLREASONVALUE_3_2_COLHEADER = "(//th[contains(.,'BOL Reason Value 3.2')])[1]";
	
	public static final By BY_BOLDISPOSITIONTYPE_COLHEADER = By.xpath("(//th[contains(.,'BOL Disposition Type')])[1]");
	public static final By BY_BOLDISPOSITIONTYPE_COLDATA = By.xpath("//table/tbody/tr/td[39]");
	/**XPATH*/ public static final String STRING_BOLDISPOSITIONTYPE_COLDATA = "//table/tbody/tr/td[39]";
	/**XPATH*/ public static final String STRING_BOLDISPOSITIONTYPE_COLHEADER = "(//th[contains(.,'BOL Disposition Type')])[1]";
	
	public static final By BY_RACKSREMAININGINUSE_COLHEADER = By.xpath("(//th[contains(.,'Racks Remaining In Use')])[1]");
	public static final By BY_RACKSREMAININGINUSE_COLDATA = By.xpath("//table/tbody/tr/td[40]");
	/**XPATH*/ public static final String STRING_RACKSREMAININGINUSE_COLDATA = "//table/tbody/tr/td[40]";
	/**XPATH*/ public static final String STRING_RACKSREMAININGINUSE_COLHEADER = "(//th[contains(.,'Racks Remaining In Use')])[1]";
	
	public static final By BY_SHIPMETHOD_COLHEADER = By.xpath("(//th[contains(.,'Ship Method')])[1]");
	public static final By BY_SHIPMETHOD_COLDATA = By.xpath("//table/tbody/tr/td[41]");
	/**XPATH*/ public static final String STRING_SHIPMETHOD_COLDATA = "//table/tbody/tr/td[41]";
	/**XPATH*/ public static final String STRING_SHIPMETHOD_COLHEADER = "(//th[contains(.,'Ship Method')])[1]";
	
	public static final By BY_SHIPPERLOCREFCODE_COLHEADER = By.xpath("(//th[contains(.,'Shipper Loc Ref Code')])[1]");
	public static final By BY_SHIPPERLOCREFCODE_COLDATA = By.xpath("//table/tbody/tr/td[42]");
	/**XPATH*/ public static final String STRING_SHIPPERLOCREFCODE_COLDATA = "//table/tbody/tr/td[42]";
	/**XPATH*/ public static final String STRING_SHIPPERLOCREFCODE_COLHEADER = "(//th[contains(.,'Shipper Loc Ref Code')])[1]";
	
	public static final By BY_SHIPPERLOCNAME_COLHEADER = By.xpath("(//th[contains(.,'Shipper Loc Name')])[1]");
	public static final By BY_SHIPPERLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[43]");
	/**XPATH*/ public static final String STRING_SHIPPERLOCNAME_COLDATA = "//table/tbody/tr/td[43]";
	/**XPATH*/ public static final String STRING_SHIPPERLOCNAME_COLHEADER = "(//th[contains(.,'Shipper Loc Name')])[1]";
	
	public static final By BY_FROMLOCCODE_COLHEADER = By.xpath("(//th[contains(.,'From Loc Code')])[1]");
	public static final By BY_FROMLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[44]");
	/**XPATH*/ public static final String STRING_FROMLOCCODE_COLDATA = "//table/tbody/tr/td[44]";
	/**XPATH*/ public static final String STRING_FROMLOCCODE_COLHEADER = "(//th[contains(.,'From Loc Code')])[1]";
	
	public static final By BY_FROMLOCNAME_COLHEADER = By.xpath("(//th[contains(.,'From Loc Name')])[1]");
	public static final By BY_FROMLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[45]");
	/**XPATH*/ public static final String STRING_FROMLOCNAME_COLDATA = "//table/tbody/tr/td[45]";
	/**XPATH*/ public static final String STRING_FROMLOCNAME_COLHEADER = "(//th[contains(.,'From Loc Name')])[1]";
	
	public static final By BY_FROMLOCADDRESS_COLHEADER = By.xpath("(//th[contains(.,'From Loc Address')])[1]");
	public static final By BY_FROMLOCADDRESS_COLDATA = By.xpath("//table/tbody/tr/td[46]");
	/**XPATH*/ public static final String STRING_FROMLOCADDRESS_COLDATA = "//table/tbody/tr/td[46]";
	/**XPATH*/ public static final String STRING_FROMLOCADDRESS_COLHEADER = "(//th[contains(.,'From Loc Address')])[1]";
	
	public static final By BY_FROMLOCCITY_COLHEADER = By.xpath("(//th[contains(.,'From Loc City')])[1]");
	public static final By BY_FROMLOCCITY_COLDATA = By.xpath("//table/tbody/tr/td[47]");
	/**XPATH*/ public static final String STRING_FROMLOCCITY_COLDATA = "//table/tbody/tr/td[47]";
	/**XPATH*/ public static final String STRING_FROMLOCCITY_COLHEADER = "(//th[contains(.,'From Loc City')])[1]";
	
	public static final By BY_FROMLOCSTATE_COLHEADER = By.xpath("(//th[contains(.,'From Loc State')])[1]");
	public static final By BY_FROMLOCSTATE_COLDATA = By.xpath("//table/tbody/tr/td[48]");
	/**XPATH*/ public static final String STRING_FROMLOCSTATE_COLDATA = "//table/tbody/tr/td[48]";
	/**XPATH*/ public static final String STRING_FROMLOCSTATE_COLHEADER = "(//th[contains(.,'From Loc State')])[1]";
	
	public static final By BY_FROMLOCZIP_COLHEADER = By.xpath("(//th[contains(.,'From Loc Zip')])[1]");
	public static final By BY_FROMLOCZIP_COLDATA = By.xpath("//table/tbody/tr/td[49]");
	/**XPATH*/ public static final String STRING_FROMLOCZIP_COLDATA = "//table/tbody/tr/td[49]";
	/**XPATH*/ public static final String STRING_FROMLOCZIP_COLHEADER = "(//th[contains(.,'From Loc Zip')])[1]";
	
	public static final By BY_ZONE_COLHEADER = By.xpath("(//th[contains(.,'Zone')])[1]");
	public static final By BY_ZONE_COLDATA = By.xpath("//table/tbody/tr/td[50]");
	/**XPATH*/ public static final String STRING_ZONE_COLDATA = "//table/tbody/tr/td[50]";
	/**XPATH*/ public static final String STRING_ZONE_COLHEADER = "(//th[contains(.,'Zone')])[1]";
	
	public static final By BY_TOLOCCODE_COLHEADER = By.xpath("(//th[contains(.,'To Loc Code')])[1]");
	public static final By BY_TOLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[51]");
	/**XPATH*/ public static final String STRING_TOLOCCODE_COLDATA = "//table/tbody/tr/td[51]";
	/**XPATH*/ public static final String STRING_TOLOCCODE_COLHEADER = "(//th[contains(.,'To Loc Code')])[1]";
	
	public static final By BY_TOLOCNAME_COLHEADER = By.xpath("(//th[contains(.,'To Loc Name')])[1]");
	public static final By BY_TOLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[52]");
	/**XPATH*/ public static final String STRING_TOLOCNAME_COLDATA = "//table/tbody/tr/td[52]";
	/**XPATH*/ public static final String STRING_TOLOCNAME_COLHEADER = "(//th[contains(.,'To Loc Name')])[1]";
	
	public static final By BY_TOLOCADDRESS_COLHEADER = By.xpath("(//th[contains(.,'To Loc Address')])[1]");
	public static final By BY_TOLOCADDRESS_COLDATA = By.xpath("//table/tbody/tr/td[53]");
	/**XPATH*/ public static final String STRING_TOLOCADDRESS_COLDATA = "//table/tbody/tr/td[53]";
	/**XPATH*/ public static final String STRING_TOLOCADDRESS_COLHEADER = "(//th[contains(.,'To Loc Address')])[1]";
	
	public static final By BY_TOLOCCITY_COLHEADER = By.xpath("(//th[contains(.,'To Loc City')])[1]");
	public static final By BY_TOLOCCITY_COLDATA = By.xpath("//table/tbody/tr/td[54]");
	/**XPATH*/ public static final String STRING_TOLOCCITY_COLDATA = "//table/tbody/tr/td[54]";
	/**XPATH*/ public static final String STRING_TOLOCCITY_COLHEADER = "(//th[contains(.,'To Loc City')])[1]";
	
	public static final By BY_TOLOCSTATE_COLHEADER = By.xpath("(//th[contains(.,'To Loc State')])[1]");
	public static final By BY_TOLOCSTATE_COLDATA = By.xpath("//table/tbody/tr/td[55]");
	/**XPATH*/ public static final String STRING_TOLOCSTATE_COLDATA = "//table/tbody/tr/td[55]";
	/**XPATH*/ public static final String STRING_TOLOCSTATE_COLHEADER = "(//th[contains(.,'To Loc State')])[1]";
	
	public static final By BY_TOLOCZIP_COLHEADER = By.xpath("(//th[contains(.,'To Loc Zip')])[1]");
	public static final By BY_TOLOCZIP_COLDATA = By.xpath("//table/tbody/tr/td[56]");
	/**XPATH*/ public static final String STRING_TOLOCZIP_COLDATA = "//table/tbody/tr/td[56]";
	/**XPATH*/ public static final String STRING_TOLOCZIP_COLHEADER = "(//th[contains(.,'To Loc Zip')])[1]";
	
	public static final By BY_CUSTOMERPO_COLHEADER = By.xpath("(//th[contains(.,'Customer PO #')])[1]");
	public static final By BY_CUSTOMERPO_COLDATA = By.xpath("//table/tbody/tr/td[57]");
	/**XPATH*/ public static final String STRING_CUSTOMERPO_COLDATA = "//table/tbody/tr/td[57]";
	/**XPATH*/ public static final String STRING_CUSTOMERPO_COLHEADER = "(//th[contains(.,'Customer PO #')])[1]";
	
	public static final By BY_ORDERCREATEDBY_COLHEADER = By.xpath("(//th[contains(.,'Order Created By')])[1]");
	public static final By BY_ORDERCREATEDBY_COLDATA = By.xpath("//table/tbody/tr/td[58]");
	/**XPATH*/ public static final String STRING_ORDERCREATEDBY_COLDATA = "//table/tbody/tr/td[58]";
	/**XPATH*/ public static final String STRING_ORDERCREATEDBY_COLHEADER = "(//th[contains(.,'Order Created By')])[1]";
	
	public static final By BY_AUTOASSIGNELIGIBLE_COLHEADER = By.xpath("(//th[contains(.,'Auto-Assign Eligible')])[1]");
	public static final By BY_AUTOASSIGNELIGIBLE_COLDATA = By.xpath("//table/tbody/tr/td[59]");
	/**XPATH*/ public static final String STRING_AUTOASSIGNELIGIBLE_COLDATA = "//table/tbody/tr/td[59]";
	/**XPATH*/ public static final String STRING_AUTOASSIGNELIGIBLE_COLHEADER = "(//th[contains(.,'Auto-Assign Eligible')])[1]";
	
	public static final By BY_BATCHFILEID_COLHEADER = By.xpath("(//th[contains(.,'Batch File ID')])[1]");
	public static final By BY_BATCHFILEID_COLDATA = By.xpath("//table/tbody/tr/td[60]");
	/**XPATH*/ public static final String STRING_BATCHFILEID_COLDATA = "//table/tbody/tr/td[60]";
	/**XPATH*/ public static final String STRING_BATCHFILEID_COLHEADER = "(//th[contains(.,'Batch File ID')])[1]";
	
	public static final By BY_BATCHFILENOTE_COLHEADER = By.xpath("(//th[contains(.,'Batch File Note')])[1]");
	public static final By BY_BATCHFILENOTE_COLDATA = By.xpath("//table/tbody/tr/td[61]");
	/**XPATH*/ public static final String STRING_BATCHFILENOTE_COLDATA = "//table/tbody/tr/td[61]";
	/**XPATH*/ public static final String STRING_BATCHFILENOTE_COLHEADER = "(//th[contains(.,'Batch File Note')])[1]";
	
	
	
}
