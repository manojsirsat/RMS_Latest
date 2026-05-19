package pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.BOLPageLocators;
import locators.CommonFunctionsLocators;
import locators.ProviderBOLPageLocators;
import locators.RecoveriesByLocationPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class ProviderBOLPageFunctional {

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();
	String bolNumber = "";
	String BOL_Number_Listingpage = "";
	String option = "";

	/**
	 * @author
	 * @return flag This method is used to navigate to Recoveries By Locations page
	 * @throws InterruptedException
	 */
	public boolean navigate_LocationsListingPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.RECOVERIES_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.RECOVERIESBYZONES_PAGE, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.RECOVERIESBYLOCATIONS_PAGE,
					ElementType.Xpath, RecoveriesByLocationPageLocators.RECOVERIESBYLOCATIONSPAGE_HEADING,
					ElementType.Xpath);
		}
		return flag;
	}

	public boolean createBOLFlow() throws InterruptedException
	{
		int count = webDB.getDriver().findElements(By.xpath(ProviderBOLPageLocators.CREATE_BOL_BTN)).size();
		int singleelement = faker.number().numberBetween(1, count);
		flag = webDB.waitForElement(ProviderBOLPageLocators.CREATE_BOL_BTN+"["+singleelement+"]", ElementType.Xpath);
		if(flag)
		{
			flag = webDB.clickAnElement(ProviderBOLPageLocators.CREATE_BOL_BTN+"["+singleelement+"]", ElementType.Xpath);
			Thread.sleep(750);
			if(flag)
			{
				flag = webDB.waitForElement(ProviderBOLPageLocators.COMMITDATE_INPUTFIELD, ElementType.Xpath);
				if(flag)
				{
					log.logging("info", "Clicked on create BOL button from locations listing page");
					flag = webDB.clickAnElement(ProviderBOLPageLocators.COMMITDATE_INPUTFIELD, ElementType.Xpath);
					if(flag)
					{
						Thread.sleep(750);
						flag = webDB.clickAnElement(ProviderBOLPageLocators.COMMITDATE_TODAY, ElementType.Xpath);
						if(flag)
						{
							Thread.sleep(750);
							log.logging("info", "Selected the commit date");
							flag = webDB.clickAnElement(ProviderBOLPageLocators.CREATE_BOL_BUTTON_POPUP, ElementType.Xpath);
							if(flag)
							{
								log.logging("info", "Clicked on the create BOL button");
								flag = webDB.waitForElement(ProviderBOLPageLocators.BOLSUCCESSMSG, ElementType.Xpath);
								if(flag)
								{
									String boltext = webDB.getTextFromElement(ProviderBOLPageLocators.BOLSUCCESSMSG, ElementType.Xpath);
									Pattern pattern = Pattern.compile("Bill of Lading \\((\\d+)\\)");
									Matcher matcher = pattern.matcher(boltext);
//									String bolNumber = "";
									if (matcher.find()) {
									    bolNumber = matcher.group(1);
									}
									log.logging("info", "New BOL created successfully i.e. "+bolNumber);
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
	 * @return flag This method is used to navigate to BOL page
	 * @throws InterruptedException
	 */
	public boolean navigate_BOLPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.ORDERSANDBOLS_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath,
					BOLPageLocators.BOLPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	/**
	 * @author
	 * @return flag This method is used to get BOL Number From BOL Listing Page
	 * @throws InterruptedException
	 */
	public String getBOLNumberFromBOL_ListingPage() {
		String BOLNumbertext = webDB.getTextFromElement(BOLPageLocators.BOL_NUMBER_FROM_LISTINGPAGE, ElementType.Xpath);
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(BOLNumbertext);
		if (matcher.find()) {
			return matcher.group();
		} else {
			throw new IllegalArgumentException("No number found in the text: " + BOLNumbertext);
		}

	}

	/**
	 * @author
	 * @return flag This method is used to verify the BOL status update
	 *         functionality
	 * @throws InterruptedException
	 */
	public boolean set_BOLStatus() throws InterruptedException {
		flag = navigate_BOLPage();
		Thread.sleep(1000);
		BOL_Number_Listingpage = getBOLNumberFromBOL_ListingPage();
		log.logging("info", "The BOL Number on listing page is: " + BOL_Number_Listingpage);
		Thread.sleep(1000);

		if (BOL_Number_Listingpage.equals(bolNumber)) {
			log.logging("info", "The BOL number is matched");
			Thread.sleep(1500);
			flag = update_BOLStatus();
		} else {
			log.logging("info", "The BOL is not matched");
			flag = false;
		}

		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to update the BOL status to Assigned, Driver
	 *         dispatched, At shipper, In transit, Pending receipt, Receiving in
	 *         progress
	 * @throws InterruptedException
	 */
	public boolean update_BOLStatus() throws InterruptedException {
		String[] statusList = { "Driver dispatched", "At shipper", "In transit", "Pending receipt",
				"Receiving in progress" };
		for (String statusToSelect : statusList) {
			flag = webDB.waitForElement(BOLPageLocators.BOL_STATUSCHANGE_DRP, ElementType.Xpath);
			if (flag) {
				webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_DRP, ElementType.Xpath);
				Thread.sleep(4000);
				int totalOptions = webDB.getDriver()
						.findElements(By.xpath(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS)).size();
				for (int i = 1; i <= totalOptions; i++) {
					option = webDB.getTextFromElement(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS + "[" + i + "]",
							ElementType.Xpath);
					if (option.equalsIgnoreCase(statusToSelect)) {
						webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS + "[" + i + "]",
								ElementType.Xpath);
						Thread.sleep(4000);
						flag = webDB.waitForElement(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATIONPOPUP_YES_BTN,
								ElementType.Xpath);
						if (flag) {
							log.logging("info", "Selected " + statusToSelect + " option from dropdown");
							webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATIONPOPUP_YES_BTN,
									ElementType.Xpath);
							Thread.sleep(4000);

							flag = webDB.waitForElement(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATION_MSG,
									ElementType.Xpath);
							if (flag) {
								log.logging("info", "The status of BOL is changed to " + statusToSelect);
								Thread.sleep(4000);
							}
						}

						break;
					} else {
						log.logging("info", "The option " + statusToSelect + " is not available in dropdown");
						flag = false;
					}

				}
			}
		}
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to mark the bol as complete
	 * @throws InterruptedException
	 */
	public boolean markBOLComplete() throws InterruptedException {
		flag = webDB.waitForElement(BOLPageLocators.MARKBOLCOMPLETE_BTN_BOLCOMPLETEPAGE, ElementType.Xpath);
		if (flag) {
			webDB.scrollToAnElement(BOLPageLocators.MARKBOLCOMPLETE_BTN_BOLCOMPLETEPAGE, ElementType.Xpath);
			Thread.sleep(1500);
			webDB.clickAnElement(BOLPageLocators.WIP_INPUTFIELD_BOLCOMPLETEPAGE, ElementType.Xpath);
			Thread.sleep(1500);
			webDB.pressUpArrowKey();
			Thread.sleep(750);
			webDB.pressUpArrowKey();
			Thread.sleep(1500);
			if (flag) {
				log.logging("info", "Entered 5 quantity in WIP input field");
				webDB.clickAnElement(BOLPageLocators.MARKBOLCOMPLETE_BTN_BOLCOMPLETEPAGE, ElementType.Xpath);
				Thread.sleep(1500);
				int popupcount = webDB.getDriver()
						.findElements(By.xpath(BOLPageLocators.MARKBOLCOMPLETE_PRIMARYREASONLABEL_BOLCOMPLETEPAGE))
						.size();
				if (popupcount == 1) {

				} else {
					webDB.clickAnElement(BOLPageLocators.MARKBOLCOMPLETE_YES_BOLCOMPLETEPAGE, ElementType.Xpath);
					log.logging("info", "Clicked on the Yes button");
					flag = true;
					Thread.sleep(5000);
				}
			}
		}

		return flag;
	}

	


	/**
	 * @author
	 * @return flag This method is used to click on Locations and Create new BOL
	 *         from locations listing page
	 * @throws InterruptedException
	 */
	public boolean set_BOL_Flow() throws InterruptedException {
		flag = navigate_LocationsListingPage();
		if (flag) {
			flag = createBOLFlow();
		}
		return flag;
	}
	

}
