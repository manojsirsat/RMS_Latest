package pages;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.Accounts_LocationsPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Accounts_LocationsPageFunctional {

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();

	/**
	 * @author
	 * @return flag This method is used to navigate to Locations page
	 * @throws InterruptedException
	 */
	public boolean navigate_LocationsListingPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.ACCOUNTS_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.ACCOUNTS_ACCOUNTS_PAGE, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ACCOUNTS_LOCATIONS_PAGE,
					ElementType.Xpath, Accounts_LocationsPageLocators.ACCOUNTS_LOCATIONSPAGE_HEADING,
					ElementType.Xpath);
		}
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the pagination functionality
	 * @throws InterruptedException
	 */
	public boolean verifypagination() throws InterruptedException {
		commonfunction.verifyPagination();
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean LocCode_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_LOCCODE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCCODE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean LocCode_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_LOCCODE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCCODE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_LOCCODE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_LOCCODE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean LocName_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_LOCNAME_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCNAME_COLHEADER,
				Accounts_LocationsPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean LocName_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_LOCNAME_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCNAME_COLHEADER,
				Accounts_LocationsPageLocators.STRING_LOCNAME_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_LOCNAME_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean LocType_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_LOCTYPE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCTYPE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_LOCTYPE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_LOCTYPE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean LocType_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_LOCTYPE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_LOCTYPE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_LOCTYPE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_LOCTYPE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean AcctCode_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_ACCTCODE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACCTCODE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_ACCTCODE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_ACCTCODE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean AcctCode_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_ACCTCODE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACCTCODE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_ACCTCODE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_ACCTCODE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Monitor_Recoveries_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_MONITOR_RECOVERIES_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_MONITOR_RECOVERIES_COLHEADER,
				Accounts_LocationsPageLocators.STRING_MONITOR_RECOVERIES_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_MONITOR_RECOVERIES_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Monitor_Recoveries_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_MONITOR_RECOVERIES_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_MONITOR_RECOVERIES_COLHEADER,
				Accounts_LocationsPageLocators.STRING_MONITOR_RECOVERIES_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_MONITOR_RECOVERIES_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Monitor_Replenishments_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_MONITOR_REPLENISHMENT_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_MONITOR_REPLENISHMENT_COLHEADER,
				Accounts_LocationsPageLocators.STRING_MONITOR_REPLENISHMENT_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_MONITOR_REPLENISHMENT_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Monitor_Replenishments_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_MONITOR_REPLENISHMENT_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_MONITOR_REPLENISHMENT_COLHEADER,
				Accounts_LocationsPageLocators.STRING_MONITOR_REPLENISHMENT_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_MONITOR_REPLENISHMENT_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Notifiable_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_NOTIFIABLE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_NOTIFIABLE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_NOTIFIABLE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_NOTIFIABLE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Notifiable_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_NOTIFIABLE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_NOTIFIABLE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_NOTIFIABLE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_NOTIFIABLE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Zone_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_ZONE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZONE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_ZONE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Zone_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_ZONE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZONE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_ZONE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Region_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_REGION_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_REGION_COLHEADER,
				Accounts_LocationsPageLocators.STRING_REGION_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_REGION_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Region_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_REGION_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_REGION_COLHEADER,
				Accounts_LocationsPageLocators.STRING_REGION_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_REGION_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Address_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_ADDRESS_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_ADDRESS_COLHEADER,
				Accounts_LocationsPageLocators.STRING_ADDRESS_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_ADDRESS_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Address_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_ADDRESS_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_ADDRESS_COLHEADER,
				Accounts_LocationsPageLocators.STRING_ADDRESS_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_ADDRESS_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean City_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_CITY_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_CITY_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CITY_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CITY_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean City_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_CITY_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_CITY_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CITY_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CITY_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean State_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_STATE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_STATE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_STATE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_STATE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean State_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_STATE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_STATE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_STATE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_STATE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Zip_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_ZIP_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZIP_COLHEADER,
				Accounts_LocationsPageLocators.STRING_ZIP_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_ZIP_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Zip_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_ZIP_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_ZIP_COLHEADER,
				Accounts_LocationsPageLocators.STRING_ZIP_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_ZIP_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Def_Prov_Loc_Code_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_CODE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_CODE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_CODE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_CODE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Def_Prov_Loc_Code_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_CODE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_CODE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_CODE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_CODE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Def_Prov_Loc_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_COLHEADER,
				Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Def_Prov_Loc_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_COLHEADER,
				Accounts_LocationsPageLocators.STRING_DEF_PROV_LOC_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_DEF_PROV_LOC_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Call_Priority_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_CALL_PRIORITY_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CALL_PRIORITY_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CALL_PRIORITY_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CALL_PRIORITY_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Call_Priority_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_CALL_PRIORITY_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CALL_PRIORITY_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CALL_PRIORITY_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CALL_PRIORITY_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Short_Name_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_SHORT_NAME_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_SHORT_NAME_COLHEADER,
				Accounts_LocationsPageLocators.STRING_SHORT_NAME_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_SHORT_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Short_Name_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_SHORT_NAME_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_SHORT_NAME_COLHEADER,
				Accounts_LocationsPageLocators.STRING_SHORT_NAME_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_SHORT_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Name_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_NAME_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_NAME_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_NAME_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Name_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_NAME_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_NAME_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_NAME_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Phone_Country_Code_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COUNTRY_CODE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COUNTRY_CODE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COUNTRY_CODE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COUNTRY_CODE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Phone_Country_Code_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COUNTRY_CODE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COUNTRY_CODE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COUNTRY_CODE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COUNTRY_CODE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Phone_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Phone_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_PHONE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_PHONE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Email_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_EMAIL_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_EMAIL_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_EMAIL_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_EMAIL_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Email_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_EMAIL_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_EMAIL_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_EMAIL_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_EMAIL_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Business_Phone_Country_Code_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Business_Phone_Country_Code_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COUNTRY_CODE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Business_Phone_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Business_Phone_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Business_Phone_EXT_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_EXT_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_EXT_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_EXT_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_EXT_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Contact_Business_Phone_EXT_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_EXT_COLHEADER, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_EXT_COLHEADER,
				Accounts_LocationsPageLocators.STRING_CONTACT_BUSINESS_PHONE_EXT_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_CONTACT_BUSINESS_PHONE_EXT_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Active_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_LocationsPageLocators.STRING_ACTIVE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACTIVE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Active_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_LocationsPageLocators.STRING_ACTIVE_COLHEADER,
				ElementType.Xpath, Accounts_LocationsPageLocators.BY_ACTIVE_COLHEADER,
				Accounts_LocationsPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath,
				Accounts_LocationsPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}

	

	/**
	 * @author
	 * @return flag This method is used to click on create new location button
	 * @throws InterruptedException
	 */
	public boolean click_CreateNewLocationBtn() throws InterruptedException {
		webDB.navigateToRefresh();
		Thread.sleep(1500);
		flag = webDB.isElementDisplayed(Accounts_LocationsPageLocators.CREATE_NEW_LOCATION_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Accounts_LocationsPageLocators.CREATE_NEW_LOCATION_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Accounts_LocationsPageLocators.NAME_INPUTFIELD, ElementType.Xpath);
			if (flag) {
				log.logging("info", "Navigated to Create New Location Page");
			}
		}
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to fill the address details
	 * @throws InterruptedException
	 */
	public boolean fill_Address_Details() throws InterruptedException {
		String address = faker.address().streetAddress();
		String subaddress = faker.address().secondaryAddress();
		String city = faker.address().cityName();
		String zipcode = faker.address().zipCode();
		flag = webDB.waitForElement(Accounts_LocationsPageLocators.ADDRESS_INPUTFIELD, ElementType.Xpath);
		if (flag) {
			flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.ADDRESS_INPUTFIELD, address,
					ElementType.Xpath);
			if (flag) {
				Thread.sleep(750);
				log.logging("info", "Entered address as: " + address);
				flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.SUBADDRESS_INPUTFIELD, subaddress,
						ElementType.Xpath);
				if (flag) {
					Thread.sleep(750);
					log.logging("info", "Entered sub address as: " + subaddress);
					flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.CITY_INPUTFIELD, city,
							ElementType.Xpath);
					if (flag) {
						Thread.sleep(750);
						log.logging("info", "Entered city as: " + city);
						webDB.clickAnElement(Accounts_LocationsPageLocators.STATE_DRPDOWN, ElementType.Xpath);
						Thread.sleep(750);
						int drpdownoptions = webDB.getDriver()
								.findElements(By.xpath(Accounts_LocationsPageLocators.STATE_DRPDOWN_OPTIONS)).size();
						int oneoption = faker.number().numberBetween(1, drpdownoptions);
						flag = webDB.clickAnElement(
								Accounts_LocationsPageLocators.STATE_DRPDOWN_OPTIONS + "[" + oneoption + "]",
								ElementType.Xpath);
						if (flag) {
							Thread.sleep(750);
							String selectedstate = webDB.getAttributeFromElement(
									Accounts_LocationsPageLocators.STATEOPTION_SELECTED, ElementType.Xpath, "value");
							log.logging("info", "Selected state is: " + selectedstate);
							flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.ZIPCODE_INPUTFIELD, zipcode,
									ElementType.Xpath);
							if (flag) {
								Thread.sleep(750);
								log.logging("info", "Entered zipcode as: " + zipcode);
							}
						}
					}
				}
			}
		}
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to fill the contact details
	 * @throws InterruptedException
	 */
	public boolean fill_Contact_Details() throws InterruptedException {
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String contactname = firstname + lastname;
		String contactemail = firstname + lastname + "123@test.com";
		String contactphone = faker.phoneNumber().phoneNumber();
		String businessphone = faker.phoneNumber().phoneNumber();
		String contact_ext = faker.phoneNumber().extension();
		String fax = faker.number().digits(10);

		flag = webDB.waitForElement(Accounts_LocationsPageLocators.CONTACTNAME_INPUTFIELD, ElementType.Xpath);
		if (flag) {
			flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.CONTACTNAME_INPUTFIELD, contactname,
					ElementType.Xpath);
			if (flag) {
				Thread.sleep(750);
				log.logging("info", "Entered contact name as: " + contactname);

				flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.CONTACTEMAIL_INPUTFIELD, contactemail,
						ElementType.Xpath);
				if (flag) {
					Thread.sleep(750);
					log.logging("info", "Entered contact email as: " + contactemail);
					webDB.clickAnElement(Accounts_LocationsPageLocators.CONTACTPHONECOUNTYCODE_DRPDWN,
							ElementType.Xpath);
					Thread.sleep(750);
					int drpdownoptions = webDB.getDriver()
							.findElements(
									By.xpath(Accounts_LocationsPageLocators.CONTACTPHONECOUNTYCODE_DRPDWN_OPTIONS))
							.size();
					int oneoption = faker.number().numberBetween(1, drpdownoptions);
					flag = webDB.clickAnElement(Accounts_LocationsPageLocators.CONTACTPHONECOUNTYCODE_DRPDWN_OPTIONS
							+ "[" + oneoption + "]", ElementType.Xpath);
					if (flag) {
						Thread.sleep(750);
						String selectedcontactphonecountrycode = webDB.getAttributeFromElement(
								Accounts_LocationsPageLocators.CONTACTPHONECOUNTYCODE_SELECTED, ElementType.Xpath,
								"value");
						log.logging("info",
								"Selected Contact Phone Country Code is: " + selectedcontactphonecountrycode);
						Thread.sleep(750);
						flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.CONTACTPHONE_INPUTFIELD,
								contactphone, ElementType.Xpath);
						if (flag) {
							Thread.sleep(750);
							log.logging("info", "Entered contact phone as: " + contactphone);

							webDB.clickAnElement(Accounts_LocationsPageLocators.BUSINESSPHONECOUNTYCODE_DRPDWN,
									ElementType.Xpath);
							Thread.sleep(750);
							int drpdownoptions1 = webDB.getDriver()
									.findElements(By.xpath(
											Accounts_LocationsPageLocators.BUSINESSPHONECOUNTYCODE_DRPDWN_OPTIONS))
									.size();
							int oneoption1 = faker.number().numberBetween(1, drpdownoptions1);
							flag = webDB.clickAnElement(
									Accounts_LocationsPageLocators.BUSINESSPHONECOUNTYCODE_DRPDWN_OPTIONS + "["
											+ oneoption1 + "]",
									ElementType.Xpath);
							if (flag) {
								Thread.sleep(750);
								String selectedbusinessphonecountrycode = webDB.getAttributeFromElement(
										Accounts_LocationsPageLocators.BUSINESSPHONECOUNTYCODE_SELECTED,
										ElementType.Xpath, "value");
								log.logging("info",
										"Selected Business Phone Country Code is: " + selectedbusinessphonecountrycode);
								flag = webDB.sendTextToAnElement(
										Accounts_LocationsPageLocators.BUSINESSPHONE_INPUTFIELD, businessphone,
										ElementType.Xpath);
								if (flag) {
									Thread.sleep(750);
									log.logging("info", "Entered business phone as: " + businessphone);
									flag = webDB.sendTextToAnElement(
											Accounts_LocationsPageLocators.BUSINESSPHONE_EXT_INPUTFIELD, contact_ext,
											ElementType.Xpath);
									if (flag) {
										Thread.sleep(750);
										log.logging("info", "Entered business phone extention as: " + contact_ext);
										flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.FAX_INPUTFILED,
												fax, ElementType.Xpath);
										if (flag) {
											Thread.sleep(750);
											log.logging("info", "Entered fax number as: " + fax);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to fill the Notes details
	 * @throws InterruptedException
	 */
	public boolean fill_Notes_Details() throws InterruptedException {
		flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.NOTES_INPUTFILED, "Testing notes",
				ElementType.Xpath);
		if (flag) {
			Thread.sleep(750);
			log.logging("info", "Entered notes as: " + "Testing notes");
			flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.DELIVERYNOTES_INPUTFILED,
					"Testing delivery notes", ElementType.Xpath);
			if (flag) {
				Thread.sleep(750);
				log.logging("info", "Entered delivery notes as: Testing delivery notes");
				flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.RECOVERYNOTES_INPUTFILED,
						"Testing recovery notes", ElementType.Xpath);
				if (flag) {
					Thread.sleep(750);
					log.logging("info", "Entered recovery notes as: Testing recovery notes");
					flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.REQUESTEDDELIVERYWINDOW_INPUTFILED,
							"10AM to 6PM", ElementType.Xpath);
					if(flag)
					{
						Thread.sleep(750);
						log.logging("info", "Entered Requested Delivery Window as 10AM to 6PM");
						flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.REQUESTEDPICKUPWINDOW_INPUTFILED,
								"10AM to 6PM", ElementType.Xpath);
						if(flag)
						{
							Thread.sleep(750);
							log.logging("info", "Entered Requested Pickup Window as 10AM to 6PM");
						}
					}
				}
			}
		}

		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to fill the location form details
	 * @throws InterruptedException
	 */
	public boolean fill_LocationForm() throws InterruptedException {
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String name = faker.name().fullName();
		String code = firstname + lastname + "123";
		String shortname = name + "123";

		flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.NAME_INPUTFIELD, name + " test",
				ElementType.Xpath);
		if (flag) {
			Thread.sleep(750);
			log.logging("info", "Entered name as: " + name + "test");
			flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.SHORTNAME_INPUTFIELD, shortname,
					ElementType.Xpath);
			if (flag) {
				Thread.sleep(750);
				log.logging("info", "Entered short name as: " + shortname);
				flag = webDB.sendTextToAnElement(Accounts_LocationsPageLocators.CODE_INPUTFIELD, code,
						ElementType.Xpath);
				if (flag) {
					Thread.sleep(750);
					log.logging("info", "Entered code as: " + code);

					//////////////

					webDB.clickAnElement(Accounts_LocationsPageLocators.LOCATIONTYPE_DRPDWN, ElementType.Xpath);
					Thread.sleep(750);
					int drpdownoptions = webDB.getDriver()
							.findElements(By.xpath(Accounts_LocationsPageLocators.LOCATIONTYPE_DRPDWN_OPTIONS)).size();
					int oneoption = faker.number().numberBetween(1, drpdownoptions);
					flag = webDB.clickAnElement(
							Accounts_LocationsPageLocators.LOCATIONTYPE_DRPDWN_OPTIONS + "[" + oneoption + "]",
							ElementType.Xpath);
					if (flag) {
						Thread.sleep(750);
						String selectedloctype = webDB.getAttributeFromElement(
								Accounts_LocationsPageLocators.LOCATIONTYPE_DRPDWN_SELECTEDOPTION, ElementType.Xpath,
								"value");
						log.logging("info", "Selected Location type is: " + selectedloctype);
//
						webDB.clickAnElement(Accounts_LocationsPageLocators.ACCOUNT_DRPDWN, ElementType.Xpath);
						Thread.sleep(750);
						int drpdownoptions1 = webDB.getDriver()
								.findElements(By.xpath(Accounts_LocationsPageLocators.ACCOUNT_DRPDWN_OPTIONS)).size();
						int oneoption1 = faker.number().numberBetween(1, drpdownoptions1);
						flag = webDB.clickAnElement(
								Accounts_LocationsPageLocators.ACCOUNT_DRPDWN_OPTIONS + "[" + oneoption1 + "]",
								ElementType.Xpath);
						if (flag) {
							Thread.sleep(750);
							String selectedaccount = webDB.getAttributeFromElement(
									Accounts_LocationsPageLocators.ACCOUNT_DRPDWN_OPTIONS_SELECTED, ElementType.Xpath,
									"value");
							log.logging("info", "Selected account is: " + selectedaccount);
							//
							webDB.clickAnElement(Accounts_LocationsPageLocators.ZONE_DRPDWN, ElementType.Xpath);
							Thread.sleep(750);
							int drpdownoptions2 = webDB.getDriver()
									.findElements(By.xpath(Accounts_LocationsPageLocators.ZONE_DRPDWN_OPTIONS)).size();
							int oneoption2 = faker.number().numberBetween(1, drpdownoptions2);
							flag = webDB.clickAnElement(
									Accounts_LocationsPageLocators.ZONE_DRPDWN_OPTIONS + "[" + oneoption2 + "]",
									ElementType.Xpath);
							if (flag) {
								Thread.sleep(750);
								String selectedzone = webDB.getAttributeFromElement(
										Accounts_LocationsPageLocators.ZONE_DRPDWN_OPTIONS_SELECTED, ElementType.Xpath,
										"value");
								log.logging("info", "Selected zone is: " + selectedzone);
								//
								webDB.clickAnElement(Accounts_LocationsPageLocators.REGION_DRPDWN, ElementType.Xpath);
								Thread.sleep(750);
								int drpdownoptions3 = webDB.getDriver()
										.findElements(By.xpath(Accounts_LocationsPageLocators.REGION_DRPDWN_OPTIONS))
										.size();
								int oneoption3 = faker.number().numberBetween(1, drpdownoptions3);
								flag = webDB.clickAnElement(
										Accounts_LocationsPageLocators.REGION_DRPDWN_OPTIONS + "[" + oneoption3 + "]",
										ElementType.Xpath);
								if (flag) {
									Thread.sleep(750);
									String selectedregion = webDB.getAttributeFromElement(
											Accounts_LocationsPageLocators.REGION_DRPDWN_OPTIONS_SELECTED,
											ElementType.Xpath, "value");
									log.logging("info", "Selected region is: " + selectedregion);
									//
									webDB.clickAnElement(Accounts_LocationsPageLocators.CALLPRIORITY_DRPDWN,
											ElementType.Xpath);
									Thread.sleep(750);
									int drpdownoptions4 = webDB.getDriver()
											.findElements(By
													.xpath(Accounts_LocationsPageLocators.CALLPRIORITY_DRPDWN_OPTIONS))
											.size();
									int oneoption4 = faker.number().numberBetween(1, drpdownoptions4);
									flag = webDB
											.clickAnElement(Accounts_LocationsPageLocators.CALLPRIORITY_DRPDWN_OPTIONS
													+ "[" + oneoption4 + "]", ElementType.Xpath);
									if (flag) {
										Thread.sleep(750);
										String selectedcallpriority = webDB.getAttributeFromElement(
												Accounts_LocationsPageLocators.CALLPRIORITY_DRPDWN_OPTIONS_SELECTED,
												ElementType.Xpath, "value");
										log.logging("info", "Selected call priority is: " + selectedcallpriority);
										//
										webDB.clickAnElement(Accounts_LocationsPageLocators.PROGRAM_DRPDWN,
												ElementType.Xpath);
										Thread.sleep(750);
										int drpdownoptions5 = webDB.getDriver()
												.findElements(
														By.xpath(Accounts_LocationsPageLocators.PROGRAM_DRPDWN_OPTIONS))
												.size();
										int oneoption5 = faker.number().numberBetween(1, drpdownoptions5);
										flag = webDB
												.clickAnElement(Accounts_LocationsPageLocators.PROGRAM_DRPDWN_OPTIONS
														+ "[" + oneoption5 + "]", ElementType.Xpath);
										if (flag) {
											Thread.sleep(750);
											String selectedprogram = webDB.getAttributeFromElement(
													Accounts_LocationsPageLocators.PROGRAM_DRPDWN_OPTIONS_SELECTED,
													ElementType.Xpath, "value");
											log.logging("info", "Selected program is: " + selectedprogram);
											int totaloptions = webDB.getDriver().findElements(By.xpath(Accounts_LocationsPageLocators.LOCATIONTYPE_RADIOBTN)).size();
											int oneoption6 = faker.number().numberBetween(1, totaloptions);
											flag = webDB
													.javaScriptClickAnElement(Accounts_LocationsPageLocators.LOCATIONTYPE_RADIOBTN
															+ "[" + oneoption6 + "]", ElementType.Xpath);
											if(flag)
											{
												Thread.sleep(750);
												String selectedlocationtype = webDB.getAttributeFromElement(
														Accounts_LocationsPageLocators.LOCATIONTYPE_RADIOBTN_SELECTED+"["+oneoption6+"]",
														ElementType.Xpath, "value");
												log.logging("info", "Selected the location type as "+selectedlocationtype);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to click on create button after filling form
	 *         details
	 * @throws InterruptedException
	 */
	public boolean click_CreateBtn() throws InterruptedException {
		flag = webDB.waitForClickElement(Accounts_LocationsPageLocators.CREATE_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Accounts_LocationsPageLocators.CREATE_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Accounts_LocationsPageLocators.EDIT_LOCATIONPAGE,
					ElementType.Xpath);
			if (flag) {
				log.logging("info", "New location is created successfully");
			}
		}
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify create new location functionality
	 * @throws InterruptedException
	 */
	public boolean create_NewLocation() throws InterruptedException {
		flag = click_CreateNewLocationBtn();
		if (flag) {
			flag = fill_LocationForm();
			if (flag) {
				flag = fill_Address_Details();
				if (flag) {
					flag = fill_Contact_Details();
					if (flag) {
						flag = fill_Notes_Details();
						if (flag) {
							flag = click_CreateBtn();
						}
					}
				}
			}

		}
		return flag;
	}
}
