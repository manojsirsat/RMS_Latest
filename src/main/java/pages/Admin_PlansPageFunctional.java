package pages;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.Admin_PlansPageLocators;
import locators.Admin_PlansPageLocators;
import locators.Admin_PlansPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_PlansPageFunctional {

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();
	
	/**
	 * @author
	 * @return flag This method is used to navigate to Admin Plans page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_PlansListingPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_PLANSPAGE_LEFTNAV,
					ElementType.Xpath, Admin_PlansPageLocators.ADMIN_PLANSPAGE_HEADING, ElementType.Xpath);
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
	public boolean ID_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_ID_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_ID_COLHEADER, Admin_PlansPageLocators.STRING_ID_COLDATA,
				ElementType.Xpath, Admin_PlansPageLocators.BY_ID_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean ID_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_ID_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_ID_COLHEADER, Admin_PlansPageLocators.STRING_ID_COLDATA,
				ElementType.Xpath, Admin_PlansPageLocators.BY_ID_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Name_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_NAME_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_NAME_COLHEADER,
				Admin_PlansPageLocators.STRING_NAME_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Name_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_NAME_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_NAME_COLHEADER,
				Admin_PlansPageLocators.STRING_NAME_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Program_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_PROGRAM_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_PROGRAM_COLHEADER,
				Admin_PlansPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Program_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_PROGRAM_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_PROGRAM_COLHEADER,
				Admin_PlansPageLocators.STRING_PROGRAM_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_PROGRAM_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean ManagedBy_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_MANAGEDBY_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_MANAGEDBY_COLHEADER,
				Admin_PlansPageLocators.STRING_MANAGEDBY_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_MANAGEDBY_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean ManagedBy_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_MANAGEDBY_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_MANAGEDBY_COLHEADER,
				Admin_PlansPageLocators.STRING_MANAGEDBY_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_MANAGEDBY_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Type_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_TYPE_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_TYPE_COLHEADER,
				Admin_PlansPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_TYPE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Type_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_TYPE_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_TYPE_COLHEADER,
				Admin_PlansPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_TYPE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean BasePlan_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_BASEPLAN_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_BASEPLAN_COLHEADER,
				Admin_PlansPageLocators.STRING_BASEPLAN_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_BASEPLAN_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean BasePlan_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_BASEPLAN_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_BASEPLAN_COLHEADER,
				Admin_PlansPageLocators.STRING_BASEPLAN_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_BASEPLAN_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean ActiveEnd_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_ACTIVEEND_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_ACTIVEEND_COLHEADER,
				Admin_PlansPageLocators.STRING_ACTIVEEND_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_ACTIVEEND_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean ActiveEnd_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_ACTIVEEND_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_ACTIVEEND_COLHEADER,
				Admin_PlansPageLocators.STRING_ACTIVEEND_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_ACTIVEEND_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Disabled_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_PlansPageLocators.STRING_DISABLED_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_DISABLED_COLHEADER,
				Admin_PlansPageLocators.STRING_DISABLED_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_DISABLED_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Disabled_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_PlansPageLocators.STRING_DISABLED_COLHEADER,
				ElementType.Xpath, Admin_PlansPageLocators.BY_DISABLED_COLHEADER,
				Admin_PlansPageLocators.STRING_DISABLED_COLDATA, ElementType.Xpath,
				Admin_PlansPageLocators.BY_DISABLED_COLDATA);
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to click on create new plan button
	 * @throws InterruptedException
	 */
	public boolean click_CreateNewPlanBtn() throws InterruptedException {
		webDB.navigateToRefresh();
		Thread.sleep(2000);
		flag = webDB.isElementDisplayed(Admin_PlansPageLocators.CREATE_NEW_PLAN_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Admin_PlansPageLocators.CREATE_NEW_PLAN_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Admin_PlansPageLocators.PLANNAME_INPUTFIELD, ElementType.Xpath);
			if (flag) {
				log.logging("info", "Navigated to Create New Plan Page");
			}
		}
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to fill the plan details
	 * @throws InterruptedException
	 */
	public boolean fill_Plan_Details() throws InterruptedException {
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String name = faker.name().fullName();
		String description = faker.lorem().paragraph();
		flag = webDB.sendTextToAnElement(Admin_PlansPageLocators.PLANNAME_INPUTFIELD, firstname + " plan test",
				ElementType.Xpath);
		if (flag) {
			Thread.sleep(750);
			log.logging("info", "Entered SKU as: " + firstname + " plan test");
			webDB.clickAnElement(Admin_PlansPageLocators.PROGRAM_DRPDWN, ElementType.Xpath);
			Thread.sleep(750);
			int drpdownoptions2 = webDB.getDriver()
					.findElements(By.xpath(Admin_PlansPageLocators.PROGRAM_DRPDWN_OPTIONS)).size();
			int oneoption2 = faker.number().numberBetween(1, drpdownoptions2);
			flag = webDB.clickAnElement(
					Admin_PlansPageLocators.PROGRAM_DRPDWN_OPTIONS + "[" + oneoption2 + "]",
					ElementType.Xpath);
			if (flag) {
				Thread.sleep(750);
				String selectedprogram = webDB.getAttributeFromElement(
						Admin_PlansPageLocators.PROGRAM_DRPDWN_OPTIONS_SELECTED, ElementType.Xpath,
						"value");
				log.logging("info", "Selected Program as: " + selectedprogram);
			
					webDB.clickAnElement(Admin_PlansPageLocators.PLANTYPE_DRPDWN, ElementType.Xpath);
						Thread.sleep(750);
						int drpdownoptions3 = webDB.getDriver()
								.findElements(By.xpath(Admin_PlansPageLocators.PLANTYPE_DRPDWN_OPTIONS)).size();
						int oneoption3 = faker.number().numberBetween(1, drpdownoptions3);
						flag = webDB.clickAnElement(
								Admin_PlansPageLocators.PLANTYPE_DRPDWN_OPTIONS + "[" + oneoption3 + "]",
								ElementType.Xpath);
						if (flag) {
							Thread.sleep(750);
							String selectedtype = webDB.getAttributeFromElement(
									Admin_PlansPageLocators.PLANTYPE_DRPDWN_OPTIONS_SELECTED, ElementType.Xpath,
									"value");
							log.logging("info", "Selected type as: " + selectedtype);
							webDB.clickAnElement(Admin_PlansPageLocators.MANAGINGACCOUNT_DRPDWN, ElementType.Xpath);
							Thread.sleep(750);
							int drpdownoptions1 = webDB.getDriver()
									.findElements(By.xpath(Admin_PlansPageLocators.MANAGINGACCOUNT_DRPDWN_OPTIONS)).size();
							int oneoption1 = faker.number().numberBetween(1, drpdownoptions1);
							flag = webDB.clickAnElement(
									Admin_PlansPageLocators.MANAGINGACCOUNT_DRPDWN_OPTIONS + "[" + oneoption1 + "]",
									ElementType.Xpath);
							if (flag) {
								Thread.sleep(750);
								String selectedaccount = webDB.getAttributeFromElement(
										Admin_PlansPageLocators.MANAGINGACCOUNT_DRPDWN_OPTIONS_SELECTED, ElementType.Xpath,
										"value");
								log.logging("info", "Selected managing account is: " + selectedaccount);
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
		flag = webDB.waitForClickElement(Admin_PlansPageLocators.SAVE_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Admin_PlansPageLocators.SAVE_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Admin_PlansPageLocators.EDITPLAN_HEADING, ElementType.Xpath);
			if (flag) {
				log.logging("info", "New Plan is created successfully");
			}
		}
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to verify create new Plan functionality
	 * @throws InterruptedException
	 */
	public boolean create_NewPlan() throws InterruptedException {
		flag = click_CreateNewPlanBtn();
		if (flag) {
//			flag = fill_Plan_Details();
			if (flag) {
				flag = click_CreateBtn();
			}
		}
		return flag;
	}


}
