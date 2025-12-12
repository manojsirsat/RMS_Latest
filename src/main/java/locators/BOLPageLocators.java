package locators;

import org.openqa.selenium.By;

public class BOLPageLocators 
{
	//Add BOL flow locators
	/**XPATH*/ public static final String BOLPAGE_HEADING = "//div[text()='Bills of Lading']";
	/**ID*/ public static final String CREATE_NEWBOL_BUTTON = "create-bol-button";
	/**XPATH*/ public static final String CREATE_NEWBOLPAGE_HEADING = "//h2[text()='Create Bill of Lading']";
	/**XPATH*/ public static final String FROM_LOC_DROPDOWN = "//div[@class='p-autocomplete p-component p-inputwrapper p-autocomplete-dd w-full inputfield' and @id='from-location-dropdown']";
	/**XPATH*/ public static final String FROM_LOC_DRP_OPTION = "//ul[@class='p-autocomplete-items p-virtualscroller-content' and @id='from-location-dropdown_list']";
	/**XPATH*/ public static final String FROM_LOC_DRP_OPTIONS_LIST = "(//ul[@class='p-autocomplete-items p-virtualscroller-content' and @id='from-location-dropdown_list']//li)";

	
	/**XPATH*/ public static final String TO_LOC_DROPDOWN = "//div[@class='p-autocomplete p-component p-inputwrapper p-autocomplete-dd w-full inputfield' and @id='to-location-dropdown']";
	/**XPATH*/ public static final String TO_LOC_DRP_OPTION = "//ul[@class='p-autocomplete-items p-virtualscroller-content' and @id='to-location-dropdown_list']";
	/**XPATH*/ public static final String TO_LOC_DRP_OPTIONS_LIST = "(//ul[@class='p-autocomplete-items p-virtualscroller-content' and @id='to-location-dropdown_list']//li)";

	/**XPATH*/ public static final String SHIPMETHOD_DROPDOWN = "//div[@class='p-autocomplete p-component p-inputwrapper p-autocomplete-dd w-full inputfield' and @id='transit-types-dropdown']";
	/**XPATH*/ public static final String SHIPMETHOD_DRP_OPTION = "//ul[@class='p-autocomplete-items' and @id='transit-types-dropdown_list']";
	/**XPATH*/ public static final String SHIPMETHOD_DRP_OPTIONS_LIST = "(//ul[@class='p-autocomplete-items' and @id='transit-types-dropdown_list']//li)[1]";
	
	/**XPATH*/ public static final String SHIPPER_DROPDOWN = "//div[@class='p-autocomplete p-component p-inputwrapper p-autocomplete-dd w-full inputfield' and @id='shipper']";
	 														//div[@class='p-autocomplete p-component p-inputwrapper p-autocomplete-dd p-overlay-open w-full inputfield' and @id='shipper']
	/**XPATH*/ public static final String SHIPPER_DRP_OPTION = "//ul[@class='p-autocomplete-items' and @id='shipper_list']";
	/**XPATH*/ public static final String SHIPPER_DRP_OPTIONS_LIST = "(//ul[@class='p-autocomplete-items' and @id='shipper_list']//li)";

	/**ID*/ public static final String SUBMIT_BOL_BUTTON = "submit-bill-of-lading-button";
	/**XPATH*/ public static final String BOL_SUCCESS_MSG = "//div[text()='Bill of Lading created successfully']";
	
	//Add Order to BOL flow locators
	/**XPATH*/ public static final String ADD_ORDER_BUTTON_BOLPAGE = "//div[@class='float-right mb-2']/button";
	
	/**XPATH*/ public static final String CREATE_NEWORDER_BUTTON = "//button[text()='Create A New Order']";
	
	/**ID*/ public static final String ORDERTYPE_DROPDOWN = "order-types-dropdown";
	/**ID*/ public static final String ORDERTYPE_DRP_OPTION = "order-types-dropdown_list";
	/**XPATH*/ public static final String ORDERTYPE_DRP_OPTIONS_LIST = "(//ul[@id='order-types-dropdown_list']//li)";

	/**ID*/ public static final String PROGRAM_DROPDOWN = "program-dropdown";
	/**ID*/ public static final String PROGRAM_DRP_OPTION = "program-dropdown_list";
	/**XPATH*/ public static final String PROGRAM_DRP_OPTIONS_LIST = "(//ul[@id='program-dropdown_list']//li)";

	/**XPATH*/ public static final String QUANTITY_REQUESTED_INPUTFIELD = "//span[@id='requested-quantity-input-0']/input";
	/**XPATH*/ public static final String SUBMIT_ORDER_BTN = "//button[@class='p-button p-component p-button-success']";

	/**XPATH*/ public static final String REMOVE_ORDERFROMBOL_BTN = "//button[@class='p-button p-component p-button-danger']";
//	/**XPATH*/ public static final String BOL_NUMBER_FROM_BOLDETAILSPAGE = "//div[@class='max-w-full prose']//h2";
	/**XPATH*/ public static final String BOL_NUMBER_FROM_BOLDETAILSPAGE = "(//h2)[1]";
	
	//Set BOL status
	/**XPATH*/ public static final String BOL_NUMBER_FROM_LISTINGPAGE = "(//tbody[@class='p-datatable-tbody']/tr/td)[2]/a";
	/**XPATH*/ public static final String BOL_CHANGESTATUS = "(//tbody[@class='p-datatable-tbody']/tr/td)[6]";
	/**XPATH*/ public static final String BOL_STATUSCHANGE_DRP = "(//span[@class='p-dropdown-label p-inputtext p-placeholder' and @aria-label='Set BOL Status'])[1]";
	/**XPATH*/ public static final String BOL_STATUSCHANGE_DRP_OPTIONS = "(//ul[@class='p-dropdown-items']//li)";
	/**XPATH*/ public static final String BOL_STATUSCHANGE_CONFIRMATIONPOPUP_YES_BTN = "//button[@class='p-button p-component p-button-text' and @aria-label='Yes']";
	/**XPATH*/ public static final String BOL_STATUSCHANGE_CONFIRMATION_MSG = "(//span[@class='p-toast-summary' and text()='Success'])[1]";
	

	// Add order to BOL from Order details page
	/**XPATH*/ public static final String ADD_ORDER_TO_BOL_BTN_ORDERDETAILSPAGE = "//button[@aria-label='Add Order to BOL']";
	/**XPATH*/ public static final String CREATE_NEWBOLPAGE_HEADING_ORDERDETAILSPAGE = "//h2[text()='Create New Bill of Lading for Order']";
	/**XPATH*/ public static final String BOL_NUMBER_FROM_ORDERDETAILSPAGE = "//div[@class='prose mb-2']/a";
	
	
	
	/**XPATH*/ public static final String ADD_ORDER_TO_BOL_BTN_BOLCREATEPAGE = "(//button[text()='Add Order To BOL'])[1]";
	
	/**XPATH*/ public static final String MARKBOLCOMPLETE_BTN_BOLCOMPLETEPAGE = "//button[@class='p-button p-component p-button-success']";
	/**XPATH*/ public static final String MARKBOLCOMPLETE_POPUP_BOLCOMPLETEPAGE = "//div[@class='p-dialog-header']";
	/**XPATH*/ public static final String MARKBOLCOMPLETE_PRIMARYREASONLABEL_BOLCOMPLETEPAGE = "//span[text()='Primary Reason']";
	/**XPATH*/ public static final String MARKBOLCOMPLETE_YES_BOLCOMPLETEPAGE = "//span[text()='Yes']";
	/**XPATH*/ public static final String WIP_INPUTFIELD_BOLCOMPLETEPAGE = "(//span[@class='p-inputnumber p-component p-inputwrapper p-inputwrapper-filled w-full'])[1]";
	
	
	// Sorting
	/**By*/ public static final By BY_BOL_COLHEADER = By.xpath("//th[contains(.,'BOL #')]");
	/**By*/ public static final By BY_BOL_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_BOL_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_BOL_COLHEADER = "//th[contains(.,'BOL #')]";
	/**XPATH*/ public static final String STRING_BOL_RESULTDATA = "(//table/tbody/tr/td[2])[1]";
	/**XPATH*/ public static final String STRING_BOL_INPUTFIELD_FILTER = "//*[@id='lading-bill-filter-input']";
		
	/**By*/ public static final By BY_URGENT_COLHEADER = By.xpath("//th[contains(.,'Urgent')]");
	/**By*/ public static final By BY_URGENT_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_URGENT_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_URGENT_COLHEADER = "//th[contains(.,'Urgent')]";
	
	/**By*/ public static final By BY_TYPE_COLHEADER = By.xpath("//th[contains(.,'Type')]");
	/**By*/ public static final By BY_TYPE_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_TYPE_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_TYPE_COLHEADER = "//th[contains(.,'Type')]";
	
	/**By*/ public static final By BY_CURRENTSTATUS_COLHEADER = By.xpath("//th[contains(.,'Current Status')]");
	/**By*/ public static final By BY_CURRENTSTATUS_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_CURRENTSTATUS_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_CURRENTSTATUS_COLHEADER = "//th[contains(.,'Current Status')]";
	
	/**By*/ public static final By BY_DUEDATE_COLHEADER = By.xpath("//th[contains(.,'Due Date')]");
	/**By*/ public static final By BY_DUEDATE_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_DUEDATE_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_DUEDATE_COLHEADER = "//th[contains(.,'Due Date')]";
	
	/**By*/ public static final By BY_SHIPMETHOD_COLHEADER = By.xpath("//th[contains(.,'Ship Method')]");
	/**By*/ public static final By BY_SHIPMETHOD_COLDATA = By.xpath("//table/tbody/tr/td[8]");
	/**XPATH*/ public static final String STRING_SHIPMETHOD_COLDATA = "//table/tbody/tr/td[8]";
	/**XPATH*/ public static final String STRING_SHIPMETHOD_COLHEADER = "//th[contains(.,'Ship Method')]";
	
	/**By*/ public static final By BY_SHIPPEDBYLOCCODE_COLHEADER = By.xpath("//th[contains(.,'Shipped By Loc Code')]");
	/**By*/ public static final By BY_SHIPPEDBYLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[9]");
	/**XPATH*/ public static final String STRING_SHIPPEDBYLOCCODE_COLDATA = "//table/tbody/tr/td[9]";
	/**XPATH*/ public static final String STRING_SHIPPEDBYLOCCODE_COLHEADER = "//th[contains(.,'Shipped By Loc Code')]";
	
	/**By*/ public static final By BY_SHIPPEDBYLOCNAME_COLHEADER = By.xpath("//th[contains(.,'Shipped By Loc Name')]");
	/**By*/ public static final By BY_SHIPPEDBYLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/**XPATH*/ public static final String STRING_SHIPPEDBYLOCNAME_COLDATA = "//table/tbody/tr/td[10]";
	/**XPATH*/ public static final String STRING_SHIPPEDBYLOCNAME_COLHEADER = "//th[contains(.,'Shipped By Loc Name')]";
	
	/**By*/ public static final By BY_DEFAULTZONE_COLHEADER = By.xpath("//th[contains(.,'Default Zone')]");
	/**By*/ public static final By BY_DEFAULTZONE_COLDATA = By.xpath("//table/tbody/tr/td[11]");
	/**XPATH*/ public static final String STRING_DEFAULTZONE_COLDATA = "//table/tbody/tr/td[11]";
	/**XPATH*/ public static final String STRING_DEFAULTZONE_COLHEADER = "//th[contains(.,'Default Zone')]";
	
	/**By*/ public static final By BY_FROMLOCCODE_COLHEADER = By.xpath("//th[contains(.,'From Loc Code')]");
	/**By*/ public static final By BY_FROMLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[12]");
	/**XPATH*/ public static final String STRING_FROMLOCCODE_COLDATA = "//table/tbody/tr/td[12]";
	/**XPATH*/ public static final String STRING_FROMLOCCODE_COLHEADER = "//th[contains(.,'From Loc Code')]";
	
	/**By*/ public static final By BY_FROMLOCNAME_COLHEADER = By.xpath("//th[contains(.,'From Loc Name')]");
	/**By*/ public static final By BY_FROMLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[13]");
	/**XPATH*/ public static final String STRING_FROMLOCNAME_COLDATA = "//table/tbody/tr/td[13]";
	/**XPATH*/ public static final String STRING_FROMLOCNAME_COLHEADER = "//th[contains(.,'From Loc Name')]";
	
	/**By*/ public static final By BY_FROMLOCCITY_COLHEADER = By.xpath("//th[contains(.,'From Loc City')]");
	/**By*/ public static final By BY_FROMLOCCITY_COLDATA = By.xpath("//table/tbody/tr/td[14]");
	/**XPATH*/ public static final String STRING_FROMLOCCITY_COLDATA = "//table/tbody/tr/td[14]";
	/**XPATH*/ public static final String STRING_FROMLOCCITY_COLHEADER = "//th[contains(.,'From Loc City')]";
	
	/**By*/ public static final By BY_FROMLOCSTATE_COLHEADER = By.xpath("//th[contains(.,'From Loc State')]");
	/**By*/ public static final By BY_FROMLOCSTATE_COLDATA = By.xpath("//table/tbody/tr/td[15]");
	/**XPATH*/ public static final String STRING_FROMLOCSTATE_COLDATA = "//table/tbody/tr/td[15]";
	/**XPATH*/ public static final String STRING_FROMLOCSTATE_COLHEADER = "//th[contains(.,'From Loc State')]";
	
	/**By*/ public static final By BY_TOLOCCODE_COLHEADER = By.xpath("//th[contains(.,'To Loc Code')]");
	/**By*/ public static final By BY_TOLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[16]");
	/**XPATH*/ public static final String STRING_TOLOCCODE_COLDATA = "//table/tbody/tr/td[16]";
	/**XPATH*/ public static final String STRING_TOLOCCODE_COLHEADER = "//th[contains(.,'To Loc Code')]";
	
	/**By*/ public static final By BY_TOLOCNAME_COLHEADER = By.xpath("//th[contains(.,'To Loc Name')]");
	/**By*/ public static final By BY_TOLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[17]");
	/**XPATH*/ public static final String STRING_TOLOCNAME_COLDATA = "//table/tbody/tr/td[17]";
	/**XPATH*/ public static final String STRING_TOLOCNAME_COLHEADER = "//th[contains(.,'To Loc Name')]";
	
	/**By*/ public static final By BY_ASSIGNDATE_COLHEADER = By.xpath("//th[contains(.,'Assign Date')]");
	/**By*/ public static final By BY_ASSIGNDATE_COLDATA = By.xpath("//table/tbody/tr/td[18]");
	/**XPATH*/ public static final String STRING_ASSIGNDATE_COLDATA = "//table/tbody/tr/td[18]";
	/**XPATH*/ public static final String STRING_ASSIGNDATE_COLHEADER = "//th[contains(.,'Assign Date')]";
	
	/**By*/ public static final By BY_COMMITNDATE_COLHEADER = By.xpath("(//th[contains(.,'Commit Date')])[1]");
	/**By*/ public static final By BY_COMMITNDATE_COLDATA = By.xpath("//table/tbody/tr/td[19]");
	/**XPATH*/ public static final String STRING_COMMITNDATE_COLDATA = "//table/tbody/tr/td[19]";
	/**XPATH*/ public static final String STRING_COMMITNDATE_COLHEADER = "(//th[contains(.,'Commit Date')])[1]";
	
	/**By*/ public static final By BY_MODCOMMITNDATE_COLHEADER = By.xpath("//th[contains(.,'Mod Commit Date')]");
	/**By*/ public static final By BY_MODCOMMITNDATE_COLDATA = By.xpath("//table/tbody/tr/td[20]");
	/**XPATH*/ public static final String STRING_MODCOMMITNDATE_COLDATA = "//table/tbody/tr/td[20]";
	/**XPATH*/ public static final String STRING_MODCOMMITNDATE_COLHEADER = "//th[contains(.,'Mod Commit Date')]";
	
	/**By*/ public static final By BY_SCHEDULEDSHIPDATE_COLHEADER = By.xpath("//th[contains(.,'Scheduled Ship Date')]");
	/**By*/ public static final By BY_SCHEDULEDSHIPDATE_COLDATA = By.xpath("//table/tbody/tr/td[21]");
	/**XPATH*/ public static final String STRING_SCHEDULEDSHIPDATE_COLDATA = "//table/tbody/tr/td[21]";
	/**XPATH*/ public static final String STRING_SCHEDULEDSHIPDATE_COLHEADER = "//th[contains(.,'Scheduled Ship Date')]";
	
	/**By*/ public static final By BY_PICKUPDATE_COLHEADER = By.xpath("//th[contains(.,'Pickup Date')]");
	/**By*/ public static final By BY_PICKUPDATE_COLDATA = By.xpath("//table/tbody/tr/td[22]");
	/**XPATH*/ public static final String STRING_PICKUPDATE_COLDATA = "//table/tbody/tr/td[22]";
	/**XPATH*/ public static final String STRING_PICKUPDATE_COLHEADER = "//th[contains(.,'Pickup Date')]";
	
	/**By*/ public static final By BY_ESTIMATEDDELIVERYDATE_COLHEADER = By.xpath("//th[contains(.,'Estimated Delivery Date')]");
	/**By*/ public static final By BY_ESTIMATEDDELIVERYDATE_COLDATA = By.xpath("//table/tbody/tr/td[23]");
	/**XPATH*/ public static final String STRING_ESTIMATEDDELIVERYDATE_COLDATA = "//table/tbody/tr/td[23]";
	/**XPATH*/ public static final String STRING_ESTIMATEDDELIVERYDATE_COLHEADER = "//th[contains(.,'Estimated Delivery Date')]";
	
	/**By*/ public static final By BY_DELIVEREDDATE_COLHEADER = By.xpath("//th[contains(.,'Delivered Date')]");
	/**By*/ public static final By BY_DELIVEREDDATE_COLDATA = By.xpath("//table/tbody/tr/td[24]");
	/**XPATH*/ public static final String STRING_DELIVEREDDATE_COLDATA = "//table/tbody/tr/td[24]";
	/**XPATH*/ public static final String STRING_DELIVEREDDATE_COLHEADER = "//th[contains(.,'Delivered Date')]";
	
	/**By*/ public static final By BY_COMPLETEDDATE_COLHEADER = By.xpath("//th[contains(.,'Completed Date')]");
	/**By*/ public static final By BY_COMPLETEDDATE_COLDATA = By.xpath("//table/tbody/tr/td[25]");
	/**XPATH*/ public static final String STRING_COMPLETEDDATE_COLDATA = "//table/tbody/tr/td[25]";
	/**XPATH*/ public static final String STRING_COMPLETEDDATE_COLHEADER = "//th[contains(.,'Completed Date')]";
	
	/**By*/ public static final By BY_QUOTE_COLHEADER = By.xpath("//th[contains(.,'Quote')]");
	/**By*/ public static final By BY_QUOTE_COLDATA = By.xpath("//table/tbody/tr/td[26]");
	/**XPATH*/ public static final String STRING_QUOTE_COLDATA = "//table/tbody/tr/td[26]";
	/**XPATH*/ public static final String STRING_QUOTE_COLHEADER = "//th[contains(.,'Quote')]";
	
	/**By*/ public static final By BY_TENDER_COLHEADER = By.xpath("//th[contains(.,'Tender')]");
	/**By*/ public static final By BY_TENDER_COLDATA = By.xpath("//table/tbody/tr/td[27]");
	/**XPATH*/ public static final String STRING_TENDER_COLDATA = "//table/tbody/tr/td[27]";
	/**XPATH*/ public static final String STRING_TENDER_COLHEADER = "//th[contains(.,'Tender')]";
	
	/**By*/ public static final By BY_SHIPMENT_COLHEADER = By.xpath("//th[contains(.,'Shipment')]");
	/**By*/ public static final By BY_SHIPMENT_COLDATA = By.xpath("//table/tbody/tr/td[28]");
	/**XPATH*/ public static final String STRING_SHIPMENT_COLDATA = "//table/tbody/tr/td[28]";
	/**XPATH*/ public static final String STRING_SHIPMENT_COLHEADER = "//th[contains(.,'Shipment')]";
	
	/**By*/ public static final By BY_AUTOASSIGNELIGIBLE_COLHEADER = By.xpath("//th[contains(.,'Auto-Assign Eligible')]");
	/**By*/ public static final By BY_AUTOASSIGNELIGIBLE_COLDATA = By.xpath("//table/tbody/tr/td[29]");
	/**XPATH*/ public static final String STRING_AUTOASSIGNELIGIBLE_COLDATA = "//table/tbody/tr/td[29]";
	/**XPATH*/ public static final String STRING_AUTOASSIGNELIGIBLE_COLHEADER = "//th[contains(.,'Auto-Assign Eligible')]";
	
	/**By*/ public static final By BY_SHIPPEDBYACCOUNT_COLHEADER = By.xpath("//th[contains(.,'Shipped By Account')]");
	/**By*/ public static final By BY_SHIPPEDBYACCOUNT_COLDATA = By.xpath("//table/tbody/tr/td[30]");
	/**XPATH*/ public static final String STRING_SHIPPEDBYACCOUNT_COLDATA = "//table/tbody/tr/td[30]";
	/**XPATH*/ public static final String STRING_SHIPPEDBYACCOUNT_COLHEADER = "//th[contains(.,'Shipped By Account')]";
	
	
	// Filter
	//BOL Search and Table locators
	/**XPATH*/ public static final String BOL_SEARCH_FILTER = "//*[@id='lading-bill-filter-input']";
	/**XPATH*/ public static final String BOL_SEARCH_FILTER_ALTERNATIVE = "//div[contains(@class,'p-column-filter')]//input[@class='p-inputtext p-component']";
	/**XPATH*/ public static final String BOL_TABLE_FIRST_ROW = "//*[@id='ladingBillsDataTable']/div[2]/table/tbody/tr[1]/td[2]/a";
	/**XPATH*/ public static final String BOL_TABLE = "//*[@id='ladingBillsDataTable']";
	/**XPATH*/ public static final String VIEW_RESULT_BUTTON = "//*[@id='view_result_button']";
	
	
	
	
	
	
	
	
}
