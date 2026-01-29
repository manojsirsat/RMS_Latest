package pages;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.Accounts_AccountsPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Accounts_AccountsPageFunctional {

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();

	/**
	 * @author Sonam
	 * @return flag This method is used to navigate to Accounts page
	 * @throws InterruptedException
	 */
	public boolean navigate_AccountsListingPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.ACCOUNTS_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.ACCOUNTS_ACCOUNTS_PAGE, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.ACCOUNTS_ACCOUNTS_PAGE, ElementType.Xpath,
					Accounts_AccountsPageLocators.ACCOUNTS_ACCOUNTSPAGE_HEADING, ElementType.Xpath);
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
	public boolean AcctCode_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_ACCTCODE_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACCTCODE_COLHEADER,
				Accounts_AccountsPageLocators.STRING_ACCTCODE_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_ACCTCODE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean AcctCode_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_ACCTCODE_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACCTCODE_COLHEADER,
				Accounts_AccountsPageLocators.STRING_ACCTCODE_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_ACCTCODE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Name_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_NAME_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_NAME_COLHEADER,
				Accounts_AccountsPageLocators.STRING_NAME_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Name_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_NAME_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_NAME_COLHEADER,
				Accounts_AccountsPageLocators.STRING_NAME_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_NAME_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Short_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_SHORT_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_SHORT_COLHEADER,
				Accounts_AccountsPageLocators.STRING_SHORT_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_SHORT_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Short_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_SHORT_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_SHORT_COLHEADER,
				Accounts_AccountsPageLocators.STRING_SHORT_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_SHORT_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean City_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_CITY_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_CITY_COLHEADER,
				Accounts_AccountsPageLocators.STRING_CITY_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_CITY_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean City_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_CITY_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_CITY_COLHEADER,
				Accounts_AccountsPageLocators.STRING_CITY_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_CITY_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Admin_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_ADMIN_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_ADMIN_COLHEADER,
				Accounts_AccountsPageLocators.STRING_ADMIN_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_ADMIN_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Admin_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_ADMIN_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_ADMIN_COLHEADER,
				Accounts_AccountsPageLocators.STRING_ADMIN_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_ADMIN_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Customer_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_CUSTOMER_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_CUSTOMER_COLHEADER,
				Accounts_AccountsPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Customer_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_CUSTOMER_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_CUSTOMER_COLHEADER,
				Accounts_AccountsPageLocators.STRING_CUSTOMER_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_CUSTOMER_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Provider_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_PROVIDER_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_PROVIDER_COLHEADER,
				Accounts_AccountsPageLocators.STRING_PROVIDER_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_PROVIDER_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Provider_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_PROVIDER_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_PROVIDER_COLHEADER,
				Accounts_AccountsPageLocators.STRING_PROVIDER_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_PROVIDER_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Carrier_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_CARRIER_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_CARRIER_COLHEADER,
				Accounts_AccountsPageLocators.STRING_CARRIER_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_CARRIER_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Carrier_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_CARRIER_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_CARRIER_COLHEADER,
				Accounts_AccountsPageLocators.STRING_CARRIER_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_CARRIER_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Network_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_NETWORK_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_NETWORK_COLHEADER,
				Accounts_AccountsPageLocators.STRING_NETWORK_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_NETWORK_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Network_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_NETWORK_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_NETWORK_COLHEADER,
				Accounts_AccountsPageLocators.STRING_NETWORK_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_NETWORK_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Active_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(Accounts_AccountsPageLocators.STRING_ACTIVE_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACTIVE_COLHEADER,
				Accounts_AccountsPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Active_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(Accounts_AccountsPageLocators.STRING_ACTIVE_COLHEADER,
				ElementType.Xpath, Accounts_AccountsPageLocators.BY_ACTIVE_COLHEADER,
				Accounts_AccountsPageLocators.STRING_ACTIVE_COLDATA, ElementType.Xpath,
				Accounts_AccountsPageLocators.BY_ACTIVE_COLDATA);
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to verify the create new account
	 *         functionality
	 * @throws InterruptedException
	 */
	public boolean create_NewAccount() throws InterruptedException {
		flag = click_CreateNewAccountBtn();
		if (flag) {
			flag = fill_AccountForm();
			if (flag) {
				flag = click_CreateBtn();
			}
		}
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to click on create new account button
	 * @throws InterruptedException
	 */
	public boolean click_CreateNewAccountBtn() throws InterruptedException {
		webDB.navigateToRefresh();
		Thread.sleep(1500);
		flag = webDB.isElementDisplayed(Accounts_AccountsPageLocators.CREATE_NEW_ACCOUNT_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Accounts_AccountsPageLocators.CREATE_NEW_ACCOUNT_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Accounts_AccountsPageLocators.NAME_INPUTFIELD, ElementType.Xpath);
			if (flag) {
				log.logging("info", "Navigated to Create New Account Page");
			}
		}
		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to fill the account form details
	 * @throws InterruptedException
	 */
	public boolean fill_AccountForm() throws InterruptedException {
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String name = faker.name().fullName();
		String code = firstname + lastname + "123";
		String shortname = name + "123";
		String address = faker.address().streetAddress();
		String subaddress = faker.address().secondaryAddress();
		String city = faker.address().cityName();
		String zipcode = faker.address().zipCode();
		String contactname = firstname + lastname;
		String contactemail = firstname + lastname + "123@test.com";
		String contactphone = faker.phoneNumber().phoneNumber();
		String contact_ext = faker.phoneNumber().extension();

		flag = webDB.sendTextToAnElement(Accounts_AccountsPageLocators.NAME_INPUTFIELD, name + " test",
				ElementType.Xpath);
		if (flag) {
			Thread.sleep(750);
			log.logging("info", "Entered name as: " + name + "test");
			flag = webDB.sendTextToAnElement(Accounts_AccountsPageLocators.CODE_INPUTFIELD, code, ElementType.Xpath);
			if (flag) {
				Thread.sleep(750);
				log.logging("info", "Entered code as: " + code);
				flag = webDB.sendTextToAnElement(Accounts_AccountsPageLocators.SHORTNAME_INPUTFIELD, shortname,
						ElementType.Xpath);
				if (flag) {
					Thread.sleep(750);
					log.logging("info", "Entered short name as: " + shortname);
					int roleoptions = webDB.getDriver()
							.findElements(By.xpath(Accounts_AccountsPageLocators.ROLE_CHECKBOXES)).size();
					int oneroleoption = faker.number().numberBetween(1, roleoptions);
					flag = webDB.clickAnElement(
							Accounts_AccountsPageLocators.ROLE_CHECKBOXES + "[" + oneroleoption + "]",
							ElementType.Xpath);
					if (flag) {
						Thread.sleep(750);
						String roleselected = webDB.getTextFromElement(
								"(//input[@type='checkbox'] /ancestor::div[@class='p-checkbox p-component'] /preceding-sibling::label)"
										+ "[" + oneroleoption + "]",
								ElementType.Xpath);
						log.logging("info", "The selected role is: " + roleselected);

						flag = webDB.sendTextToAnElement(Accounts_AccountsPageLocators.ADDRESS_INPUTFIELD, address,
								ElementType.Xpath);
						if (flag) {
							Thread.sleep(750);
							log.logging("info", "Entered address as: " + address);
							flag = webDB.sendTextToAnElement(Accounts_AccountsPageLocators.SUBADDRESS_INPUTFIELD,
									subaddress, ElementType.Xpath);
							if (flag) {
								Thread.sleep(750);
								log.logging("info", "Entered sub address as: " + subaddress);
								flag = webDB.sendTextToAnElement(Accounts_AccountsPageLocators.CITY_INPUTFIELD, city,
										ElementType.Xpath);
								if (flag) {
									Thread.sleep(750);
									log.logging("info", "Entered city as: " + city);
									webDB.clickAnElement(Accounts_AccountsPageLocators.STATE_DRPDOWN,
											ElementType.Xpath);
									Thread.sleep(750);
									int drpdownoptions = webDB.getDriver()
											.findElements(By.xpath(Accounts_AccountsPageLocators.STATE_DRPDOWN_OPTIONS))
											.size();
									int oneoption = faker.number().numberBetween(1, drpdownoptions);
									flag = webDB.clickAnElement(
											Accounts_AccountsPageLocators.STATE_DRPDOWN_OPTIONS + "[" + oneoption + "]",
											ElementType.Xpath);
									if (flag) {
										Thread.sleep(750);
										String selectedstate = webDB.getAttributeFromElement(
												Accounts_AccountsPageLocators.STATEOPTION_SELECTED, ElementType.Xpath,
												"value");
										log.logging("info", "Selected state is: " + selectedstate);
										flag = webDB.sendTextToAnElement(
												Accounts_AccountsPageLocators.ZIPCODE_INPUTFIELD, zipcode,
												ElementType.Xpath);
										if (flag) {
											Thread.sleep(750);
											log.logging("info", "Entered zipcode as: " + zipcode);
											flag = webDB.sendTextToAnElement(
													Accounts_AccountsPageLocators.CONTACTNAME_INPUTFIELD, contactname,
													ElementType.Xpath);
											if (flag) {
												Thread.sleep(750);
												log.logging("info", "Entered contact name as: " + contactname);

												flag = webDB.sendTextToAnElement(
														Accounts_AccountsPageLocators.CONTACTEMAIL_INPUTFIELD,
														contactemail, ElementType.Xpath);
												if (flag) {
													Thread.sleep(750);
													log.logging("info", "Entered contact email as: " + contactemail);
													flag = webDB.sendTextToAnElement(
															Accounts_AccountsPageLocators.CONTACTPHONE_INPUTFIELD,
															contactphone, ElementType.Xpath);
													if (flag) {
														Thread.sleep(750);
														log.logging("info",
																"Entered contact phone as: " + contactphone);
														flag = webDB.sendTextToAnElement(
																Accounts_AccountsPageLocators.CONTACTPHONE_EXT_INPUTFIELD,
																contact_ext, ElementType.Xpath);
														if (flag) {
															Thread.sleep(750);
															log.logging("info", "Entered contact phone extention as: "
																	+ contact_ext);

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
	 * @return flag This method is used to click on create button after filling form
	 *         details
	 * @throws InterruptedException
	 */
	public boolean click_CreateBtn() throws InterruptedException {
		flag = webDB.waitForClickElement(Accounts_AccountsPageLocators.CREATE_BTN, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(Accounts_AccountsPageLocators.CREATE_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.waitForElement(Accounts_AccountsPageLocators.INVENTORYLINK_LOCATIONSUMMARYPAGE,
					ElementType.Xpath);
			if (flag) {
				log.logging("info", "New account is created successfully");
			}
		}
		return flag;
	}

}
