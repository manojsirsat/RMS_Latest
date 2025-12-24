package locators;

import org.openqa.selenium.By;

public class Reports_ArchivePageLocators 
{
	
	/**XPATH*/ public static final String REPORTS_ARCHIVEPAGE_HEADING = "//div[text()='Reports']";
	
	//Sorting
	public static final By BY_REPORT_COLHEADER = By.xpath("(//th[contains(.,'Report #')])[1]");
	public static final By BY_REPORT_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_REPORT_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_REPORT_COLHEADER = "(//th[contains(.,'Report #')])[1]";
	
	public static final By BY_NAME_COLHEADER = By.xpath("(//th[contains(.,'Name')])[1]");
	public static final By BY_NAME_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_NAME_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_NAME_COLHEADER = "(//th[contains(.,'Name')])[1]";
	
	public static final By BY_OWNER_COLHEADER = By.xpath("(//th[contains(.,'Owner')])[1]");
	public static final By BY_OWNER_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_OWNER_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_OWNER_COLHEADER = "(//th[contains(.,'Owner')])[1]";
	
	public static final By BY_REQUESTEDBY_COLHEADER = By.xpath("(//th[contains(.,'Requested By')])[1]");
	public static final By BY_REQUESTEDBY_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_REQUESTEDBY_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_REQUESTEDBY_COLHEADER = "(//th[contains(.,'Requested By')])[1]";
	
	public static final By BY_REPORTREQUESTED_COLHEADER = By.xpath("(//th[contains(.,'Report Requested')])[1]");
	public static final By BY_REPORTREQUESTED_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_REPORTREQUESTED_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_REPORTREQUESTED_COLHEADER = "(//th[contains(.,'Report Requested')])[1]";
	
	
}
