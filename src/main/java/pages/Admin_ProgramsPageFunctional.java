package pages;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.Admin_ProgramsPageLocators;
import locators.Admin_ProgramsPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_ProgramsPageFunctional {

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();

	/**
	 * @author
	 * @return flag This method is used to navigate to Admin Programs page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_ProgramsListingPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV,
					ElementType.Xpath, Admin_ProgramsPageLocators.ADMIN_PROGRAMPAGE_HEADING, ElementType.Xpath);
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
	public boolean name_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ProgramsPageLocators.STRING_NAME_COLHEADER,
				ElementType.Xpath, Admin_ProgramsPageLocators.BY_NAME_COLHEADER,
				Admin_ProgramsPageLocators.STRING_NAME_COLDATA, ElementType.Xpath,
				Admin_ProgramsPageLocators.BY_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Name_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ProgramsPageLocators.STRING_NAME_COLHEADER,
				ElementType.Xpath, Admin_ProgramsPageLocators.BY_NAME_COLHEADER,
				Admin_ProgramsPageLocators.STRING_NAME_COLDATA, ElementType.Xpath,
				Admin_ProgramsPageLocators.BY_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Code_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ProgramsPageLocators.STRING_CODE_COLHEADER,
				ElementType.Xpath, Admin_ProgramsPageLocators.BY_CODE_COLHEADER,
				Admin_ProgramsPageLocators.STRING_CODE_COLDATA, ElementType.Xpath,
				Admin_ProgramsPageLocators.BY_CODE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Code_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ProgramsPageLocators.STRING_CODE_COLHEADER,
				ElementType.Xpath, Admin_ProgramsPageLocators.BY_CODE_COLHEADER,
				Admin_ProgramsPageLocators.STRING_CODE_COLDATA, ElementType.Xpath,
				Admin_ProgramsPageLocators.BY_CODE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Account_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ProgramsPageLocators.STRING_ACCOUNT_COLHEADER,
				ElementType.Xpath, Admin_ProgramsPageLocators.BY_ACCOUNT_COLHEADER,
				Admin_ProgramsPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath,
				Admin_ProgramsPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Account_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ProgramsPageLocators.STRING_ACCOUNT_COLHEADER,
				ElementType.Xpath, Admin_ProgramsPageLocators.BY_ACCOUNT_COLHEADER,
				Admin_ProgramsPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath,
				Admin_ProgramsPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Locations_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ProgramsPageLocators.STRING_LOCATIONS_COLHEADER,
				ElementType.Xpath, Admin_ProgramsPageLocators.BY_LOCATIONS_COLHEADER,
				Admin_ProgramsPageLocators.STRING_LOCATIONS_COLDATA, ElementType.Xpath,
				Admin_ProgramsPageLocators.BY_LOCATIONS_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Locations_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ProgramsPageLocators.STRING_LOCATIONS_COLHEADER,
				ElementType.Xpath, Admin_ProgramsPageLocators.BY_LOCATIONS_COLHEADER,
				Admin_ProgramsPageLocators.STRING_LOCATIONS_COLDATA, ElementType.Xpath,
				Admin_ProgramsPageLocators.BY_LOCATIONS_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean SKUS_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_ProgramsPageLocators.STRING_SKUS_COLHEADER,
				ElementType.Xpath, Admin_ProgramsPageLocators.BY_SKUS_COLHEADER,
				Admin_ProgramsPageLocators.STRING_SKUS_COLDATA, ElementType.Xpath,
				Admin_ProgramsPageLocators.BY_SKUS_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean SKUS_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_ProgramsPageLocators.STRING_SKUS_COLHEADER,
				ElementType.Xpath, Admin_ProgramsPageLocators.BY_SKUS_COLHEADER,
				Admin_ProgramsPageLocators.STRING_SKUS_COLDATA, ElementType.Xpath,
				Admin_ProgramsPageLocators.BY_SKUS_COLDATA);
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to click on create new program button
	 * @throws InterruptedException
	 */
	public boolean click_CreateNewProgramBtn() throws InterruptedException {
		webDB.navigateToRefresh();
		Thread.sleep(1500);
		flag = webDB.isElementDisplayed(Admin_ProgramsPageLocators.CREATE_NEW_PROGRAM_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Admin_ProgramsPageLocators.CREATE_NEW_PROGRAM_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Admin_ProgramsPageLocators.NAME_INPUTFIELD, ElementType.Xpath);
			if (flag) {
				log.logging("info", "Navigated to Create New Program Page");
			}
		}
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to fill the program form details
	 * @throws InterruptedException
	 */
	public boolean fill_Program_Details() throws InterruptedException {
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String name = faker.name().fullName();
		String code = firstname + lastname + "123";
		
		flag = webDB.sendTextToAnElement(Admin_ProgramsPageLocators.NAME_INPUTFIELD, name + " test", ElementType.Xpath);
		if (flag) {
			Thread.sleep(750);
			log.logging("info", "Entered name as: " + name + "test");

			flag = webDB.sendTextToAnElement(Admin_ProgramsPageLocators.CODE_INPUTFIELD, code, ElementType.Xpath);
			if (flag) {
				Thread.sleep(750);
				log.logging("info", "Entered code as: " + code);
				webDB.clickAnElement(Admin_ProgramsPageLocators.ACCOUNT_DRPDWN, ElementType.Xpath);
				Thread.sleep(750);
				int drpdownoptions1 = webDB.getDriver()
						.findElements(By.xpath(Admin_ProgramsPageLocators.ACCOUNT_DRPDWN_OPTIONS)).size();
				int oneoption1 = faker.number().numberBetween(1, drpdownoptions1);
				flag = webDB.clickAnElement(
						Admin_ProgramsPageLocators.ACCOUNT_DRPDWN_OPTIONS + "[" + oneoption1 + "]",
						ElementType.Xpath);
				if (flag) {
					Thread.sleep(750);
					String selectedaccount = webDB.getAttributeFromElement(
							Admin_ProgramsPageLocators.ACCOUNT_DRPDWN_OPTIONS_SELECTED, ElementType.Xpath, "value");
					log.logging("info", "Selected account is: " + selectedaccount);

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
	public boolean click_SaveBtn() throws InterruptedException {
		flag = webDB.waitForClickElement(Admin_ProgramsPageLocators.SAVE_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Admin_ProgramsPageLocators.SAVE_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Admin_ProgramsPageLocators.ADMIN_PROGRAMPAGE_HEADING, ElementType.Xpath);
			if (flag) {
				log.logging("info", "New program is created successfully");
			}
		}
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to verify create new program functionality
	 * @throws InterruptedException
	 */
	public boolean create_NewProgram() throws InterruptedException {
		flag = click_CreateNewProgramBtn();
		if (flag) {
			flag = fill_Program_Details();
			if (flag) {
				flag = click_SaveBtn();
			}

		}
		return flag;
	}

}
