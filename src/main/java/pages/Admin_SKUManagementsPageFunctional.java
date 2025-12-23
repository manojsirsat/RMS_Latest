package pages;

import commonfunctions.CommonFunctions;
import locators.Admin_SKUManagementsPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_SKUManagementsPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Admin SKU Managements page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_SKUManagementsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_SKUMANAGEMENTPAGE_LEFTNAV, ElementType.Xpath, Admin_SKUManagementsPageLocators.ADMIN_SKUMANAGEMENTPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean SKU_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_SKU_COLHEADER, Admin_SKUManagementsPageLocators.STRING_SKU_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKU_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_SKU_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_SKU_COLHEADER, Admin_SKUManagementsPageLocators.STRING_SKU_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_SKU_COLDATA);
		return flag;
	}
	
	public boolean SKUName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_SKUNAME_COLHEADER, Admin_SKUManagementsPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean SKUName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_SKUNAME_COLHEADER, Admin_SKUManagementsPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}
	
	public boolean Type_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_TYPE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_TYPE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_TYPE_COLDATA);
		return flag;
	}
	
	public boolean Type_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_TYPE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_TYPE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_TYPE_COLDATA);
		return flag;
	}
	
	public boolean Account_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_ACCOUNT_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_ACCOUNT_COLHEADER, Admin_SKUManagementsPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}
	
	public boolean Account_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_ACCOUNT_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_ACCOUNT_COLHEADER, Admin_SKUManagementsPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}
	
	public boolean RecoveryValue_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_RECOVERYVALUE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_RECOVERYVALUE_COLDATA);
		return flag;
	}
	
	public boolean RecoveryValue_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_RECOVERYVALUE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_RECOVERYVALUE_COLDATA);
		return flag;
	}
	
	public boolean RecoveryValueOverride_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUEOVERRIDE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_RECOVERYVALUEOVERRIDE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUEOVERRIDE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_RECOVERYVALUEOVERRIDE_COLDATA);
		return flag;
	}
	
	public boolean RecoveryValueOverride_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUEOVERRIDE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_RECOVERYVALUEOVERRIDE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUEOVERRIDE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_RECOVERYVALUEOVERRIDE_COLDATA);
		return flag;
	}
	
	public boolean Length_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_LENGTH_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_LENGTH_COLHEADER, Admin_SKUManagementsPageLocators.STRING_LENGTH_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_LENGTH_COLDATA);
		return flag;
	}
	
	public boolean Length_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_LENGTH_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_LENGTH_COLHEADER, Admin_SKUManagementsPageLocators.STRING_LENGTH_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_LENGTH_COLDATA);
		return flag;
	}
	
	public boolean Width_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_WIDTH_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WIDTH_COLHEADER, Admin_SKUManagementsPageLocators.STRING_WIDTH_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WIDTH_COLDATA);
		return flag;
	}
	
	public boolean Width_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_WIDTH_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WIDTH_COLHEADER, Admin_SKUManagementsPageLocators.STRING_WIDTH_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WIDTH_COLDATA);
		return flag;
	}
	
	public boolean Height_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_HEIGHT_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_HEIGHT_COLHEADER, Admin_SKUManagementsPageLocators.STRING_HEIGHT_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_HEIGHT_COLDATA);
		return flag;
	}
	
	public boolean Height_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_HEIGHT_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_HEIGHT_COLHEADER, Admin_SKUManagementsPageLocators.STRING_HEIGHT_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_HEIGHT_COLDATA);
		return flag;
	}
	
	public boolean Weight_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_WEIGHT_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WEIGHT_COLHEADER, Admin_SKUManagementsPageLocators.STRING_WEIGHT_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WEIGHT_COLDATA);
		return flag;
	}
	
	public boolean Weight_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_WEIGHT_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WEIGHT_COLHEADER, Admin_SKUManagementsPageLocators.STRING_WEIGHT_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WEIGHT_COLDATA);
		return flag;
	}
	
	public boolean Notifiable_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_NOTIFIABLE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_NOTIFIABLE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_NOTIFIABLE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_NOTIFIABLE_COLDATA);
		return flag;
	}
	
	public boolean Notifiable_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_NOTIFIABLE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_NOTIFIABLE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_NOTIFIABLE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_NOTIFIABLE_COLDATA);
		return flag;
	}
	
	public boolean Orderable_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_ORDERABLE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_ORDERABLE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_ORDERABLE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_ORDERABLE_COLDATA);
		return flag;
	}
	
	public boolean Orderable_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_ORDERABLE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_ORDERABLE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_ORDERABLE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_ORDERABLE_COLDATA);
		return flag;
	}
	
	public boolean Confirmable_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_CONFIRMABLE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_CONFIRMABLE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_CONFIRMABLE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_CONFIRMABLE_COLDATA);
		return flag;
	}
	
	public boolean Confirmable_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_CONFIRMABLE_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_CONFIRMABLE_COLHEADER, Admin_SKUManagementsPageLocators.STRING_CONFIRMABLE_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_CONFIRMABLE_COLDATA);
		return flag;
	}
	
	public boolean LastUpdatedBy_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_LASTUPDATEDBY_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_LASTUPDATEDBY_COLHEADER, Admin_SKUManagementsPageLocators.STRING_LASTUPDATEDBY_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_LASTUPDATEDBY_COLDATA);
		return flag;
	}
	
	public boolean LastUpdatedBy_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_LASTUPDATEDBY_COLHEADER, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_LASTUPDATEDBY_COLHEADER, Admin_SKUManagementsPageLocators.STRING_LASTUPDATEDBY_COLDATA, ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_LASTUPDATEDBY_COLDATA);
		return flag;
	}
	
}
