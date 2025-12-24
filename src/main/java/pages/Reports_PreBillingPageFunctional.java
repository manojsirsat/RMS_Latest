package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_PreBillingPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_PreBillingPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports Pre Billing page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_PreBillingListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_PREBILLINGPAGE_LEFTNAV, ElementType.Xpath, Reports_PreBillingPageLocators.REPORTS_PREBILLINGPAGE_HEADING, ElementType.Xpath);
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
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_BOLID_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_BOLID_COLHEADER, Reports_PreBillingPageLocators.STRING_BOLID_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_BOLID_COLDATA);
		return flag;
	}
	
	public boolean BOLID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_BOLID_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_BOLID_COLHEADER, Reports_PreBillingPageLocators.STRING_BOLID_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_BOLID_COLDATA);
		return flag;
	}
	
	public boolean OrderID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ORDERID_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERID_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERID_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERID_COLDATA);
		return flag;
	}
	
	public boolean OrderID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ORDERID_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERID_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERID_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERID_COLDATA);
		return flag;
	}
	
	public boolean OrderType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ORDERTYPE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERTYPE_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERTYPE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERTYPE_COLDATA);
		return flag;
	}
	
	public boolean OrderType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ORDERTYPE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERTYPE_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERTYPE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERTYPE_COLDATA);
		return flag;
	}
	
	public boolean ProgramOwner_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_PROGRAMOWNER_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PROGRAMOWNER_COLHEADER, Reports_PreBillingPageLocators.STRING_PROGRAMOWNER_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PROGRAMOWNER_COLDATA);
		return flag;
	}
	
	public boolean ProgramOwner_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_PROGRAMOWNER_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PROGRAMOWNER_COLHEADER, Reports_PreBillingPageLocators.STRING_PROGRAMOWNER_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PROGRAMOWNER_COLDATA);
		return flag;
	}
	
	public boolean Program_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_PROGRAM_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PROGRAM_COLHEADER, Reports_PreBillingPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}
	
	public boolean Program_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_PROGRAM_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PROGRAM_COLHEADER, Reports_PreBillingPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}
	
	public boolean CompletedWeek_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_COMPLETEDWEEK_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_COMPLETEDWEEK_COLHEADER, Reports_PreBillingPageLocators.STRING_COMPLETEDWEEK_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_COMPLETEDWEEK_COLDATA);
		return flag;
	}
	
	public boolean CompletedWeek_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_COMPLETEDWEEK_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_COMPLETEDWEEK_COLHEADER, Reports_PreBillingPageLocators.STRING_COMPLETEDWEEK_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_COMPLETEDWEEK_COLDATA);
		return flag;
	}
	
	public boolean OrderDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_PreBillingPageLocators.BY_ORDERDATE_COLHEADER, Reports_PreBillingPageLocators.BY_ORDERDATE_COLDATA);
		return flag;
	}
	
	public boolean OrderDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_PreBillingPageLocators.BY_ORDERDATE_COLHEADER, Reports_PreBillingPageLocators.BY_ORDERDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLAssignDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_PreBillingPageLocators.BY_BOLASSIGNEDDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLASSIGNEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLAssignDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_PreBillingPageLocators.BY_BOLASSIGNEDDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLASSIGNEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLDueDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_PreBillingPageLocators.BY_BOLDUEDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLDUEDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLDueDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_PreBillingPageLocators.BY_BOLDUEDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLDUEDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_PreBillingPageLocators.BY_BOLCOMMITDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_PreBillingPageLocators.BY_BOLCOMMITDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLModifiedCommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_PreBillingPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLModifiedCommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_PreBillingPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLMODIFIEDCOMMITDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLPickUpDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_PreBillingPageLocators.BY_BOLPICKUPDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLPICKUPDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLPickUpDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_PreBillingPageLocators.BY_BOLPICKUPDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLPICKUPDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCompletedDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(Reports_PreBillingPageLocators.BY_BOLCOMPLETEDDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLCOMPLETEDDATE_COLDATA);
		return flag;
	}
	
	public boolean BOLCompletedDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(Reports_PreBillingPageLocators.BY_BOLCOMPLETEDDATE_COLHEADER, Reports_PreBillingPageLocators.BY_BOLCOMPLETEDDATE_COLDATA);
		return flag;
	}
	
	
	public boolean Customer_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_CUSTOMER_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_CUSTOMER_COLHEADER, Reports_PreBillingPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}
	
	public boolean Customer_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_CUSTOMER_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_CUSTOMER_COLHEADER, Reports_PreBillingPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}
	
	public boolean CustomerCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_CUSTOMERCODE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_CUSTOMERCODE_COLHEADER, Reports_PreBillingPageLocators.STRING_CUSTOMERCODE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_CUSTOMERCODE_COLDATA);
		return flag;
	}
	
	public boolean CustomerCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_CUSTOMERCODE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_CUSTOMERCODE_COLHEADER, Reports_PreBillingPageLocators.STRING_CUSTOMERCODE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_CUSTOMERCODE_COLDATA);
		return flag;
	}
	
	public boolean ItemSKU_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ITEMSKU_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMSKU_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMSKU_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMSKU_COLDATA);
		return flag;
	}
	
	public boolean ItemSKU_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ITEMSKU_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMSKU_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMSKU_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMSKU_COLDATA);
		return flag;
	}
	
	public boolean ItemName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ITEMNAME_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMNAME_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMNAME_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMNAME_COLDATA);
		return flag;
	}
	
	public boolean ItemName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ITEMNAME_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMNAME_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMNAME_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMNAME_COLDATA);
		return flag;
	}
	
	public boolean ItemType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ITEMTYPE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMTYPE_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMTYPE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMTYPE_COLDATA);
		return flag;
	}
	
	public boolean ItemType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ITEMTYPE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMTYPE_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMTYPE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMTYPE_COLDATA);
		return flag;
	}
	

	public boolean ItemOwner_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ITEMOWNER_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMOWNER_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMOWNER_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMOWNER_COLDATA);
		return flag;
	}
	
	public boolean ItemOwner_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ITEMOWNER_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMOWNER_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMOWNER_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMOWNER_COLDATA);
		return flag;
	}
	
	public boolean ItemOwnerCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ITEMOWNERCODE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMOWNERCODE_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMOWNERCODE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMOWNERCODE_COLDATA);
		return flag;
	}
	
	public boolean ItemOwnerCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ITEMOWNERCODE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMOWNERCODE_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMOWNERCODE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMOWNERCODE_COLDATA);
		return flag;
	}
	
	public boolean ItemQuantity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ITEMQUANTITY_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMQUANTITY_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMQUANTITY_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMQUANTITY_COLDATA);
		return flag;
	}
	
	public boolean ItemQuantity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ITEMQUANTITY_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMQUANTITY_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMQUANTITY_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMQUANTITY_COLDATA);
		return flag;
	}
	
	public boolean OrderMinApplied_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ORDERMINAPPLIED_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERMINAPPLIED_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERMINAPPLIED_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERMINAPPLIED_COLDATA);
		return flag;
	}
	
	public boolean OrderMinApplied_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ORDERMINAPPLIED_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERMINAPPLIED_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERMINAPPLIED_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERMINAPPLIED_COLDATA);
		return flag;
	}
	
	public boolean PlanMinQty_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_PLANMINQTY_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PLANMINQTY_COLHEADER, Reports_PreBillingPageLocators.STRING_PLANMINQTY_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PLANMINQTY_COLDATA);
		return flag;
	}
	
	public boolean PlanMinQty_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_PLANMINQTY_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PLANMINQTY_COLHEADER, Reports_PreBillingPageLocators.STRING_PLANMINQTY_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_PLANMINQTY_COLDATA);
		return flag;
	}
	

	public boolean ItemPriceEach_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ITEMPRICEEACH_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMPRICEEACH_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMPRICEEACH_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMPRICEEACH_COLDATA);
		return flag;
	}
	
	public boolean ItemPriceEach_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ITEMPRICEEACH_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMPRICEEACH_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMPRICEEACH_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMPRICEEACH_COLDATA);
		return flag;
	}
	
	public boolean ItemPriceTotal_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ITEMPRICETOTAL_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMPRICETOTAL_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMPRICETOTAL_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMPRICETOTAL_COLDATA);
		return flag;
	}
	
	public boolean ItemPriceTotal_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ITEMPRICETOTAL_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMPRICETOTAL_COLHEADER, Reports_PreBillingPageLocators.STRING_ITEMPRICETOTAL_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ITEMPRICETOTAL_COLDATA);
		return flag;
	}
	
	public boolean OrderSubtotal_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ORDERSUBTOTAL_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERSUBTOTAL_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERSUBTOTAL_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERSUBTOTAL_COLDATA);
		return flag;
	}
	
	public boolean OrderSubtotal_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ORDERSUBTOTAL_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERSUBTOTAL_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERSUBTOTAL_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERSUBTOTAL_COLDATA);
		return flag;
	}
	
	public boolean SpotRateType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_SPOTRATETYPE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SPOTRATETYPE_COLHEADER, Reports_PreBillingPageLocators.STRING_SPOTRATETYPE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SPOTRATETYPE_COLDATA);
		return flag;
	}
	
	public boolean SpotRateType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_SPOTRATETYPE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SPOTRATETYPE_COLHEADER, Reports_PreBillingPageLocators.STRING_SPOTRATETYPE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SPOTRATETYPE_COLDATA);
		return flag;
	}
	
	public boolean SpotRatePrice_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_SPOTRATEPRICE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SPOTRATEPRICE_COLHEADER, Reports_PreBillingPageLocators.STRING_SPOTRATEPRICE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SPOTRATEPRICE_COLDATA);
		return flag;
	}
	
	public boolean SpotRatePrice_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_SPOTRATEPRICE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SPOTRATEPRICE_COLHEADER, Reports_PreBillingPageLocators.STRING_SPOTRATEPRICE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SPOTRATEPRICE_COLDATA);
		return flag;
	}
	
	public boolean OrderFuelCost_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ORDERFUELCOST_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERFUELCOST_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERFUELCOST_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERFUELCOST_COLDATA);
		return flag;
	}
	
	public boolean OrderFuelCost_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ORDERFUELCOST_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERFUELCOST_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERFUELCOST_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERFUELCOST_COLDATA);
		return flag;
	}
	
	public boolean OrderOtherCost_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ORDEROTHERCOST_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDEROTHERCOST_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDEROTHERCOST_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDEROTHERCOST_COLDATA);
		return flag;
	}
	
	public boolean OrderOtherCost_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ORDEROTHERCOST_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDEROTHERCOST_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDEROTHERCOST_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDEROTHERCOST_COLDATA);
		return flag;
	}
	

	public boolean OrderOtherNotes_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ORDEROTHERNOTES_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDEROTHERNOTES_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDEROTHERNOTES_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDEROTHERNOTES_COLDATA);
		return flag;
	}
	
	public boolean OrderOtherNotes_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ORDEROTHERNOTES_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDEROTHERNOTES_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDEROTHERNOTES_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDEROTHERNOTES_COLDATA);
		return flag;
	}
	
	public boolean OrderTotal_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_ORDERTOTAL_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERTOTAL_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERTOTAL_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERTOTAL_COLDATA);
		return flag;
	}
	
	public boolean OrderTotal_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_ORDERTOTAL_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERTOTAL_COLHEADER, Reports_PreBillingPageLocators.STRING_ORDERTOTAL_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_ORDERTOTAL_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_SHIPPERLOCCODE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SHIPPERLOCCODE_COLHEADER, Reports_PreBillingPageLocators.STRING_SHIPPERLOCCODE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SHIPPERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_SHIPPERLOCCODE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SHIPPERLOCCODE_COLHEADER, Reports_PreBillingPageLocators.STRING_SHIPPERLOCCODE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SHIPPERLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_SHIPPERLOCNAME_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SHIPPERLOCNAME_COLHEADER, Reports_PreBillingPageLocators.STRING_SHIPPERLOCNAME_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SHIPPERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ShipperLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_SHIPPERLOCNAME_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SHIPPERLOCNAME_COLHEADER, Reports_PreBillingPageLocators.STRING_SHIPPERLOCNAME_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_SHIPPERLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCCODE_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCCODE_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCNAME_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCNAME_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocAddress_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCADDRESS_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCADDRESS_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean FromLocAddress_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCADDRESS_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCADDRESS_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean FromLocCity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCCITY_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCCITY_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCCITY_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean FromLocCity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCCITY_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCCITY_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCCITY_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean FromLocState_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCSTATE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCSTATE_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCSTATE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean FromLocState_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCSTATE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCSTATE_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCSTATE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean FromLocZip_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCZIP_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCZIP_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCZIP_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean FromLocZip_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_FROMLOCZIP_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCZIP_COLHEADER, Reports_PreBillingPageLocators.STRING_FROMLOCZIP_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_FROMLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocState_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCSTATE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCSTATE_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCSTATE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean ToLocState_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCSTATE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCSTATE_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCSTATE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean ToLocZip_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCZIP_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCZIP_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCZIP_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocZip_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCZIP_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCZIP_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCZIP_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCZIP_COLDATA);
		return flag;
	}
	
	public boolean ToLocAddress_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCADDRESS_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCADDRESS_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean ToLocAddress_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCADDRESS_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCADDRESS_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCADDRESS_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCADDRESS_COLDATA);
		return flag;
	}
	
	public boolean ToLocCity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCCITY_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCCITY_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCCITY_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean ToLocCity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCCITY_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCCITY_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCCITY_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCCODE_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCCODE_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCNAME_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_PreBillingPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCNAME_COLHEADER, Reports_PreBillingPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, Reports_PreBillingPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}
	
}
