package locators;

import org.openqa.selenium.By;

public class Accounts_LocationsPageLocators 
{
	
	/**XPATH*/ public static final String ACCOUNTS_LOCATIONSPAGE_HEADING = "//div[text()='Locations']";
	
	//Sorting
			public static final By BY_LOCCODE_COLHEADER = By.xpath("(//th[contains(.,'Loc Code')])[1]");
			public static final By BY_LOCCODE_COLDATA = By.xpath("//table/tbody/tr/td[1]");
			/**XPATH*/ public static final String STRING_LOCCODE_COLDATA = "//table/tbody/tr/td[1]";
			/**XPATH*/ public static final String STRING_LOCCODE_COLHEADER = "(//th[contains(.,'Loc Code')])[1]";
			
			public static final By BY_LOCNAME_COLHEADER = By.xpath("//th[contains(.,'Loc Name')]");
			public static final By BY_LOCNAME_COLDATA = By.xpath("//table/tbody/tr/td[2]");
			/**XPATH*/ public static final String STRING_LOCNAME_COLDATA = "//table/tbody/tr/td[2]";
			/**XPATH*/ public static final String STRING_LOCNAME_COLHEADER = "//th[contains(.,'Loc Name')]";
			
			public static final By BY_LOCTYPE_COLHEADER = By.xpath("//th[contains(.,'Loc Type')]");
			public static final By BY_LOCTYPE_COLDATA = By.xpath("//table/tbody/tr/td[3]");
			/**XPATH*/ public static final String STRING_LOCTYPE_COLDATA = "//table/tbody/tr/td[3]";
			/**XPATH*/ public static final String STRING_LOCTYPE_COLHEADER = "//th[contains(.,'Loc Type')]";
			
			public static final By BY_ACCTCODE_COLHEADER = By.xpath("//th[contains(.,'Acct Code')]");
			public static final By BY_ACCTCODE_COLDATA = By.xpath("//table/tbody/tr/td[4]");
			/**XPATH*/ public static final String STRING_ACCTCODE_COLDATA = "//table/tbody/tr/td[4]";
			/**XPATH*/ public static final String STRING_ACCTCODE_COLHEADER = "//th[contains(.,'Acct Code')]";
			
			public static final By BY_ACCTNAME_COLHEADER = By.xpath("//th[contains(.,'Acct Name')]");
			public static final By BY_ACCTNAME_COLDATA = By.xpath("//table/tbody/tr/td[5]");
			/**XPATH*/ public static final String STRING_ACCTNAME_COLDATA = "//table/tbody/tr/td[5]";
			/**XPATH*/ public static final String STRING_ACCTNAME_COLHEADER = "//th[contains(.,'Acct Name')]";
			
			public static final By BY_MONITOR_RECOVERIES_COLHEADER = By.xpath("//th[contains(.,'Monitor Recoveries')]");
			public static final By BY_MONITOR_RECOVERIES_COLDATA = By.xpath("//table/tbody/tr/td[6]");
			/**XPATH*/ public static final String STRING_MONITOR_RECOVERIES_COLDATA = "//table/tbody/tr/td[6]";
			/**XPATH*/ public static final String STRING_MONITOR_RECOVERIES_COLHEADER = "//th[contains(.,'Monitor Recoveries')]";
			
			public static final By BY_MONITOR_REPLENISHMENT_COLHEADER = By.xpath("//th[contains(.,'Monitor Replenishments')]");
			public static final By BY_MONITOR_REPLENISHMENT_COLDATA = By.xpath("//table/tbody/tr/td[7]");
			/**XPATH*/ public static final String STRING_MONITOR_REPLENISHMENT_COLDATA = "//table/tbody/tr/td[7]";
			/**XPATH*/ public static final String STRING_MONITOR_REPLENISHMENT_COLHEADER = "//th[contains(.,'Monitor Replenishments')]";
			
			public static final By BY_NOTIFIABLE_COLHEADER = By.xpath("//th[contains(.,'Notifiable')]");
			public static final By BY_NOTIFIABLE_COLDATA = By.xpath("//table/tbody/tr/td[8]");
			/**XPATH*/ public static final String STRING_NOTIFIABLE_COLDATA = "//table/tbody/tr/td[8]";
			/**XPATH*/ public static final String STRING_NOTIFIABLE_COLHEADER = "//th[contains(.,'Notifiable')]";
			
			public static final By BY_ZONE_COLHEADER = By.xpath("//th[contains(.,'Zone')]");
			public static final By BY_ZONE_COLDATA = By.xpath("//table/tbody/tr/td[9]");
			/**XPATH*/ public static final String STRING_ZONE_COLDATA = "//table/tbody/tr/td[9]";
			/**XPATH*/ public static final String STRING_ZONE_COLHEADER = "//th[contains(.,'Zone')]";
			
			public static final By BY_REGION_COLHEADER = By.xpath("//th[contains(.,'Region')]");
			public static final By BY_REGION_COLDATA = By.xpath("//table/tbody/tr/td[10]");
			/**XPATH*/ public static final String STRING_REGION_COLDATA = "//table/tbody/tr/td[10]";
			/**XPATH*/ public static final String STRING_REGION_COLHEADER = "//th[contains(.,'Region')]";
			
			public static final By BY_ADDRESS_COLHEADER = By.xpath("//th[contains(.,'Address')]");
			public static final By BY_ADDRESS_COLDATA = By.xpath("//table/tbody/tr/td[11]");
			/**XPATH*/ public static final String STRING_ADDRESS_COLDATA = "//table/tbody/tr/td[11]";
			/**XPATH*/ public static final String STRING_ADDRESS_COLHEADER = "//th[contains(.,'Address')]";
			
			public static final By BY_CITY_COLHEADER = By.xpath("//th[contains(.,'City')]");
			public static final By BY_CITY_COLDATA = By.xpath("//table/tbody/tr/td[12]");
			/**XPATH*/ public static final String STRING_CITY_COLDATA = "//table/tbody/tr/td[12]";
			/**XPATH*/ public static final String STRING_CITY_COLHEADER = "//th[contains(.,'City')]";
			
			public static final By BY_STATE_COLHEADER = By.xpath("//th[contains(.,'State')]");
			public static final By BY_STATE_COLDATA = By.xpath("//table/tbody/tr/td[13]");
			/**XPATH*/ public static final String STRING_STATE_COLDATA = "//table/tbody/tr/td[13]";
			/**XPATH*/ public static final String STRING_STATE_COLHEADER = "//th[contains(.,'State')]";
			
			public static final By BY_ZIP_COLHEADER = By.xpath("//th[contains(.,'Zip')]");
			public static final By BY_ZIP_COLDATA = By.xpath("//table/tbody/tr/td[14]");
			/**XPATH*/ public static final String STRING_ZIP_COLDATA = "//table/tbody/tr/td[14]";
			/**XPATH*/ public static final String STRING_ZIP_COLHEADER = "//th[contains(.,'Zip')]";
			
			public static final By BY_DEF_PROV_LOC_CODE_COLHEADER = By.xpath("//th[contains(.,'Def Prov Loc Code')]");
			public static final By BY_DEF_PROV_LOC_CODE_COLDATA = By.xpath("//table/tbody/tr/td[15]");
			/**XPATH*/ public static final String STRING_DEF_PROV_LOC_CODE_COLDATA = "//table/tbody/tr/td[15]";
			/**XPATH*/ public static final String STRING_DEF_PROV_LOC_CODE_COLHEADER = "//th[contains(.,'Def Prov Loc Code')]";
			
			public static final By BY_DEF_PROV_LOC_COLHEADER = By.xpath("//th[contains(.,'Def Prov Loc')]");
			public static final By BY_DEF_PROV_LOC_COLDATA = By.xpath("//table/tbody/tr/td[16]");
			/**XPATH*/ public static final String STRING_DEF_PROV_LOC_COLDATA = "//table/tbody/tr/td[16]";
			/**XPATH*/ public static final String STRING_DEF_PROV_LOC_COLHEADER = "//th[contains(.,'Def Prov Loc')]";
			
			public static final By BY_CALL_PRIORITY_COLHEADER = By.xpath("//th[contains(.,'Call Priority')]");
			public static final By BY_CALL_PRIORITY_COLDATA = By.xpath("//table/tbody/tr/td[17]");
			/**XPATH*/ public static final String STRING_CALL_PRIORITY_COLDATA = "//table/tbody/tr/td[17]";
			/**XPATH*/ public static final String STRING_CALL_PRIORITY_COLHEADER = "//th[contains(.,'Call Priority')]";
			
			public static final By BY_SHORT_NAME_COLHEADER = By.xpath("//th[contains(.,'Short Name')]");
			public static final By BY_SHORT_NAME_COLDATA = By.xpath("//table/tbody/tr/td[18]");
			/**XPATH*/ public static final String STRING_SHORT_NAME_COLDATA = "//table/tbody/tr/td[18]";
			/**XPATH*/ public static final String STRING_SHORT_NAME_COLHEADER = "//th[contains(.,'Short Name')]";
			
			public static final By BY_CONTACT_NAME_COLHEADER = By.xpath("//th[contains(.,'Contact Name')]");
			public static final By BY_CONTACT_NAME_COLDATA = By.xpath("//table/tbody/tr/td[19]");
			/**XPATH*/ public static final String STRING_CONTACT_NAME_COLDATA = "//table/tbody/tr/td[19]";
			/**XPATH*/ public static final String STRING_CONTACT_NAME_COLHEADER = "//th[contains(.,'Contact Name')]";
			
			public static final By BY_CONTACT_PHONE_COUNTRY_CODE_COLHEADER = By.xpath("//th[contains(.,'Contact Phone Country Code')]");
			public static final By BY_CONTACT_PHONE_COUNTRY_CODE_COLDATA = By.xpath("//table/tbody/tr/td[20]");
			/**XPATH*/ public static final String STRING_CONTACT_PHONE_COUNTRY_CODE_COLDATA = "//table/tbody/tr/td[20]";
			/**XPATH*/ public static final String STRING_CONTACT_PHONE_COUNTRY_CODE_COLHEADER = "//th[contains(.,'Contact Phone Country Code')]";
			
			public static final By BY_CONTACT_PHONE_COLHEADER = By.xpath("//th[contains(.,'Contact Phone')]");
			public static final By BY_CONTACT_PHONE_COLDATA = By.xpath("//table/tbody/tr/td[21]");
			/**XPATH*/ public static final String STRING_CONTACT_PHONE_COLDATA = "//table/tbody/tr/td[21]";
			/**XPATH*/ public static final String STRING_CONTACT_PHONE_COLHEADER = "//th[contains(.,'Contact Phone')]";
			
			public static final By BY_CONTACT_EMAIL_COLHEADER = By.xpath("//th[contains(.,'Contact Email')]");
			public static final By BY_CONTACT_EMAIL_COLDATA = By.xpath("//table/tbody/tr/td[22]");
			/**XPATH*/ public static final String STRING_CONTACT_EMAIL_COLDATA = "//table/tbody/tr/td[22]";
			/**XPATH*/ public static final String STRING_CONTACT_EMAIL_COLHEADER = "//th[contains(.,'Contact Eamil')]";
			
			public static final By BY_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLHEADER = By.xpath("//th[contains(.,'Contact Business Phone Country Code')]");
			public static final By BY_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLDATA = By.xpath("//table/tbody/tr/td[23]");
			/**XPATH*/ public static final String STRING_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLDATA = "//table/tbody/tr/td[23]";
			/**XPATH*/ public static final String STRING_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLHEADER = "//th[contains(.,'Contact Business Phone Country Code')]";
			
			public static final By BY_CONTACT_BUSINESS_PHONE_COLHEADER = By.xpath("//th[contains(.,'Contact Business Phone')]");
			public static final By BY_CONTACT_BUSINESS_PHONE_COLDATA = By.xpath("//table/tbody/tr/td[24]");
			/**XPATH*/ public static final String STRING_CONTACT_BUSINESS_PHONE_COLDATA = "//table/tbody/tr/td[24]";
			/**XPATH*/ public static final String STRING_CONTACT_BUSINESS_PHONE_COLHEADER = "//th[contains(.,'Contact Business Phone')]";
			
			public static final By BY_CONTACT_BUSINESS_PHONE_EXT_COLHEADER = By.xpath("//th[contains(.,'Contact Business Phone Ext')]");
			public static final By BY_CONTACT_BUSINESS_PHONE_EXT_COLDATA = By.xpath("//table/tbody/tr/td[25]");
			/**XPATH*/ public static final String STRING_CONTACT_BUSINESS_PHONE_EXT_COLDATA = "//table/tbody/tr/td[25]";
			/**XPATH*/ public static final String STRING_CONTACT_BUSINESS_PHONE_EXT_COLHEADER = "//th[contains(.,'Contact Business Phone Ext')]";
			
			public static final By BY_ACTIVE_COLHEADER = By.xpath("//th[contains(.,'Active')]");
			public static final By BY_ACTIVE_COLDATA = By.xpath("//table/tbody/tr/td[31]");
			/**XPATH*/ public static final String STRING_ACTIVE_COLDATA = "//table/tbody/tr/td[31]";
			/**XPATH*/ public static final String STRING_ACTIVE_COLHEADER = "//th[contains(.,'Active')]";
			
			
			
			
			
	
}
