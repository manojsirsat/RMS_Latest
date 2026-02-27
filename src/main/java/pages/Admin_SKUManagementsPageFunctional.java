package pages;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.Admin_SKUManagementsPageLocators;
import locators.Admin_SKUManagementsPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Admin_SKUManagementsPageFunctional {

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();
	
	/**
	 * @author
	 * @return flag This method is used to navigate to Admin SKU Managements page
	 * @throws InterruptedException
	 */
	public boolean navigate_Admin_SKUManagementsListingPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.ADMIN_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.ADMIN_PROGRAMSPAGE_LEFTNAV, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ADMIN_SKUMANAGEMENTPAGE_LEFTNAV,
					ElementType.Xpath, Admin_SKUManagementsPageLocators.ADMIN_SKUMANAGEMENTPAGE_HEADING,
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
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean SKU_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_SKU_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_SKU_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_SKU_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_SKU_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean SKU_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_SKU_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_SKU_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_SKU_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_SKU_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean SKUName_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Admin_SKUManagementsPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_SKUNAME_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean SKUName_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Admin_SKUManagementsPageLocators.STRING_SKUNAME_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_SKUNAME_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_SKUNAME_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_SKUNAME_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Type_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_TYPE_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_TYPE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_TYPE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Type_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_TYPE_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_TYPE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_TYPE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Account_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Admin_SKUManagementsPageLocators.STRING_ACCOUNT_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_ACCOUNT_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Account_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Admin_SKUManagementsPageLocators.STRING_ACCOUNT_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_ACCOUNT_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_ACCOUNT_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_ACCOUNT_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean RecoveryValue_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUE_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_RECOVERYVALUE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_RECOVERYVALUE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean RecoveryValue_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUE_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_RECOVERYVALUE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_RECOVERYVALUE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean RecoveryValueOverride_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUEOVERRIDE_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_RECOVERYVALUEOVERRIDE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUEOVERRIDE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_RECOVERYVALUEOVERRIDE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean RecoveryValueOverride_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUEOVERRIDE_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_RECOVERYVALUEOVERRIDE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_RECOVERYVALUEOVERRIDE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_RECOVERYVALUEOVERRIDE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Length_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_LENGTH_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_LENGTH_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_LENGTH_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_LENGTH_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Length_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_LENGTH_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_LENGTH_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_LENGTH_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_LENGTH_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Width_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_WIDTH_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WIDTH_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_WIDTH_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_WIDTH_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Width_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_WIDTH_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WIDTH_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_WIDTH_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_WIDTH_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Height_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_HEIGHT_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_HEIGHT_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_HEIGHT_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_HEIGHT_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Height_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_HEIGHT_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_HEIGHT_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_HEIGHT_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_HEIGHT_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Weight_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Admin_SKUManagementsPageLocators.STRING_WEIGHT_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WEIGHT_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_WEIGHT_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_WEIGHT_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Weight_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Admin_SKUManagementsPageLocators.STRING_WEIGHT_COLHEADER,
				ElementType.Xpath, Admin_SKUManagementsPageLocators.BY_WEIGHT_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_WEIGHT_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_WEIGHT_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Notifiable_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Admin_SKUManagementsPageLocators.STRING_NOTIFIABLE_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_NOTIFIABLE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_NOTIFIABLE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_NOTIFIABLE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Notifiable_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Admin_SKUManagementsPageLocators.STRING_NOTIFIABLE_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_NOTIFIABLE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_NOTIFIABLE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_NOTIFIABLE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Orderable_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Admin_SKUManagementsPageLocators.STRING_ORDERABLE_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_ORDERABLE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_ORDERABLE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_ORDERABLE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Orderable_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Admin_SKUManagementsPageLocators.STRING_ORDERABLE_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_ORDERABLE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_ORDERABLE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_ORDERABLE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Confirmable_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Admin_SKUManagementsPageLocators.STRING_CONFIRMABLE_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_CONFIRMABLE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_CONFIRMABLE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_CONFIRMABLE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Confirmable_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Admin_SKUManagementsPageLocators.STRING_CONFIRMABLE_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_CONFIRMABLE_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_CONFIRMABLE_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_CONFIRMABLE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean LastUpdatedBy_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(
				Admin_SKUManagementsPageLocators.STRING_LASTUPDATEDBY_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_LASTUPDATEDBY_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_LASTUPDATEDBY_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_LASTUPDATEDBY_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean LastUpdatedBy_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(
				Admin_SKUManagementsPageLocators.STRING_LASTUPDATEDBY_COLHEADER, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_LASTUPDATEDBY_COLHEADER,
				Admin_SKUManagementsPageLocators.STRING_LASTUPDATEDBY_COLDATA, ElementType.Xpath,
				Admin_SKUManagementsPageLocators.BY_LASTUPDATEDBY_COLDATA);
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to click on create new sku button
	 * @throws InterruptedException
	 */
	public boolean click_CreateNewSKUBtn() throws InterruptedException {
		webDB.navigateToRefresh();
		Thread.sleep(2000);
		flag = webDB.isElementDisplayed(Admin_SKUManagementsPageLocators.CREATE_NEW_SKU_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Admin_SKUManagementsPageLocators.CREATE_NEW_SKU_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Admin_SKUManagementsPageLocators.NAME_INPUTFIELD, ElementType.Xpath);
			if (flag) {
				log.logging("info", "Navigated to Create New Program Page");
			}
		}
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to fill the SKU details
	 * @throws InterruptedException
	 */
	public boolean fill_SKU_Details() throws InterruptedException {
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String name = faker.name().fullName();
		String description = faker.lorem().paragraph();
		Double length1 = faker.number().randomDouble(2, 0, 9);
		String length = Double.toString(length1);
		Double width1 = faker.number().randomDouble(2, 0, 9);
		String width = Double.toString(width1);
		Double height1 = faker.number().randomDouble(2, 0, 9);
		String height = Double.toString(height1);
		Double weight1 = faker.number().randomDouble(2, 0, 9);
		String weight = Double.toString(weight1);
		int palletqty1 = faker.number().numberBetween(1, 30);
		String palletqty = String.valueOf(palletqty1);
		
		flag = webDB.sendTextToAnElement(Admin_SKUManagementsPageLocators.SKU_INPUTFIELD, firstname + " sku test",
				ElementType.Xpath);
		if (flag) {
			Thread.sleep(750);
			log.logging("info", "Entered SKU as: " + firstname + " sku test");
			flag = webDB.sendTextToAnElement(Admin_SKUManagementsPageLocators.NAME_INPUTFIELD, firstname + " sku test",
					ElementType.Xpath);
			if (flag) {
				Thread.sleep(750);
				log.logging("info", "Entered name as: " + firstname + " sku test");

				flag = webDB.sendTextToAnElement(Admin_SKUManagementsPageLocators.DESCRIPTION_INPUTFIELD,
						"This is a testing SKU", ElementType.Xpath);
				if (flag) {
					Thread.sleep(750);
					log.logging("info", "Entered description as: " + "This is a testing SKU");
					flag = webDB.clearTextField(Admin_SKUManagementsPageLocators.LENGTH_INPUTFIELD, ElementType.Xpath);
					if (flag) {
						Thread.sleep(750);
						webDB.sendTextToAnElement(Admin_SKUManagementsPageLocators.LENGTH_INPUTFIELD, length,
								ElementType.Xpath);
						if (flag) {
							Thread.sleep(750);
							log.logging("info", "Entered length as: " + length);
							flag = webDB.clearTextField(Admin_SKUManagementsPageLocators.WIDTH_INPUTFIELD,
									ElementType.Xpath);
							if (flag) {
								Thread.sleep(750);
								webDB.sendTextToAnElement(Admin_SKUManagementsPageLocators.WIDTH_INPUTFIELD, width,
										ElementType.Xpath);
								if (flag) {
									Thread.sleep(750);
									log.logging("info", "Entered width as: " + width);
									flag = webDB.clearTextField(Admin_SKUManagementsPageLocators.HEIGHT_INPUTFIELD,
											ElementType.Xpath);
									if (flag) {
										Thread.sleep(750);
										webDB.sendTextToAnElement(Admin_SKUManagementsPageLocators.HEIGHT_INPUTFIELD,
												height, ElementType.Xpath);
										if (flag) {
											Thread.sleep(750);
											log.logging("info", "Entered height as: " + height);
											flag = webDB.clearTextField(
													Admin_SKUManagementsPageLocators.WEIGHT_INPUTFIELD,
													ElementType.Xpath);
											if (flag) {
												Thread.sleep(750);
												webDB.sendTextToAnElement(
														Admin_SKUManagementsPageLocators.WEIGHT_INPUTFIELD, weight,
														ElementType.Xpath);
												if (flag) {
													Thread.sleep(750);
													log.logging("info", "Entered weight as: " + weight);

													webDB.clickAnElement(
															Admin_SKUManagementsPageLocators.NATIONAL_MOTOR_FREIGHT_CLASSIFICATION_DRPDWN,
															ElementType.Xpath);
													Thread.sleep(750);
													int drpdownoptions = webDB.getDriver().findElements(By.xpath(
															Admin_SKUManagementsPageLocators.NATIONAL_MOTOR_FREIGHT_CLASSIFICATION_DRPDWN_OPTIONS))
															.size();
													int oneoption = faker.number().numberBetween(1, drpdownoptions);
													flag = webDB.clickAnElement(
															Admin_SKUManagementsPageLocators.NATIONAL_MOTOR_FREIGHT_CLASSIFICATION_DRPDWN_OPTIONS
																	+ "[" + oneoption + "]",
															ElementType.Xpath);
													if (flag) {
														Thread.sleep(750);
														String selectednationalmotorfreight = webDB
																.getAttributeFromElement(
																		Admin_SKUManagementsPageLocators.NATIONAL_MOTOR_FREIGHT_CLASSIFICATION_DRPDWN_OPTIONS_SELECTED,
																		ElementType.Xpath, "value");
														log.logging("info",
																"Selected National motor freight classification is: "
																		+ selectednationalmotorfreight);
														flag = webDB.clearTextField(
																Admin_SKUManagementsPageLocators.PALLETQTY_INPUTFIELD,
																ElementType.Xpath);
														if (flag) {
															Thread.sleep(750);
															webDB.sendTextToAnElement(
																	Admin_SKUManagementsPageLocators.PALLETQTY_INPUTFIELD,
																	height, ElementType.Xpath);
															if (flag) {
																Thread.sleep(750);
																log.logging("info",
																		"Entered pallet qty as: " + palletqty);

																webDB.clickAnElement(
																		Admin_SKUManagementsPageLocators.ACCOUNT_DRPDWN,
																		ElementType.Xpath);
																Thread.sleep(750);
																int drpdownoptions1 = webDB.getDriver().findElements(By
																		.xpath(Admin_SKUManagementsPageLocators.ACCOUNT_DRPDWN_OPTIONS))
																		.size();
																int oneoption1 = faker.number().numberBetween(1,
																		drpdownoptions1);
																flag = webDB.clickAnElement(
																		Admin_SKUManagementsPageLocators.ACCOUNT_DRPDWN_OPTIONS
																				+ "[" + oneoption1 + "]",
																		ElementType.Xpath);
																if (flag) {
																	Thread.sleep(750);
																	String selectedaccount = webDB
																			.getAttributeFromElement(
																					Admin_SKUManagementsPageLocators.ACCOUNT_DRPDWN_OPTIONS_SELECTED,
																					ElementType.Xpath, "value");
																	log.logging("info",
																			"Selected account is: " + selectedaccount);
																	webDB.clickAnElement(
																			Admin_SKUManagementsPageLocators.TYPE_DRPDWN,
																			ElementType.Xpath);
																	Thread.sleep(750);
																	int drpdownoptions2 = webDB.getDriver()
																			.findElements(By.xpath(
																					Admin_SKUManagementsPageLocators.TYPE_DRPDWN_OPTIONS))
																			.size();
																	int oneoption2 = faker.number().numberBetween(1,
																			drpdownoptions2);
																	flag = webDB.clickAnElement(
																			Admin_SKUManagementsPageLocators.TYPE_DRPDWN_OPTIONS
																					+ "[" + oneoption2 + "]",
																			ElementType.Xpath);
																	if (flag) {
																		Thread.sleep(750);
																		String selectedtype = webDB
																				.getAttributeFromElement(
																						Admin_SKUManagementsPageLocators.TYPE_DRPDWN_OPTIONS_SELECTED,
																						ElementType.Xpath, "value");
																		log.logging("info",
																				"Selected type as: " + selectedtype);
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
		flag = webDB.waitForClickElement(Admin_SKUManagementsPageLocators.SAVE_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Admin_SKUManagementsPageLocators.SAVE_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Admin_SKUManagementsPageLocators.EDITSKU_HEADING, ElementType.Xpath);
			if (flag) {
				log.logging("info", "New SKU is created successfully");
			}
		}
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to verify create new SKU functionality
	 * @throws InterruptedException
	 */
	public boolean create_NewSKU() throws InterruptedException {
		flag = click_CreateNewSKUBtn();
		if (flag) {
			flag = fill_SKU_Details();
			if (flag) {
				flag = click_CreateBtn();
			}
		}
		return flag;
	}

}
