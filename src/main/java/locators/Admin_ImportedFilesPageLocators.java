package locators;

import org.openqa.selenium.By;

public class Admin_ImportedFilesPageLocators 
{
	
	/**XPATH*/ public static final String ADMIN_IMPORTEDFILESPAGE_HEADING = "//div[text()='Plans']";
	
	//Sorting
	/**By*/ public static final By BY_ID_COLHEADER = By.xpath("//th[contains(.,'ID')]");
	/**By*/ public static final By BY_ID_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_ID_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_ID_COLHEADER = "//th[contains(.,'ID')]";
	
	/**By*/ public static final By BY_IMPORTTYPE_COLHEADER = By.xpath("//th[contains(.,'Import Type')]");
	/**By*/ public static final By BY_IMPORTTYPE_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_IMPORTTYPE_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_IMPORTTYPE_COLHEADER = "//th[contains(.,'Import Type')]";
	
	/**By*/ public static final By BY_TOTALLINES_COLHEADER = By.xpath("//th[contains(.,'Total Lines')]");
	/**By*/ public static final By BY_TOTALLINES_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_TOTALLINES_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_TOTALLINES_COLHEADER = "//th[contains(.,'Total Lines')]";
	
	/**By*/ public static final By BY_SUCCESSFUL_COLHEADER = By.xpath("//th[contains(.,'Successful')]");
	/**By*/ public static final By BY_SUCCESSFUL_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_SUCCESSFUL_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_SUCCESSFUL_COLHEADER = "//th[contains(.,'Successful')]";
	
	/**By*/ public static final By BY_ERRORS_COLHEADER = By.xpath("//th[contains(.,'Errors')]");
	/**By*/ public static final By BY_ERRORS_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_ERRORS_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_ERRORS_COLHEADER = "//th[contains(.,'Locations Count')]";
	
	/**By*/ public static final By BY_UNPROCESSED_COLHEADER = By.xpath("//th[contains(.,'Unprocessed')]");
	/**By*/ public static final By BY_UNPROCESSED_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_UNPROCESSED_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_UNPROCESSED_COLHEADER = "//th[contains(.,'Unprocessed')]";
	
	/**By*/ public static final By BY_USER_COLHEADER = By.xpath("//th[contains(.,'User')]");
	/**By*/ public static final By BY_USER_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/**XPATH*/ public static final String STRING_USER_COLDATA = "//table/tbody/tr/td[10]";
	/**XPATH*/ public static final String STRING_USER_COLHEADER = "//th[contains(.,'User')]";
	
	
}
