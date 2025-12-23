package pages;

import commonfunctions.CommonFunctions;
import locators.Accounts_AccountsPageLocators;
import locators.Accounts_LocationsPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Accounts_LocationsPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Locations page
	 * @throws InterruptedException
	 */
	public boolean navigate_LocationsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ACCOUNTS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.ACCOUNTS_ACCOUNTS_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ACCOUNTS_LOCATIONS_PAGE, ElementType.Xpath, Accounts_LocationsPageLocators.ACCOUNTS_LOCATIONSPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean LocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_LOCCODE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCCODE_COLHEADER, Accounts_LocationsPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}
	
	public boolean LocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_LOCCODE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCCODE_COLHEADER, Accounts_LocationsPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}
	
	public boolean LocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_LOCNAME_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCNAME_COLHEADER, Accounts_LocationsPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}
	
	public boolean LocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_LOCNAME_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCNAME_COLHEADER, Accounts_LocationsPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}
	
	public boolean LocType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_LOCTYPE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCTYPE_COLHEADER, Accounts_LocationsPageLocators.STRING_LOCTYPE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCTYPE_COLDATA);
		return flag;
	}
	
	public boolean LocType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_LOCTYPE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCTYPE_COLHEADER, Accounts_LocationsPageLocators.STRING_LOCTYPE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCTYPE_COLDATA);
		return flag;
	}
	
	public boolean AcctCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_ACCTCODE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACCTCODE_COLHEADER, Accounts_LocationsPageLocators.STRING_ACCTCODE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACCTCODE_COLDATA);
		return flag;
	}
	
	public boolean AcctCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_ACCTCODE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACCTCODE_COLHEADER, Accounts_LocationsPageLocators.STRING_ACCTCODE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACCTCODE_COLDATA);
		return flag;
	}
	
	public boolean Monitor_Recoveries_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_MONITOR_RECOVERIES_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_MONITOR_RECOVERIES_COLHEADER, Accounts_LocationsPageLocators.STRING_MONITOR_RECOVERIES_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_MONITOR_RECOVERIES_COLDATA);
		return flag;
	}
	
	public boolean Monitor_Recoveries_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_MONITOR_RECOVERIES_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_MONITOR_RECOVERIES_COLHEADER, Accounts_LocationsPageLocators.STRING_MONITOR_RECOVERIES_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_MONITOR_RECOVERIES_COLDATA);
		return flag;
	}
	
	public boolean Monitor_Replenishments_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_MONITOR_REPLENISHMENT_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_MONITOR_REPLENISHMENT_COLHEADER, Accounts_LocationsPageLocators.STRING_MONITOR_REPLENISHMENT_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_MONITOR_REPLENISHMENT_COLDATA);
		return flag;
	}
	
	public boolean Monitor_Replenishments_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_MONITOR_REPLENISHMENT_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_MONITOR_REPLENISHMENT_COLHEADER, Accounts_LocationsPageLocators.STRING_MONITOR_REPLENISHMENT_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_MONITOR_REPLENISHMENT_COLDATA);
		return flag;
	}
	
	public boolean Notifiable_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_NOTIFIABLE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_NOTIFIABLE_COLHEADER, Accounts_LocationsPageLocators.STRING_NOTIFIABLE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_NOTIFIABLE_COLDATA);
		return flag;
	}
	
	public boolean Notifiable_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_NOTIFIABLE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_NOTIFIABLE_COLHEADER, Accounts_LocationsPageLocators.STRING_NOTIFIABLE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_NOTIFIABLE_COLDATA);
		return flag;
	}
	
	public boolean Zone_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZONE_COLHEADER, Accounts_LocationsPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Zone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_ZONE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZONE_COLHEADER, Accounts_LocationsPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZONE_COLDATA);
		return flag;
	}
	
	public boolean Region_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_REGION_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_REGION_COLHEADER, Accounts_LocationsPageLocators.STRING_REGION_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_REGION_COLDATA);
		return flag;
	}
	
	public boolean Region_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_REGION_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_REGION_COLHEADER, Accounts_LocationsPageLocators.STRING_REGION_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_REGION_COLDATA);
		return flag;
	}
	
	public boolean Address_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_ADDRESS_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ADDRESS_COLHEADER, Accounts_LocationsPageLocators.STRING_ADDRESS_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ADDRESS_COLDATA);
		return flag;
	}
	
	public boolean Address_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_ADDRESS_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ADDRESS_COLHEADER, Accounts_LocationsPageLocators.STRING_ADDRESS_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ADDRESS_COLDATA);
		return flag;
	}
	
	public boolean City_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CITY_COLHEADER, Accounts_LocationsPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean City_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_CITY_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CITY_COLHEADER, Accounts_LocationsPageLocators.STRING_CITY_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CITY_COLDATA);
		return flag;
	}
	
	public boolean State_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_STATE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_STATE_COLHEADER, Accounts_LocationsPageLocators.STRING_STATE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_STATE_COLDATA);
		return flag;
	}
	
	public boolean State_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_STATE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_STATE_COLHEADER, Accounts_LocationsPageLocators.STRING_STATE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_STATE_COLDATA);
		return flag;
	}
	
	public boolean Zip_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_ZIP_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZIP_COLHEADER, Accounts_LocationsPageLocators.STRING_ZIP_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZIP_COLDATA);
		return flag;
	}
	
	public boolean Zip_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_ZIP_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZIP_COLHEADER, Accounts_LocationsPageLocators.STRING_ZIP_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZIP_COLDATA);
		return flag;
	}
	
	public boolean Def_Prov_Loc_Code_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_CODE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_CODE_COLHEADER, Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_CODE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_CODE_COLDATA);
		return flag;
	}
	
	public boolean Def_Prov_Loc_Code_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_CODE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_CODE_COLHEADER, Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_CODE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_CODE_COLDATA);
		return flag;
	}
	
	public boolean Def_Prov_Loc_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_COLHEADER, Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_COLDATA);
		return flag;
	}
	
	public boolean Def_Prov_Loc_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_COLHEADER, Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_COLDATA);
		return flag;
	}
	
	public boolean Call_Priority_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_CALL_PRIORITY_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CALL_PRIORITY_COLHEADER, Accounts_LocationsPageLocators.STRING_CALL_PRIORITY_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CALL_PRIORITY_COLDATA);
		return flag;
	}
	
	public boolean Call_Priority_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_CALL_PRIORITY_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CALL_PRIORITY_COLHEADER, Accounts_LocationsPageLocators.STRING_CALL_PRIORITY_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CALL_PRIORITY_COLDATA);
		return flag;
	}
	
	public boolean Short_Name_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_SHORT_NAME_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_SHORT_NAME_COLHEADER, Accounts_LocationsPageLocators.STRING_SHORT_NAME_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_SHORT_NAME_COLDATA);
		return flag;
	}
	
	public boolean Short_Name_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_SHORT_NAME_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_SHORT_NAME_COLHEADER, Accounts_LocationsPageLocators.STRING_SHORT_NAME_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_SHORT_NAME_COLDATA);
		return flag;
	}
	
	public boolean Contact_Name_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_NAME_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_NAME_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_NAME_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_NAME_COLDATA);
		return flag;
	}
	
	public boolean Contact_Name_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_NAME_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_NAME_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_NAME_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_NAME_COLDATA);
		return flag;
	}
	
	public boolean Contact_Phone_Country_Code_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COUNTRY_CODE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COUNTRY_CODE_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COUNTRY_CODE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COUNTRY_CODE_COLDATA);
		return flag;
	}
	
	public boolean Contact_Phone_Country_Code_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COUNTRY_CODE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COUNTRY_CODE_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COUNTRY_CODE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COUNTRY_CODE_COLDATA);
		return flag;
	}
	
	public boolean Contact_Phone_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COLDATA);
		return flag;
	}
	
	public boolean Contact_Phone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COLDATA);
		return flag;
	}
	
	public boolean Contact_Email_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_EMAIL_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_EMAIL_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_EMAIL_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_EMAIL_COLDATA);
		return flag;
	}
	
	public boolean Contact_Email_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_EMAIL_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_EMAIL_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_EMAIL_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_EMAIL_COLDATA);
		return flag;
	}
	
	public boolean Contact_Business_Phone_Country_Code_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLDATA);
		return flag;
	}
	
	public boolean Contact_Business_Phone_Country_Code_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLDATA);
		return flag;
	}
	
	public boolean Contact_Business_Phone_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COLDATA);
		return flag;
	}
	
	public boolean Contact_Business_Phone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COLDATA);
		return flag;
	}
	
	public boolean Contact_Business_Phone_EXT_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_EXT_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_EXT_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_EXT_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_EXT_COLDATA);
		return flag;
	}
	
	public boolean Contact_Business_Phone_EXT_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_EXT_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_EXT_COLHEADER, Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_EXT_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_EXT_COLDATA);
		return flag;
	}
	
	public boolean Active_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_ACTIVE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACTIVE_COLHEADER, Accounts_LocationsPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
	
	public boolean Active_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_ACTIVE_COLHEADER, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACTIVE_COLHEADER, Accounts_LocationsPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
}
