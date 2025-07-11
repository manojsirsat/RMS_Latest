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
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();
	String BOL_Number="";
	String BOL_Number_Listingpage="";
	String option = "";
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
		webDB.clickAnElement(BOLPageLocators.CREATE_NEWBOL_BUTTON, ElementType.Id);
		Thread.sleep(4000);
		flag = webDB.isElementDisplayed(BOLPageLocators.CREATE_NEWBOLPAGE_HEADING, ElementType.Xpath);
		log.logging("info", "Redirected to the create new BOL page");
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to create new BOL
	 * @throws InterruptedException
	 */
	public boolean set_BOLPage_CarrierDetails() throws InterruptedException
	{
		flag = click_CreateNewBOL_Button();
		if(flag)
		{
		flag = webDB.isElementDisplayed(BOLPageLocators.CREATE_NEWBOLPAGE_HEADING, ElementType.Xpath);
		if(flag)
		{
			//Select from location
			webDB.clickAnElement(BOLPageLocators.FROM_LOC_DROPDOWN, ElementType.Id);
			Thread.sleep(1000);
			flag = webDB.isElementDisplayed(BOLPageLocators.FROM_LOC_DRP_OPTION, ElementType.Id);
			if(flag)
			{
				int totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.FROM_LOC_DRP_OPTIONS_LIST)).size();
				int oneoption = faker.number().numberBetween(1, totaloptions-1);
				webDB.getDriver().findElement(By.xpath(BOLPageLocators.FROM_LOC_DRP_OPTIONS_LIST+"["+oneoption+"]")).click();
				log.logging("info", "Selected From location");
				Thread.sleep(2000);
				
				//Select to location
				webDB.clickAnElement(BOLPageLocators.TO_LOC_DROPDOWN, ElementType.Id);
				Thread.sleep(1000);
				flag = webDB.isElementDisplayed(BOLPageLocators.TO_LOC_DRP_OPTION, ElementType.Id);
				if(flag)
				{
					int toloc_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.TO_LOC_DRP_OPTIONS_LIST)).size();
					int toloc_oneoption = faker.number().numberBetween(1, toloc_totaloptions-1);
					if(oneoption==toloc_oneoption)
					{
						int finalto_location = toloc_oneoption+1;
					
					webDB.getDriver().findElement(By.xpath(BOLPageLocators.TO_LOC_DRP_OPTIONS_LIST+"["+finalto_location+"]")).click();
					Thread.sleep(2000);
					log.logging("info", "Selected To location");
					}
					else
					{
						webDB.getDriver().findElement(By.xpath(BOLPageLocators.TO_LOC_DRP_OPTIONS_LIST+"["+toloc_oneoption+"]")).click();
						Thread.sleep(2000);
						log.logging("info", "Selected To location");
						flag = true;
					}
					//Select Ship Method
					webDB.clickAnElement(BOLPageLocators.SHIPMETHOD_DROPDOWN, ElementType.Id);
					Thread.sleep(1000);
					flag = webDB.isElementDisplayed(BOLPageLocators.SHIPMETHOD_DRP_OPTION, ElementType.Id);
					if(flag)
					{
						webDB.clickAnElement(BOLPageLocators.SHIPMETHOD_DRP_OPTIONS_LIST, ElementType.Xpath);
						log.logging("info", "Selected Ship method");
						Thread.sleep(2000);
						//Select Shipper
						webDB.clickAnElement(BOLPageLocators.SHIPPER_DROPDOWN, ElementType.Id);
						Thread.sleep(1000);
						flag = webDB.isElementDisplayed(BOLPageLocators.SHIPPER_DRP_OPTION, ElementType.Id);
						if(flag)
						{
							int shipper_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.SHIPPER_DRP_OPTIONS_LIST)).size();
							int shipper_oneoption = faker.number().numberBetween(1, shipper_totaloptions-1);
							webDB.getDriver().findElement(By.xpath(BOLPageLocators.SHIPPER_DRP_OPTIONS_LIST+"["+shipper_oneoption+"]")).click();
							Thread.sleep(2000);
							log.logging("info", "Selected Shipper");
							flag = webDB.isElementDisplayed(BOLPageLocators.SUBMIT_BOL_BUTTON, ElementType.Id);
							if(flag)
							{
								webDB.clickAnElement(BOLPageLocators.SUBMIT_BOL_BUTTON, ElementType.Id);
								Thread.sleep(1000);
								
								flag = webDB.isElementDisplayed(BOLPageLocators.BOL_SUCCESS_MSG, ElementType.Xpath);
								Thread.sleep(3000);
								log.logging("info", "BOL submitted and success message is displayed");
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
	 * @return flag
	 * This method is used to add an order to the BOL
	 * @throws InterruptedException
	 */
	public boolean set_AddOrderToBOL() throws InterruptedException
	{
		webDB.scrollToAnElement(BOLPageLocators.ADD_ORDER_BUTTON_BOLPAGE, ElementType.Xpath);
		Thread.sleep(750);
		flag = webDB.isElementDisplayed(BOLPageLocators.ADD_ORDER_BUTTON_BOLPAGE, ElementType.Xpath);
				if(flag)
				{
					webDB.clickAnElement(BOLPageLocators.ADD_ORDER_BUTTON_BOLPAGE, ElementType.Xpath);
					Thread.sleep(3000);
					log.logging("info", "Clicked on add order to BOL button");
					flag = webDB.isElementDisplayed(BOLPageLocators.CREATE_NEWORDER_BUTTON, ElementType.Xpath);
					if(flag)
					{
						webDB.clickAnElement(BOLPageLocators.CREATE_NEWORDER_BUTTON, ElementType.Xpath);
						Thread.sleep(3000);
						flag = webDB.isElementDisplayed(BOLPageLocators.ORDERTYPE_DROPDOWN, ElementType.Id);
						if(flag)
						{
							//Select order type
							webDB.clickAnElement(BOLPageLocators.ORDERTYPE_DROPDOWN, ElementType.Id);
							Thread.sleep(1000);
							flag = webDB.isElementDisplayed(BOLPageLocators.ORDERTYPE_DRP_OPTION, ElementType.Id);
							if(flag)
							{
								int totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.ORDERTYPE_DRP_OPTIONS_LIST)).size();
								int oneoption = faker.number().numberBetween(1, totaloptions-1);
								webDB.getDriver().findElement(By.xpath(BOLPageLocators.ORDERTYPE_DRP_OPTIONS_LIST+"["+oneoption+"]")).click();
								Thread.sleep(2000);
								log.logging("info", "Selected order type");
								flag = webDB.isElementDisplayed(BOLPageLocators.PROGRAM_DROPDOWN, ElementType.Id);
								if(flag)
								{
									webDB.clickAnElement(BOLPageLocators.PROGRAM_DROPDOWN, ElementType.Id);
									Thread.sleep(1000);
									flag = webDB.isElementDisplayed(BOLPageLocators.PROGRAM_DRP_OPTION, ElementType.Id);
									if(flag)
									{
									int program_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.PROGRAM_DRP_OPTIONS_LIST)).size();
									int program_oneoption = faker.number().numberBetween(1, program_totaloptions-1);
									webDB.getDriver().findElement(By.xpath(BOLPageLocators.PROGRAM_DRP_OPTIONS_LIST+"["+program_oneoption+"]")).click();
									Thread.sleep(2000);
									log.logging("info", "Selected Program");
									flag = webDB.isElementDisplayed(BOLPageLocators.QUANTITY_REQUESTED_INPUTFIELD, ElementType.Xpath);
									if(flag)
									{
										webDB.sendTextToAnElement(BOLPageLocators.QUANTITY_REQUESTED_INPUTFIELD,"20", ElementType.Xpath);
										log.logging("info", "Entered the requested quantity in the input field");
										flag = webDB.isElementDisplayed(BOLPageLocators.SUBMIT_ORDER_BTN, ElementType.Xpath);
										if(flag)
										{
											webDB.clickAnElement(BOLPageLocators.SUBMIT_ORDER_BTN, ElementType.Xpath);
											Thread.sleep(3000);
											log.logging("info", "Submitted order");
											webDB.scrollToAnElement(BOLPageLocators.ADD_ORDER_BUTTON_BOLPAGE, ElementType.Xpath);
											Thread.sleep(750);
											flag = webDB.isElementDisplayed(BOLPageLocators.REMOVE_ORDERFROMBOL_BTN, ElementType.Xpath);
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
	 * @return flag
	 * This method is used to verify the BOL status update functionality
	 * @throws InterruptedException
	 */
	public boolean set_BOLStatus() throws InterruptedException
	{
		BOL_Number= getBOLNumberFromOrderDetailsPage();
		log.logging("info", "The BOL Number on BOL Details page is: "+BOL_Number);
		Thread.sleep(3000);
		
		commonfunction.clickOnBOLSPage();
		BOL_Number_Listingpage = getBOLNumberFromBOL_ListingPage();
		log.logging("info", "The BOL Number on listing page is: "+BOL_Number_Listingpage);
		Thread.sleep(750);
	
		if(BOL_Number_Listingpage.equals(BOL_Number))
		{
			log.logging("info", "The BOL number is matched");
			flag = update_BOLStatus();
		}
		else
		{
			log.logging("info", "The BOL is not matched");
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
		    flag = webDB.isElementDisplayed(BOLPageLocators.BOL_STATUSCHANGE_DRP, ElementType.Xpath);
		    if (flag) {
		        webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_DRP, ElementType.Xpath);
		        Thread.sleep(3000);
		        int totalOptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS)).size();
		        for (int i = 1; i <= totalOptions; i++) {
		            option = webDB.getTextFromElement(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS + "[" + i + "]", ElementType.Xpath);
		            if (option.equalsIgnoreCase(statusToSelect)) 
		            {
		                webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS + "[" + i + "]", ElementType.Xpath);
		                Thread.sleep(3000);
		                flag = webDB.isElementDisplayed(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATIONPOPUP_YES_BTN, ElementType.Xpath);
		                if (flag) {
		                    log.logging("info", "Selected " + statusToSelect + " option from dropdown");
		                    webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATIONPOPUP_YES_BTN, ElementType.Xpath);
		                    Thread.sleep(3000);

		                    flag = webDB.isElementDisplayed(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATION_MSG, ElementType.Xpath);
		                    if (flag) {
		                        log.logging("info", "The status of BOL is changed to " + statusToSelect);
		                        Thread.sleep(3000);
		                    }
		                }

		                break; 
		            }
		            else
		            {
		            	log.logging("info", "The option "+statusToSelect+" is not available in dropdown");
	                	flag = false;
		            }
		            
		        }
		    }
		}
			return flag;
	}

	/**
	 * @author 
	 * @return flag
	 * This method is used to get BOL Number from Order details page
	 * @throws InterruptedException
	 */
	public String getBOLNumberFromOrderDetailsPage()
	{
		String BOLNumbertext = webDB.getTextFromElement(BOLPageLocators.BOL_NUMBER_FROM_BOLDETAILSPAGE, ElementType.Xpath);
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
	
	
	
	
}
