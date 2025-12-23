package locators;

import org.openqa.selenium.By;

public class Admin_UsersPageLocators 
{
	
	/**XPATH*/ public static final String ADMIN_USERSPAGE_HEADING = "//div[text()='Users']";
	
	//Sorting
	/**By*/ public static final By BY_USERID_COLHEADER = By.xpath("//th[contains(.,'User ID')]");
	/**By*/ public static final By BY_USERID_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_USERID_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_USERID_COLHEADER = "//th[contains(.,'User ID')]";
	
	/**By*/ public static final By BY_NAME_COLHEADER = By.xpath("//th[contains(.,'Name')]");
	/**By*/ public static final By BY_NAME_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_NAME_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_NAME_COLHEADER = "//th[contains(.,'Name')]";
	
	/**By*/ public static final By BY_EMAIL_COLHEADER = By.xpath("//th[contains(.,'Email')]");
	/**By*/ public static final By BY_EMAIL_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_EMAIL_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_EMAIL_COLHEADER = "//th[contains(.,'Email')]";
	
	/**By*/ public static final By BY_ACCOUNTNAME_COLHEADER = By.xpath("//th[contains(.,'Account Name')]");
	/**By*/ public static final By BY_ACCOUNTNAME_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_ACCOUNTNAME_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_ACCOUNTNAME_COLHEADER = "//th[contains(.,'Account Name')]";
	
	/**By*/ public static final By BY_ACTIVE_COLHEADER = By.xpath("//th[contains(.,'Active')]");
	/**By*/ public static final By BY_ACTIVE_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_ACTIVE_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_ACTIVE_COLHEADER = "//th[contains(.,'Active')]";
	
	
}
