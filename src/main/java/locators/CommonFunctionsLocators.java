package locators;

public class CommonFunctionsLocators 
{

	//Login page locators
//	/**css*/ public static final String USERNAME_FIELD = "input#okta-signin-username";
//	/**css*/ public static final String PASSWORD_FIELD = "input#okta-signin-password";
//	/**css*/ public static final String SIGNIN_BUTTON = "input#okta-signin-submit";
	
	/**XPATH*/ public static final String USERNAME_FIELD = "//*[@id='preferred_username']";
	/**XPATH*/ public static final String PASSWORD_FIELD = "//*[@id='password']/input";
	/**XPATH*/ public static final String SIGNIN_BUTTON = "//button[text()='Sign In ']";
	
	
	//Homepage
	/**XPATH*/ public static final String PROFILENAME = "//span[@class='p-button-label']";
	/** XPATH */ public static final String ORDERSANDBOLS_PAGE_LEFTNAV = "//a[@id='pv_id_2_2_header_action']//following-sibling::span[text()='Orders & BOLs']";
	/** XPATH */ public static final String BOLS_PAGE = "//a[@href='/bills-of-lading']";
	/** XPATH */ public static final String CREATEORDER_PAGE = "//a[@href='/create-order']";
	/** XPATH */ public static final String ORDERSANDBOLS_ORDERS_PAGE = "//a[@href='/orders']";
	/** XPATH */ public static final String BATCHFILES_PAGE = "//a[@href='/batch-files']";
	
	/** XPATH */ public static final String RECOVERIES_PAGE_LEFTNAV = "//a[@id='pv_id_2_0_header_action']//following-sibling::span[text()='Recoveries']";
	/** XPATH */ public static final String RECOVERIESBYZONES_PAGE = "//a[@href='/recoveries-by-zone']";
	/** XPATH */ public static final String RECOVERIESBYLOCATIONS_PAGE = "//a[@href='/recoveries-by-location']";
	/** XPATH */ public static final String RECOVERIESBYLOCATIONS_PROGRAMS_PAGE = "//a[@href='/recoveries-by-location-by-program']";
	/** XPATH */ public static final String RECOVERIESBYCOMPONENTS_PAGE = "//a[@href='/recoveries-by-component']";
	
	/** XPATH */ public static final String REPLENISHMENTS_PAGE_LEFTNAV = "//a[@id='pv_id_2_1_header_action']//following-sibling::span[text()='Replenishments']";
	/** XPATH */ public static final String REPLENISHMENTS_COMPONENTS_PAGE = "//a[@href='/replenishments-by-component']";
	
	
	/** XPATH */ public static final String ACTIVETABCOUNT = "//span[@class='swiper-pagination-bullet swiper-pagination-bullet-active']";
	/**XPATH*/ public static final String ECOMMERCEPAGE_NAVLINK = "(//a[text()='eCommerce Solutions'])[1]";
	
	
	//Pagination
	/**XPATH*/ public static final String SHOWINGRESULTBOTTOM = "//span[@class='p-paginator-current']";
	/**XPATH*/ public static final String NEXTBUTTON = "//button[@class='p-paginator-next p-paginator-element p-link']";
	/**XPATH*/ public static final String TOTALRECORDSCOUNT = "(//tbody[@class='p-datatable-tbody']//tr)";
	/**XPATH*/ public static final String SHOWFILTER = "//div[@class='p-dropdown p-component p-inputwrapper p-inputwrapper-filled p-paginator-rpp-options']//div[@class='p-dropdown-trigger']";
	/**XPATH*/ public static final String SHOWFILTERSELECTVALUE_500 = "(//li[@class='p-dropdown-item'])[5]";
	
	
	
}
