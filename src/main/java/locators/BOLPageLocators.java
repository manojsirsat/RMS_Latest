package locators;

public class BOLPageLocators 
{
	//Add BOL flow locators
	/**XPATH*/ public static final String BOLPAGE_HEADING = "//div[contains(text(),'Bills of Lading')]";
	/**ID*/ public static final String CREATE_NEWBOL_BUTTON = "create-bol-button";
	
	//BOL Search and Table locators
	/**XPATH*/ public static final String BOL_SEARCH_FILTER = "//*[@id='lading-bill-filter-input']";
	/**XPATH*/ public static final String BOL_SEARCH_FILTER_ALTERNATIVE = "//div[contains(@class,'p-column-filter')]//input[@class='p-inputtext p-component']";
	/**XPATH*/ public static final String BOL_TABLE_FIRST_ROW = "//*[@id='ladingBillsDataTable']/div[2]/table/tbody/tr[1]/td[2]/a";
	/**XPATH*/ public static final String BOL_TABLE_FIRST_ROW_FROM_LOCATION = "//*[@id='ladingBillsDataTable']/div[2]/table/tbody/tr/td[15]";
	/**XPATH*/ public static final String BOL_TABLE_FIRST_ROW_TO_LOCATION_PART1 = "//*[@id='ladingBillsDataTable']/div[2]/table/tbody/tr/td[16]";
	/**XPATH*/ public static final String BOL_TABLE_FIRST_ROW_TO_LOCATION_PART2 = "//*[@id='ladingBillsDataTable']/div[2]/table/tbody/tr/td[17]";
	/**XPATH*/ public static final String NO_DATA_MESSAGE = "//*[@id='ladingBillsDataTable']/div[2]/table/tbody/tr/td";
	/**XPATH*/ public static final String BOL_TABLE = "//*[@id='ladingBillsDataTable']";
	/**XPATH*/ public static final String CREATE_NEWBOLPAGE_HEADING = "//h2[text()='Create Bill of Lading']";
    /**ID*/ public static final String FROM_LOC_DROPDOWN = "from-location-dropdown";
	/**ID*/ public static final String FROM_LOC_DRP_OPTION = "from-location-dropdown_list";
	/**XPATH*/ public static final String FROM_LOC_DRP_OPTIONS_LIST = "(//ul[@id='from-location-dropdown_list']//li)";
    /**ID*/ public static final String BOL_FROM_LOC_DROPDOWN = "//*[@id='origin-location-state-autocomplete']";
	/**ID*/ public static final String BOL_FROM_LOC_DRP_OPTION = "//ul[@id='origin-location-state-autocomplete_list']";
	/**XPATH*/ public static final String BOL_FROM_LOC_DRP_OPTIONS_LIST = "(//ul[@id='origin-location-state-autocomplete_list']//li)";

    /**ID*/ public static final String BOL_TO_LOC_DROPDOWN = "//*[@id='destination-location-autocomplete']";
	/**ID*/ public static final String BOL_TO_LOC_DRP_OPTION = "//ul[@id='destination-location-autocomplete_list']";
	/**XPATH*/ public static final String BOL_TO_LOC_DRP_OPTIONS_LIST = "(//ul[@id='destination-location-autocomplete_list']//li)";
	/**XPATH*/ public static final String BOL_CURRENTSTATUS_DRP = "//*[@id='status-multi-select']/div[3]";
	/**XPATH*/ public static final String BOL_COMPLETEDSTATUS_DRP = "//*[@id='status-multi-select_3']";
	/**XPATH*/ public static final String BOL_CALENDARSTARTDATE = "//*[@id='completed-date-calendar_panel']/div[2]/button[1]";
	/**XPATH*/ public static final String BOL_CALENDARENDDATE = "//*[@id='completed-date-calendar_panel']/div[2]/button[1]";
	

	// BOLPageLocators.java

	public static final String COMPLETE_DATE_PICKER = "//*[@id='completed-date-calendar']/input";
	public static final String PAGINATION_TEXT = "//span[contains(text(),'Showing') and contains(text(),'of')]";


	/**ID*/ public static final String TO_LOC_DROPDOWN = "to-location-dropdown";
	/**ID*/ public static final String TO_LOC_DRP_OPTION = "to-location-dropdown_list";
	/**XPATH*/ public static final String TO_LOC_DRP_OPTIONS_LIST = "(//ul[@id='to-location-dropdown_list']//li)";

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
	/**XPATH*/ public static final String BOL_NUMBER_FROM_BOLDETAILSPAGE = "//h2[contains(text(), 'Bill of Lading')]";
	//Set BOL status
	/**XPATH*/ public static final String BOL_NUMBER_FROM_LISTINGPAGE = "((//tr[@class='p-selectable-row'])[1]//td)[2]/a";
	/**XPATH*/ public static final String BOL_CHANGESTATUS = "((//tr[@class='p-selectable-row'])[1]//td)[6]";
	/**XPATH*/ public static final String BOL_STATUSCHANGE_DRP = "(//span[@class='p-dropdown-label p-inputtext p-placeholder' and @aria-label='Set BOL Status'])[1]";
	/**XPATH*/ public static final String BOL_STATUSCHANGE_DRP_OPTIONS = "(//ul[@class='p-dropdown-items']//li)";
	/**XPATH*/ public static final String BOL_STATUSCHANGE_CONFIRMATIONPOPUP_YES_BTN = "//button[@class='p-button p-component p-button-text' and @aria-label='Yes']";
	/**XPATH*/ public static final String BOL_STATUSCHANGE_CONFIRMATION_MSG = "(//span[@class='p-toast-summary' and text()='Success'])[1]";
	

	// Add order to BOL from Order details page
	/**XPATH*/ public static final String ADD_ORDER_TO_BOL_BTN_ORDERDETAILSPAGE = "//button[@aria-label='Add Order to BOL']";
	/**XPATH*/ public static final String CREATE_NEWBOLPAGE_HEADING_ORDERDETAILSPAGE = "//h2[text()='Create New Bill of Lading for Order']";
	/**XPATH*/ public static final String BOL_NUMBER_FROM_ORDERDETAILSPAGE = "//div[@class='prose mb-2']/a";
	
	
	
	/**XPATH*/ public static final String ADD_ORDER_TO_BOL_BTN_BOLCREATEPAGE = "(//button[text()='Add Order To BOL'])[1]";
	/**XPATH*/ public static final String VIEW_RESULT_BUTTON = "//*[@id='view_result_button']";
	
//BOL Filter locators
	/**ID*/ public static final String STATUS_MULTI_SELECT = "status-multi-select";
	/**XPATH*/ public static final String STATUS_MULTI_SELECT_PANEL = "//div[contains(@class, 'p-multiselect-panel')]";
	/**XPATH*/ public static final String STATUS_MULTI_SELECT_ITEMS_LIST = "//ul[contains(@class, 'p-multiselect-items')]";
	/**XPATH*/ public static final String STATUS_MULTI_SELECT_ITEM = STATUS_MULTI_SELECT_ITEMS_LIST + "/li";
	/**XPATH*/ public static final String STATUS_TABLE_COLUMN_DATA = "//table[@class='p-datatable-table']/tbody/tr/td[7]";
	/**XPATH*/ public static final String FROM_LOC_TABLE_COLUMN_DATA = "//table[@class='p-datatable-table']/tbody/tr/td[3]";
	/**XPATH*/ public static final String TO_LOC_TABLE_COLUMN_DATA = "//table[@class='p-datatable-table']/tbody/tr/td[4]";
	/**XPATH*/ public static final String BOL_SEARCH_INPUT = "//*[@id='lading-bill-filter-input']";
	/**XPATH*/ public static final String CLEAR_BOL_SEARCH_BUTTON = "//button[contains(@class, 'p-column-filter-clear-button')]";
	/**XPATH*/ public static final String RESET_FILTERS_BUTTON = "//*[@id='reset_filters_button']";
	/**XPATH*/ public static final String STATUS_MULTI_SELECT_ALL_CHECKBOX = "//input[@type='checkbox' and contains(@class, 'p-checkbox-input')]";
}
