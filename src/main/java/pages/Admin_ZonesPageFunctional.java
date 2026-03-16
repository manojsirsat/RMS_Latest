package pages;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.Admin_ZonesPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_ZonesPageFunctional {

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();
	
	/**
	 * @author
	 * @return flag This method is used to navigate to Admin Zones page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_ZonesListingPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_ZONESPAGE_LEFTNAV,
					ElementType.Xpath, Admin_ZonesPageLocators.ADMIN_ZONESPAGE_HEADING, ElementType.Xpath);
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
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Zone_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ZonesPageLocators.STRING_ZONE_COLHEADER,
				ElementType.Xpath, Admin_ZonesPageLocators.BY_ZONE_COLHEADER,
				Admin_ZonesPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath,
				Admin_ZonesPageLocators.BY_ZONE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Zone_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ZonesPageLocators.STRING_ZONE_COLHEADER,
				ElementType.Xpath, Admin_ZonesPageLocators.BY_ZONE_COLHEADER,
				Admin_ZonesPageLocators.STRING_ZONE_COLDATA, ElementType.Xpath,
				Admin_ZonesPageLocators.BY_ZONE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Description_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ZonesPageLocators.STRING_DESCRIPTION_COLHEADER,
				ElementType.Xpath, Admin_ZonesPageLocators.BY_DESCRIPTION_COLHEADER,
				Admin_ZonesPageLocators.STRING_DESCRIPTION_COLDATA, ElementType.Xpath,
				Admin_ZonesPageLocators.BY_DESCRIPTION_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Description_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ZonesPageLocators.STRING_DESCRIPTION_COLHEADER,
				ElementType.Xpath, Admin_ZonesPageLocators.BY_DESCRIPTION_COLHEADER,
				Admin_ZonesPageLocators.STRING_DESCRIPTION_COLDATA, ElementType.Xpath,
				Admin_ZonesPageLocators.BY_DESCRIPTION_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean ProviderLocCode_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ZonesPageLocators.STRING_PROVIDERLOCCODE_COLHEADER,
				ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCCODE_COLHEADER,
				Admin_ZonesPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath,
				Admin_ZonesPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean ProviderLocCode_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ZonesPageLocators.STRING_PROVIDERLOCCODE_COLHEADER,
				ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCCODE_COLHEADER,
				Admin_ZonesPageLocators.STRING_PROVIDERLOCCODE_COLDATA, ElementType.Xpath,
				Admin_ZonesPageLocators.BY_PROVIDERLOCCODE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean ProviderLocName_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ZonesPageLocators.STRING_PROVIDERLOCNAME_COLHEADER,
				ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCNAME_COLHEADER,
				Admin_ZonesPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath,
				Admin_ZonesPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean ProviderLocName_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ZonesPageLocators.STRING_PROVIDERLOCNAME_COLHEADER,
				ElementType.Xpath, Admin_ZonesPageLocators.BY_PROVIDERLOCNAME_COLHEADER,
				Admin_ZonesPageLocators.STRING_PROVIDERLOCNAME_COLDATA, ElementType.Xpath,
				Admin_ZonesPageLocators.BY_PROVIDERLOCNAME_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean LocationsCount_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ZonesPageLocators.STRING_LOCATIONSCOUNT_COLHEADER,
				ElementType.Xpath, Admin_ZonesPageLocators.BY_LOCATIONSCOUNT_COLHEADER,
				Admin_ZonesPageLocators.STRING_LOCATIONSCOUNT_COLDATA, ElementType.Xpath,
				Admin_ZonesPageLocators.BY_LOCATIONSCOUNT_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean LocationsCount_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ZonesPageLocators.STRING_LOCATIONSCOUNT_COLHEADER,
				ElementType.Xpath, Admin_ZonesPageLocators.BY_LOCATIONSCOUNT_COLHEADER,
				Admin_ZonesPageLocators.STRING_LOCATIONSCOUNT_COLDATA, ElementType.Xpath,
				Admin_ZonesPageLocators.BY_LOCATIONSCOUNT_COLDATA);
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to click on create new zone button
	 * @throws InterruptedException
	 */
	public boolean click_CreateNewZoneBtn() throws InterruptedException {
		webDB.navigateToRefresh();
		Thread.sleep(3000);
		flag = webDB.isElementDisplayed(Admin_ZonesPageLocators.CREATE_NEW_ZONE_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Admin_ZonesPageLocators.CREATE_NEW_ZONE_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Admin_ZonesPageLocators.CODE_INPUTFIELD, ElementType.Xpath);
			if (flag) {
				log.logging("info", "Navigated to Create New Zone Page");
			}
		}
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to fill the Zone details
	 * @throws InterruptedException
	 */
	public boolean fill_Zone_Details() throws InterruptedException {
		String firstname = faker.name().firstName();
		int num = faker.number().numberBetween(1, 100);
		flag = webDB.sendTextToAnElement(Admin_ZonesPageLocators.CODE_INPUTFIELD, firstname + num+" Test zone", ElementType.Xpath);
		if (flag) {
			Thread.sleep(750);
			log.logging("info", "Entered code as: " + firstname + num+" Test zone");
			flag = webDB.sendTextToAnElement(Admin_ZonesPageLocators.DESCRIPTION_INPUTFIELD,
					"This is testing zone. Created for testing purpose please ignore", ElementType.Xpath);
			if (flag) {
				log.logging("info",
						"Entered description as " + "This is testing zone. Created for testing purpose please ignore");
				Thread.sleep(750);
				webDB.clickAnElement(Admin_ZonesPageLocators.LOCATION_DRPDWN, ElementType.Xpath);
				Thread.sleep(750);
				int drpdownoptions1 = webDB.getDriver()
						.findElements(By.xpath(Admin_ZonesPageLocators.LOCATION_DRPDWN_OPTIONS)).size();
				int oneoption1 = faker.number().numberBetween(1, drpdownoptions1);
				flag = webDB.clickAnElement(Admin_ZonesPageLocators.LOCATION_DRPDWN_OPTIONS + "[" + oneoption1 + "]",
						ElementType.Xpath);
				if (flag) {
					Thread.sleep(750);
					String selectedlocation = webDB.getAttributeFromElement(
							Admin_ZonesPageLocators.LOCATION_DRPDWN_OPTIONS_SELECTED, ElementType.Xpath, "value");
					log.logging("info", "Selected primary location is: " + selectedlocation);
				}

			}

		}

		return flag;
	}
	

	/**
	 * @author
	 * @return flag This method is used to click on save button after filling form
	 *         details
	 * @throws InterruptedException
	 */
	public boolean click_CreateBtn() throws InterruptedException {
		flag = webDB.waitForClickElement(Admin_ZonesPageLocators.SAVE_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Admin_ZonesPageLocators.SAVE_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Admin_ZonesPageLocators.EDITZONE_HEADING, ElementType.Xpath);
			if (flag) {
				log.logging("info", "New Zone is created successfully");
			}
		}
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to verify create new Zone functionality
	 * @throws InterruptedException
	 */
	public boolean create_NewZone() throws InterruptedException {
		flag = click_CreateNewZoneBtn();
		if (flag) {
			flag = fill_Zone_Details();
			if (flag) {
					flag = click_CreateBtn();
			}
		}
		return flag;
	}


}
