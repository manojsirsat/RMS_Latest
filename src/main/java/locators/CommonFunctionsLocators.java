package locators;

public class CommonFunctionsLocators 
{

	//Login page locators
	/**XPATH*/ public static final String USERNAME_FIELD = "//*[@id=\"preferred_username\"]";
	/**XPATH*/ public static final String PASSWORD_FIELD = "//*[@id=\"password\"]/input";
	/**XPATH*/ public static final String SIGNIN_BUTTON = "//*[@id=\"vueApp\"]/div/div/div/div/main/section/div/div/div/div/div/div[6]/button";
	
	//Homepage
	/**XPATH*/ public static final String PROFILENAME = "//span[@class='p-button-label']";
	/** XPATH */ public static final String ORDERSANDBOLS_PAGE_LEFTNAV = "//a[@id='pv_id_2_2_header_action']//following-sibling::span[text()='Orders & BOLs']";
	/** XPATH */ public static final String BOLS_PAGE = "//a[@href='/bills-of-lading']";
	/** XPATH */ public static final String CREATEORDER_PAGE = "//a[@href='/create-order']";
	
	/** XPATH */ public static final String ACTIVETABCOUNT = "//span[@class='swiper-pagination-bullet swiper-pagination-bullet-active']";
	/**XPATH*/ public static final String ECOMMERCEPAGE_NAVLINK = "(//a[text()='eCommerce Solutions'])[1]";
	
	
	
}
