package pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.BOLPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class BOLPageFunctional 
{

	boolean flag;
	private CommonFunctions commonfunction;
	private WebDriverBase webDB;
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();
	String BOL_Number="";
	String BOL_Number_Listingpage="";
	String option = "";

	public BOLPageFunctional(WebDriverBase webDB, CommonFunctions commonfunction) {
		this.webDB = webDB;
		this.commonfunction = commonfunction;
	}
	
	/**
	 * @return String BOL number from the first row of the table
	 * This method gets the BOL number from the first row of the BOL listing table
	 */
	public String getLatestBOLNumber() {
		try {
			// First verify table is present
			if (!webDB.waitForClickElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath)) {
				log.logging("info", "BOL table is not displayed");
				return null;
			}
			
			// Wait for the first row to be present
			if (!webDB.waitForElement(BOLPageLocators.BOL_TABLE_FIRST_ROW, ElementType.Xpath)) {
				log.logging("info", "No BOL entries found in the table");
				return null;
			}
			
			String bolNumber = webDB.getText(ElementType.Xpath, BOLPageLocators.BOL_TABLE_FIRST_ROW);
			if (bolNumber != null && !bolNumber.trim().isEmpty()) {
				log.logging("info", "Got BOL number from the first row: " + bolNumber);
				return bolNumber.trim();
			} else {
				log.logging("info", "BOL number is empty or null");
				return null;
			}
		} catch (Exception e) {
			log.logging("info", "Unable to get BOL number from first row with Exception: " + e.getMessage());
			return null;
		}
	}
	
	/**
	 * @param bolNumber The BOL number to search for
	 * @return boolean indicating if the search was successful
	 * This method searches for a specific BOL number using the filter
	 */
	public boolean searchBOLNumber(String bolNumber) {
		if (bolNumber == null || bolNumber.trim().isEmpty()) {
			log.logging("info", "Invalid BOL number provided for search");
			return false;
		}
		
		try {
			// Try primary search filter locator
			boolean filterFound = webDB.waitForElement(ElementType.Xpath, BOLPageLocators.BOL_SEARCH_FILTER);
			
			// If primary fails, try alternative locator
			if (!filterFound) {
				filterFound = webDB.waitForElement(ElementType.Xpath, BOLPageLocators.BOL_SEARCH_FILTER_ALTERNATIVE);
				if (!filterFound) {
					log.logging("info", "Unable to locate BOL search filter");
					return false;
				}
			}
			
			// Clear and enter the BOL number
			String locatorToUse = filterFound ? BOLPageLocators.BOL_SEARCH_FILTER : BOLPageLocators.BOL_SEARCH_FILTER_ALTERNATIVE;
			webDB.clear(ElementType.Xpath, locatorToUse);
			webDB.sendKeys(ElementType.Xpath, locatorToUse, bolNumber);
			log.logging("info", "Entered BOL number in search filter: " + bolNumber);
			
			// Wait for table to update (using explicit wait instead of Thread.sleep)
			boolean tableUpdated = webDB.waitForElement(ElementType.Xpath, BOLPageLocators.BOL_TABLE);
			if (!tableUpdated) {
				log.logging("info", "Table did not update after search");
				return false;
			}
			
			// Get and verify the search result
			String firstRowBOL = getLatestBOLNumber();
			if (firstRowBOL != null && firstRowBOL.equals(bolNumber)) {
				log.logging("info", "Successfully found BOL number: " + bolNumber);
				return true;
			} else {
				log.logging("BOL number not found in search results. Expected: " + bolNumber + ", Found: " + firstRowBOL);
				return false;
			}
		} catch (Exception e) {
			log.logging("Unable to search BOL number with Exception: " + e.getMessage());
			return false;
		}
	}
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to BOL page
	 * @throws InterruptedException
	 */
	public boolean navigate_BOLPage () throws InterruptedException
	{
		flag = commonfunction.clickOnOrdersAndBolsPage();
		if(flag)
		{
			flag = commonfunction.clickOnBOLSPage();
		}
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on create new BOL button
	 * @throws InterruptedException
	 */
	public boolean click_CreateNewBOL_Button() throws InterruptedException
	{
	    log.logging("info", "Attempting to click the 'Create New BOL' button.");
	    webDB.clickAnElement(BOLPageLocators.CREATE_NEWBOL_BUTTON, ElementType.Id);

	    // First, wait for the heading to confirm the page has started to load.
	    if (!webDB.waitForElement(BOLPageLocators.CREATE_NEWBOLPAGE_HEADING, ElementType.Xpath)) {
	        log.logging("error", "Did not redirect to the 'Create New BOL' page. Heading not found.");
	        return false;
	    }
	    log.logging("info", "Redirected to the create new BOL page. Now verifying page is interactive.");

	    // **CRITICAL STEP ADDED**: Now, wait for the first form element to be ready.
	    // This ensures the page is fully rendered and interactive before proceeding.
	    if (!webDB.waitForElement(BOLPageLocators.FROM_LOC_DROPDOWN, ElementType.Xpath)) {
	        log.logging("error", "Create BOL page loaded, but the 'From Location' dropdown is not visible or ready.");
	        return false;
	    }
	    
	    log.logging("info", "Create BOL page is fully loaded and ready for interaction.");
	    return true; // Return true only after all checks pass.
	}
	/**
	 * @author 
	 * @return flag
	 * This method is used to create new BOL
	 * @throws InterruptedException
	 */
	public boolean set_BOLPage_CarrierDetails() throws InterruptedException
	{
		
	    log.logging("info", "Attempting to populate carrier details on the new BOL page.");
	    
	    // The wait for FROM_LOC_DROPDOWN is no longer needed here, as it's now in click_CreateNewBOL_Button()

	    //Select from location
	    webDB.clickAnElement(BOLPageLocators.FROM_LOC_DROPDOWN, ElementType.Xpath);
	    if (!webDB.waitForElement(BOLPageLocators.FROM_LOC_DRP_OPTION, ElementType.Xpath)) return false;
		int totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.FROM_LOC_DRP_OPTIONS_LIST)).size();
		int oneoption = faker.number().numberBetween(1, totaloptions-1);
		webDB.getDriver().findElement(By.xpath(BOLPageLocators.FROM_LOC_DRP_OPTIONS_LIST+"["+oneoption+"]")).click();
		log.logging("info", "Selected From location");

		//Select to location
		if (!webDB.waitForElement(BOLPageLocators.TO_LOC_DROPDOWN, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.TO_LOC_DROPDOWN, ElementType.Xpath);
		if (!webDB.waitForElement(BOLPageLocators.TO_LOC_DRP_OPTION, ElementType.Xpath)) return false;
		int toloc_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.TO_LOC_DRP_OPTIONS_LIST)).size();
		int toloc_oneoption = faker.number().numberBetween(1, toloc_totaloptions-1);
		if(oneoption==toloc_oneoption)
		{
			int finalto_location = toloc_oneoption+1;
			webDB.getDriver().findElement(By.xpath(BOLPageLocators.TO_LOC_DRP_OPTIONS_LIST+"["+finalto_location+"]")).click();
		}
		else
		{
			webDB.getDriver().findElement(By.xpath(BOLPageLocators.TO_LOC_DRP_OPTIONS_LIST+"["+toloc_oneoption+"]")).click();
		}
		log.logging("info", "Selected To location");

		//Select Ship Method
		if (!webDB.waitForElement(BOLPageLocators.SHIPMETHOD_DROPDOWN, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.SHIPMETHOD_DROPDOWN, ElementType.Xpath);
		if (!webDB.waitForElement(BOLPageLocators.SHIPMETHOD_DRP_OPTION, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.SHIPMETHOD_DRP_OPTIONS_LIST, ElementType.Xpath);
		log.logging("info", "Selected Ship method");

		//Select Shipper
		if (!webDB.waitForElement(BOLPageLocators.SHIPPER_DROPDOWN, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.SHIPPER_DROPDOWN, ElementType.Xpath);
		if (!webDB.waitForElement(BOLPageLocators.SHIPPER_DRP_OPTION, ElementType.Xpath)) return false;
		int shipper_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.SHIPPER_DRP_OPTIONS_LIST)).size();
		int shipper_oneoption = faker.number().numberBetween(1, shipper_totaloptions-1);
		webDB.getDriver().findElement(By.xpath(BOLPageLocators.SHIPPER_DRP_OPTIONS_LIST+"["+shipper_oneoption+"]")).click();
		log.logging("info", "Selected Shipper");

		//Submit BOL
		if (!webDB.waitForElement(BOLPageLocators.SUBMIT_BOL_BUTTON, ElementType.Id)) return false;
		webDB.clickAnElement(BOLPageLocators.SUBMIT_BOL_BUTTON, ElementType.Id);
		if (!webDB.waitForElement(BOLPageLocators.BOL_SUCCESS_MSG, ElementType.Xpath)) return false;
		log.logging("info", "BOL submitted and success message is displayed");
		// Wait for the success message to disappear
		webDB.waitForClickElement(BOLPageLocators.BOL_SUCCESS_MSG, ElementType.Xpath);
		
		// STAGE 1: Wait for the OLD header to disappear.
		// This is the most important step. It confirms the page is navigating away.
		// Assumes you have a `waitForElementToDisappear` method.
		Thread.sleep(6000);
		//Get BOL Number
		BOL_Number = getBOLNumberFromBOLDetailsPage();
		if (BOL_Number != null) {
			log.logging("info", "The BOL Number on BOL Details page is: "+BOL_Number);
		} else {
			log.logging("error", "Failed to get BOL number from details page.");
			return false; // Explicitly fail the test
		}

		return true; // If we got here, everything succeeded.
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to add an order to the BOL
	 * @throws InterruptedException
	 */
	public boolean set_AddOrderToBOL() throws InterruptedException
	{
		if (!webDB.waitForElement(BOLPageLocators.ADD_ORDER_BUTTON_BOLPAGE, ElementType.Xpath)) return false;
        webDB.scrollToAnElement(BOLPageLocators.ADD_ORDER_BUTTON_BOLPAGE, ElementType.Xpath);
		webDB.clickAnElement(BOLPageLocators.ADD_ORDER_BUTTON_BOLPAGE, ElementType.Xpath);
		log.logging("info", "Clicked on add order to BOL button");

		if (!webDB.waitForElement(BOLPageLocators.CREATE_NEWORDER_BUTTON, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.CREATE_NEWORDER_BUTTON, ElementType.Xpath);

		if (!webDB.waitForElement(BOLPageLocators.ORDERTYPE_DROPDOWN, ElementType.Id)) return false;
		//Select order type
		webDB.clickAnElement(BOLPageLocators.ORDERTYPE_DROPDOWN, ElementType.Id);
		if (!webDB.waitForElement(BOLPageLocators.ORDERTYPE_DRP_OPTION, ElementType.Id)) return false;
		int totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.ORDERTYPE_DRP_OPTIONS_LIST)).size();
		int oneoption = faker.number().numberBetween(1, totaloptions-1);
		webDB.getDriver().findElement(By.xpath(BOLPageLocators.ORDERTYPE_DRP_OPTIONS_LIST+"["+oneoption+"]")).click();
		log.logging("info", "Selected order type");

		if (!webDB.waitForElement(BOLPageLocators.PROGRAM_DROPDOWN, ElementType.Id)) return false;
		webDB.clickAnElement(BOLPageLocators.PROGRAM_DROPDOWN, ElementType.Id);
		if (!webDB.waitForElement(BOLPageLocators.PROGRAM_DRP_OPTION, ElementType.Id)) return false;
		int program_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.PROGRAM_DRP_OPTIONS_LIST)).size();
		int program_oneoption = faker.number().numberBetween(1, program_totaloptions-1);
		webDB.getDriver().findElement(By.xpath(BOLPageLocators.PROGRAM_DRP_OPTIONS_LIST+"["+program_oneoption+"]")).click();
		log.logging("info", "Selected Program");

		if (!webDB.waitForElement(BOLPageLocators.QUANTITY_REQUESTED_INPUTFIELD, ElementType.Xpath)) return false;
		webDB.sendTextToAnElement(BOLPageLocators.QUANTITY_REQUESTED_INPUTFIELD,"20", ElementType.Xpath);
		log.logging("info", "Entered the requested quantity in the input field");

		if (!webDB.waitForElement(BOLPageLocators.SUBMIT_ORDER_BTN, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.SUBMIT_ORDER_BTN, ElementType.Xpath);
		log.logging("info", "Submitted order");

		if (!webDB.waitForElement(BOLPageLocators.REMOVE_ORDERFROMBOL_BTN, ElementType.Xpath)) return false;
        webDB.scrollToAnElement(BOLPageLocators.REMOVE_ORDERFROMBOL_BTN, ElementType.Xpath);
		
		return true;
	}
	
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to verify the BOL status update functionality
	 * @throws InterruptedException
	 */
	public boolean set_BOLStatus() throws InterruptedException
	{
		if (!commonfunction.clickOnBOLSPage()) return false;

		BOL_Number_Listingpage = getBOLNumberFromBOL_ListingPage();
		log.logging("info", "The BOL Number on listing page is: "+BOL_Number_Listingpage);
	
		if(BOL_Number_Listingpage.equals(BOL_Number))
		{
			log.logging("info", "The BOL number is matched");
			flag = update_BOLStatus();
		}
		else
		{
			log.logging("error", "The BOL number on the listing page does not match the created BOL number.");
			flag = false;
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to update the BOL status to Assigned, Driver dispatched, At shipper, In transit, Pending receipt, Receiving in progress
	 * @throws InterruptedException
	 */
	public boolean update_BOLStatus() throws InterruptedException
	{
		String[] statusList = {"assigned", "Driver dispatched", "At shipper", "In transit", "Pending receipt", "Receiving in progress"};
		for (String statusToSelect : statusList) {
		    if (!webDB.waitForElement(BOLPageLocators.BOL_STATUSCHANGE_DRP, ElementType.Xpath)) return false;
		    
			webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_DRP, ElementType.Xpath);
			if (!webDB.waitForElement(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS, ElementType.Xpath)) return false;

			int totalOptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS)).size();
			boolean optionFound = false;
			for (int i = 1; i <= totalOptions; i++) {
				option = webDB.getTextFromElement(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS + "[" + i + "]", ElementType.Xpath);
				if (option.equalsIgnoreCase(statusToSelect))
				{
					webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS + "[" + i + "]", ElementType.Xpath);
					if (!webDB.waitForElement(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATIONPOPUP_YES_BTN, ElementType.Xpath)) return false;
					
					log.logging("info", "Selected " + statusToSelect + " option from dropdown");
					webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATIONPOPUP_YES_BTN, ElementType.Xpath);

					if (!webDB.waitForElement(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATION_MSG, ElementType.Xpath)) return false;
					log.logging("info", "The status of BOL is changed to " + statusToSelect);
					optionFound = true;
					break;
				}
			}
			if (!optionFound) {
				log.logging("error", "The option "+statusToSelect+" was not found in the dropdown.");
				return false;
			}
		}
		return true;
	}

	/**
	 * @author 
	 * @return flag
	 * This method is used to get BOL Number from BOL details page
	 * @throws InterruptedException
	 */
	public String getBOLNumberFromBOLDetailsPage()
	{
	    // Use the new, more specific locator to wait for the correct heading to appear.
	    if (!webDB.waitForElement(BOLPageLocators.BOL_NUMBER_FROM_BOLDETAILSPAGE, ElementType.Xpath)) {
	        log.logging("error", "The BOL Details Page heading element did not appear in time.");
	        return null;
	    }

	    String BOLNumbertext = webDB.getTextFromElement(BOLPageLocators.BOL_NUMBER_FROM_BOLDETAILSPAGE, ElementType.Xpath);
	    if (BOLNumbertext == null || BOLNumbertext.trim().isEmpty()) {
	        log.logging("error", "Could not find the BOL Details Page heading element, or it was empty.");
	        return null;
	    }
	    
	    log.logging("info", "Found BOL header text: '" + BOLNumbertext + "'"); // Example: "Bill of Lading 703920 (Unassigned)"
	    
	    // CORRECTED PATTERN: Look for one or more digits (\d+) in the string.
	    Pattern pattern = Pattern.compile("\\d+");
	    Matcher matcher = pattern.matcher(BOLNumbertext);

	    if (matcher.find()) {
	        String bolNumber = matcher.group(); // .group() will return the first sequence of digits found, e.g., "703920"
	        log.logging("info", "Successfully extracted BOL number: " + bolNumber);
	        return bolNumber;
	    } else {
	        log.logging("error", "Could not find any numbers in the text: '" + BOLNumbertext + "'");
	        return null;
	    }
	}
	/**
	 * @author 
	 * @return flag
	 * This method is used to get BOL Number from BOL details page
	 * @throws InterruptedException
	 */
	public String getBOLNumberFromOrderDetailsPage()
	{
		String BOLNumbertext = webDB.getTextFromElement(BOLPageLocators.BOL_NUMBER_FROM_ORDERDETAILSPAGE, ElementType.Xpath);
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
	 * @return flag
	 * This method is used to get BOL Number From BOL Listing Page
	 * @throws InterruptedException
	 */
	public String getBOLNumberFromBOL_ListingPage()
	{
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
	 * @return flag
	 * This method is used to click on Add Order to BOL and Create BOL button from Order details page
	 * @throws InterruptedException
	 */
	public boolean click_Add_Order_To_BOL_And_CreateBOL_BTN() throws InterruptedException
	{
		if (!webDB.waitForElement(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_ORDERDETAILSPAGE, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_ORDERDETAILSPAGE, ElementType.Xpath);

		if (!webDB.waitForElement(BOLPageLocators.CREATE_NEWBOL_BUTTON, ElementType.Id)) return false;
		webDB.clickAnElement(BOLPageLocators.CREATE_NEWBOL_BUTTON, ElementType.Id);

		if (!webDB.waitForElement(BOLPageLocators.CREATE_NEWBOLPAGE_HEADING_ORDERDETAILSPAGE, ElementType.Xpath)) return false;
		log.logging("info", "Redirected to the create new BOL page");
		
		return true;
	}
	
	
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to create new BOL
	 * @throws InterruptedException
	 */
	public boolean set_BOLPage_CarrierDetails_CreatingOrderFirst() throws InterruptedException
	{
		if (!webDB.waitForElement(BOLPageLocators.SHIPMETHOD_DROPDOWN, ElementType.Xpath)) return false;
		//Select Ship Method
		webDB.clickAnElement(BOLPageLocators.SHIPMETHOD_DROPDOWN, ElementType.Xpath);
		if (!webDB.waitForElement(BOLPageLocators.SHIPMETHOD_DRP_OPTION, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.SHIPMETHOD_DRP_OPTIONS_LIST, ElementType.Xpath);
		log.logging("info", "Selected Ship method");

		//Select Shipper
		if (!webDB.waitForElement(BOLPageLocators.SHIPPER_DROPDOWN, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.SHIPPER_DROPDOWN, ElementType.Xpath);
		if (!webDB.waitForElement(BOLPageLocators.SHIPPER_DRP_OPTION, ElementType.Xpath)) return false;
		int shipper_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.SHIPPER_DRP_OPTIONS_LIST)).size();
		int shipper_oneoption = faker.number().numberBetween(1, shipper_totaloptions-1);
		webDB.getDriver().findElement(By.xpath(BOLPageLocators.SHIPPER_DRP_OPTIONS_LIST+"["+shipper_oneoption+"]")).click();
		log.logging("info", "Selected Shipper");

		//Submit BOL
		if (!webDB.waitForElement(BOLPageLocators.SUBMIT_BOL_BUTTON, ElementType.Id)) return false;
		webDB.clickAnElement(BOLPageLocators.SUBMIT_BOL_BUTTON, ElementType.Id);
		if (!webDB.waitForElement(BOLPageLocators.BOL_SUCCESS_MSG, ElementType.Xpath)) return false;
		log.logging("info", "BOL submitted and success message is displayed");
		
		BOL_Number = getBOLNumberFromOrderDetailsPage();
		if (BOL_Number == null) {
			log.logging("error", "Failed to get BOL number from order details page.");
			return false;
		}
		log.logging("info", "The BOL Number on Order Details page is: "+BOL_Number);

		return true;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Add Order to BOL button from Order details page
	 * @throws InterruptedException
	 */
	public boolean click_Add_Order_To_BOL_BTN_OrderDetailsPage() throws InterruptedException
	{
		if (!webDB.waitForElement(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_ORDERDETAILSPAGE, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_ORDERDETAILSPAGE, ElementType.Xpath);

		if (!webDB.waitForElement(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_BOLCREATEPAGE, ElementType.Xpath)) return false;
		webDB.clickAnElement(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_BOLCREATEPAGE, ElementType.Xpath);

		String BOL_Number_Existing = getBOLNumberFromOrderDetailsPage();
		if (BOL_Number_Existing == null) {
			log.logging("error", "Failed to get existing BOL number from order details page.");
			return false;
		}
		log.logging("info", "The BOL Number on Order Details page is: "+BOL_Number_Existing);
		
		if(BOL_Number_Existing.equalsIgnoreCase(BOL_Number))
		{
			log.logging("info", "Order added to existing BOL i.e. "+BOL_Number_Existing);
			return true;
		}
		else
		{
			log.logging("error", "The Order was not added to the existing BOL. Expected: " + BOL_Number + ", Found: " + BOL_Number_Existing);
			return false;
		}
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Add Order to BOL and Create BOL button from Order details page and fill the carrier details
	 * @throws InterruptedException
	 */
	public boolean set_BOL_Flow() throws InterruptedException
	{
		flag = click_Add_Order_To_BOL_And_CreateBOL_BTN();
		if(flag)
		{
			flag = set_BOLPage_CarrierDetails_CreatingOrderFirst();
			if(flag)
			{
				flag = set_BOLStatus();
			}
		}
		return flag;
	}
	
}
