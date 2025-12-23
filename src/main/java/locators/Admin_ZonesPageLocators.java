package locators;

import org.openqa.selenium.By;

public class Admin_ZonesPageLocators 
{
	
	/**XPATH*/ public static final String ADMIN_ZONESPAGE_HEADING = "//div[text()='Zones']";
	
	//Sorting
	/**By*/ public static final By BY_ZONE_COLHEADER = By.xpath("//th[contains(.,'Zone')]");
	/**By*/ public static final By BY_ZONE_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_ZONE_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_ZONE_COLHEADER = "//th[contains(.,'Zone')]";
	
	/**By*/ public static final By BY_DESCRIPTION_COLHEADER = By.xpath("//th[contains(.,'Description')]");
	/**By*/ public static final By BY_DESCRIPTION_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_DESCRIPTION_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_DESCRIPTION_COLHEADER = "//th[contains(.,'Description')]";
	
	/**By*/ public static final By BY_PROVIDERLOCCODE_COLHEADER = By.xpath("//th[contains(.,'Provider Loc Code')]");
	/**By*/ public static final By BY_PROVIDERLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_PROVIDERLOCCODE_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_PROVIDERLOCCODE_COLHEADER = "//th[contains(.,'Provider Loc Code')]";
	
	/**By*/ public static final By BY_PROVIDERLOCNAME_COLHEADER = By.xpath("//th[contains(.,'Provider Loc Name')]");
	/**By*/ public static final By BY_PROVIDERLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_PROVIDERLOCNAME_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_PROVIDERLOCNAME_COLHEADER = "//th[contains(.,'Provider Loc Name')]";
	
	/**By*/ public static final By BY_LOCATIONSCOUNT_COLHEADER = By.xpath("//th[contains(.,'Locations Count')]");
	/**By*/ public static final By BY_LOCATIONSCOUNT_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_LOCATIONSCOUNT_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_LOCATIONSCOUNT_COLHEADER = "//th[contains(.,'Locations Count')]";
	
}
