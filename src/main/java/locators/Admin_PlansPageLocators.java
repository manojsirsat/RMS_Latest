package locators;

import org.openqa.selenium.By;

public class Admin_PlansPageLocators 
{
	
	/**XPATH*/ public static final String ADMIN_PLANSPAGE_HEADING = "//div[text()='Plans']";

	// Sorting
	/**By*/ public static final By BY_ID_COLHEADER = By.xpath("//th[contains(.,'ID')]");
	/**By*/ public static final By BY_ID_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_ID_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_ID_COLHEADER = "//th[contains(.,'ID')]";
	
	/**By*/ public static final By BY_NAME_COLHEADER = By.xpath("//th[contains(.,'Name')]");
	/**By*/ public static final By BY_NAME_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_NAME_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_NAME_COLHEADER = "//th[contains(.,'Name')]";
	
	/**By*/ public static final By BY_PROGRAM_COLHEADER = By.xpath("//th[contains(.,'Program')]");
	/**By*/ public static final By BY_PROGRAM_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_PROGRAM_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_PROGRAM_COLHEADER = "//th[contains(.,'Program')]";
	
	/**By*/ public static final By BY_MANAGEDBY_COLHEADER = By.xpath("//th[contains(.,'Managed By')]");
	/**By*/ public static final By BY_MANAGEDBY_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_MANAGEDBY_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_MANAGEDBY_COLHEADER = "//th[contains(.,'Managed By')]";
	
	/**By*/ public static final By BY_TYPE_COLHEADER = By.xpath("//th[contains(.,'Type')]");
	/**By*/ public static final By BY_TYPE_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_TYPE_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_TYPE_COLHEADER = "//th[contains(.,'Type')]";
	
	/**By*/ public static final By BY_BASEPLAN_COLHEADER = By.xpath("//th[contains(.,'Base Plan')]");
	/**By*/ public static final By BY_BASEPLAN_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_BASEPLAN_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_BASEPLAN_COLHEADER = "//th[contains(.,'Base Plan')]";
	
	/**By*/ public static final By BY_ACTIVEEND_COLHEADER = By.xpath("//th[contains(.,'Active End')]");
	/**By*/ public static final By BY_ACTIVEEND_COLDATA = By.xpath("//table/tbody/tr/td[9]");
	/**XPATH*/ public static final String STRING_ACTIVEEND_COLDATA = "//table/tbody/tr/td[9]";
	/**XPATH*/ public static final String STRING_ACTIVEEND_COLHEADER = "//th[contains(.,'Active End')]";
	
	/**By*/ public static final By BY_DISABLED_COLHEADER = By.xpath("//th[contains(.,'Disabled')]");
	/**By*/ public static final By BY_DISABLED_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/**XPATH*/ public static final String STRING_DISABLED_COLDATA = "//table/tbody/tr/td[10]";
	/**XPATH*/ public static final String STRING_DISABLED_COLHEADER = "//th[contains(.,'Disabled')]";
	
	
}
