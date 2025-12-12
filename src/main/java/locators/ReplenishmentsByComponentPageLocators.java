package locators;

import org.openqa.selenium.By;

public class ReplenishmentsByComponentPageLocators 
{
	
	/**XPATH*/ public static final String REPLENISHMENTSBYCOMPONENTSPAGE_HEADING = "//div[text()='Replenishments By Component']";
	
	//Sorting
	public static final By BY_ACCOUNT_COLHEADER = By.xpath("//th[contains(.,'Account')]");
	public static final By BY_ACCOUNT_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_ACCOUNT_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_ACCOUNT_COLHEADER = "//th[contains(.,'Account')]";

	public static final By BY_PROVIDERLOCCODE_COLHEADER = By.xpath("//th[contains(.,'Provider Loc Code')]");
	public static final By BY_PROVIDERLOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_PROVIDERLOCCODE_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_PROVIDERLOCCODE_COLHEADER = "//th[contains(.,'Provider Loc Code')]";
	
	public static final By BY_PROVIDERLOCNAME_COLHEADER = By.xpath("//th[contains(.,'Provider Loc Name')]");
	public static final By BY_PROVIDERLOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_PROVIDERLOCNAME_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_PROVIDERLOCNAME_COLHEADER = "//th[contains(.,'Provider Loc Name')]";
	
	public static final By BY_ZONE_COLHEADER = By.xpath("//th[contains(.,'Zone')]");
	public static final By BY_ZONE_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_ZONE_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_ZONE_COLHEADER = "//th[contains(.,'Zone')]";
	
	public static final By BY_LOCCODE_COLHEADER = By.xpath("(//th[contains(.,'Loc Code')])[2]");
	public static final By BY_LOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/**XPATH*/ public static final String STRING_LOCCODE_COLDATA = "//table/tbody/tr/td[4]";
	/**XPATH*/ public static final String STRING_LOCCODE_COLHEADER = "(//th[contains(.,'Loc Code')])[2]";
	
	public static final By BY_LOCNAME_COLHEADER = By.xpath("(//th[contains(.,'Loc Name')])[2]");
	public static final By BY_LOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_LOCNAME_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_LOCNAME_COLHEADER = "(//th[contains(.,'Loc Name')])[2]";
	
	public static final By BY_CITY_COLHEADER = By.xpath("//th[contains(.,'City')]");
	public static final By BY_CITY_COLDATA = By.xpath("//table/tbody/tr/td[8]");
	/**XPATH*/ public static final String STRING_CITY_COLDATA = "//table/tbody/tr/td[8]";
	/**XPATH*/ public static final String STRING_CITY_COLHEADER = "//th[contains(.,'Provider Loc Code')]";
	
	public static final By BY_STATE_COLHEADER = By.xpath("//th[contains(.,'State')]");
	public static final By BY_STATE_COLDATA = By.xpath("//table/tbody/tr/td[9]");
	/**XPATH*/ public static final String STRING_STATE_COLDATA = "//table/tbody/tr/td[9]";
	/**XPATH*/ public static final String STRING_STATE_COLHEADER = "//th[contains(.,'State')]";
		
	public static final By BY_ZIPCODE_COLHEADER = By.xpath("//th[contains(.,'Zip Code')]");
	public static final By BY_ZIPCODE_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/**XPATH*/ public static final String STRING_ZIPCODE_COLDATA = "//table/tbody/tr/td[10]";
	/**XPATH*/ public static final String STRING_ZIPCODE_COLHEADER = "//th[contains(.,'Zip Code')]";
	
	public static final By BY_SKU_COLHEADER = By.xpath("(//th[contains(.,'SKU')])[1]");
	public static final By BY_SKU_COLDATA = By.xpath("//table/tbody/tr/td[11]");
	/**XPATH*/ public static final String STRING_SKU_COLDATA = "//table/tbody/tr/td[11]";
	/**XPATH*/ public static final String STRING_SKU_COLHEADER = "(//th[contains(.,'SKU')])[1]";
	
	public static final By BY_SKUNAME_COLHEADER = By.xpath("(//th[contains(.,'SKU Name')])[1]");
	public static final By BY_SKUNAME_COLDATA = By.xpath("//table/tbody/tr/td[12]");
	/**XPATH*/ public static final String STRING_SKUNAME_COLDATA = "//table/tbody/tr/td[12]";
	/**XPATH*/ public static final String STRING_SKUNAME_COLHEADER = "(//th[contains(.,'SKU Name')])[1]";
	
	public static final By BY_FG_COLHEADER = By.xpath("//th[contains(.,'FG')]");
	public static final By BY_FG_COLDATA = By.xpath("//table/tbody/tr/td[13]");
	/**XPATH*/ public static final String STRING_FG_COLDATA = "//table/tbody/tr/td[13]";
	/**XPATH*/ public static final String STRING_FG_COLHEADER = "//th[contains(.,'FG')]";
	
	public static final By BY_CONFAVIL_COLHEADER = By.xpath("(//th[contains(.,'Conf Avail')])[1]");
	public static final By BY_CONFAVIL_COLDATA = By.xpath("//table/tbody/tr/td[18]");
	/**XPATH*/ public static final String STRING_CONFAVIL_COLDATA = "//table/tbody/tr/td[18]";
	/**XPATH*/ public static final String STRING_CONFAVIL_COLHEADER = "(//th[contains(.,'Conf Avail')])[1]";

	public static final By BY_REGION_COLHEADER = By.xpath("//th[contains(.,'Region')]");
	public static final By BY_REGION_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_REGION_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_REGION_COLHEADER = "//th[contains(.,'Region')]";
	
	public static final By BY_SHIPMIN_COLHEADER = By.xpath("//th[contains(.,'Ship Min')]");
	public static final By BY_SHIPMIN_COLDATA = By.xpath("//table/tbody/tr/td[14]");
	/**XPATH*/ public static final String STRING_SHIPMIN_COLDATA = "//table/tbody/tr/td[14]";
	/**XPATH*/ public static final String STRING_SHIPMIN_COLHEADER = "//th[contains(.,'Ship Min')]";
	
	public static final By BY_SHIPMAX_COLHEADER = By.xpath("//th[contains(.,'Ship Max')]");
	public static final By BY_SHIPMAX_COLDATA = By.xpath("//table/tbody/tr/td[15]");
	/**XPATH*/ public static final String STRING_SHIPMAX_COLDATA = "//table/tbody/tr/td[15]";
	/**XPATH*/ public static final String STRING_SHIPMAX_COLHEADER = "//th[contains(.,'Ship Max')]";
	
	public static final By BY_INTRANSIT_COLHEADER = By.xpath("//th[contains(.,'In Transit')]");
	public static final By BY_INTRANSIT_COLDATA = By.xpath("//table/tbody/tr/td[16]");
	/**XPATH*/ public static final String STRING_INTRANSIT_COLDATA = "//table/tbody/tr/td[16]";
	/**XPATH*/ public static final String STRING_INTRANSIT_COLHEADER = "//th[contains(.,'In Transit')]";
	
	public static final By BY_BELOWMINQTY_COLHEADER = By.xpath("//th[contains(.,'Below Min Qty')]");
	public static final By BY_BELOWMINQTY_COLDATA = By.xpath("//table/tbody/tr/td[17]");
	/**XPATH*/ public static final String STRING_BELOWMINQTY_COLDATA = "//table/tbody/tr/td[17]";
	/**XPATH*/ public static final String STRING_BELOWMINQTY_COLHEADER = "//th[contains(.,'Below Min Qty')]";
	
}
