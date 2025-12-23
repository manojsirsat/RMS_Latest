package locators;

import org.openqa.selenium.By;

public class Admin_CallPriorityTypesPageLocators 
{
	
	/**XPATH*/ public static final String ADMIN_CALLPRIORITYTYPESPAGE_HEADING = "//div[text()='Call Priority Types']";
	
	//Sorting
	/**By*/ public static final By BY_TYPE_COLHEADER = By.xpath("//th[contains(.,'Type')]");
	/**By*/ public static final By BY_TYPE_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_TYPE_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_TYPE_COLHEADER = "//th[contains(.,'Type')]";
	
	/**By*/ public static final By BY_ACTIVE_COLHEADER = By.xpath("//th[contains(.,'Active')]");
	/**By*/ public static final By BY_ACTIVE_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_ACTIVE_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_ACTIVE_COLHEADER = "//th[contains(.,'Active')]";
	
}
