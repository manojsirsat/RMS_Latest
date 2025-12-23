package locators;

import org.openqa.selenium.By;

public class Admin_ProgramsPageLocators 
{
	
	/**XPATH*/ public static final String ADMIN_PROGRAMPAGE_HEADING = "//div[text()='Programs']";
	
	//Sorting
	/**By*/ public static final By BY_NAME_COLHEADER = By.xpath("//th[contains(.,'Name')]");
	/**By*/ public static final By BY_NAME_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_NAME_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_NAME_COLHEADER = "//th[contains(.,'Name')]";
	
	/**By*/ public static final By BY_CODE_COLHEADER = By.xpath("//th[contains(.,'Code')]");
	/**By*/ public static final By BY_CODE_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_CODE_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_CODE_COLHEADER = "//th[contains(.,'Code')]";
	
	
	/**By*/ public static final By BY_ACCOUNT_COLHEADER = By.xpath("//th[contains(.,'Account')]");
	/**By*/ public static final By BY_ACCOUNT_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_ACCOUNT_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_ACCOUNT_COLHEADER = "//th[contains(.,'Account')]";
	
	/**By*/ public static final By BY_LOCATIONS_COLHEADER = By.xpath("//th[contains(.,'Locations')]");
	/**By*/ public static final By BY_LOCATIONS_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_LOCATIONS_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_LOCATIONS_COLHEADER = "//th[contains(.,'Locations')]";
	
	/**By*/ public static final By BY_SKUS_COLHEADER = By.xpath("//th[contains(.,'SKUs')]");
	/**By*/ public static final By BY_SKUS_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_SKUS_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_SKUS_COLHEADER = "//th[contains(.,'SKUs')]";
	
	
	
	
}
