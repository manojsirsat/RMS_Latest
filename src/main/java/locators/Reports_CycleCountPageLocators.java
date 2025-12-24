package locators;

import org.openqa.selenium.By;

public class Reports_CycleCountPageLocators 
{
	
	/**XPATH*/ public static final String REPORTS_CYCLECOUNTPAGE_HEADING = "//div[text()='Cycle Count Report']";

	//Sorting
	public static final By BY_ACCOUNTNAME_COLHEADER = By.xpath("(//th[contains(.,'Account Name')])[1]");
	public static final By BY_ACCOUNTNAME_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/**XPATH*/ public static final String STRING_ACCOUNTNAME_COLDATA = "//table/tbody/tr/td[1]";
	/**XPATH*/ public static final String STRING_ACCOUNTNAME_COLHEADER = "(//th[contains(.,'Account Name')])[1]";
	
	public static final By BY_ACCOUNTCODE_COLHEADER = By.xpath("(//th[contains(.,'Account Code')])[1]");
	public static final By BY_ACCOUNTCODE_COLDATA = By.xpath("//table/tbody/tr/td[2]");
	/**XPATH*/ public static final String STRING_ACCOUNTCODE_COLDATA = "//table/tbody/tr/td[2]";
	/**XPATH*/ public static final String STRING_ACCOUNTCODE_COLHEADER = "(//th[contains(.,'Account Code')])[1]";
	
	public static final By BY_LOCATIONCODE_COLHEADER = By.xpath("(//th[contains(.,'Location Code')])[1]");
	public static final By BY_LOCATIONCODE_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/**XPATH*/ public static final String STRING_LOCATIONCODE_COLDATA = "//table/tbody/tr/td[3]";
	/**XPATH*/ public static final String STRING_LOCATIONCODE_COLHEADER = "(//th[contains(.,'Location Code')])[1]";
	
	public static final By BY_SKUNAME_COLHEADER = By.xpath("(//th[contains(.,'SKU Name')])[1]");
	public static final By BY_SKUNAME_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/**XPATH*/ public static final String STRING_SKUNAME_COLDATA = "//table/tbody/tr/td[5]";
	/**XPATH*/ public static final String STRING_SKUNAME_COLHEADER = "(//th[contains(.,'SKU Name')])[1]";
	
	public static final By BY_SKU_COLHEADER = By.xpath("(//th[contains(.,'SKU')])[2]");
	public static final By BY_SKU_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/**XPATH*/ public static final String STRING_SKU_COLDATA = "//table/tbody/tr/td[6]";
	/**XPATH*/ public static final String STRING_SKU_COLHEADER = "(//th[contains(.,'SKU')])[2]";
	
	public static final By BY_CURRENTWIP_COLHEADER = By.xpath("(//th[contains(.,'Current WIP')])[1]");
	public static final By BY_CURRENTWIP_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/**XPATH*/ public static final String STRING_CURRENTWIP_COLDATA = "//table/tbody/tr/td[7]";
	/**XPATH*/ public static final String STRING_CURRENTWIP_COLHEADER = "(//th[contains(.,'Current WIP')])[1]";
	
	public static final By BY_PHYSICALWIP_COLHEADER = By.xpath("(//th[contains(.,'Physical WIP')])[1]");
	public static final By BY_PHYSICALWIP_COLDATA = By.xpath("//table/tbody/tr/td[8]");
	/**XPATH*/ public static final String STRING_PHYSICALWIP_COLDATA = "//table/tbody/tr/td[8]";
	/**XPATH*/ public static final String STRING_PHYSICALWIP_COLHEADER = "(//th[contains(.,'Physical WIP')])[1]";
	
	public static final By BY_VARIANCEWIP_COLHEADER = By.xpath("(//th[contains(.,'Variance WIP')])[1]");
	public static final By BY_VARIANCEWIP_COLDATA = By.xpath("//table/tbody/tr/td[9]");
	/**XPATH*/ public static final String STRING_VARIANCEWIP_COLDATA = "//table/tbody/tr/td[9]";
	/**XPATH*/ public static final String STRING_VARIANCEWIP_COLHEADER = "(//th[contains(.,'Variance WIP')])[1]";
	
	public static final By BY_CURRENTFG_COLHEADER = By.xpath("(//th[contains(.,'Current FG')])[1]");
	public static final By BY_CURRENTFG_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/**XPATH*/ public static final String STRING_CURRENTFG_COLDATA = "//table/tbody/tr/td[10]";
	/**XPATH*/ public static final String STRING_CURRENTFG_COLHEADER = "(//th[contains(.,'Current FG')])[1]";
	
	public static final By BY_PHYSICALFG_COLHEADER = By.xpath("(//th[contains(.,'Physical FG')])[1]");
	public static final By BY_PHYSICALFG_COLDATA = By.xpath("//table/tbody/tr/td[11]");
	/**XPATH*/ public static final String STRING_PHYSICALFG_COLDATA = "//table/tbody/tr/td[11]";
	/**XPATH*/ public static final String STRING_PHYSICALFG_COLHEADER = "(//th[contains(.,'Physical FG')])[1]";
	
	public static final By BY_VARIANCEFG_COLHEADER = By.xpath("(//th[contains(.,'Variance FG')])[1]");
	public static final By BY_VARIANCEFG_COLDATA = By.xpath("//table/tbody/tr/td[12]");
	/**XPATH*/ public static final String STRING_VARIANCEFG_COLDATA = "//table/tbody/tr/td[12]";
	/**XPATH*/ public static final String STRING_VARIANCEFG_COLHEADER = "(//th[contains(.,'Variance FG')])[1]";
	
	public static final By BY_CURRENTDAMAGED_COLHEADER = By.xpath("(//th[contains(.,'Current Damaged')])[1]");
	public static final By BY_CURRENTDAMAGED_COLDATA = By.xpath("//table/tbody/tr/td[13]");
	/**XPATH*/ public static final String STRING_CURRENTDAMAGED_COLDATA = "//table/tbody/tr/td[13]";
	/**XPATH*/ public static final String STRING_CURRENTDAMAGED_COLHEADER = "(//th[contains(.,'Current Damaged')])[1]";
	
	public static final By BY_PHYSICALDAMAGED_COLHEADER = By.xpath("(//th[contains(.,'Physical Damaged')])[1]");
	public static final By BY_PHYSICALDAMAGED_COLDATA = By.xpath("//table/tbody/tr/td[14]");
	/**XPATH*/ public static final String STRING_PHYSICALDAMAGED_COLDATA = "//table/tbody/tr/td[14]";
	/**XPATH*/ public static final String STRING_PHYSICALDAMAGED_COLHEADER = "(//th[contains(.,'Physical Damaged')])[1]";
	
	public static final By BY_VARIANCEDAMAGED_COLHEADER = By.xpath("(//th[contains(.,'Variance Damaged')])[1]");
	public static final By BY_VARIANCEDAMAGED_COLDATA = By.xpath("//table/tbody/tr/td[15]");
	/**XPATH*/ public static final String STRING_VARIANCEDAMAGED_COLDATA = "//table/tbody/tr/td[15]";
	/**XPATH*/ public static final String STRING_VARIANCEDAMAGED_COLHEADER = "(//th[contains(.,'Variance Damaged')])[1]";
	
	public static final By BY_CURRENTSCRAP_COLHEADER = By.xpath("(//th[contains(.,'Current Scrap')])[1]");
	public static final By BY_CURRENTSCRAP_COLDATA = By.xpath("//table/tbody/tr/td[16]");
	/**XPATH*/ public static final String STRING_CURRENTSCRAP_COLDATA = "//table/tbody/tr/td[16]";
	/**XPATH*/ public static final String STRING_CURRENTSCRAP_COLHEADER = "(//th[contains(.,'Current Scrap')])[1]";
	
	public static final By BY_PHYSICALSCRAP_COLHEADER = By.xpath("(//th[contains(.,'Physical Scrap')])[1]");
	public static final By BY_PHYSICALSCRAP_COLDATA = By.xpath("//table/tbody/tr/td[17]");
	/**XPATH*/ public static final String STRING_PHYSICALSCRAP_COLDATA = "//table/tbody/tr/td[17]";
	/**XPATH*/ public static final String STRING_PHYSICALSCRAP_COLHEADER = "(//th[contains(.,'Physical Scrap')])[1]";
	
	public static final By BY_VARIANCESCRAP_COLHEADER = By.xpath("(//th[contains(.,'Variance Scrap')])[1]");
	public static final By BY_VARIANCESCRAP_COLDATA = By.xpath("//table/tbody/tr/td[18]");
	/**XPATH*/ public static final String STRING_VARIANCESCRAP_COLDATA = "//table/tbody/tr/td[18]";
	/**XPATH*/ public static final String STRING_VARIANCESCRAP_COLHEADER = "(//th[contains(.,'Variance Scrap')])[1]";
	
	
}
