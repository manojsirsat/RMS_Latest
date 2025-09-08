package locators;

public class CreateOrderPageLocators 
{

	//Create Order Page Locators
	
	/** XPATH */ public static final String CREATEORDER_PAGE_HEADING = "//h2[text()='Create Order']";
	
	// General details
	/**ID*/ public static final String ACCOUNT_DROPDOWN = "account-autocomplete";
	/**ID*/ public static final String ACCOUNT_DRP_OPTION = "account-autocomplete_list";
	/**XPATH*/ public static final String ACCOUNT_DRP_OPTIONS_LIST = "(//ul[@id='account-autocomplete_list']//li)";
	/**ID*/ public static final String PROGRAM_DROPDOWN = "program-autocomplete";
	/**ID*/ public static final String PROGRAM_DRP_OPTION = "program-autocomplete_list";
	/**XPATH*/ public static final String PROGRAM_DRP_OPTIONS_LIST = "(//ul[@id='program-autocomplete_list']//li)";

	// Transit Details
	/**ID*/ public static final String ORDERTYPE_DROPDOWN = "order-types-autocomplete";
	/**ID*/ public static final String ORDERTYPE_DRP_OPTION = "order-types-autocomplete_list";
	/**XPATH*/ public static final String ORDERTYPE_DRP_OPTIONS_LIST = "(//ul[@id='order-types-autocomplete_list']//li)";
	/**ID*/ public static final String FROM_LOC_DROPDOWN = "from-location-dropdown";
	/**ID*/ public static final String FROM_LOC_DRP_OPTION = "from-location-dropdown_list";
	/**XPATH*/ public static final String FROM_LOC_DRP_OPTIONS_LIST = "(//ul[@id='from-location-dropdown_list']//li)";
	/**ID*/ public static final String TO_LOC_DROPDOWN = "to-location-dropdown";
	/**ID*/ public static final String TO_LOC_DRP_OPTION = "to-location-dropdown_list";
	/**XPATH*/ public static final String TO_LOC_DRP_OPTIONS_LIST = "(//ul[@id='to-location-dropdown_list']//li)";
	/**ID*/ public static final String PICKUP_WINDOW_STARTDATE_CALENDER = "pickup-window-start-date";
	/**XPATH*/ public static final String PICKUP_WINDOW_STARTDATE_TODAY = "//td[@class='p-datepicker-today']";
	/**ID*/ public static final String PICKUP_WINDOW_ENDDATE_CALENDER = "pickup-window-end-date";
	/**XPATH*/ public static final String PICKUP_WINDOW_ENDDATE = "(//td[@class='p-datepicker-today']//following-sibling::td)[1]";
	/**XPATH*/ public static final String NEXTHOUR_INCREMENT_BTN = "(//button[@class='p-link'])[1]";
	/**ID*/ public static final String DELIVERY_WINDOW_STARTDATE_CALENDER = "delivery-window-start-date";
	/**XPATH*/ public static final String DELIVERY_WINDOW_STARTDATE_TODAY = "(//td[@class='p-datepicker-today']//following-sibling::td)[1]";
	/**ID*/ public static final String DELIVERY_WINDOW_ENDDATE_CALENDER = "delivery-window-end-date";
	/**XPATH*/ public static final String DELIVERY_WINDOW_ENDDATE = "(//td[@class='p-datepicker-today']//following-sibling::td)[3]";
	
	//Items To Transit
	/**XPATH*/ public static final String INPUT_QUANTITY = "//span[@id='requested-quantity-input-0']//input";
	
	// Submit or Create order button
	/**ID*/ public static final String CREATE_SUBMIT_ORDER_BUTTON = "submit-order-button";
	/**XPATH*/ public static final String ADD_ORDER_TO_BOL_BUTTON = "//span[text()='Add Order to BOL']";
	

	
	
}
