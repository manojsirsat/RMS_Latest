package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Reports_CycleCountPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Reports_CycleCountPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Reports CycleCount page
	 * @throws InterruptedException
	 */
	public boolean navigate_Reports_CycleCountListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.REPORTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.REPORTS_ORDERDETAILSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.REPORTS_CYCLECOUNTPAGE_LEFTNAV, ElementType.Xpath, Reports_CycleCountPageLocators.REPORTS_CYCLECOUNTPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean AccountName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_ACCOUNTNAME_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_ACCOUNTNAME_COLHEADER, Reports_CycleCountPageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}
	
	public boolean AccountName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_ACCOUNTNAME_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_ACCOUNTNAME_COLHEADER, Reports_CycleCountPageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}
	
	public boolean AccountCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_ACCOUNTCODE_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_ACCOUNTCODE_COLHEADER, Reports_CycleCountPageLocators.STRING_ACCOUNTCODE_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_ACCOUNTCODE_COLDATA);
		return flag;
	}
	
	public boolean AccountCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_ACCOUNTCODE_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_ACCOUNTCODE_COLHEADER, Reports_CycleCountPageLocators.STRING_ACCOUNTCODE_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_ACCOUNTCODE_COLDATA);
		return flag;
	}
	
	public boolean LocationCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_LOCATIONCODE_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_LOCATIONCODE_COLHEADER, Reports_CycleCountPageLocators.STRING_LOCATIONCODE_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_LOCATIONCODE_COLDATA);
		return flag;
	}
	
	public boolean LocationCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_LOCATIONCODE_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_LOCATIONCODE_COLHEADER, Reports_CycleCountPageLocators.STRING_LOCATIONCODE_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_LOCATIONCODE_COLDATA);
		return flag;
	}
	
	public boolean SKUName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_SKUNAME_COLHEADER, Reports_CycleCountPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean SKUName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_SKUNAME_COLHEADER, Reports_CycleCountPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean SKU_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_SKU_COLHEADER, Reports_CycleCountPageLocators.STRING_SKU_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKU_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_SKU_COLHEADER, Reports_CycleCountPageLocators.STRING_SKU_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_SKU_COLDATA);
		return flag;
	}
	

	public boolean CurrentWIP_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_CURRENTWIP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTWIP_COLHEADER, Reports_CycleCountPageLocators.STRING_CURRENTWIP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTWIP_COLDATA);
		return flag;
	}
	
	public boolean CurrentWIP_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_CURRENTWIP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTWIP_COLHEADER, Reports_CycleCountPageLocators.STRING_CURRENTWIP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTWIP_COLDATA);
		return flag;
	}
	
	public boolean PhysicalWIP_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_PHYSICALWIP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALWIP_COLHEADER, Reports_CycleCountPageLocators.STRING_PHYSICALWIP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALWIP_COLDATA);
		return flag;
	}
	
	public boolean PhysicalWIP_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_PHYSICALWIP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALWIP_COLHEADER, Reports_CycleCountPageLocators.STRING_PHYSICALWIP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALWIP_COLDATA);
		return flag;
	}
	
	public boolean VarianceWIP_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_VARIANCEWIP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEWIP_COLHEADER, Reports_CycleCountPageLocators.STRING_VARIANCEWIP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEWIP_COLDATA);
		return flag;
	}
	
	public boolean VarianceWIP_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_VARIANCEWIP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEWIP_COLHEADER, Reports_CycleCountPageLocators.STRING_VARIANCEWIP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEWIP_COLDATA);
		return flag;
	}
	
	public boolean CurrentFG_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_CURRENTFG_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTFG_COLHEADER, Reports_CycleCountPageLocators.STRING_CURRENTFG_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTFG_COLDATA);
		return flag;
	}
	
	public boolean CurrentFG_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_CURRENTFG_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTFG_COLHEADER, Reports_CycleCountPageLocators.STRING_CURRENTFG_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTFG_COLDATA);
		return flag;
	}
	
	public boolean PhysicalFG_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_PHYSICALFG_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALFG_COLHEADER, Reports_CycleCountPageLocators.STRING_PHYSICALFG_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALFG_COLDATA);
		return flag;
	}
	
	public boolean PhysicalFG_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_PHYSICALFG_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALFG_COLHEADER, Reports_CycleCountPageLocators.STRING_PHYSICALFG_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALFG_COLDATA);
		return flag;
	}
	

	public boolean VarianceFG_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_VARIANCEFG_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEFG_COLHEADER, Reports_CycleCountPageLocators.STRING_VARIANCEFG_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEFG_COLDATA);
		return flag;
	}
	
	public boolean VarianceFG_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_VARIANCEFG_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEFG_COLHEADER, Reports_CycleCountPageLocators.STRING_VARIANCEFG_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEFG_COLDATA);
		return flag;
	}
	
	public boolean CurrentDamaged_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_CURRENTDAMAGED_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTDAMAGED_COLHEADER, Reports_CycleCountPageLocators.STRING_CURRENTDAMAGED_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTDAMAGED_COLDATA);
		return flag;
	}
	
	public boolean CurrentDamaged_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_CURRENTDAMAGED_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTDAMAGED_COLHEADER, Reports_CycleCountPageLocators.STRING_CURRENTDAMAGED_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTDAMAGED_COLDATA);
		return flag;
	}
	
	public boolean PhysicalDamaged_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_PHYSICALDAMAGED_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALDAMAGED_COLHEADER, Reports_CycleCountPageLocators.STRING_PHYSICALDAMAGED_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALDAMAGED_COLDATA);
		return flag;
	}
	
	public boolean PhysicalDamaged_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_PHYSICALDAMAGED_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALDAMAGED_COLHEADER, Reports_CycleCountPageLocators.STRING_PHYSICALDAMAGED_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALDAMAGED_COLDATA);
		return flag;
	}
	
	public boolean VarianceDamaged_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_VARIANCEDAMAGED_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEDAMAGED_COLHEADER, Reports_CycleCountPageLocators.STRING_VARIANCEDAMAGED_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEDAMAGED_COLDATA);
		return flag;
	}
	
	public boolean VarianceDamaged_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_VARIANCEDAMAGED_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEDAMAGED_COLHEADER, Reports_CycleCountPageLocators.STRING_VARIANCEDAMAGED_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCEDAMAGED_COLDATA);
		return flag;
	}
	
	public boolean CurrentScrap_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_CURRENTSCRAP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTSCRAP_COLHEADER, Reports_CycleCountPageLocators.STRING_CURRENTSCRAP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTSCRAP_COLDATA);
		return flag;
	}
	
	public boolean CurrentScrap_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_CURRENTSCRAP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTSCRAP_COLHEADER, Reports_CycleCountPageLocators.STRING_CURRENTSCRAP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_CURRENTSCRAP_COLDATA);
		return flag;
	}
	
	public boolean PhysicalScrap_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_PHYSICALSCRAP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALSCRAP_COLHEADER, Reports_CycleCountPageLocators.STRING_PHYSICALSCRAP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALSCRAP_COLDATA);
		return flag;
	}
	
	public boolean PhysicalScrap_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_PHYSICALSCRAP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALSCRAP_COLHEADER, Reports_CycleCountPageLocators.STRING_PHYSICALSCRAP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_PHYSICALSCRAP_COLDATA);
		return flag;
	}
	
	public boolean VarianceScrap_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Reports_CycleCountPageLocators.STRING_VARIANCESCRAP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCESCRAP_COLHEADER, Reports_CycleCountPageLocators.STRING_VARIANCESCRAP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCESCRAP_COLDATA);
		return flag;
	}
	
	public boolean VarianceScrap_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Reports_CycleCountPageLocators.STRING_VARIANCESCRAP_COLHEADER, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCESCRAP_COLHEADER, Reports_CycleCountPageLocators.STRING_VARIANCESCRAP_COLDATA, ElementType.Xpath, Reports_CycleCountPageLocators.BY_VARIANCESCRAP_COLDATA);
		return flag;
	}
	

	
}
