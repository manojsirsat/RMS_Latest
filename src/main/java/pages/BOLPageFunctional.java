package pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.BOLPageLocators;
import locators.CommonFunctionsLocators;
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
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ORDERSANDBOLS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath, BOLPageLocators.BOLPAGE_HEADING, ElementType.Xpath);
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
//		flag = click_CreateNewBOL_Button();
//		if(flag)
//		{
		flag = webDB.isElementDisplayed(BOLPageLocators.FROM_LOC_DROPDOWN, ElementType.Xpath);
		if(flag)
		{
			//Select from location
			webDB.clickAnElement(BOLPageLocators.FROM_LOC_DROPDOWN, ElementType.Xpath);
			Thread.sleep(1000);
			flag = webDB.isElementDisplayed(BOLPageLocators.FROM_LOC_DRP_OPTION, ElementType.Xpath);
			if(flag)
			{
				int totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.FROM_LOC_DRP_OPTIONS_LIST)).size();
				int oneoption = faker.number().numberBetween(1, totaloptions-1);
				webDB.getDriver().findElement(By.xpath(BOLPageLocators.FROM_LOC_DRP_OPTIONS_LIST+"["+oneoption+"]")).click();
				log.logging("info", "Selected From location");
				Thread.sleep(2000);
				
				//Select to location
				webDB.clickAnElement(BOLPageLocators.TO_LOC_DROPDOWN, ElementType.Xpath);
				Thread.sleep(1000);
				flag = webDB.isElementDisplayed(BOLPageLocators.TO_LOC_DRP_OPTION, ElementType.Xpath);
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
					webDB.clickAnElement(BOLPageLocators.SHIPMETHOD_DROPDOWN, ElementType.Xpath);
					Thread.sleep(1000);
					flag = webDB.isElementDisplayed(BOLPageLocators.SHIPMETHOD_DRP_OPTION, ElementType.Xpath);
					if(flag)
					{
						webDB.clickAnElement(BOLPageLocators.SHIPMETHOD_DRP_OPTIONS_LIST, ElementType.Xpath);
						log.logging("info", "Selected Ship method");
						Thread.sleep(2000);
						//Select Shipper
						webDB.clickAnElement(BOLPageLocators.SHIPPER_DROPDOWN, ElementType.Xpath);
						Thread.sleep(1000);
						flag = webDB.isElementDisplayed(BOLPageLocators.SHIPPER_DRP_OPTION, ElementType.Xpath);
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
								Thread.sleep(4000);
								log.logging("info", "BOL submitted and success message is displayed");
								BOL_Number= getBOLNumberFromBOLDetailsPage();
								log.logging("info", "The BOL Number on BOL Details page is: "+BOL_Number);
								Thread.sleep(3000);
							}

						}
					}
				}
			}
		}
//	}
		
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
					Thread.sleep(5000);
					log.logging("info", "Clicked on add order to BOL button");
					flag = webDB.isElementDisplayed(BOLPageLocators.CREATE_NEWORDER_BUTTON, ElementType.Xpath);
					if(flag)
					{
						webDB.clickAnElement(BOLPageLocators.CREATE_NEWORDER_BUTTON, ElementType.Xpath);
						Thread.sleep(5000);
						flag = webDB.isElementDisplayed(BOLPageLocators.ORDERTYPE_DROPDOWN, ElementType.Id);
						if(flag)
						{
							//Select order type
							webDB.clickAnElement(BOLPageLocators.ORDERTYPE_DROPDOWN, ElementType.Id);
							Thread.sleep(2000);
							flag = webDB.isElementDisplayed(BOLPageLocators.ORDERTYPE_DRP_OPTION, ElementType.Id);
							if(flag)
							{
								int totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.ORDERTYPE_DRP_OPTIONS_LIST)).size();
								int oneoption = faker.number().numberBetween(1, totaloptions-1);
								webDB.getDriver().findElement(By.xpath(BOLPageLocators.ORDERTYPE_DRP_OPTIONS_LIST+"["+oneoption+"]")).click();
								Thread.sleep(3000);
								log.logging("info", "Selected order type");
								flag = webDB.isElementDisplayed(BOLPageLocators.PROGRAM_DROPDOWN, ElementType.Id);
								if(flag)
								{
									webDB.clickAnElement(BOLPageLocators.PROGRAM_DROPDOWN, ElementType.Id);
									Thread.sleep(3000);
									flag = webDB.isElementDisplayed(BOLPageLocators.PROGRAM_DRP_OPTION, ElementType.Id);
									if(flag)
									{
									int program_totaloptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.PROGRAM_DRP_OPTIONS_LIST)).size();
									int program_oneoption = faker.number().numberBetween(1, program_totaloptions-1);
									webDB.getDriver().findElement(By.xpath(BOLPageLocators.PROGRAM_DRP_OPTIONS_LIST+"["+program_oneoption+"]")).click();
									Thread.sleep(3000);
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
//		BOL_Number= getBOLNumberFromBOLDetailsPage();
//		log.logging("info", "The BOL Number on BOL Details page is: "+BOL_Number);
//		Thread.sleep(3000);
		
		commonfunction.clickOnBOLSPage();
		BOL_Number_Listingpage = getBOLNumberFromBOL_ListingPage();
		log.logging("info", "The BOL Number on listing page is: "+BOL_Number_Listingpage);
		Thread.sleep(1000);
	
		if(BOL_Number_Listingpage.equals(BOL_Number))
		{
			log.logging("info", "The BOL number is matched");
			Thread.sleep(1500);
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
		        Thread.sleep(4000);
		        int totalOptions = webDB.getDriver().findElements(By.xpath(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS)).size();
		        for (int i = 1; i <= totalOptions; i++) {
		            option = webDB.getTextFromElement(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS + "[" + i + "]", ElementType.Xpath);
		            if (option.equalsIgnoreCase(statusToSelect)) 
		            {
		                webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_DRP_OPTIONS + "[" + i + "]", ElementType.Xpath);
		                Thread.sleep(4000);
		                flag = webDB.isElementDisplayed(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATIONPOPUP_YES_BTN, ElementType.Xpath);
		                if (flag) {
		                    log.logging("info", "Selected " + statusToSelect + " option from dropdown");
		                    webDB.clickAnElement(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATIONPOPUP_YES_BTN, ElementType.Xpath);
		                    Thread.sleep(4000);

		                    flag = webDB.isElementDisplayed(BOLPageLocators.BOL_STATUSCHANGE_CONFIRMATION_MSG, ElementType.Xpath);
		                    if (flag) {
		                        log.logging("info", "The status of BOL is changed to " + statusToSelect);
		                        Thread.sleep(4000);
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
	
	public boolean markBOLComplete() throws InterruptedException
	{
		flag = webDB.waitForElement(BOLPageLocators.MARKBOLCOMPLETE_BTN_BOLCOMPLETEPAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.scrollToAnElement(BOLPageLocators.MARKBOLCOMPLETE_BTN_BOLCOMPLETEPAGE, ElementType.Xpath);
			Thread.sleep(1500);
//			webDB.scrollBottom();
//			Thread.sleep(750);
			webDB.clickAnElement(BOLPageLocators.WIP_INPUTFIELD_BOLCOMPLETEPAGE, ElementType.Xpath);
			Thread.sleep(1500);
//			flag = webDB.javaScriptSendTextToAnElement(BOLPageLocators.WIP_INPUTFIELD_BOLCOMPLETEPAGE, "5", ElementType.Xpath);
//			flag = webDB.sendTextToAnElement(BOLPageLocators.WIP_INPUTFIELD_BOLCOMPLETEPAGE, "5", ElementType.Xpath);
			webDB.pressUpArrowKey();
			Thread.sleep(750);
			webDB.pressUpArrowKey();
			Thread.sleep(1500);
			if(flag)
			{
			log.logging("info", "Entered 5 quantity in WIP input field");	
			webDB.clickAnElement(BOLPageLocators.MARKBOLCOMPLETE_BTN_BOLCOMPLETEPAGE, ElementType.Xpath);
			Thread.sleep(1500);
			int popupcount = webDB.getDriver().findElements(By.xpath(BOLPageLocators.MARKBOLCOMPLETE_PRIMARYREASONLABEL_BOLCOMPLETEPAGE)).size();
			if(popupcount==1)
			{
				
			}
			else
			{
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
	 * @return flag
	 * This method is used to get BOL Number from BOL details page
	 * @throws InterruptedException
	 */
	public String getBOLNumberFromBOLDetailsPage()
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
		flag = webDB.isElementDisplayed(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_ORDERDETAILSPAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.clickAnElement(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_ORDERDETAILSPAGE, ElementType.Xpath);
			Thread.sleep(1500);
			flag = webDB.isElementDisplayed(BOLPageLocators.CREATE_NEWBOL_BUTTON, ElementType.Id);
			if(flag)
			{
				webDB.clickAnElement(BOLPageLocators.CREATE_NEWBOL_BUTTON, ElementType.Id);
				Thread.sleep(4000);
				flag = webDB.isElementDisplayed(BOLPageLocators.CREATE_NEWBOLPAGE_HEADING_ORDERDETAILSPAGE, ElementType.Xpath);
				log.logging("info", "Redirected to the create new BOL page");
			}
		}
		return flag;
	}
	
	
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to create new BOL
	 * @throws InterruptedException
	 */
	public boolean set_BOLPage_CarrierDetails_CreatingOrderFirst() throws InterruptedException
	{
		flag = webDB.isElementDisplayed(BOLPageLocators.SHIPMETHOD_DROPDOWN, ElementType.Xpath);
		if(flag)
		{
			//Select Ship Method
			webDB.clickAnElement(BOLPageLocators.SHIPMETHOD_DROPDOWN, ElementType.Xpath);
			Thread.sleep(2000);
			flag = webDB.isElementDisplayed(BOLPageLocators.SHIPMETHOD_DRP_OPTION, ElementType.Xpath);
			if(flag)
			{
				webDB.clickAnElement(BOLPageLocators.SHIPMETHOD_DRP_OPTIONS_LIST, ElementType.Xpath);
				log.logging("info", "Selected Ship method");
				Thread.sleep(3000);
				//Select Shipper
				webDB.clickAnElement(BOLPageLocators.SHIPPER_DROPDOWN, ElementType.Xpath);
				Thread.sleep(3000);
				flag = webDB.isElementDisplayed(BOLPageLocators.SHIPPER_DRP_OPTION, ElementType.Xpath);
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
						Thread.sleep(4000);
						log.logging("info", "BOL submitted and success message is displayed");
						BOL_Number = getBOLNumberFromOrderDetailsPage();
						log.logging("info", "The BOL Number on Order Details page is: "+BOL_Number);
						Thread.sleep(3000);
					}

				}
			}
		}
			
					

		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Add Order to BOL button from Order details page
	 * @throws InterruptedException
	 */
	public boolean click_Add_Order_To_BOL_BTN_OrderDetailsPage() throws InterruptedException
	{
		flag = webDB.isElementDisplayed(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_ORDERDETAILSPAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.clickAnElement(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_ORDERDETAILSPAGE, ElementType.Xpath);
			Thread.sleep(2000);
			flag = webDB.isElementDisplayed(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_BOLCREATEPAGE, ElementType.Xpath);
			if(flag)
			{
				webDB.clickAnElement(BOLPageLocators.ADD_ORDER_TO_BOL_BTN_BOLCREATEPAGE, ElementType.Xpath);
				Thread.sleep(4000);
				String BOL_Number_Existing = getBOLNumberFromOrderDetailsPage();
				log.logging("info", "The BOL Number on Order Details page is: "+BOL_Number_Existing);
				Thread.sleep(3000);
				if(BOL_Number_Existing.equalsIgnoreCase(BOL_Number))
				{
					log.logging("info", "Order added to existing BOL i.e. "+BOL_Number_Existing);
				}
				else
				{
					log.logging("info", "The Order is not added to existing BOL");
					flag=false;
				}
			}
		}
		return flag;
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
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean BOL_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_BOL_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_BOL_COLHEADER, BOLPageLocators.STRING_BOL_COLDATA, ElementType.Xpath, BOLPageLocators.BY_BOL_COLDATA);
		return flag;
	}
	
	public boolean BOL_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_BOL_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_BOL_COLHEADER, BOLPageLocators.STRING_BOL_COLDATA, ElementType.Xpath, BOLPageLocators.BY_BOL_COLDATA);
		return flag;
	}
	
	public boolean Type_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_TYPE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_TYPE_COLHEADER, BOLPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_TYPE_COLDATA);
		return flag;
	}
	
	public boolean Type_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_TYPE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_TYPE_COLHEADER, BOLPageLocators.STRING_TYPE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_TYPE_COLDATA);
		return flag;
	}
	
	public boolean CurrentStatus_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_CURRENTSTATUS_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_CURRENTSTATUS_COLHEADER, BOLPageLocators.STRING_CURRENTSTATUS_COLDATA, ElementType.Xpath, BOLPageLocators.BY_CURRENTSTATUS_COLDATA);
		return flag;
	}
	
	public boolean CurrentStatus_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_CURRENTSTATUS_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_CURRENTSTATUS_COLHEADER, BOLPageLocators.STRING_CURRENTSTATUS_COLDATA, ElementType.Xpath, BOLPageLocators.BY_CURRENTSTATUS_COLDATA);
		return flag;
	}
	
	public boolean DueDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_DUEDATE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_DUEDATE_COLHEADER, BOLPageLocators.STRING_DUEDATE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_DUEDATE_COLDATA);
		return flag;
	}
	
	public boolean DueDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_DUEDATE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_DUEDATE_COLHEADER, BOLPageLocators.STRING_DUEDATE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_DUEDATE_COLDATA);
		return flag;
	}
	
	public boolean ShipMethod_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_SHIPMETHOD_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_SHIPMETHOD_COLHEADER, BOLPageLocators.STRING_SHIPMETHOD_COLDATA, ElementType.Xpath, BOLPageLocators.BY_SHIPMETHOD_COLDATA);
		return flag;
	}
	
	public boolean ShipMethod_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_SHIPMETHOD_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_SHIPMETHOD_COLHEADER, BOLPageLocators.STRING_SHIPMETHOD_COLDATA, ElementType.Xpath, BOLPageLocators.BY_SHIPMETHOD_COLDATA);
		return flag;
	}
	
	public boolean ShippedByLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_SHIPPEDBYLOCCODE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYLOCCODE_COLHEADER, BOLPageLocators.STRING_SHIPPEDBYLOCCODE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ShippedByLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_SHIPPEDBYLOCCODE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYLOCCODE_COLHEADER, BOLPageLocators.STRING_SHIPPEDBYLOCCODE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ShippedByLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_SHIPPEDBYLOCNAME_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYLOCNAME_COLHEADER, BOLPageLocators.STRING_SHIPPEDBYLOCNAME_COLDATA, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ShippedByLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_SHIPPEDBYLOCNAME_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYLOCNAME_COLHEADER, BOLPageLocators.STRING_SHIPPEDBYLOCNAME_COLDATA, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean DefaultZone_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_DEFAULTZONE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_DEFAULTZONE_COLHEADER, BOLPageLocators.STRING_DEFAULTZONE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_DEFAULTZONE_COLDATA);
		return flag;
	}
	
	public boolean DefaultZone_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_DEFAULTZONE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_DEFAULTZONE_COLHEADER, BOLPageLocators.STRING_DEFAULTZONE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_DEFAULTZONE_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_FROMLOCCODE_COLHEADER, BOLPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_FROMLOCCODE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_FROMLOCCODE_COLHEADER, BOLPageLocators.STRING_FROMLOCCODE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_FROMLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_FROMLOCNAME_COLHEADER, BOLPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, BOLPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean FromLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_FROMLOCNAME_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_FROMLOCNAME_COLHEADER, BOLPageLocators.STRING_FROMLOCNAME_COLDATA, ElementType.Xpath, BOLPageLocators.BY_FROMLOCNAME_COLDATA);
		return flag;
	}
	
	
	public boolean FromLocCity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_FROMLOCCITY_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_FROMLOCCITY_COLHEADER, BOLPageLocators.STRING_FROMLOCCITY_COLDATA, ElementType.Xpath, BOLPageLocators.BY_FROMLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean FromLocCity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_FROMLOCCITY_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_FROMLOCCITY_COLHEADER, BOLPageLocators.STRING_FROMLOCCITY_COLDATA, ElementType.Xpath, BOLPageLocators.BY_FROMLOCCITY_COLDATA);
		return flag;
	}
	
	public boolean FromLocState_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_FROMLOCSTATE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_FROMLOCSTATE_COLHEADER, BOLPageLocators.STRING_FROMLOCSTATE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_FROMLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean FromLocState_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_FROMLOCSTATE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_FROMLOCSTATE_COLHEADER, BOLPageLocators.STRING_FROMLOCSTATE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_FROMLOCSTATE_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_TOLOCCODE_COLHEADER, BOLPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocCode_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_TOLOCCODE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_TOLOCCODE_COLHEADER, BOLPageLocators.STRING_TOLOCCODE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_TOLOCCODE_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_TOLOCNAME_COLHEADER, BOLPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, BOLPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean ToLocName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_TOLOCNAME_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_TOLOCNAME_COLHEADER, BOLPageLocators.STRING_TOLOCNAME_COLDATA, ElementType.Xpath, BOLPageLocators.BY_TOLOCNAME_COLDATA);
		return flag;
	}
	
	public boolean AssignDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(BOLPageLocators.BY_ASSIGNDATE_COLHEADER, BOLPageLocators.BY_ASSIGNDATE_COLDATA);
		return flag;
	}
	
	public boolean AssignDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(BOLPageLocators.BY_ASSIGNDATE_COLHEADER, BOLPageLocators.BY_ASSIGNDATE_COLDATA);
		return flag;
	}
	
	public boolean CommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(BOLPageLocators.BY_COMMITNDATE_COLHEADER, BOLPageLocators.BY_COMMITNDATE_COLDATA);
		return flag;
	}
	
	public boolean CommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(BOLPageLocators.BY_COMMITNDATE_COLHEADER, BOLPageLocators.BY_COMMITNDATE_COLDATA);
		return flag;
	}
	
	public boolean ModCommitDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(BOLPageLocators.BY_MODCOMMITNDATE_COLHEADER, BOLPageLocators.BY_MODCOMMITNDATE_COLDATA);
		return flag;
	}
	
	public boolean ModCommitDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(BOLPageLocators.BY_MODCOMMITNDATE_COLHEADER, BOLPageLocators.BY_MODCOMMITNDATE_COLDATA);
		return flag;
	}
	
	public boolean ScheduleShipDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(BOLPageLocators.BY_SCHEDULEDSHIPDATE_COLHEADER, BOLPageLocators.BY_SCHEDULEDSHIPDATE_COLDATA);
		return flag;
	}
	
	public boolean ScheduleShipDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(BOLPageLocators.BY_SCHEDULEDSHIPDATE_COLHEADER, BOLPageLocators.BY_SCHEDULEDSHIPDATE_COLDATA);
		return flag;
	}
	
	public boolean PickupDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(BOLPageLocators.BY_PICKUPDATE_COLHEADER, BOLPageLocators.BY_PICKUPDATE_COLDATA);
		return flag;
	}
	
	public boolean PickupDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(BOLPageLocators.BY_PICKUPDATE_COLHEADER, BOLPageLocators.BY_PICKUPDATE_COLDATA);
		return flag;
	}
	
	public boolean EstimatedDeliveryDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(BOLPageLocators.BY_ESTIMATEDDELIVERYDATE_COLHEADER, BOLPageLocators.BY_ESTIMATEDDELIVERYDATE_COLDATA);
		return flag;
	}
	
	public boolean EstimatedDeliveryDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(BOLPageLocators.BY_ESTIMATEDDELIVERYDATE_COLHEADER, BOLPageLocators.BY_ESTIMATEDDELIVERYDATE_COLDATA);
		return flag;
	}
	
	public boolean DeliveredDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(BOLPageLocators.BY_DELIVEREDDATE_COLHEADER, BOLPageLocators.BY_DELIVEREDDATE_COLDATA);
		return flag;
	}
	
	public boolean DeliveredDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(BOLPageLocators.BY_DELIVEREDDATE_COLHEADER, BOLPageLocators.BY_DELIVEREDDATE_COLDATA);
		return flag;
	}
	
	public boolean CompleteDate_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(BOLPageLocators.BY_COMPLETEDDATE_COLHEADER, BOLPageLocators.BY_COMPLETEDDATE_COLDATA);
		return flag;
	}
	
	public boolean CompleteDate_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(BOLPageLocators.BY_COMPLETEDDATE_COLHEADER, BOLPageLocators.BY_COMPLETEDDATE_COLDATA);
		return flag;
	}
	
	
	public boolean Quote_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_QUOTE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_QUOTE_COLHEADER, BOLPageLocators.STRING_QUOTE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_QUOTE_COLDATA);
		return flag;
	}
	
	public boolean Quote_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_QUOTE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_QUOTE_COLHEADER, BOLPageLocators.STRING_QUOTE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_QUOTE_COLDATA);
		return flag;
	}
	
	public boolean Tender_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_TENDER_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_TENDER_COLHEADER, BOLPageLocators.STRING_TENDER_COLDATA, ElementType.Xpath, BOLPageLocators.BY_TENDER_COLDATA);
		return flag;
	}
	
	public boolean Tender_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_TENDER_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_TENDER_COLHEADER, BOLPageLocators.STRING_TENDER_COLDATA, ElementType.Xpath, BOLPageLocators.BY_TENDER_COLDATA);
		return flag;
	}
	
	public boolean Shipment_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_SHIPMENT_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_SHIPMENT_COLHEADER, BOLPageLocators.STRING_SHIPMENT_COLDATA, ElementType.Xpath, BOLPageLocators.BY_SHIPMENT_COLDATA);
		return flag;
	}
	
	public boolean Shipment_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_SHIPMENT_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_SHIPMENT_COLHEADER, BOLPageLocators.STRING_SHIPMENT_COLDATA, ElementType.Xpath, BOLPageLocators.BY_SHIPMENT_COLDATA);
		return flag;
	}
	
	public boolean AutoAssignEligible_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_AUTOASSIGNELIGIBLE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_AUTOASSIGNELIGIBLE_COLHEADER, BOLPageLocators.STRING_AUTOASSIGNELIGIBLE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_AUTOASSIGNELIGIBLE_COLDATA);
		return flag;
	}
	
	public boolean AutoAssignEligible_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_AUTOASSIGNELIGIBLE_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_AUTOASSIGNELIGIBLE_COLHEADER, BOLPageLocators.STRING_AUTOASSIGNELIGIBLE_COLDATA, ElementType.Xpath, BOLPageLocators.BY_AUTOASSIGNELIGIBLE_COLDATA);
		return flag;
	}
	
	public boolean ShippedByAccount_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BOLPageLocators.STRING_SHIPPEDBYACCOUNT_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYACCOUNT_COLHEADER, BOLPageLocators.STRING_SHIPPEDBYACCOUNT_COLDATA, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYACCOUNT_COLDATA);
		return flag;
	}
	
	public boolean ShippedByAccount_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BOLPageLocators.STRING_SHIPPEDBYACCOUNT_COLHEADER, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYACCOUNT_COLHEADER, BOLPageLocators.STRING_SHIPPEDBYACCOUNT_COLDATA, ElementType.Xpath, BOLPageLocators.BY_SHIPPEDBYACCOUNT_COLDATA);
		return flag;
	}
	
	//					Filters
	public boolean verify_InputBOLFilter() throws InterruptedException
	{
		commonfunction.applyTextFilter(BOLPageLocators.STRING_BOL_COLDATA, BOLPageLocators.STRING_BOL_RESULTDATA, ElementType.Xpath, BOLPageLocators.STRING_BOL_INPUTFIELD_FILTER, ElementType.Xpath);
		return flag;
	}
	
	
	
	
	
	
//	/**
//	 * @return String BOL number from the first row of the table
//	 * This method gets the BOL number from the first row of the BOL listing table
//	 */
//	public String getLatestBOLNumber() {
//		try {
//			// First verify table is present
//			webDB.scrollToAnElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath);
//			if (!webDB.waitForClickElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath)) {
//				log.logging("info", "BOL table is not displayed");
//				return null;
//			}
//			
//			// Wait for the first row to be present
//			if (!webDB.waitForElement(BOLPageLocators.BOL_TABLE_FIRST_ROW, ElementType.Xpath)) {
//				log.logging("info", "No BOL entries found in the table");
//				return null;
//			}
//			
//			String bolNumber = webDB.getTextFromElement(BOLPageLocators.BOL_TABLE_FIRST_ROW, ElementType.Xpath);
//			if (bolNumber != null && !bolNumber.trim().isEmpty()) {
//				log.logging("info", "Got BOL number from the first row: " + bolNumber);
//				return bolNumber.trim();
//			} else {
//				log.logging("info", "BOL number is empty or null");
//				return null;
//			}
//		} catch (Exception e) {
//			log.logging("info", "Unable to get BOL number from first row with Exception: " + e.getMessage());
//			return null;
//		}
//	}
//	
//	/**
//	 * @param bolNumber The BOL number to search for
//	 * @return boolean indicating if the search was successful
//	 * This method searches for a specific BOL number using the filter
//	 */
//	public boolean searchBOLNumber(String bolNumber) throws InterruptedException {
//		if (bolNumber == null || bolNumber.trim().isEmpty()) {
//			log.logging("info", "Invalid BOL number provided for search");
//			return false;
//		}
//		
//		try {
//			// Try primary search filter locator
//			boolean filterFound = webDB.waitForElement(BOLPageLocators.BOL_SEARCH_FILTER, ElementType.Xpath);
//			
//			// If primary fails, try alternative locator
//			if (!filterFound) {
//				filterFound = webDB.waitForElement(BOLPageLocators.BOL_SEARCH_FILTER_ALTERNATIVE, ElementType.Xpath);
//				if (!filterFound) {
//					log.logging("info", "Unable to locate BOL search filter");
//					return false;
//				}
//			}
//			
//			// Clear and enter the BOL number
//			String locatorToUse = filterFound ? BOLPageLocators.BOL_SEARCH_FILTER : BOLPageLocators.BOL_SEARCH_FILTER_ALTERNATIVE;
//			// The user said they fixed the scroll up.
//			webDB.clearText(locatorToUse, ElementType.Xpath);
//			webDB.sendTextToAnElement(locatorToUse, bolNumber, ElementType.Xpath);
//			log.logging("info", "Entered BOL number in search filter: " + bolNumber);
//
//			webDB.clickAnElement(BOLPageLocators.VIEW_RESULT_BUTTON, ElementType.Xpath);
//            log.logging("info", "Clicked on View Result button");
//			
//			// Wait for table to update (using explicit wait instead of Thread.sleep)
//			boolean tableUpdated = webDB.waitForElement(BOLPageLocators.BOL_TABLE, ElementType.Xpath);
//			if (!tableUpdated) {
//				log.logging("info", "Table did not update after search");
//				return false;
//			}
//			
//			// Get and verify the search result
//			String firstRowBOL = getFirstBOLNumberFromResult();
//			if (firstRowBOL != null && firstRowBOL.equals(bolNumber)) {
//				log.logging("info", "Successfully found BOL number: " + bolNumber);
//				return true;
//			} else {
//				log.logging("BOL number not found in search results. Expected: " + bolNumber + ", Found: " + firstRowBOL, firstRowBOL);
//				return false;
//			}
//		} catch (Exception e) {
//			log.logging("Unable to search BOL number with Exception: " + e.getMessage(), bolNumber);
//			return false;
//		}
//	}
//
//	private String getFirstBOLNumberFromResult() {
//        // This method assumes the table is already visible and updated.
//        // It does not perform any scrolling.
//        try {
//            if (!webDB.waitForElement(BOLPageLocators.BOL_TABLE_FIRST_ROW, ElementType.Xpath)) {
//                log.logging("info", "No BOL entries found in the table after search");
//                return null;
//            }
//            String bolNumber = webDB.getTextFromElement(BOLPageLocators.BOL_TABLE_FIRST_ROW, ElementType.Xpath);
//            if (bolNumber != null && !bolNumber.trim().isEmpty()) {
//                log.logging("info", "Got BOL number from the first row after search: " + bolNumber);
//                return bolNumber.trim();
//            } else {
//                log.logging("info", "BOL number is empty or null after search");
//                return null;
//            }
//        } catch (Exception e) {
//            log.logging("info", "Unable to get BOL number from first row after search with Exception: " + e.getMessage());
//            return null;
//        }
//    }

	
	
	
	
	
}
