package locators;

import org.openqa.selenium.By;

public class Admin_WeekNumbersPageLocators 
{
	
	/**XPATH*/ public static final String ADMIN_WEEKNUMBERSPAGE_HEADING = "//div[text()='Week Number Configs']";
	
	//Sorting
	/**By*/ public static final By BY_NAME_COLHEADER = By.xpath("//th[contains(.,'Name')]");
	/**By*/ public static final By BY_NAME_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_NAME_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_NAME_COLHEADER = "//th[contains(.,'Name')]";
	
	/**By*/ public static final By BY_STARTDATE_COLHEADER = By.xpath("//th[contains(.,'Start Date')]");
	/**By*/ public static final By BY_STARTDATE_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_STARTDATE_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_STARTDATE_COLHEADER = "//th[contains(.,'Start Date')]";
	
	/**By*/ public static final By BY_LASTUPDATEDBY_COLHEADER = By.xpath("//th[contains(.,'Last Updated By')]");
	/**By*/ public static final By BY_LASTUPDATEDBY_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_LASTUPDATEDBY_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_LASTUPDATEDBY_COLHEADER = "//th[contains(.,'Last Updated By')]";
	
	
}
