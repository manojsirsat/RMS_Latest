package locators;

public class ProviderBOLPageLocators {
	
	/** XPATH */
	public static final String BOLPAGE_HEADING = "//div[text()='Bills of Lading']";
	/** XPATH */
	public static final String CREATE_BOL_BTN = "(//button[@id='create-bol-button'])";
	/** XPATH */
	public static final String COMMITDATE_INPUTFIELD = "//span[@id='lading-bill-commit-date']//input";
	/** XPATH */
	public static final String COMMITDATE_TODAY = "//td[@class='p-datepicker-today']";
	/** XPATH */
	public static final String CREATE_BOL_BUTTON_POPUP = "(//div[@class='p-dialog-content']//following-sibling::div)[2]/button";
	/** XPATH */
	public static final String BOLSUCCESSMSG = "//div[@class='p-toast-detail']";
	/** XPATH */
	public static final String CREATE_NEWBOLPAGE_HEADING = "//h2[text()='Create Bill of Lading']";
	/** XPATH */
	public static final String Bottom_Pagination = "//span[@aria-label='Rows per page']";
	/** XPATH */
	public static final String Bottom_PaginationClick1000Page = "//span[normalize-space()='1000']";
	
	
}
