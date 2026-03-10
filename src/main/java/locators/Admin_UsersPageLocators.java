package locators;

import org.openqa.selenium.By;

public class Admin_UsersPageLocators {

	/** XPATH */
	public static final String ADMIN_USERSPAGE_HEADING = "//div[text()='Users']";

	// Sorting
	/** By */
	public static final By BY_USERID_COLHEADER = By.xpath("//th[contains(.,'User ID')]");
	/** By */
	public static final By BY_USERID_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/** XPATH */
	public static final String STRING_USERID_COLDATA = "//table/tbody/tr/td[1]";
	/** XPATH */
	public static final String STRING_USERID_COLHEADER = "//th[contains(.,'User ID')]";

	/** By */
	public static final By BY_NAME_COLHEADER = By.xpath("//th[contains(.,'Name')]");
	/** By */
	public static final By BY_NAME_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/** XPATH */
	public static final String STRING_NAME_COLDATA = "//table/tbody/tr/td[2]";
	/** XPATH */
	public static final String STRING_NAME_COLHEADER = "//th[contains(.,'Name')]";

	/** By */
	public static final By BY_EMAIL_COLHEADER = By.xpath("//th[contains(.,'Email')]");
	/** By */
	public static final By BY_EMAIL_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/** XPATH */
	public static final String STRING_EMAIL_COLDATA = "//table/tbody/tr/td[3]";
	/** XPATH */
	public static final String STRING_EMAIL_COLHEADER = "//th[contains(.,'Email')]";
	/** By */
	public static final By BY_ACCOUNTNAME_COLHEADER = By.xpath("//th[contains(.,'Account Name')]");
	/** By */
	public static final By BY_ACCOUNTNAME_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/** XPATH */
	public static final String STRING_ACCOUNTNAME_COLDATA = "//table/tbody/tr/td[5]";
	/** XPATH */
	public static final String STRING_ACCOUNTNAME_COLHEADER = "//th[contains(.,'Account Name')]";
	/** By */
	public static final By BY_ACTIVE_COLHEADER = By.xpath("//th[contains(.,'Active')]");
	/** By */
	public static final By BY_ACTIVE_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/** XPATH */
	public static final String STRING_ACTIVE_COLDATA = "//table/tbody/tr/td[6]";
	/** XPATH */
	public static final String STRING_ACTIVE_COLHEADER = "//th[contains(.,'Active')]";
	
	// Create new User
	/** XPATH */
	public static final String CREATE_NEW_USER_BTN = "//button[@id='create-user-button']";
	/** XPATH */
	public static final String USEREMAIL_INPUTFIELD = "//input[@id='user-email']";
	/** XPATH */
	public static final String CHECKEMAIL_BTN = "//button[@id='check-email-button']";
	/** XPATH */
	public static final String FULLNAME_INPUTFIELD = "//input[@id='full-name']";
	/** XPATH */
	public static final String USERNAME_INPUTFIELD = "//input[@id='username']";
	/** XPATH */
	public static final String ACCOUNT_DRPDWN = "//div[@id='user-account']";
	/** XPATH */
	public static final String ACCOUNT_DRPDWN_OPTIONS = "(//ul[@id='user-account_list']//li)";
	/** XPATH */
	public static final String ACCOUNT_DRPDWN_OPTIONS_SELECTED = "//div[@id='user-account']//input";
	/** XPATH */
	public static final String AVAILBLE_USERROLE_OPTIONS = "(//ul[@class='p-picklist-list p-picklist-source-list']//li)";
	/** XPATH */
	public static final String AVAILBLE_USERROLE_OPTION_SELECTED = "(//ul[@class='p-picklist-list p-picklist-source-list']//li)";
	/** XPATH */
	public static final String SELECTROLE_BTN = "//button[@aria-label='Move to Target']";
	/** XPATH */
	public static final String SELECTED_USERROLE_OPTION = "(//ul[@class='p-picklist-list p-picklist-target']//li)[1]//span";
	/** XPATH */
	public static final String SAVE_BTN = "//button[@id='create-user-button']";
	/** XPATH */
	public static final String EDITUSER_HEADING = "//h3[text()='Edit User']";
		
}
