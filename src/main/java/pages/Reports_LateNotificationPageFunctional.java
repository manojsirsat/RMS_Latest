package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_LateNotificationPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_LateNotificationPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports Late Notification page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_LateNotificationListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_LATENOTIFICATIONPAGE_LEFTNAV, ElementType.Xpath, Reports_LateNotificationPageLocators.REPORTS_LATENOTIFICATIONPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean BOLID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_BOLID_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BOLID_COLHEADER, Reports_LateNotificationPageLocators.STRING_BOLID_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BOLID_COLDATA);
		return flag;
	}
	
	public boolean BOLID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_BOLID_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BOLID_COLHEADER, Reports_LateNotificationPageLocators.STRING_BOLID_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BOLID_COLDATA);
		return flag;
	}
	
	public boolean OrderID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_ORDERID_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ORDERID_COLHEADER, Reports_LateNotificationPageLocators.STRING_ORDERID_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ORDERID_COLDATA);
		return flag;
	}
	
	public boolean OrderID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_ORDERID_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ORDERID_COLHEADER, Reports_LateNotificationPageLocators.STRING_ORDERID_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ORDERID_COLDATA);
		return flag;
	}
	
	public boolean BatchID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_BATCHID_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BATCHID_COLHEADER, Reports_LateNotificationPageLocators.STRING_BATCHID_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BATCHID_COLDATA);
		return flag;
	}
	
	public boolean BatchID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_BATCHID_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BATCHID_COLHEADER, Reports_LateNotificationPageLocators.STRING_BATCHID_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BATCHID_COLDATA);
		return flag;
	}
	
	public boolean BOLStatus_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_BOLSTATUS_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BOLSTATUS_COLHEADER, Reports_LateNotificationPageLocators.STRING_BOLSTATUS_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BOLSTATUS_COLDATA);
		return flag;
	}
	
	public boolean BOLStatus_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_BOLSTATUS_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BOLSTATUS_COLHEADER, Reports_LateNotificationPageLocators.STRING_BOLSTATUS_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_BOLSTATUS_COLDATA);
		return flag;
	}
	
	public boolean OrderType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_ORDERTYPE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ORDERTYPE_COLHEADER, Reports_LateNotificationPageLocators.STRING_ORDERTYPE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ORDERTYPE_COLDATA);
		return flag;
	}
	
	public boolean OrderType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_ORDERTYPE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ORDERTYPE_COLHEADER, Reports_LateNotificationPageLocators.STRING_ORDERTYPE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ORDERTYPE_COLDATA);
		return flag;
	}
	
	public boolean Program_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_PROGRAM_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_PROGRAM_COLHEADER, Reports_LateNotificationPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}
	
	public boolean Program_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_PROGRAM_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_PROGRAM_COLHEADER, Reports_LateNotificationPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}
	
	public boolean CompletedWeek_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_COMPLETEDWEEK_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_COMPLETEDWEEK_COLHEADER, Reports_LateNotificationPageLocators.STRING_COMPLETEDWEEK_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_COMPLETEDWEEK_COLDATA);
		return flag;
	}
	
	public boolean CompletedWeek_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_COMPLETEDWEEK_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_COMPLETEDWEEK_COLHEADER, Reports_LateNotificationPageLocators.STRING_COMPLETEDWEEK_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_COMPLETEDWEEK_COLDATA);
		return flag;
	}
	
	public boolean OrderDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_LateNotificationPageLocators.BY_ORDERDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_ORDERDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_LateNotificationPageLocators.BY_ORDERDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_ORDERDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderNeedByDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_LateNotificationPageLocators.BY_ORDERNEEDBYDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_ORDERNEEDBYDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderNeedByDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_LateNotificationPageLocators.BY_ORDERNEEDBYDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_ORDERNEEDBYDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderCreatedDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_LateNotificationPageLocators.BY_ORDERCREATEDDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_ORDERCREATEDDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderCreatedDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_LateNotificationPageLocators.BY_ORDERCREATEDDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_ORDERCREATEDDATE_COLDATA);
		return flag;
	}
	
	public boolean NotifyDays_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_NOTIFYDAYS_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_NOTIFYDAYS_COLHEADER, Reports_LateNotificationPageLocators.STRING_NOTIFYDAYS_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_NOTIFYDAYS_COLDATA);
		return flag;
	}
	
	public boolean NotifyDays_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_NOTIFYDAYS_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_NOTIFYDAYS_COLHEADER, Reports_LateNotificationPageLocators.STRING_NOTIFYDAYS_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_NOTIFYDAYS_COLDATA);
		return flag;
	}
	
	public boolean BOLAssignDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_LateNotificationPageLocators.BY_BOLASSIGNEDDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLASSIGNEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLAssignDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_LateNotificationPageLocators.BY_BOLASSIGNEDDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLASSIGNEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLDueDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_LateNotificationPageLocators.BY_BOLDUEDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLDUEDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLDueDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_LateNotificationPageLocators.BY_BOLDUEDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLDUEDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_LateNotificationPageLocators.BY_BOLCOMMITDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_LateNotificationPageLocators.BY_BOLCOMMITDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLModifiedCommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_LateNotificationPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLModifiedCommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_LateNotificationPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLPickUpDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_LateNotificationPageLocators.BY_BOLPICKUPDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLPICKUPDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLPickUpDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_LateNotificationPageLocators.BY_BOLPICKUPDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLPICKUPDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCompletedDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_LateNotificationPageLocators.BY_BOLCOMPLETEDDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLCOMPLETEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCompletedDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_LateNotificationPageLocators.BY_BOLCOMPLETEDDATE_COLHEADER, Reports_LateNotificationPageLocators.BY_BOLCOMPLETEDDATE_COLDATA);
		return flag;
	}
	
	
	public boolean Customer_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_CUSTOMER_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_CUSTOMER_COLHEADER, Reports_LateNotificationPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}
	
	public boolean Customer_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_CUSTOMER_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_CUSTOMER_COLHEADER, Reports_LateNotificationPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}
	
	public boolean ItemSKU_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_ITEMSKU_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMSKU_COLHEADER, Reports_LateNotificationPageLocators.STRING_ITEMSKU_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMSKU_COLDATA);
		return flag;
	}
	
	public boolean ItemSKU_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_ITEMSKU_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMSKU_COLHEADER, Reports_LateNotificationPageLocators.STRING_ITEMSKU_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMSKU_COLDATA);
		return flag;
	}
	
	public boolean ItemName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_ITEMNAME_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMNAME_COLHEADER, Reports_LateNotificationPageLocators.STRING_ITEMNAME_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMNAME_COLDATA);
		return flag;
	}
	
	public boolean ItemName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_ITEMNAME_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMNAME_COLHEADER, Reports_LateNotificationPageLocators.STRING_ITEMNAME_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMNAME_COLDATA);
		return flag;
	}
	
	public boolean ItemOwner_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_ITEMOWNER_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMOWNER_COLHEADER, Reports_LateNotificationPageLocators.STRING_ITEMOWNER_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMOWNER_COLDATA);
		return flag;
	}
	
	public boolean ItemOwner_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_ITEMOWNER_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMOWNER_COLHEADER, Reports_LateNotificationPageLocators.STRING_ITEMOWNER_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_ITEMOWNER_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocRefCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_SHIPPERLOCREFCODE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_SHIPPERLOCREFCODE_COLHEADER, Reports_LateNotificationPageLocators.STRING_SHIPPERLOCREFCODE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_SHIPPERLOCREFCODE_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocRefCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_SHIPPERLOCREFCODE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_SHIPPERLOCREFCODE_COLHEADER, Reports_LateNotificationPageLocators.STRING_SHIPPERLOCREFCODE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_SHIPPERLOCREFCODE_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_SHIPPERLOCNAME_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_SHIPPERLOCNAME_COLHEADER, Reports_LateNotificationPageLocators.STRING_SHIPPERLOCNAME_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_SHIPPERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_SHIPPERLOCNAME_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_SHIPPERLOCNAME_COLHEADER, Reports_LateNotificationPageLocators.STRING_SHIPPERLOCNAME_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_SHIPPERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCCODE_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCCODE_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCNAME_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCNAME_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocAddress_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCADDRESS_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCADDRESS_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean FromLocAddress_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCADDRESS_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCADDRESS_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean FromLocCity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCCITY_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCCITY_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCCITY_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean FromLocCity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCCITY_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCCITY_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCCITY_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean FromLocState_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCSTATE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCSTATE_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCSTATE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean FromLocState_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCSTATE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCSTATE_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCSTATE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean FromLocZip_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCZIP_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCZIP_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCZIP_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean FromLocZip_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_FROMLOCZIP_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCZIP_COLHEADER, Reports_LateNotificationPageLocators.STRING_FROMLOCZIP_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_FROMLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocState_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCSTATE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCSTATE_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCSTATE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean ToLocState_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCSTATE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCSTATE_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCSTATE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean ToLocZip_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCZIP_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCZIP_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCZIP_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocZip_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCZIP_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCZIP_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCZIP_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocAddress_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCADDRESS_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCADDRESS_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean ToLocAddress_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCADDRESS_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCADDRESS_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean ToLocCity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCCITY_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCCITY_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCCITY_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean ToLocCity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCCITY_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCCITY_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCCITY_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCCODE_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCCODE_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCNAME_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_LateNotificationPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCNAME_COLHEADER, Reports_LateNotificationPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, Reports_LateNotificationPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}

	
}
