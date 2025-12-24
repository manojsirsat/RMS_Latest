package locators;

import org.openqa.selenium.By;

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
	
	/** XPATH */ public static final String ACCOUNTS_PAGE_LEFTNAV = "//a[@id='pv_id_2_3_header_action']//following-sibling::span[text()='Accounts']";
	/** XPATH */ public static final String ACCOUNTS_ACCOUNTS_PAGE = "//a[@href='/accounts']";
	/** XPATH */ public static final String ACCOUNTS_LOCATIONS_PAGE = "//a[@href='/locations']";

	/** XPATH */ public static final String REPORTS_PAGE_LEFTNAV = "//a[@id='pv_id_2_4_header_action']//following-sibling::span[text()='Reports']";
	/** XPATH */ public static final String REPORTS_ORDERDETAILSPAGE_LEFTNAV = "//a[@href='/reports/orders'] ";
	/** XPATH */ public static final String REPORTS_LATENOTIFICATIONPAGE_LEFTNAV = "//a[@href='/reports/late-notifications']";
	/** XPATH */ public static final String REPORTS_PREBILLINGPAGE_LEFTNAV = "//a[@href='/reports/prebilling']";
	/** XPATH */ public static final String REPORTS_INVOICINGPAGE_LEFTNAV = "//a[@href='/reports/invoicing']";
	/** XPATH */ public static final String REPORTS_LEDGERPAGE_LEFTNAV = "//a[@href='/inventory-ledger']";
	/** XPATH */ public static final String REPORTS_CURRENTINVENTORYBYLOCATIONPAGE_LEFTNAV = "//a[@href='/reports/current-inventory-by-location']";
	/** XPATH */ public static final String REPORTS_HISTORICALINVENTORYBYLOCATIONPAGE_LEFTNAV = "//a[@href='/reports/historical-inventory-by-location']";
	/** XPATH */ public static final String REPORTS_CYCLECOUNTPAGE_LEFTNAV = "//a[@href='/reports/cycle-count']";
	/** XPATH */ public static final String REPORTS_INVENTORYMOVENTSPAGE_LEFTNAV = "//a[@href='/reports/inventory-movements']";
	/** XPATH */ public static final String REPORTS_INVENTORYBYSTAGEPAGE_LEFTNAV = "//a[@href='/reports/inventory-by-component']";
	/** XPATH */ public static final String REPORTS_INVENTORY99SPAGE_LEFTNAV = "//a[@href='/reports/inventory-ledger-99s']";
	/** XPATH */ public static final String REPORTS_ARCHIVEPAGE_LEFTNAV = "//a[@href='/reports']";
	
	/** XPATH */ public static final String ADMIN_PAGE_LEFTNAV = "//a[@id='pv_id_2_5_header_action']//following-sibling::span[text()='Admin']";
	/** XPATH */ public static final String ADMIN_PROGRAMSPAGE_LEFTNAV = "//a[@href='/programs']";
	/** XPATH */ public static final String ADMIN_SKUMANAGEMENTPAGE_LEFTNAV = "//a[@href='/skus']";
	/** XPATH */ public static final String ADMIN_PLANSPAGE_LEFTNAV = "//a[@href='/plans']";
	/** XPATH */ public static final String ADMIN_USERSPAGE_LEFTNAV = "//a[@href='/admin/users']";
	/** XPATH */ public static final String ADMIN_MASTERADJUSTMENTSPAGE_LEFTNAV = "//a[@href='/admin/master-adjustment']";
	/** XPATH */ public static final String ADMIN_CALLPRIORITYTYPESPAGE_LEFTNAV = "//a[@href='/admin/call-priority-types']";
	/** XPATH */ public static final String ADMIN_WEEKNUMBERSPAGE_LEFTNAV = "//a[@href='/admin/week-numbers'] ";
	/** XPATH */ public static final String ADMIN_ZONESPAGE_LEFTNAV = "//a[@href='/admin/zones']";
	/** XPATH */ public static final String ADMIN_IMPORTSPAGE_LEFTNAV = "//a[@href='/admin/imports']";
	/** XPATH */ public static final String ADMIN_IMPORTEDFILESPAGE_LEFTNAV = "//a[@href='/admin/imports-list']";
	/** XPATH */ public static final String ADMIN_TOOLSPAGE_LEFTNAV = "//a[@href='/admin/tools'] ";
	
	/** XPATH */ public static final String HELP_PAGE_LEFTNAV = "//a[@id='pv_id_2_6_header_action']//following-sibling::span[text()='Help']";
	/** XPATH */ public static final String HELP_HELPFILESPAGE_LEFTNAV = "//a[@href='/help-files']";
	
	
	
	
	
//	/** XPATH */ public static final String ACTIVETABCOUNT = "//span[@class='swiper-pagination-bullet swiper-pagination-bullet-active']";
//	/**XPATH*/ public static final String ECOMMERCEPAGE_NAVLINK = "(//a[text()='eCommerce Solutions'])[1]";
	
	
	//Pagination
	/**XPATH*/ public static final String SHOWINGRESULTBOTTOM = "//span[@class='p-paginator-current']";
	/**XPATH*/ public static final String NEXTBUTTON = "//button[@class='p-paginator-next p-paginator-element p-link']";
	/**XPATH*/ public static final String TOTALRECORDSCOUNT = "(//tbody[@class='p-datatable-tbody']//tr)";
	/**XPATH*/ public static final String SHOWFILTER = "//div[@class='p-dropdown p-component p-inputwrapper p-inputwrapper-filled p-paginator-rpp-options']//div[@class='p-dropdown-trigger']";
	/**XPATH*/ public static final String SHOWFILTERSELECTVALUE_500 = "(//li[@class='p-dropdown-item'])[5]";
	/**XPATH*/ public static final String SHOWFILTERSELECTVALUE_1000 = "(//li[@class='p-dropdown-item'])[6]";
	
	// Sorting
	public static final By bolHeader = By.xpath("//th[contains(.,'Provider Loc Code')]");
	public static final By bolColumn = By.xpath("//table/tbody/tr/td[1]");
	public static final By nextBtn   = By.xpath("//button[@aria-label='Next Page']");
	/**XPATH*/ public static final String BOLCOLUMN = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String BOLHEADER = "//th[contains(.,'Provider Loc Code')]";
	/**XPATH*/ public static final String NEXTBUTTON_PAGINATION = "//button[@aria-label='Next Page']";
	
	/**XPATH*/ public static final String VIEWRESULT_BUTTON = "//button[@id='view_result_button']";
	
	
}
