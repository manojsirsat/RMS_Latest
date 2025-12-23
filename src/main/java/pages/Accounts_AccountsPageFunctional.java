package pages;

import commonfunctions.CommonFunctions;
import locators.Accounts_AccountsPageLocators;
import locators.CommonFunctionsLocators;
import locators.RecoveriesByLocation_ProgramPageLocators;
import locators.Reports_ArchivePageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Accounts_AccountsPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Accounts page
	 * @throws InterruptedException
	 */
	public boolean navigate_AccountsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ACCOUNTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ACCOUNTS_ACCOUNTS_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ACCOUNTS_ACCOUNTS_PAGE, ElementType.Xpath, Accounts_AccountsPageLocators.ACCOUNTS_ACCOUNTSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean AcctCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_ACCTCODE_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACCTCODE_COLHEADER, Accounts_AccountsPageLocators.STRING_ACCTCODE_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACCTCODE_COLDATA);
		return flag;
	}
	
	public boolean AcctCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_ACCTCODE_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACCTCODE_COLHEADER, Accounts_AccountsPageLocators.STRING_ACCTCODE_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACCTCODE_COLDATA);
		return flag;
	}
	
	public boolean Name_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_NAME_COLHEADER, Accounts_AccountsPageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Name_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_NAME_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_NAME_COLHEADER, Accounts_AccountsPageLocators.STRING_NAME_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_NAME_COLDATA);
		return flag;
	}
	
	public boolean Short_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_SHORT_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_SHORT_COLHEADER, Accounts_AccountsPageLocators.STRING_SHORT_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_SHORT_COLDATA);
		return flag;
	}
	
	public boolean Short_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_SHORT_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_SHORT_COLHEADER, Accounts_AccountsPageLocators.STRING_SHORT_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_SHORT_COLDATA);
		return flag;
	}
	
	public boolean City_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CITY_COLHEADER, Accounts_AccountsPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean City_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CITY_COLHEADER, Accounts_AccountsPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean Admin_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_ADMIN_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ADMIN_COLHEADER, Accounts_AccountsPageLocators.STRING_ADMIN_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ADMIN_COLDATA);
		return flag;
	}
	
	public boolean Admin_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_ADMIN_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ADMIN_COLHEADER, Accounts_AccountsPageLocators.STRING_ADMIN_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ADMIN_COLDATA);
		return flag;
	}
	
	public boolean Customer_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_CUSTOMER_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CUSTOMER_COLHEADER, Accounts_AccountsPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}
	
	public boolean Customer_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_CUSTOMER_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CUSTOMER_COLHEADER, Accounts_AccountsPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}
	
	public boolean Provider_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_PROVIDER_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_PROVIDER_COLHEADER, Accounts_AccountsPageLocators.STRING_PROVIDER_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_PROVIDER_COLDATA);
		return flag;
	}
	
	public boolean Provider_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_PROVIDER_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_PROVIDER_COLHEADER, Accounts_AccountsPageLocators.STRING_PROVIDER_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_PROVIDER_COLDATA);
		return flag;
	}
	
	public boolean Carrier_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_CARRIER_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CARRIER_COLHEADER, Accounts_AccountsPageLocators.STRING_CARRIER_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CARRIER_COLDATA);
		return flag;
	}
	
	public boolean Carrier_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_CARRIER_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CARRIER_COLHEADER, Accounts_AccountsPageLocators.STRING_CARRIER_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_CARRIER_COLDATA);
		return flag;
	}
	
	public boolean Network_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_NETWORK_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_NETWORK_COLHEADER, Accounts_AccountsPageLocators.STRING_NETWORK_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_NETWORK_COLDATA);
		return flag;
	}
	
	public boolean Network_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_NETWORK_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_NETWORK_COLHEADER, Accounts_AccountsPageLocators.STRING_NETWORK_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_NETWORK_COLDATA);
		return flag;
	}
	
	public boolean Active_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_ACTIVE_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACTIVE_COLHEADER, Accounts_AccountsPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
	
	public boolean Active_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_ACTIVE_COLHEADER, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACTIVE_COLHEADER, Accounts_AccountsPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
	
	
	
}
