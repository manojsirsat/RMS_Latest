package pages;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
			webDB.scrollToAnElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath);
			if (!webDB.waitForClickElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath)) {
				log.logging("info", "BOL table is not displayed");
				return null;
			}
			
			// Wait for the first row to be present
			if (!webDB.waitForElement(BOLPageLocators.BOL_TABLE_FIRST_ROW, ElementType.Xpath)) {
				log.logging("info", "No BOL entries found in the table");
				return null;
			}
			
			String bolNumber = webDB.getTextFromElement(BOLPageLocators.BOL_TABLE_FIRST_ROW, ElementType.Xpath);
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
	public boolean searchBOLNumber(String bolNumber) throws InterruptedException {
		if (bolNumber == null || bolNumber.trim().isEmpty()) {
			log.logging("info", "Invalid BOL number provided for search");
			return false;
		}
		
		try {
			// Try primary search filter locator
			boolean filterFound = webDB.waitForElement(BOLPageLocators.BOL_SEARCH_FILTER, ElementType.Xpath);
			
			// If primary fails, try alternative locator
			if (!filterFound) {
				filterFound = webDB.waitForElement(BOLPageLocators.BOL_SEARCH_FILTER_ALTERNATIVE, ElementType.Xpath);
				if (!filterFound) {
					log.logging("info", "Unable to locate BOL search filter");
					return false;
				}
			}
			
			// Clear and enter the BOL number
			String locatorToUse = filterFound ? BOLPageLocators.BOL_SEARCH_FILTER : BOLPageLocators.BOL_SEARCH_FILTER_ALTERNATIVE;
			// The user said they fixed the scroll up.
			webDB.clearText(locatorToUse, ElementType.Xpath);
			webDB.sendTextToAnElement(locatorToUse, bolNumber, ElementType.Xpath);
			log.logging("info", "Entered BOL number in search filter: " + bolNumber);

			webDB.clickAnElement(BOLPageLocators.VIEW_RESULT_BUTTON, ElementType.Xpath);
            log.logging("info", "Clicked on View Result button");
			
			// Wait for table to update (using explicit wait instead of Thread.sleep)
			boolean tableUpdated = webDB.waitForElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath);
			if (!tableUpdated) {
				log.logging("info", "Table did not update after search");
				return false;
			}
			
			// Get and verify the search result
			String firstRowBOL = getFirstBOLNumberFromResult();
			if (firstRowBOL != null && firstRowBOL.equals(bolNumber)) {
				log.logging("info", "Successfully found BOL number: " + bolNumber);
				return true;
			} else {
				log.logging("BOL number not found in search results. Expected: " + bolNumber + ", Found: " + firstRowBOL, firstRowBOL);
				return false;
			}
		} catch (Exception e) {
			log.logging("Unable to search BOL number with Exception: " + e.getMessage(), bolNumber);
			return false;
		}
	}

	private String getFirstBOLNumberFromResult() {
        // This method assumes the table is already visible and updated.
        // It does not perform any scrolling.
        try {
            if (!webDB.waitForElement(BOLPageLocators.BOL_TABLE_FIRST_ROW, ElementType.Xpath)) {
                log.logging("info", "No BOL entries found in the table after search");
                return null;
            }
            String bolNumber = webDB.getTextFromElement(BOLPageLocators.BOL_TABLE_FIRST_ROW, ElementType.Xpath);
            if (bolNumber != null && !bolNumber.trim().isEmpty()) {
                log.logging("info", "Got BOL number from the first row after search: " + bolNumber);
                return bolNumber.trim();
            } else {
                log.logging("info", "BOL number is empty or null after search");
                return null;
            }
        } catch (Exception e) {
            log.logging("info", "Unable to get BOL number from first row after search with Exception: " + e.getMessage());
            return null;
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
	
// public String selectRandomOptionFromDropdown() throws InterruptedException {
//     try {
//         String selectedFromLocation = "";
//         String selectedToLocation = "";

//         // Select from location
//         webDB.clickAnElement(BOLPageLocators.BOL_FROM_LOC_DROPDOWN, ElementType.Xpath);
//         if (!webDB.waitForElement(BOLPageLocators.BOL_FROM_LOC_DRP_OPTION, ElementType.Xpath)) return null;
        
//         int totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.BOL_FROM_LOC_DRP_OPTIONS_LIST)).size();
//         int oneoption = faker.number().numberBetween(1, totaloptions);
        
//         WebElement fromLocationElement = webDB.getDriver().findElement(By.xpath(BOLPageLocators.BOL_FROM_LOC_DRP_OPTIONS_LIST+"["+oneoption+"]"));
//         selectedFromLocation = fromLocationElement.getText();
//         fromLocationElement.click();
//         log.logging("info", "Selected From location: " + selectedFromLocation);

//         // Select to location
//         if (!webDB.waitForElement(BOLPageLocators.BOL_TO_LOC_DROPDOWN, ElementType.Xpath)) return null;
//         webDB.clickAnElement(BOLPageLocators.BOL_TO_LOC_DROPDOWN, ElementType.Xpath);
//         if (!webDB.waitForElement(BOLPageLocators.BOL_TO_LOC_DRP_OPTION, ElementType.Xpath)) return null;
        
//         int toloc_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.BOL_TO_LOC_DRP_OPTIONS_LIST)).size();
//         int toloc_oneoption = faker.number().numberBetween(1, toloc_totaloptions);
        
//         // Ensure different from and to locations
//         if (oneoption == toloc_oneoption) {
//             toloc_oneoption = (toloc_oneoption % toloc_totaloptions) + 1;
//         }
        
//         WebElement toLocationElement = webDB.getDriver().findElement(By.xpath(BOLPageLocators.BOL_TO_LOC_DRP_OPTIONS_LIST+"["+toloc_oneoption+"]"));
//         selectedToLocation = toLocationElement.getText();
//         toLocationElement.click();
//         log.logging("info", "Selected To location: " + selectedToLocation);
// 		webDB.clickAnElement(BOLPageLocators.VIEW_RESULT_BUTTON, ElementType.Xpath);
//         log.logging("info", "Clicked on View Result button");
//         // Return both locations in a formatted string
//         return "From: " + selectedFromLocation + " | To: " + selectedToLocation;

//     } catch (Exception e) {
//         log.logging("error", "Unable to select random option from dropdown: " + e.getMessage());
//         return null;
//     }
// }

// 	public String selectRandomOptionFromDropdown(boolean selectFirstOptions) throws InterruptedException {
// 		try {
// 			String selectedFromLocation = "";
// 			String selectedToLocation = "";

// 			// Select from location
// 			webDB.clickAnElement(BOLPageLocators.BOL_FROM_LOC_DROPDOWN, ElementType.Xpath);
// 			if (!webDB.waitForElement(BOLPageLocators.BOL_FROM_LOC_DRP_OPTION, ElementType.Xpath)) return null;
			
// 			int totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.BOL_FROM_LOC_DRP_OPTIONS_LIST)).size();
// 			int oneoption;
			
// 			if (selectFirstOptions) {
// 				oneoption = 1; // Select first option
// 			} else {
// 				oneoption = faker.number().numberBetween(1, totaloptions); // Random selection
// 			}
			
// 			WebElement fromLocationElement = webDB.getDriver().findElement(By.xpath(BOLPageLocators.BOL_FROM_LOC_DRP_OPTIONS_LIST+"["+oneoption+"]"));
// 			selectedFromLocation = fromLocationElement.getText();
// 			fromLocationElement.click();
// 			log.logging("info", "Selected From location: " + selectedFromLocation);

// 			// Select to location
// 			if (!webDB.waitForElement(BOLPageLocators.BOL_TO_LOC_DROPDOWN, ElementType.Xpath)) return null;
// 			webDB.clickAnElement(BOLPageLocators.BOL_TO_LOC_DROPDOWN, ElementType.Xpath);
// 			if (!webDB.waitForElement(BOLPageLocators.BOL_TO_LOC_DRP_OPTION, ElementType.Xpath)) return null;
			
// 			int toloc_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.BOL_TO_LOC_DRP_OPTIONS_LIST)).size();
// 			int toloc_oneoption;
			
// 			if (selectFirstOptions) {
// 				toloc_oneoption = 1; // Select first option
// 			} else {
// 				toloc_oneoption = faker.number().numberBetween(1, toloc_totaloptions);
// 				// Ensure different from and to locations for random selection
// 				if (oneoption == toloc_oneoption) {
// 					toloc_oneoption = (toloc_oneoption % toloc_totaloptions) + 1;
// 				}
// 			}
			
// 			WebElement toLocationElement = webDB.getDriver().findElement(By.xpath(BOLPageLocators.BOL_TO_LOC_DRP_OPTIONS_LIST+"["+toloc_oneoption+"]"));
// 			selectedToLocation = toLocationElement.getText();
// 			toLocationElement.click();
// 			log.logging("info", "Selected To location: " + selectedToLocation);

// 			// Click View Result button
// 			webDB.clickAnElement(BOLPageLocators.VIEW_RESULT_BUTTON, ElementType.Xpath);
// 			log.logging("info", "Clicked on View Result button");

// 			// If first options were selected, validate table results
// 			if (selectFirstOptions) {
// 				boolean isValidated = validateTableResults(selectedFromLocation, selectedToLocation);
// 				if (isValidated) {
// 					log.logging("info", "Table validation successful - filtered results match selected locations");
// 					return "From: " + selectedFromLocation + " | To: " + selectedToLocation + " | Validation: PASSED";
// 				} else {
// 					log.logging("info", "Table validation failed - filtered results do not match selected locations");
// 					return "From: " + selectedFromLocation + " | To: " + selectedToLocation + " | Validation: FAILED";
// 				}
// 			}

// 			// Return both locations in a formatted string for random selection
// 			return "From: " + selectedFromLocation + " | To: " + selectedToLocation;

// 		} catch (Exception e) {
// 			log.logging("error", "Unable to select option from dropdown: " + e.getMessage());
// 			return null;
// 		}
// 	}

// 	private boolean validateTableResults(String expectedFromLocation, String expectedToLocation) {
//     try {
//         // First verify table is present
//         webDB.scrollToAnElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath);
//         if (!webDB.waitForClickElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath)) {
//             log.logging("info", "BOL table is not displayed");
//             return false;
//         }
        
//         // Wait for the first row to be present
//         if (!webDB.waitForElement(BOLPageLocators.BOL_TABLE_FIRST_ROW_FROM_LOCATION, ElementType.Xpath)) {
//             log.logging("info", "No BOL entries found in the table");
//             return false;
//         }
        
//         // Extract from location from table
//         String tableFromLocation = webDB.getTextFromElement(BOLPageLocators.BOL_TABLE_FIRST_ROW_FROM_LOCATION, ElementType.Xpath);
//         if (tableFromLocation == null || tableFromLocation.trim().isEmpty()) {
//             log.logging("info", "From location in table is empty or null");
//             return false;
//         }
        
//         // Extract to location parts from table and merge them
//         String tableToLocationPart1 = webDB.getTextFromElement(BOLPageLocators.BOL_TABLE_FIRST_ROW_TO_LOCATION_PART1, ElementType.Xpath);
//         String tableToLocationPart2 = webDB.getTextFromElement(BOLPageLocators.BOL_TABLE_FIRST_ROW_TO_LOCATION_PART2, ElementType.Xpath);
        
//         if (tableToLocationPart1 == null) tableToLocationPart1 = "";
//         if (tableToLocationPart2 == null) tableToLocationPart2 = "";
        
//         // Merge the two parts with a space (adjust separator as needed)
//         String tableToLocation = (tableToLocationPart1.trim() + " " + tableToLocationPart2.trim()).trim();
        
//         if (tableToLocation.isEmpty()) {
//             log.logging("info", "To location in table is empty after merging both parts");
//             return false;
//         }
        
//         // Clean and process the values for comparison
//         String cleanTableFromLocation = tableFromLocation.trim();
//         String cleanTableToLocation = tableToLocation.trim();
//         String cleanExpectedFromLocation = expectedFromLocation.trim();
//         String cleanExpectedToLocation = expectedToLocation.trim();
        
//         // Process FROM location - extract only state part (before comma)
//         String stateFromDropdown = cleanExpectedFromLocation;
//         if (cleanExpectedFromLocation.contains(",")) {
//             stateFromDropdown = cleanExpectedFromLocation.split(",")[0].trim();
//         }
        
//         // Process TO location - extract location name and code from dropdown format "Location Name (CODE)"
//         String locationNameFromDropdown = "";
//         String locationCodeFromDropdown = "";
        
//         if (cleanExpectedToLocation.contains("(") && cleanExpectedToLocation.contains(")")) {
//             int openParen = cleanExpectedToLocation.lastIndexOf("(");
//             int closeParen = cleanExpectedToLocation.lastIndexOf(")");
            
//             locationNameFromDropdown = cleanExpectedToLocation.substring(0, openParen).trim();
//             locationCodeFromDropdown = cleanExpectedToLocation.substring(openParen + 1, closeParen).trim();
//         } else {
//             locationNameFromDropdown = cleanExpectedToLocation;
//         }
        
//         log.logging("info", "Table To Location Part1 (Code): '" + tableToLocationPart1.trim() + "'");
//         log.logging("info", "Table To Location Part2 (Name): '" + tableToLocationPart2.trim() + "'");
//         log.logging("info", "Merged Table To Location: '" + cleanTableToLocation + "'");
//         log.logging("info", "Extracted State from Dropdown: '" + stateFromDropdown + "'");
//         log.logging("info", "Extracted Location Name from Dropdown: '" + locationNameFromDropdown + "'");
//         log.logging("info", "Extracted Location Code from Dropdown: '" + locationCodeFromDropdown + "'");
//         log.logging("info", "Comparing - Expected State: '" + stateFromDropdown + "' vs Table From: '" + cleanTableFromLocation + "'");
//         log.logging("info", "Comparing - Expected Location Name: '" + locationNameFromDropdown + "' vs Table Location Name: '" + tableToLocationPart2.trim() + "'");
//         log.logging("info", "Comparing - Expected Location Code: '" + locationCodeFromDropdown + "' vs Table Location Code: '" + tableToLocationPart1.trim() + "'");
        
//         // Check FROM location match (state only)
//         boolean fromLocationMatches = stateFromDropdown.equalsIgnoreCase(cleanTableFromLocation);
        
//         // Check TO location match (both name and code should match)
//         boolean toLocationNameMatches = locationNameFromDropdown.equalsIgnoreCase(tableToLocationPart2.trim());
//         boolean toLocationCodeMatches = locationCodeFromDropdown.equalsIgnoreCase(tableToLocationPart1.trim());
//         boolean toLocationMatches = toLocationNameMatches && toLocationCodeMatches;
        
//         return fromLocationMatches && toLocationMatches;
        
//     } catch (Exception e) {
//         log.logging("error", "Unable to validate table results with Exception: " + e.getMessage());
//         return false;
//     }
// }



	public String selectRandomOptionFromDropdown(boolean selectFirstOptions) throws InterruptedException {
		try {
			String selectedFromLocation = "";
			String selectedToLocation = "";

			// Select from location
			webDB.clickAnElement(BOLPageLocators.BOL_FROM_LOC_DROPDOWN, ElementType.Xpath);
			if (!webDB.waitForElement(BOLPageLocators.BOL_FROM_LOC_DRP_OPTION, ElementType.Xpath)) return null;
			
			int totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.BOL_FROM_LOC_DRP_OPTIONS_LIST)).size();
			int oneoption;
			
			if (selectFirstOptions) {
				oneoption = 1; // Select first option
			} else {
				oneoption = faker.number().numberBetween(1, totaloptions); // Random selection
			}
			
			WebElement fromLocationElement = webDB.getDriver().findElement(By.xpath(BOLPageLocators.BOL_FROM_LOC_DRP_OPTIONS_LIST+"["+oneoption+"]"));
			selectedFromLocation = fromLocationElement.getText();
			fromLocationElement.click();
			log.logging("info", "Selected From location: " + selectedFromLocation);

			// Select to location
			if (!webDB.waitForElement(BOLPageLocators.BOL_TO_LOC_DROPDOWN, ElementType.Xpath)) return null;
			webDB.clickAnElement(BOLPageLocators.BOL_TO_LOC_DROPDOWN, ElementType.Xpath);
			if (!webDB.waitForElement(BOLPageLocators.BOL_TO_LOC_DRP_OPTION, ElementType.Xpath)) return null;
			
			int toloc_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.BOL_TO_LOC_DRP_OPTIONS_LIST)).size();
			int toloc_oneoption;
			
			if (selectFirstOptions) {
				toloc_oneoption = 1; // Select first option
			} else {
				toloc_oneoption = faker.number().numberBetween(1, toloc_totaloptions);
				// Ensure different from and to locations for random selection
				if (oneoption == toloc_oneoption) {
					toloc_oneoption = (toloc_oneoption % toloc_totaloptions) + 1;
				}
			}
			
			WebElement toLocationElement = webDB.getDriver().findElement(By.xpath(BOLPageLocators.BOL_TO_LOC_DRP_OPTIONS_LIST+"["+toloc_oneoption+"]"));
			selectedToLocation = toLocationElement.getText();
			toLocationElement.click();
			log.logging("info", "Selected To location: " + selectedToLocation);

			// Click View Result button
			webDB.clickAnElement(BOLPageLocators.VIEW_RESULT_BUTTON, ElementType.Xpath);
			log.logging("info", "Clicked on View Result button");

			// Always validate table results for both first and random selection
			String validationResult = validateTableResultsNew(selectedFromLocation, selectedToLocation, selectFirstOptions);
			
			if (selectFirstOptions) {
				// For first selection, return with validation status
				return "From: " + selectedFromLocation + " | To: " + selectedToLocation + " | " + validationResult;
			} else {
				// For random selection, return with validation result
				return "From: " + selectedFromLocation + " | To: " + selectedToLocation + " | " + validationResult;
			}

		} catch (Exception e) {
			log.logging("error", "Unable to select option from dropdown: " + e.getMessage());
			return null;
		}
	}

	// New validation method with String return type
	private String validateTableResultsNew(String expectedFromLocation, String expectedToLocation, boolean isFirstSelection) {
		try {
			// First verify table is present
			webDB.scrollToAnElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath);
			
			// Check for "No Bills of Lading data found" message
			if (webDB.waitForElement(BOLPageLocators.NO_DATA_MESSAGE, ElementType.Xpath)) {
				String noDataMessage = webDB.getTextFromElement(BOLPageLocators.NO_DATA_MESSAGE, ElementType.Xpath);
				log.logging("info", "No data message found: " + noDataMessage);
				if (isFirstSelection) {
					return "Validation: FAILED - No data found";
				} else {
					return "Result: No Table found for this random data - " + noDataMessage;
				}
			}
			
			if (!webDB.waitForClickElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath)) {
				log.logging("info", "BOL table is not displayed");
				if (isFirstSelection) {
					return "Validation: FAILED - Table not displayed";
				} else {
					return "Result: No Table found for this random data";
				}
			}
			
			// Wait for the first row to be present
			if (!webDB.waitForElement(BOLPageLocators.BOL_TABLE_FIRST_ROW_FROM_LOCATION, ElementType.Xpath)) {
				log.logging("info", "No BOL entries found in the table");
				if (isFirstSelection) {
					return "Validation: FAILED - No entries found";
				} else {
					return "Result: No Table found for this random data";
				}
			}
			
			// Extract from location from table
			String tableFromLocation = webDB.getTextFromElement(BOLPageLocators.BOL_TABLE_FIRST_ROW_FROM_LOCATION, ElementType.Xpath);
			if (tableFromLocation == null || tableFromLocation.trim().isEmpty()) {
				log.logging("info", "From location in table is empty or null");
				if (isFirstSelection) {
					return "Validation: FAILED - From location empty";
				} else {
					return "Result: Table data incomplete";
				}
			}
			
			// Extract to location parts from table and merge them
			String tableToLocationPart1 = webDB.getTextFromElement(BOLPageLocators.BOL_TABLE_FIRST_ROW_TO_LOCATION_PART1, ElementType.Xpath);
			String tableToLocationPart2 = webDB.getTextFromElement(BOLPageLocators.BOL_TABLE_FIRST_ROW_TO_LOCATION_PART2, ElementType.Xpath);
			
			if (tableToLocationPart1 == null) tableToLocationPart1 = "";
			if (tableToLocationPart2 == null) tableToLocationPart2 = "";
			
			// Merge the two parts with a space (adjust separator as needed)
			String tableToLocation = (tableToLocationPart1.trim() + " " + tableToLocationPart2.trim()).trim();
			
			if (tableToLocation.isEmpty()) {
				log.logging("info", "To location in table is empty after merging both parts");
				if (isFirstSelection) {
					return "Validation: FAILED - To location empty";
				} else {
					return "Result: Table data incomplete";
				}
			}
			
			// Clean and process the values for comparison
			String cleanTableFromLocation = tableFromLocation.trim();
			String cleanExpectedFromLocation = expectedFromLocation.trim();
			String cleanExpectedToLocation = expectedToLocation.trim();
			
			// Process FROM location - extract only state part (before comma)
			String stateFromDropdown = cleanExpectedFromLocation;
			if (cleanExpectedFromLocation.contains(",")) {
				stateFromDropdown = cleanExpectedFromLocation.split(",")[0].trim();
			}
			
			// Process TO location - extract location name and code from dropdown format "Location Name (CODE)"
			String locationNameFromDropdown = "";
			String locationCodeFromDropdown = "";
			
			if (cleanExpectedToLocation.contains("(") && cleanExpectedToLocation.contains(")")) {
				int openParen = cleanExpectedToLocation.lastIndexOf("(");
				int closeParen = cleanExpectedToLocation.lastIndexOf(")");
				
				locationNameFromDropdown = cleanExpectedToLocation.substring(0, openParen).trim();
				locationCodeFromDropdown = cleanExpectedToLocation.substring(openParen + 1, closeParen).trim();
			} else {
				locationNameFromDropdown = cleanExpectedToLocation;
			}
			
			log.logging("info", "Table To Location Part1 (Code): '" + tableToLocationPart1.trim() + "'");
			log.logging("info", "Table To Location Part2 (Name): '" + tableToLocationPart2.trim() + "'");
			log.logging("info", "Extracted State from Dropdown: '" + stateFromDropdown + "'");
			log.logging("info", "Extracted Location Name from Dropdown: '" + locationNameFromDropdown + "'");
			log.logging("info", "Extracted Location Code from Dropdown: '" + locationCodeFromDropdown + "'");
			log.logging("info", "Comparing - Expected State: '" + stateFromDropdown + "' vs Table From: '" + cleanTableFromLocation + "'");
			log.logging("info", "Comparing - Expected Location Name: '" + locationNameFromDropdown + "' vs Table Location Name: '" + tableToLocationPart2.trim() + "'");
			log.logging("info", "Comparing - Expected Location Code: '" + locationCodeFromDropdown + "' vs Table Location Code: '" + tableToLocationPart1.trim() + "'");
			
			// Check FROM location match (state only)
			boolean fromLocationMatches = stateFromDropdown.equalsIgnoreCase(cleanTableFromLocation);
			
			// Check TO location match (both name and code should match)
			boolean toLocationNameMatches = locationNameFromDropdown.equalsIgnoreCase(tableToLocationPart2.trim());
			boolean toLocationCodeMatches = locationCodeFromDropdown.equalsIgnoreCase(tableToLocationPart1.trim());
			boolean toLocationMatches = toLocationNameMatches && toLocationCodeMatches;
			
			// Return appropriate result based on selection type
			if (fromLocationMatches && toLocationMatches) {
				log.logging("info", "Table validation successful - filtered results match selected locations");
				if (isFirstSelection) {
					return "Validation: PASSED";
				} else {
					return "Result: Table data matches selected locations";
				}
			} else {
				log.logging("info", "Table validation failed - filtered results do not match selected locations");
				if (isFirstSelection) {
					return "Validation: FAILED - Data mismatch";
				} else {
					return "Result: Table data does not match selected locations";
				}
			}
			
		} catch (Exception e) {
			log.logging("error", "Unable to validate table results with Exception: " + e.getMessage());
			if (isFirstSelection) {
				return "Validation: FAILED - Exception occurred";
			} else {
				return "Result: Exception during validation - " + e.getMessage();
			}
		}
	}


    public boolean verifyTableColumn(String columnLocator, String expectedValue) {
        try {
            java.util.List<org.openqa.selenium.WebElement> elements = webDB.getDriver().findElements(By.xpath(columnLocator));
            if (elements.isEmpty()) {
                log.logging("info", "No rows found in the table for column: " + columnLocator);
                return false;
            }
            for (org.openqa.selenium.WebElement element : elements) {
                if (!element.getText().equalsIgnoreCase(expectedValue)) {
                    log.logging("Column value mismatch. Expected: " + expectedValue + ", Found: " + element.getText() + " for column: " + columnLocator, "error");
                    return false;
                }
            }
            log.logging("info", "Verified all rows in column " + columnLocator + " have value: " + expectedValue);
            return true;
        } catch (Exception e) {
            log.logging("Unable to verify table column " + columnLocator + " with Exception: " + e.getMessage(), "error");
            return false;
        }
    }
	
			public boolean resetFilters() throws InterruptedException {
        try {
            webDB.clickAnElement(BOLPageLocators.RESET_FILTERS_BUTTON, ElementType.Xpath);
            log.logging("info", "Clicked on Reset Filters button");
            webDB.waitForElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath); // Wait for table to refresh
            return true;
        } catch (Exception e) {
            log.logging("Unable to reset filters with Exception: " + e.getMessage(), "error");
            return false;
        }
    }

    public java.util.List<String> getStatusOptions() {
        java.util.List<String> options = new java.util.ArrayList<>();
        try {
            webDB.clickAnElement(BOLPageLocators.STATUS_MULTI_SELECT, ElementType.Id);
            webDB.waitForElement(BOLPageLocators.STATUS_MULTI_SELECT_PANEL, ElementType.Xpath);
            java.util.List<org.openqa.selenium.WebElement> elements = webDB.getDriver().findElements(By.xpath(BOLPageLocators.STATUS_MULTI_SELECT_ITEM));
            for (org.openqa.selenium.WebElement element : elements) {
                options.add(element.getText());
            }
            webDB.clickAnElement(BOLPageLocators.STATUS_MULTI_SELECT, ElementType.Id); // Close dropdown
        } catch (Exception e) {
            log.logging("Unable to get status options with Exception: " + e.getMessage(), "error");
        }
        return options;
    }

    public boolean selectStatusAndApply(String status) throws InterruptedException {
        try {
            webDB.clickAnElement(BOLPageLocators.STATUS_MULTI_SELECT, ElementType.Id);
            webDB.waitForElement(BOLPageLocators.STATUS_MULTI_SELECT_PANEL, ElementType.Xpath);
            String optionXpath = BOLPageLocators.STATUS_MULTI_SELECT_ITEM + "[@aria-label='" + status + "']";
            webDB.clickAnElement(optionXpath, ElementType.Xpath);
            log.logging("info", "Selected status: " + status);
            webDB.clickAnElement(BOLPageLocators.VIEW_RESULT_BUTTON, ElementType.Xpath);
            log.logging("info", "Clicked on View Result button");
            webDB.waitForElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath); // Wait for table to update
            return true;
        } catch (Exception e) {
            log.logging("Unable to select status and apply with Exception: " + e.getMessage(), "error");
            return false;
        }
    }

    public boolean verifyStatusColumn(String expectedStatus) {
        try {
            java.util.List<org.openqa.selenium.WebElement> elements = webDB.getDriver().findElements(By.xpath(BOLPageLocators.STATUS_TABLE_COLUMN_DATA));
            for (org.openqa.selenium.WebElement element : elements) {
                if (!element.getText().equalsIgnoreCase(expectedStatus)) {
                    log.logging("Status mismatch. Expected: " + expectedStatus + ", Found: " + element.getText(), "error");
                    return false;
                }
            }
            log.logging("info", "Verified all rows have status: " + expectedStatus);
            return true;
        } catch (Exception e) {
            log.logging("Unable to verify status column with Exception: " + e.getMessage(), "error");
            return false;
        }
    }

    public boolean unselectAllStatuses() throws InterruptedException {
        try {
            // 1. Open the dropdown
            webDB.clickAnElement(BOLPageLocators.STATUS_MULTI_SELECT, ElementType.Id);
            webDB.waitForElement(BOLPageLocators.STATUS_MULTI_SELECT_PANEL, ElementType.Xpath);
            log.logging("info", "Opened status multi-select dropdown.");

			        if (!webDB.waitForElement(BOLPageLocators.STATUS_MULTI_SELECT_PANEL, ElementType.Xpath)) {
            log.logging("error", "Multiselect panel did not open.");
            return false;
        }
        log.logging("info", "Opened status multi-select dropdown.");

        // 2. Try multiple XPath strategies to find the checkbox
        String[] checkboxXPaths = {
            "//div[contains(@class, 'p-multiselect-header')]//input[@type='checkbox']",
            "//div[@class='p-multiselect-header']//input[contains(@class, 'p-checkbox-input')]",
            "//div[contains(@class, 'p-multiselect-panel')]//div[contains(@class, 'p-multiselect-header')]//input[@type='checkbox']",
            BOLPageLocators.STATUS_MULTI_SELECT_ALL_CHECKBOX // Your original locator
        };
        
        WebElement selectAllCheckbox = null;
        String successfulXPath = null;
        
        for (String xpath : checkboxXPaths) {
            try {
                WebDriverWait wait = new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(5));
                selectAllCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
                successfulXPath = xpath;
                log.logging("info", "Found checkbox using XPath: " + xpath);
                break;
            } catch (TimeoutException e) {
                log.logging("info", "Checkbox not found with XPath: " + xpath);
                continue;
            }
        }
        
            // 2. Find the 'select/unselect all' checkbox
            if (!webDB.waitForElement(BOLPageLocators.STATUS_MULTI_SELECT_ALL_CHECKBOX, ElementType.Xpath)) {
                 log.logging("error", "Could not find the 'select all' checkbox.");
                 // Close dropdown before failing
                 webDB.clickAnElement(BOLPageLocators.STATUS_MULTI_SELECT, ElementType.Id);
                 return false;
            }
            org.openqa.selenium.WebElement selectAllCheckbox1 = webDB.getDriver().findElement(By.xpath(BOLPageLocators.STATUS_MULTI_SELECT_ALL_CHECKBOX));

            // 3. Check its state via aria-label and click ONLY if everything is selected
            String ariaLabel = selectAllCheckbox1.getAttribute("aria-label");
            log.logging("info", "Header checkbox aria-label is: '" + ariaLabel + "'");

            if ("All items selected".equalsIgnoreCase(ariaLabel)) {
                selectAllCheckbox1.click();
                log.logging("info", "Clicked the header checkbox to unselect all statuses.");
            } else {
                log.logging("info", "All items are already unselected. No action needed.");
            }

            // 4. Close the dropdown
            webDB.clickAnElement(BOLPageLocators.STATUS_MULTI_SELECT, ElementType.Id);
            log.logging("info", "Closed status multi-select dropdown.");

            // 5. Apply the filter change
            webDB.clickAnElement(BOLPageLocators.VIEW_RESULT_BUTTON, ElementType.Xpath);
            log.logging("info", "Clicked 'View Result' to apply the unselection.");
            webDB.waitForElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath); // Wait for table to refresh
            return true;
        } catch (Exception e) {
            log.logging("Unable to unselect all statuses with Exception: " + e.getMessage(), "error");
            return false;
        }
    }
}