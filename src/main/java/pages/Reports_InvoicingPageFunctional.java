package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_InvoicingPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_InvoicingPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports invoicing page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_InvoicingListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_INVOICINGPAGE_LEFTNAV, ElementType.Xpath, Reports_InvoicingPageLocators.REPORTS_INVOICINGPAGE_HEADING, ElementType.Xpath);
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
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_BOLID_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_BOLID_COLHEADER, Reports_InvoicingPageLocators.STRING_BOLID_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_BOLID_COLDATA);
		return flag;
	}
	
	public boolean BOLID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_BOLID_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_BOLID_COLHEADER, Reports_InvoicingPageLocators.STRING_BOLID_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_BOLID_COLDATA);
		return flag;
	}
	
	public boolean OrderID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ORDERID_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERID_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERID_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERID_COLDATA);
		return flag;
	}
	
	public boolean OrderID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ORDERID_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERID_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERID_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERID_COLDATA);
		return flag;
	}
	
	public boolean OrderType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ORDERTYPE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERTYPE_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERTYPE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERTYPE_COLDATA);
		return flag;
	}
	
	public boolean OrderType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ORDERTYPE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERTYPE_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERTYPE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERTYPE_COLDATA);
		return flag;
	}
	
	public boolean ProgramOwner_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_PROGRAMOWNER_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PROGRAMOWNER_COLHEADER, Reports_InvoicingPageLocators.STRING_PROGRAMOWNER_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PROGRAMOWNER_COLDATA);
		return flag;
	}
	
	public boolean ProgramOwner_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_PROGRAMOWNER_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PROGRAMOWNER_COLHEADER, Reports_InvoicingPageLocators.STRING_PROGRAMOWNER_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PROGRAMOWNER_COLDATA);
		return flag;
	}
	
	public boolean Program_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_PROGRAM_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PROGRAM_COLHEADER, Reports_InvoicingPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}
	
	public boolean Program_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_PROGRAM_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PROGRAM_COLHEADER, Reports_InvoicingPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}
	
	public boolean OrderDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_InvoicingPageLocators.BY_ORDERDATE_COLHEADER, Reports_InvoicingPageLocators.BY_ORDERDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_InvoicingPageLocators.BY_ORDERDATE_COLHEADER, Reports_InvoicingPageLocators.BY_ORDERDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLAssignDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_InvoicingPageLocators.BY_BOLASSIGNEDDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLASSIGNEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLAssignDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_InvoicingPageLocators.BY_BOLASSIGNEDDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLASSIGNEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLDueDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_InvoicingPageLocators.BY_BOLDUEDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLDUEDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLDueDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_InvoicingPageLocators.BY_BOLDUEDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLDUEDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_InvoicingPageLocators.BY_BOLCOMMITDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_InvoicingPageLocators.BY_BOLCOMMITDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLModifiedCommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_InvoicingPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLModifiedCommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_InvoicingPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLPickupWeek_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_BOLPICKUPWEEK_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_BOLPICKUPWEEK_COLHEADER, Reports_InvoicingPageLocators.STRING_BOLPICKUPWEEK_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_BOLPICKUPWEEK_COLDATA);
		return flag;
	}
	
	public boolean BOLPickupWeek_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_BOLPICKUPWEEK_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_BOLPICKUPWEEK_COLHEADER, Reports_InvoicingPageLocators.STRING_BOLPICKUPWEEK_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_BOLPICKUPWEEK_COLDATA);
		return flag;
	}
	
	public boolean BOLPickUpDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_InvoicingPageLocators.BY_BOLPICKUPDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLPICKUPDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLPickUpDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_InvoicingPageLocators.BY_BOLPICKUPDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLPICKUPDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCompletedDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_InvoicingPageLocators.BY_BOLCOMPLETEDDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLCOMPLETEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCompletedDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_InvoicingPageLocators.BY_BOLCOMPLETEDDATE_COLHEADER, Reports_InvoicingPageLocators.BY_BOLCOMPLETEDDATE_COLDATA);
		return flag;
	}
	
	
	public boolean Customer_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_CUSTOMER_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_CUSTOMER_COLHEADER, Reports_InvoicingPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}
	
	public boolean Customer_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_CUSTOMER_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_CUSTOMER_COLHEADER, Reports_InvoicingPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}
	
	public boolean CustomerCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_CUSTOMERCODE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_CUSTOMERCODE_COLHEADER, Reports_InvoicingPageLocators.STRING_CUSTOMERCODE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_CUSTOMERCODE_COLDATA);
		return flag;
	}
	
	public boolean CustomerCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_CUSTOMERCODE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_CUSTOMERCODE_COLHEADER, Reports_InvoicingPageLocators.STRING_CUSTOMERCODE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_CUSTOMERCODE_COLDATA);
		return flag;
	}
	
	public boolean ItemSKU_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ITEMSKU_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMSKU_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMSKU_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMSKU_COLDATA);
		return flag;
	}
	
	public boolean ItemSKU_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ITEMSKU_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMSKU_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMSKU_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMSKU_COLDATA);
		return flag;
	}
	
	public boolean ItemName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ITEMNAME_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMNAME_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMNAME_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMNAME_COLDATA);
		return flag;
	}
	
	public boolean ItemName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ITEMNAME_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMNAME_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMNAME_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMNAME_COLDATA);
		return flag;
	}
	
	public boolean ItemType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ITEMTYPE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMTYPE_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMTYPE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMTYPE_COLDATA);
		return flag;
	}
	
	public boolean ItemType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ITEMTYPE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMTYPE_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMTYPE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMTYPE_COLDATA);
		return flag;
	}
	

	public boolean ItemOwner_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ITEMOWNER_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMOWNER_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMOWNER_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMOWNER_COLDATA);
		return flag;
	}
	
	public boolean ItemOwner_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ITEMOWNER_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMOWNER_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMOWNER_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMOWNER_COLDATA);
		return flag;
	}
	
	public boolean ItemOwnerCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ITEMOWNERCODE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMOWNERCODE_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMOWNERCODE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMOWNERCODE_COLDATA);
		return flag;
	}
	
	public boolean ItemOwnerCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ITEMOWNERCODE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMOWNERCODE_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMOWNERCODE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMOWNERCODE_COLDATA);
		return flag;
	}
	
	public boolean ItemQuantity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ITEMQUANTITY_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMQUANTITY_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMQUANTITY_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMQUANTITY_COLDATA);
		return flag;
	}
	
	public boolean ItemQuantity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ITEMQUANTITY_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMQUANTITY_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMQUANTITY_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMQUANTITY_COLDATA);
		return flag;
	}
	
	public boolean OrderMinApplied_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ORDERMINAPPLIED_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERMINAPPLIED_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERMINAPPLIED_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERMINAPPLIED_COLDATA);
		return flag;
	}
	
	public boolean OrderMinApplied_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ORDERMINAPPLIED_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERMINAPPLIED_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERMINAPPLIED_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERMINAPPLIED_COLDATA);
		return flag;
	}
	
	public boolean PlanMinQty_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_PLANMINQTY_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PLANMINQTY_COLHEADER, Reports_InvoicingPageLocators.STRING_PLANMINQTY_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PLANMINQTY_COLDATA);
		return flag;
	}
	
	public boolean PlanMinQty_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_PLANMINQTY_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PLANMINQTY_COLHEADER, Reports_InvoicingPageLocators.STRING_PLANMINQTY_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_PLANMINQTY_COLDATA);
		return flag;
	}
	

	public boolean ItemPriceEach_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ITEMPRICEEACH_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMPRICEEACH_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMPRICEEACH_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMPRICEEACH_COLDATA);
		return flag;
	}
	
	public boolean ItemPriceEach_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ITEMPRICEEACH_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMPRICEEACH_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMPRICEEACH_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMPRICEEACH_COLDATA);
		return flag;
	}
	
	public boolean ItemPriceTotal_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ITEMPRICETOTAL_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMPRICETOTAL_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMPRICETOTAL_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMPRICETOTAL_COLDATA);
		return flag;
	}
	
	public boolean ItemPriceTotal_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ITEMPRICETOTAL_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMPRICETOTAL_COLHEADER, Reports_InvoicingPageLocators.STRING_ITEMPRICETOTAL_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ITEMPRICETOTAL_COLDATA);
		return flag;
	}
	
	public boolean OrderSubtotal_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ORDERSUBTOTAL_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERSUBTOTAL_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERSUBTOTAL_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERSUBTOTAL_COLDATA);
		return flag;
	}
	
	public boolean OrderSubtotal_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ORDERSUBTOTAL_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERSUBTOTAL_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERSUBTOTAL_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERSUBTOTAL_COLDATA);
		return flag;
	}
	
	public boolean OrderFuelCost_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ORDERFUELCOST_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERFUELCOST_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERFUELCOST_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERFUELCOST_COLDATA);
		return flag;
	}
	
	public boolean OrderFuelCost_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ORDERFUELCOST_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERFUELCOST_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERFUELCOST_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERFUELCOST_COLDATA);
		return flag;
	}
	
	public boolean OrderOtherCost_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ORDEROTHERCOST_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDEROTHERCOST_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDEROTHERCOST_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDEROTHERCOST_COLDATA);
		return flag;
	}
	
	public boolean OrderOtherCost_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ORDEROTHERCOST_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDEROTHERCOST_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDEROTHERCOST_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDEROTHERCOST_COLDATA);
		return flag;
	}
	

	public boolean OrderOtherNotes_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ORDEROTHERNOTES_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDEROTHERNOTES_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDEROTHERNOTES_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDEROTHERNOTES_COLDATA);
		return flag;
	}
	
	public boolean OrderOtherNotes_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ORDEROTHERNOTES_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDEROTHERNOTES_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDEROTHERNOTES_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDEROTHERNOTES_COLDATA);
		return flag;
	}
	
	public boolean OrderTotal_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_ORDERTOTAL_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERTOTAL_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERTOTAL_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERTOTAL_COLDATA);
		return flag;
	}
	
	public boolean OrderTotal_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_ORDERTOTAL_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERTOTAL_COLHEADER, Reports_InvoicingPageLocators.STRING_ORDERTOTAL_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_ORDERTOTAL_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_SHIPPERLOCCODE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_SHIPPERLOCCODE_COLHEADER, Reports_InvoicingPageLocators.STRING_SHIPPERLOCCODE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_SHIPPERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_SHIPPERLOCCODE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_SHIPPERLOCCODE_COLHEADER, Reports_InvoicingPageLocators.STRING_SHIPPERLOCCODE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_SHIPPERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_SHIPPERLOCNAME_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_SHIPPERLOCNAME_COLHEADER, Reports_InvoicingPageLocators.STRING_SHIPPERLOCNAME_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_SHIPPERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_SHIPPERLOCNAME_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_SHIPPERLOCNAME_COLHEADER, Reports_InvoicingPageLocators.STRING_SHIPPERLOCNAME_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_SHIPPERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCCODE_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCCODE_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCNAME_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCNAME_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocAddress_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCADDRESS_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCADDRESS_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean FromLocAddress_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCADDRESS_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCADDRESS_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean FromLocCity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCCITY_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCCITY_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCCITY_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean FromLocCity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCCITY_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCCITY_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCCITY_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean FromLocState_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCSTATE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCSTATE_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCSTATE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean FromLocState_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCSTATE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCSTATE_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCSTATE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean FromLocZip_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCZIP_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCZIP_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCZIP_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean FromLocZip_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_FROMLOCZIP_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCZIP_COLHEADER, Reports_InvoicingPageLocators.STRING_FROMLOCZIP_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_FROMLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocState_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCSTATE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCSTATE_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCSTATE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean ToLocState_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCSTATE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCSTATE_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCSTATE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean ToLocZip_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCZIP_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCZIP_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCZIP_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocZip_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCZIP_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCZIP_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCZIP_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocAddress_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCADDRESS_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCADDRESS_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean ToLocAddress_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCADDRESS_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCADDRESS_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean ToLocCity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCCITY_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCCITY_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCCITY_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean ToLocCity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCCITY_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCCITY_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCCITY_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCCODE_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCCODE_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCNAME_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_InvoicingPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCNAME_COLHEADER, Reports_InvoicingPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, Reports_InvoicingPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}

	
}
