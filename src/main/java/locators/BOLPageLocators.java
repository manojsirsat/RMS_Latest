package locators;

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
	
//	
}
