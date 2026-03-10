package pages;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.Admin_UsersPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_UsersPageFunctional {

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();
	
	/**
	 * @author
	 * @return flag This method is used to navigate to Admin Users page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_UsersListingPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_USERSPAGE_LEFTNAV,
					ElementType.Xpath, Admin_UsersPageLocators.ADMIN_USERSPAGE_HEADING, ElementType.Xpath);
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
	public boolean UserID_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_UsersPageLocators.STRING_USERID_COLHEADER,
				ElementType.Xpath, Admin_UsersPageLocators.BY_USERID_COLHEADER,
				Admin_UsersPageLocators.STRING_USERID_COLDATA, ElementType.Xpath,
				Admin_UsersPageLocators.BY_USERID_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean UserID_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_UsersPageLocators.STRING_USERID_COLHEADER,
				ElementType.Xpath, Admin_UsersPageLocators.BY_USERID_COLHEADER,
				Admin_UsersPageLocators.STRING_USERID_COLDATA, ElementType.Xpath,
				Admin_UsersPageLocators.BY_USERID_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Name_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_UsersPageLocators.STRING_NAME_COLHEADER,
				ElementType.Xpath, Admin_UsersPageLocators.BY_NAME_COLHEADER,
				Admin_UsersPageLocators.STRING_NAME_COLDATA, ElementType.Xpath,
				Admin_UsersPageLocators.BY_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Name_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_UsersPageLocators.STRING_NAME_COLHEADER,
				ElementType.Xpath, Admin_UsersPageLocators.BY_NAME_COLHEADER,
				Admin_UsersPageLocators.STRING_NAME_COLDATA, ElementType.Xpath,
				Admin_UsersPageLocators.BY_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Email_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_UsersPageLocators.STRING_EMAIL_COLHEADER,
				ElementType.Xpath, Admin_UsersPageLocators.BY_EMAIL_COLHEADER,
				Admin_UsersPageLocators.STRING_EMAIL_COLDATA, ElementType.Xpath,
				Admin_UsersPageLocators.BY_EMAIL_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Email_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_UsersPageLocators.STRING_EMAIL_COLHEADER,
				ElementType.Xpath, Admin_UsersPageLocators.BY_EMAIL_COLHEADER,
				Admin_UsersPageLocators.STRING_EMAIL_COLDATA, ElementType.Xpath,
				Admin_UsersPageLocators.BY_EMAIL_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean AccountName_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_UsersPageLocators.STRING_ACCOUNTNAME_COLHEADER,
				ElementType.Xpath, Admin_UsersPageLocators.BY_ACCOUNTNAME_COLHEADER,
				Admin_UsersPageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath,
				Admin_UsersPageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean AccountName_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_UsersPageLocators.STRING_ACCOUNTNAME_COLHEADER,
				ElementType.Xpath, Admin_UsersPageLocators.BY_ACCOUNTNAME_COLHEADER,
				Admin_UsersPageLocators.STRING_ACCOUNTNAME_COLDATA, ElementType.Xpath,
				Admin_UsersPageLocators.BY_ACCOUNTNAME_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Active_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_UsersPageLocators.STRING_ACTIVE_COLHEADER,
				ElementType.Xpath, Admin_UsersPageLocators.BY_ACTIVE_COLHEADER,
				Admin_UsersPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath,
				Admin_UsersPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Active_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_UsersPageLocators.STRING_ACTIVE_COLHEADER,
				ElementType.Xpath, Admin_UsersPageLocators.BY_ACTIVE_COLHEADER,
				Admin_UsersPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath,
				Admin_UsersPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to click on create new user button
	 * @throws InterruptedException
	 */
	public boolean click_CreateNewUserBtn() throws InterruptedException {
		webDB.navigateToRefresh();
		Thread.sleep(2000);
		flag = webDB.isElementDisplayed(Admin_UsersPageLocators.CREATE_NEW_USER_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Admin_UsersPageLocators.CREATE_NEW_USER_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Admin_UsersPageLocators.USEREMAIL_INPUTFIELD, ElementType.Xpath);
			if (flag) {
				log.logging("info", "Navigated to Create New User Page");
			}
		}
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to fill the User details
	 * @throws InterruptedException
	 */
	public boolean fill_User_Details() throws InterruptedException {
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String name = firstname + lastname;
		String fullname = firstname + " " + lastname;
		int num = faker.number().numberBetween(1, 100);
		flag = webDB.sendTextToAnElement(Admin_UsersPageLocators.USEREMAIL_INPUTFIELD, name + num + "test@yopmail.com",
				ElementType.Xpath);
		if (flag) {
			Thread.sleep(750);
			log.logging("info", "Entered Email as: " + name + num + "test@yopmail.com");
			flag = webDB.clickAnElement(Admin_UsersPageLocators.CHECKEMAIL_BTN, ElementType.Xpath);
			Thread.sleep(750);
			flag = webDB.waitForElement(Admin_UsersPageLocators.FULLNAME_INPUTFIELD, ElementType.Xpath);
			if (flag) {
				flag = webDB.sendTextToAnElement(Admin_UsersPageLocators.FULLNAME_INPUTFIELD, fullname,
						ElementType.Xpath);
				if (flag) {
					log.logging("info", "Entered full name as " + fullname);
					Thread.sleep(750);
					flag = webDB.sendTextToAnElement(Admin_UsersPageLocators.USERNAME_INPUTFIELD, name,
							ElementType.Xpath);
					if (flag) {
						log.logging("info", "Entered user name as " + name);
						Thread.sleep(750);
						webDB.clickAnElement(Admin_UsersPageLocators.ACCOUNT_DRPDWN, ElementType.Xpath);
						Thread.sleep(750);
						int drpdownoptions1 = webDB.getDriver()
								.findElements(By.xpath(Admin_UsersPageLocators.ACCOUNT_DRPDWN_OPTIONS)).size();
						int oneoption1 = faker.number().numberBetween(1, drpdownoptions1);
						flag = webDB.clickAnElement(
								Admin_UsersPageLocators.ACCOUNT_DRPDWN_OPTIONS + "[" + oneoption1 + "]",
								ElementType.Xpath);
						if (flag) {
							Thread.sleep(750);
							String selectedaccount = webDB.getAttributeFromElement(
									Admin_UsersPageLocators.ACCOUNT_DRPDWN_OPTIONS_SELECTED, ElementType.Xpath,
									"value");
							log.logging("info", "Selected account is: " + selectedaccount);

							int userroleptions = webDB.getDriver()
									.findElements(By.xpath(Admin_UsersPageLocators.AVAILBLE_USERROLE_OPTIONS)).size();
							int oneuserroleoption = faker.number().numberBetween(1, userroleptions);
							flag = webDB.clickAnElement(
									Admin_UsersPageLocators.AVAILBLE_USERROLE_OPTIONS + "[" + oneuserroleoption + "]",
									ElementType.Xpath);
							if (flag) {
								Thread.sleep(750);
								String selecteduserrole = webDB
										.getTextFromElement(Admin_UsersPageLocators.AVAILBLE_USERROLE_OPTIONS + "["
												+ oneuserroleoption + "]//span", ElementType.Xpath);
								log.logging("info", "Selected userrole is: " + selecteduserrole);
								flag = webDB.clickAnElement(Admin_UsersPageLocators.SELECTROLE_BTN, ElementType.Xpath);
								if (flag) {
									log.logging("info", "Click on button to reflect role on right side");
									String selecteduserroleonrightside = webDB.getTextFromElement(
											Admin_UsersPageLocators.SELECTED_USERROLE_OPTION, ElementType.Xpath);
									log.logging("info",
											"Selected role on right side is " + selecteduserroleonrightside);
									if (selecteduserrole.equalsIgnoreCase(selecteduserroleonrightside)) {
										log.logging("info", "Both the user roles are same");
										flag = true;
									} else {
										log.logging("info", "Both the user roles are same");
										flag = false;
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
	 * @return flag This method is used to click on save button after filling form
	 *         details
	 * @throws InterruptedException
	 */
	public boolean click_CreateBtn() throws InterruptedException {
		flag = webDB.waitForClickElement(Admin_UsersPageLocators.SAVE_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Admin_UsersPageLocators.SAVE_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Admin_UsersPageLocators.EDITUSER_HEADING, ElementType.Xpath);
			if (flag) {
				log.logging("info", "New User is created successfully");
			}
		}
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to verify create new User functionality
	 * @throws InterruptedException
	 */
	public boolean create_NewUser() throws InterruptedException {
		flag = click_CreateNewUserBtn();
		if (flag) {
			flag = fill_User_Details();
			if (flag) {
					flag = click_CreateBtn();
			}
		}
		return flag;
	}


}
