package pages;

import commonfunctions.CommonFunctions;
import locators.Admin_PlansPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_PlansPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Admin Plans page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_PlansListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_PLANSPAGE_LEFTNAV, ElementType.Xpath, Admin_PlansPageLocators.ADMIN_PLANSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean ID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_ID_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_ID_COLHEADER, Admin_PlansPageLocators.STRING_ID_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_ID_COLDATA);
		return flag;
	}
	
	public boolean ID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_ID_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_ID_COLHEADER, Admin_PlansPageLocators.STRING_ID_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_ID_COLDATA);
		return flag;
	}
	
	public boolean Name_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_NAME_COLHEADER, Admin_PlansPageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Name_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_NAME_COLHEADER, Admin_PlansPageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Program_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_PROGRAM_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_PROGRAM_COLHEADER, Admin_PlansPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}
	
	public boolean Program_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_PROGRAM_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_PROGRAM_COLHEADER, Admin_PlansPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}
	
	public boolean ManagedBy_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_MANAGEDBY_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_MANAGEDBY_COLHEADER, Admin_PlansPageLocators.STRING_MANAGEDBY_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_MANAGEDBY_COLDATA);
		return flag;
	}
	
	public boolean ManagedBy_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_MANAGEDBY_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_MANAGEDBY_COLHEADER, Admin_PlansPageLocators.STRING_MANAGEDBY_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_MANAGEDBY_COLDATA);
		return flag;
	}
	
	public boolean Type_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_TYPE_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_TYPE_COLHEADER, Admin_PlansPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_TYPE_COLDATA);
		return flag;
	}
	
	public boolean Type_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_TYPE_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_TYPE_COLHEADER, Admin_PlansPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_TYPE_COLDATA);
		return flag;
	}
	
	public boolean BasePlan_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_BASEPLAN_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_BASEPLAN_COLHEADER, Admin_PlansPageLocators.STRING_BASEPLAN_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_BASEPLAN_COLDATA);
		return flag;
	}
	
	public boolean BasePlan_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_BASEPLAN_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_BASEPLAN_COLHEADER, Admin_PlansPageLocators.STRING_BASEPLAN_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_BASEPLAN_COLDATA);
		return flag;
	}
	
	public boolean ActiveEnd_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_ACTIVEEND_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_ACTIVEEND_COLHEADER, Admin_PlansPageLocators.STRING_ACTIVEEND_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_ACTIVEEND_COLDATA);
		return flag;
	}
	
	public boolean ActiveEnd_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_ACTIVEEND_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_ACTIVEEND_COLHEADER, Admin_PlansPageLocators.STRING_ACTIVEEND_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_ACTIVEEND_COLDATA);
		return flag;
	}
	
	public boolean Disabled_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_DISABLED_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_DISABLED_COLHEADER, Admin_PlansPageLocators.STRING_DISABLED_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_DISABLED_COLDATA);
		return flag;
	}
	
	public boolean Disabled_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_DISABLED_COLHEADER, ElementType.Xpath, Admin_PlansPageLocators.BY_DISABLED_COLHEADER, Admin_PlansPageLocators.STRING_DISABLED_COLDATA, ElementType.Xpath, Admin_PlansPageLocators.BY_DISABLED_COLDATA);
		return flag;
	}
	
	
}
