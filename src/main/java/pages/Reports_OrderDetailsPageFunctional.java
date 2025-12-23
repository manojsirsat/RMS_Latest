package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_OrderDetailsPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_OrderDetailsPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports_OrderDetails page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_OrderDetailsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath, Reports_OrderDetailsPageLocators.REPORTS_ORDERDETAILSPAGE_HEADING, ElementType.Xpath);
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
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_BOLID_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BOLID_COLHEADER, Reports_OrderDetailsPageLocators.STRING_BOLID_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BOLID_COLDATA);
		return flag;
	}
	
	public boolean BOLID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_BOLID_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BOLID_COLHEADER, Reports_OrderDetailsPageLocators.STRING_BOLID_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BOLID_COLDATA);
		return flag;
	}
	
	public boolean OrderID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_ORDERID_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERID_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ORDERID_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERID_COLDATA);
		return flag;
	}
	
	public boolean OrderID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_ORDERID_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERID_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ORDERID_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERID_COLDATA);
		return flag;
	}
	
	public boolean OrderStatus_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_ORDERSTATUS_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERSTATUS_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ORDERSTATUS_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERSTATUS_COLDATA);
		return flag;
	}
	
	public boolean OrderStatus_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_ORDERSTATUS_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERSTATUS_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ORDERSTATUS_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERSTATUS_COLDATA);
		return flag;
	}
	
	public boolean BOLStatus_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_BOLSTATUS_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BOLSTATUS_COLHEADER, Reports_OrderDetailsPageLocators.STRING_BOLSTATUS_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BOLSTATUS_COLDATA);
		return flag;
	}
	
	public boolean BOLStatus_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_BOLSTATUS_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BOLSTATUS_COLHEADER, Reports_OrderDetailsPageLocators.STRING_BOLSTATUS_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BOLSTATUS_COLDATA);
		return flag;
	}
	
	public boolean OrderType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_ORDERTYPE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERTYPE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ORDERTYPE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERTYPE_COLDATA);
		return flag;
	}
	
	public boolean OrderType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_ORDERTYPE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERTYPE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ORDERTYPE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERTYPE_COLDATA);
		return flag;
	}
	
	public boolean Program_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_PROGRAM_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PROGRAM_COLHEADER, Reports_OrderDetailsPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}
	
	public boolean Program_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_PROGRAM_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PROGRAM_COLHEADER, Reports_OrderDetailsPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}
	
	public boolean CompletedWeek_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_COMPLETEDWEEK_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_COMPLETEDWEEK_COLHEADER, Reports_OrderDetailsPageLocators.STRING_COMPLETEDWEEK_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_COMPLETEDWEEK_COLDATA);
		return flag;
	}
	
	public boolean CompletedWeek_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_COMPLETEDWEEK_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_COMPLETEDWEEK_COLHEADER, Reports_OrderDetailsPageLocators.STRING_COMPLETEDWEEK_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_COMPLETEDWEEK_COLDATA);
		return flag;
	}
	
	public boolean OrderDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_OrderDetailsPageLocators.BY_ORDERDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_ORDERDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_OrderDetailsPageLocators.BY_ORDERDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_ORDERDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderNeedByDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_OrderDetailsPageLocators.BY_ORDERNEEDBYDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_ORDERNEEDBYDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderNeedByDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_OrderDetailsPageLocators.BY_ORDERNEEDBYDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_ORDERNEEDBYDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderUpdatedDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_OrderDetailsPageLocators.BY_ORDERUPDATEDDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_ORDERUPDATEDDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderUpdatedDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_OrderDetailsPageLocators.BY_ORDERUPDATEDDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_ORDERUPDATEDDATE_COLDATA);
		return flag;
	}
	
	public boolean PreBillingOverrideMinQuantity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_PREBILLINGOVERRIDEMINQTY_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PREBILLINGOVERRIDEMINQTY_COLHEADER, Reports_OrderDetailsPageLocators.STRING_PREBILLINGOVERRIDEMINQTY_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PREBILLINGOVERRIDEMINQTY_COLDATA);
		return flag;
	}
	
	public boolean PreBillingOverrideMinQuantity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_PREBILLINGOVERRIDEMINQTY_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PREBILLINGOVERRIDEMINQTY_COLHEADER, Reports_OrderDetailsPageLocators.STRING_PREBILLINGOVERRIDEMINQTY_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PREBILLINGOVERRIDEMINQTY_COLDATA);
		return flag;
	}
	
	public boolean PreBillingOverrideMinQuantityReason_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_PREBILLINGOVERRIDEMINQTYREASON_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PREBILLINGOVERRIDEMINQTYREASON_COLHEADER, Reports_OrderDetailsPageLocators.STRING_PREBILLINGOVERRIDEMINQTYREASON_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PREBILLINGOVERRIDEMINQTYREASON_COLDATA);
		return flag;
	}
	
	public boolean PreBillingOverrideMinQuantityReason_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_PREBILLINGOVERRIDEMINQTYREASON_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PREBILLINGOVERRIDEMINQTYREASON_COLHEADER, Reports_OrderDetailsPageLocators.STRING_PREBILLINGOVERRIDEMINQTYREASON_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PREBILLINGOVERRIDEMINQTYREASON_COLDATA);
		return flag;
	}
	
	public boolean BOLAssignDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_OrderDetailsPageLocators.BY_BOLASSIGNEDDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLASSIGNEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLAssignDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_OrderDetailsPageLocators.BY_BOLASSIGNEDDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLASSIGNEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLDueDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_OrderDetailsPageLocators.BY_BOLDUEDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLDUEDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLDueDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_OrderDetailsPageLocators.BY_BOLDUEDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLDUEDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_OrderDetailsPageLocators.BY_BOLCOMMITDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_OrderDetailsPageLocators.BY_BOLCOMMITDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLModifiedCommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_OrderDetailsPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLModifiedCommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_OrderDetailsPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLPickUpDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_OrderDetailsPageLocators.BY_BOLPICKUPDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLPICKUPDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLPickUpDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_OrderDetailsPageLocators.BY_BOLPICKUPDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLPICKUPDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCompletedDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_OrderDetailsPageLocators.BY_BOLCOMPLETEDDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLCOMPLETEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCompletedDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_OrderDetailsPageLocators.BY_BOLCOMPLETEDDATE_COLHEADER, Reports_OrderDetailsPageLocators.BY_BOLCOMPLETEDDATE_COLDATA);
		return flag;
	}
	
	
	public boolean Customer_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_CUSTOMER_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_CUSTOMER_COLHEADER, Reports_OrderDetailsPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}
	
	public boolean Customer_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_CUSTOMER_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_CUSTOMER_COLHEADER, Reports_OrderDetailsPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}
	
	public boolean ItemSKU_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_ITEMSKU_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ITEMSKU_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ITEMSKU_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ITEMSKU_COLDATA);
		return flag;
	}
	
	public boolean ItemSKU_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_ITEMSKU_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ITEMSKU_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ITEMSKU_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ITEMSKU_COLDATA);
		return flag;
	}
	
	public boolean ItemName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_ITEMNAME_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ITEMNAME_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ITEMNAME_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ITEMNAME_COLDATA);
		return flag;
	}
	
	public boolean ItemName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_ITEMNAME_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ITEMNAME_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ITEMNAME_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ITEMNAME_COLDATA);
		return flag;
	}
	
	public boolean ProgramOwner_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_PROGRAMOWNER_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PROGRAMOWNER_COLHEADER, Reports_OrderDetailsPageLocators.STRING_PROGRAMOWNER_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PROGRAMOWNER_COLDATA);
		return flag;
	}
	
	public boolean ProgramOwner_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_PROGRAMOWNER_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PROGRAMOWNER_COLHEADER, Reports_OrderDetailsPageLocators.STRING_PROGRAMOWNER_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_PROGRAMOWNER_COLDATA);
		return flag;
	}
	
	public boolean ShipMethod_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_SHIPMETHOD_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPMETHOD_COLHEADER, Reports_OrderDetailsPageLocators.STRING_SHIPMETHOD_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPMETHOD_COLDATA);
		return flag;
	}
	
	public boolean ShipMethod_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_SHIPMETHOD_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPMETHOD_COLHEADER, Reports_OrderDetailsPageLocators.STRING_SHIPMETHOD_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPMETHOD_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocRefCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_SHIPPERLOCREFCODE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPPERLOCREFCODE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_SHIPPERLOCREFCODE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPPERLOCREFCODE_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocRefCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_SHIPPERLOCREFCODE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPPERLOCREFCODE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_SHIPPERLOCREFCODE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPPERLOCREFCODE_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_SHIPPERLOCNAME_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPPERLOCNAME_COLHEADER, Reports_OrderDetailsPageLocators.STRING_SHIPPERLOCNAME_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPPERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_SHIPPERLOCNAME_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPPERLOCNAME_COLHEADER, Reports_OrderDetailsPageLocators.STRING_SHIPPERLOCNAME_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_SHIPPERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCCODE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCCODE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCNAME_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCNAME_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocAddress_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCADDRESS_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCADDRESS_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean FromLocAddress_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCADDRESS_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCADDRESS_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean FromLocCity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCCITY_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCCITY_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCCITY_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean FromLocCity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCCITY_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCCITY_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCCITY_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean FromLocState_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCSTATE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCSTATE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCSTATE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean FromLocState_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCSTATE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCSTATE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCSTATE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean FromLocZip_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCZIP_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCZIP_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCZIP_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean FromLocZip_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_FROMLOCZIP_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCZIP_COLHEADER, Reports_OrderDetailsPageLocators.STRING_FROMLOCZIP_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_FROMLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean Zone_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ZONE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Zone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ZONE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean ToLocState_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCSTATE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCSTATE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCSTATE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean ToLocState_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCSTATE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCSTATE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCSTATE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean ToLocZip_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCZIP_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCZIP_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCZIP_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocZip_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCZIP_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCZIP_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCZIP_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocAddress_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCADDRESS_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCADDRESS_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean ToLocAddress_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCADDRESS_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCADDRESS_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean ToLocCity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCCITY_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCCITY_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCCITY_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean ToLocCity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCCITY_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCCITY_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCCITY_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCCODE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCCODE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCNAME_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCNAME_COLHEADER, Reports_OrderDetailsPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}
	
	
	public boolean CustomerPO_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_CUSTOMERPO_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_CUSTOMERPO_COLHEADER, Reports_OrderDetailsPageLocators.STRING_CUSTOMERPO_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_CUSTOMERPO_COLDATA);
		return flag;
	}
	
	public boolean CustomerPO_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_CUSTOMERPO_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_CUSTOMERPO_COLHEADER, Reports_OrderDetailsPageLocators.STRING_CUSTOMERPO_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_CUSTOMERPO_COLDATA);
		return flag;
	}
	
	public boolean OrderCreatedBy_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_ORDERCREATEDBY_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERCREATEDBY_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ORDERCREATEDBY_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERCREATEDBY_COLDATA);
		return flag;
	}
	
	public boolean OrderCreatedBy_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_ORDERCREATEDBY_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERCREATEDBY_COLHEADER, Reports_OrderDetailsPageLocators.STRING_ORDERCREATEDBY_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_ORDERCREATEDBY_COLDATA);
		return flag;
	}
	
	public boolean AutoAssignEligible_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_AUTOASSIGNELIGIBLE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_AUTOASSIGNELIGIBLE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_AUTOASSIGNELIGIBLE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_AUTOASSIGNELIGIBLE_COLDATA);
		return flag;
	}
	
	public boolean AutoAssignEligible_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_AUTOASSIGNELIGIBLE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_AUTOASSIGNELIGIBLE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_AUTOASSIGNELIGIBLE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_AUTOASSIGNELIGIBLE_COLDATA);
		return flag;
	}
	
	public boolean BatchFileID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_BATCHFILEID_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BATCHFILEID_COLHEADER, Reports_OrderDetailsPageLocators.STRING_BATCHFILEID_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BATCHFILEID_COLDATA);
		return flag;
	}
	
	public boolean BatchFileID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_BATCHFILEID_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BATCHFILEID_COLHEADER, Reports_OrderDetailsPageLocators.STRING_BATCHFILEID_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BATCHFILEID_COLDATA);
		return flag;
	}
	
	public boolean BatchFileNote_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_OrderDetailsPageLocators.STRING_BATCHFILENOTE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BATCHFILENOTE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_BATCHFILENOTE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BATCHFILENOTE_COLDATA);
		return flag;
	}
	
	public boolean BatchFileNote_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_OrderDetailsPageLocators.STRING_BATCHFILENOTE_COLHEADER, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BATCHFILENOTE_COLHEADER, Reports_OrderDetailsPageLocators.STRING_BATCHFILENOTE_COLDATA, ElementType.Xpath, Reports_OrderDetailsPageLocators.BY_BATCHFILENOTE_COLDATA);
		return flag;
	}
	
	
}
