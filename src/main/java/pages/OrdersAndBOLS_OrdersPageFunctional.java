package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.OrdersAndBOLS_OrdersPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class OrdersAndBOLS_OrdersPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Orders Listing page
	 * @throws InterruptedException
	 */
	public boolean navigate_OrdersListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ORDERSANDBOLS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ORDERSANDBOLS_ORDERS_PAGE, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.ORDERSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean Order_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_ORDER_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDER_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_ORDER_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDER_COLDATA);
		return flag;
	}
	
	public boolean Order_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_ORDER_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDER_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_ORDER_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDER_COLDATA);
		return flag;
	}
	
	
	public boolean OrderDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(OrdersAndBOLS_OrdersPageLocators.BY_ORDERDATE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.BY_ORDERDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(OrdersAndBOLS_OrdersPageLocators.BY_ORDERDATE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.BY_ORDERDATE_COLDATA);
		return flag;
	}
	
	public boolean NeedByDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(OrdersAndBOLS_OrdersPageLocators.BY_NEEDBYDATE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.BY_NEEDBYDATE_COLDATA);
		return flag;
	}
	
	public boolean NeedByDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(OrdersAndBOLS_OrdersPageLocators.BY_NEEDBYDATE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.BY_NEEDBYDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLDueDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(OrdersAndBOLS_OrdersPageLocators.BY_BOLDUEDATE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.BY_BOLDUEDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLDueDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(OrdersAndBOLS_OrdersPageLocators.BY_BOLDUEDATE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.BY_BOLDUEDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_ORDERTYPE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDERTYPE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_ORDERTYPE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDERTYPE_COLDATA);
		return flag;
	}
	
	public boolean OrderType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_ORDERTYPE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDERTYPE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_ORDERTYPE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDERTYPE_COLDATA);
		return flag;
	}
	
	public boolean CustomerPO_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_CUSTOMERPO_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_CUSTOMERPO_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_CUSTOMERPO_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_CUSTOMERPO_COLDATA);
		return flag;
	}
	
	public boolean CustomerPO_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_CUSTOMERPO_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_CUSTOMERPO_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_CUSTOMERPO_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_CUSTOMERPO_COLDATA);
		return flag;
	}
	
	public boolean AccountCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_ACCOUNTCODE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ACCOUNTCODE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_ACCOUNTCODE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ACCOUNTCODE_COLDATA);
		return flag;
	}
	
	public boolean AccountCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_ACCOUNTCODE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ACCOUNTCODE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_ACCOUNTCODE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ACCOUNTCODE_COLDATA);
		return flag;
	}
	
	public boolean AccountName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_ACCOUNTNAME_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ACCOUNTNAME_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}
	
	public boolean AccountName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_ACCOUNTNAME_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ACCOUNTNAME_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_FROMLOCCODE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_FROMLOCCODE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_FROMLOCNAME_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_FROMLOCNAME_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_TOLOCCODE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_TOLOCCODE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_TOLOCNAME_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_TOLOCNAME_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}
	
	
	public boolean ShipMethod_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_SHIPMETHOD_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPMETHOD_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_SHIPMETHOD_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPMETHOD_COLDATA);
		return flag;
	}
	
	public boolean ShipMethod_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_SHIPMETHOD_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPMETHOD_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_SHIPMETHOD_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPMETHOD_COLDATA);
		return flag;
	}
	
	public boolean ShipperCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_SHIPPERCODE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPPERCODE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_SHIPPERCODE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPPERCODE_COLDATA);
		return flag;
	}
	
	public boolean ShipperCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_SHIPPERCODE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPPERCODE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_SHIPPERCODE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPPERCODE_COLDATA);
		return flag;
	}
	
	public boolean ShipperName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_SHIPPERNAME_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPPERNAME_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_SHIPPERNAME_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPPERNAME_COLDATA);
		return flag;
	}
	
	public boolean ShipperName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_SHIPPERNAME_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPPERNAME_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_SHIPPERNAME_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_SHIPPERNAME_COLDATA);
		return flag;
	}
	
	public boolean BOL_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_BOL_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BOL_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_BOL_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BOL_COLDATA);
		return flag;
	}
	
	public boolean BOL_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_BOL_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BOL_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_BOL_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BOL_COLDATA);
		return flag;
	}
	
	public boolean OrderStatus_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_ORDERSTATUS_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDERSTATUS_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_ORDERSTATUS_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDERSTATUS_COLDATA);
		return flag;
	}
	
	public boolean OrderStatus_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_ORDERSTATUS_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDERSTATUS_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_ORDERSTATUS_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_ORDERSTATUS_COLDATA);
		return flag;
	}
	
	public boolean BOLStatus_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_BOLSTATUS_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BOLSTATUS_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_BOLSTATUS_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BOLSTATUS_COLDATA);
		return flag;
	}
	
	public boolean BOLStatus_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_BOLSTATUS_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BOLSTATUS_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_BOLSTATUS_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BOLSTATUS_COLDATA);
		return flag;
	}
	
	public boolean CompletedDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_COMPLETEDDATE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_COMPLETEDDATE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_COMPLETEDDATE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_COMPLETEDDATE_COLDATA);
		return flag;
	}
	
	public boolean CompletedDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_COMPLETEDDATE_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_COMPLETEDDATE_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_COMPLETEDDATE_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_COMPLETEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BatchFileID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_BATCHFILEID_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BATCHFILEID_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_BATCHFILEID_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BATCHFILEID_COLDATA);
		return flag;
	}
	
	public boolean BatchFileID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(OrdersAndBOLS_OrdersPageLocators.STRING_BATCHFILEID_COLHEADER, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BATCHFILEID_COLHEADER, OrdersAndBOLS_OrdersPageLocators.STRING_BATCHFILEID_COLDATA, ElementType.Xpath, OrdersAndBOLS_OrdersPageLocators.BY_BATCHFILEID_COLDATA);
		return flag;
	}
	
	
	
	
	
}
