package pages;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.CreateOrderPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class CreateOrderPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();
	String BOL_Number="";
	String BOL_Number_Listingpage="";
	String option = "";
	int onefromloc;
	int onetoloc;
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Create order page
	 * @throws InterruptedException
	 */
	public boolean navigate_CreateOrderPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ORDERSANDBOLS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.CREATEORDER_PAGE, ElementType.Xpath, CreateOrderPageLocators.CREATEORDER_PAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to select the general information details
	 * @throws InterruptedException
	 */
	public boolean set_General_Info_Details() throws InterruptedException
	{
		
		flag = webDB.isElementDisplayed(CreateOrderPageLocators.CREATEORDER_PAGE_HEADING, ElementType.Xpath);
		if(flag)
		{
			//Select Account from the dropdown
			webDB.clickAnElement(CreateOrderPageLocators.ACCOUNT_DROPDOWN, ElementType.Id);
			Thread.sleep(1000);
			flag = webDB.isElementDisplayed(CreateOrderPageLocators.ACCOUNT_DRP_OPTION, ElementType.Id);
			if(flag)
			{
				int totaloptions = webDB.getDriver().findElements(By.xpath(CreateOrderPageLocators.ACCOUNT_DRP_OPTIONS_LIST)).size();
				int oneoption = faker.number().numberBetween(1, totaloptions-1);
//				webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.ACCOUNT_DRP_OPTIONS_LIST+"["+oneoption+"]")).click(); //Select for dynamic account selection
				webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.ACCOUNT_DRP_OPTIONS_LIST+"["+1+"]")).click();
				log.logging("info", "Selected Account");
				Thread.sleep(2000);
				
				//Select program from the dropdown
				webDB.clickAnElement(CreateOrderPageLocators.PROGRAM_DROPDOWN, ElementType.Id);
				Thread.sleep(1000);
				flag = webDB.isElementDisplayed(CreateOrderPageLocators.PROGRAM_DRP_OPTION, ElementType.Id);
				if(flag)
				{
					int totalprograms = webDB.getDriver().findElements(By.xpath(CreateOrderPageLocators.PROGRAM_DRP_OPTIONS_LIST)).size();
					int oneprogram = faker.number().numberBetween(1, totalprograms-1);
					webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.PROGRAM_DRP_OPTIONS_LIST+"["+oneprogram+"]")).click(); 
					log.logging("info", "Selected Program");
					Thread.sleep(4000);
					flag = webDB.isElementDisplayed(CreateOrderPageLocators.ORDERTYPE_DROPDOWN, ElementType.Id); 

				}
			}
		}
	
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to set the Transit details
	 * @throws InterruptedException
	 */
	public boolean set_Transit_Details() throws InterruptedException
	{
		//Select Order Type from the dropdown
		webDB.clickAnElement(CreateOrderPageLocators.ORDERTYPE_DROPDOWN, ElementType.Id);
		Thread.sleep(1000);
		flag = webDB.isElementDisplayed(CreateOrderPageLocators.ORDERTYPE_DRP_OPTION, ElementType.Id);
		if(flag)
		{
			int totalordertypeoptions = webDB.getDriver().findElements(By.xpath(CreateOrderPageLocators.ORDERTYPE_DRP_OPTIONS_LIST)).size();
			int oneordertype = faker.number().numberBetween(1, totalordertypeoptions-1);
			webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.ORDERTYPE_DRP_OPTIONS_LIST+"["+oneordertype+"]")).click(); 
			log.logging("info", "Selected order type");
			Thread.sleep(3000);
			// Select From Loc
			flag = webDB.isElementDisplayed(CreateOrderPageLocators.FROM_LOC_DROPDOWN, ElementType.Id);
			if(flag)
			{
				webDB.clickAnElement(CreateOrderPageLocators.FROM_LOC_DROPDOWN, ElementType.Id);
				Thread.sleep(1000);
				int totalfromlocoptions = webDB.getDriver().findElements(By.xpath(CreateOrderPageLocators.FROM_LOC_DRP_OPTIONS_LIST)).size();
				onefromloc = faker.number().numberBetween(1, totalfromlocoptions-1);
				webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.FROM_LOC_DRP_OPTIONS_LIST+"["+onefromloc+"]")).click(); 
				log.logging("info", "Selected from loc");
				Thread.sleep(2000);
				// Select To Loc
				flag = webDB.isElementDisplayed(CreateOrderPageLocators.TO_LOC_DROPDOWN, ElementType.Id);
				if(flag)
				{
					webDB.clickAnElement(CreateOrderPageLocators.TO_LOC_DROPDOWN, ElementType.Id);
					Thread.sleep(1000);
					int totaltolocoptions = webDB.getDriver().findElements(By.xpath(CreateOrderPageLocators.TO_LOC_DRP_OPTIONS_LIST)).size();
					onetoloc = faker.number().numberBetween(1, totaltolocoptions-1);
					if(onefromloc==onetoloc)
					{
						int finalto_location = onetoloc+1;
					
					webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.TO_LOC_DRP_OPTIONS_LIST+"["+finalto_location+"]")).click();
					Thread.sleep(2000);
					log.logging("info", "Selected To location");
					}
					else
					{
						webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.TO_LOC_DRP_OPTIONS_LIST+"["+onetoloc+"]")).click();
						Thread.sleep(2000);
						log.logging("info", "Selected To location");
						flag = true;
					}
					// Select Pickup window Start date
					flag = webDB.isElementDisplayed(CreateOrderPageLocators.PICKUP_WINDOW_STARTDATE_CALENDER, ElementType.Id);
					if(flag)
					{
						webDB.clickAnElement(CreateOrderPageLocators.PICKUP_WINDOW_STARTDATE_CALENDER, ElementType.Id);
						Thread.sleep(1000);
						webDB.clickAnElement(CreateOrderPageLocators.PICKUP_WINDOW_STARTDATE_TODAY, ElementType.Xpath);
						Thread.sleep(1000);
						webDB.pressEscapeKey();
						log.logging("info", "Selected Pickup window Start date");
						Thread.sleep(1000);
						// Select Pickup window End date
						flag = webDB.isElementDisplayed(CreateOrderPageLocators.PICKUP_WINDOW_ENDDATE_CALENDER, ElementType.Id);
						if(flag)
						{
							webDB.clickAnElement(CreateOrderPageLocators.PICKUP_WINDOW_ENDDATE_CALENDER, ElementType.Id);
							Thread.sleep(1000);
							webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
							Thread.sleep(1000);
							webDB.pressEscapeKey();
							log.logging("info", "Selected Pickup window End date");
							Thread.sleep(1000);
							// Select Delivery window Start date
							flag = webDB.isElementDisplayed(CreateOrderPageLocators.DELIVERY_WINDOW_STARTDATE_CALENDER, ElementType.Id);
							if(flag)
							{
								webDB.clickAnElement(CreateOrderPageLocators.DELIVERY_WINDOW_STARTDATE_CALENDER, ElementType.Id);
								Thread.sleep(1000);
								webDB.clickAnElement(CreateOrderPageLocators.DELIVERY_WINDOW_STARTDATE_TODAY, ElementType.Xpath);
								Thread.sleep(1000);
								webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
								Thread.sleep(1000);
//								webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
//								Thread.sleep(1000);
								webDB.pressEscapeKey();
								log.logging("info", "Selected Delivery window Start date");
								Thread.sleep(1000);
								// Select Delivery window End date
								flag = webDB.isElementDisplayed(CreateOrderPageLocators.DELIVERY_WINDOW_ENDDATE_CALENDER, ElementType.Id);
								if(flag)
								{
//									webDB.clickAnElement(CreateOrderPageLocators.DELIVERY_WINDOW_ENDDATE_CALENDER, ElementType.Id);
//									Thread.sleep(1000);
									
//									webDB.clickAnElement(CreateOrderPageLocators.DELIVERY_WINDOW_ENDDATE, ElementType.Xpath);
//									Thread.sleep(1000);
//									webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
//									Thread.sleep(1000);
//									webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
//									Thread.sleep(1000);
//									webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
//									Thread.sleep(1000);
									
//									webDB.pressEscapeKey();
//									log.logging("info", "Selected Delivery window End date");
//									Thread.sleep(1000);
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
	 * This method is used to set the Transit details for multiple orders
	 * @throws InterruptedException
	 */
	public boolean set_Transit_Details_For_MultipleOrders() throws InterruptedException
	{
		//Select Order Type from the dropdown
		webDB.clickAnElement(CreateOrderPageLocators.ORDERTYPE_DROPDOWN, ElementType.Id);
		Thread.sleep(1000);
		flag = webDB.isElementDisplayed(CreateOrderPageLocators.ORDERTYPE_DRP_OPTION, ElementType.Id);
		if(flag)
		{
			int totalordertypeoptions = webDB.getDriver().findElements(By.xpath(CreateOrderPageLocators.ORDERTYPE_DRP_OPTIONS_LIST)).size();
			int oneordertype = faker.number().numberBetween(1, totalordertypeoptions-1);
			webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.ORDERTYPE_DRP_OPTIONS_LIST+"["+oneordertype+"]")).click(); 
			log.logging("info", "Selected order type");
			Thread.sleep(3000);
			// Select From Loc
			flag = webDB.isElementDisplayed(CreateOrderPageLocators.FROM_LOC_DROPDOWN, ElementType.Id);
			if(flag)
			{
				webDB.clickAnElement(CreateOrderPageLocators.FROM_LOC_DROPDOWN, ElementType.Id);
				Thread.sleep(1000);
				int totalfromlocoptions = webDB.getDriver().findElements(By.xpath(CreateOrderPageLocators.FROM_LOC_DRP_OPTIONS_LIST)).size();
//				int onefromloc = faker.number().numberBetween(1, totalfromlocoptions-1);
				webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.FROM_LOC_DRP_OPTIONS_LIST+"["+onefromloc+"]")).click(); 
				log.logging("info", "Selected from loc");
				Thread.sleep(2000);
				// Select To Loc
				flag = webDB.isElementDisplayed(CreateOrderPageLocators.TO_LOC_DROPDOWN, ElementType.Id);
				if(flag)
				{
					webDB.clickAnElement(CreateOrderPageLocators.TO_LOC_DROPDOWN, ElementType.Id);
					Thread.sleep(1000);
					int totaltolocoptions = webDB.getDriver().findElements(By.xpath(CreateOrderPageLocators.TO_LOC_DRP_OPTIONS_LIST)).size();
//					int onetoloc = faker.number().numberBetween(1, totaltolocoptions-1);
					if(onefromloc==onetoloc)
					{
						int finalto_location = onetoloc+1;
					
					webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.TO_LOC_DRP_OPTIONS_LIST+"["+finalto_location+"]")).click();
					Thread.sleep(2000);
					log.logging("info", "Selected To location");
					}
					else
					{
						webDB.getDriver().findElement(By.xpath(CreateOrderPageLocators.TO_LOC_DRP_OPTIONS_LIST+"["+onetoloc+"]")).click();
						Thread.sleep(2000);
						log.logging("info", "Selected To location");
						flag = true;
					}
					// Select Pickup window Start date
					flag = webDB.isElementDisplayed(CreateOrderPageLocators.PICKUP_WINDOW_STARTDATE_CALENDER, ElementType.Id);
					if(flag)
					{
						webDB.clickAnElement(CreateOrderPageLocators.PICKUP_WINDOW_STARTDATE_CALENDER, ElementType.Id);
						Thread.sleep(1000);
						webDB.clickAnElement(CreateOrderPageLocators.PICKUP_WINDOW_STARTDATE_TODAY, ElementType.Xpath);
						Thread.sleep(1000);
						webDB.pressEscapeKey();
						log.logging("info", "Selected Pickup window Start date");
						Thread.sleep(1000);
						// Select Pickup window End date
						flag = webDB.isElementDisplayed(CreateOrderPageLocators.PICKUP_WINDOW_ENDDATE_CALENDER, ElementType.Id);
						if(flag)
						{
							webDB.clickAnElement(CreateOrderPageLocators.PICKUP_WINDOW_ENDDATE_CALENDER, ElementType.Id);
							Thread.sleep(1000);
							webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
							Thread.sleep(1000);
							webDB.pressEscapeKey();
							log.logging("info", "Selected Pickup window End date");
							Thread.sleep(1000);
							// Select Delivery window Start date
							flag = webDB.isElementDisplayed(CreateOrderPageLocators.DELIVERY_WINDOW_STARTDATE_CALENDER, ElementType.Id);
							if(flag)
							{
								webDB.clickAnElement(CreateOrderPageLocators.DELIVERY_WINDOW_STARTDATE_CALENDER, ElementType.Id);
								Thread.sleep(1000);
								webDB.clickAnElement(CreateOrderPageLocators.DELIVERY_WINDOW_STARTDATE_TODAY, ElementType.Xpath);
								Thread.sleep(1000);
								webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
								Thread.sleep(1000);
//								webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
//								Thread.sleep(1000);
								webDB.pressEscapeKey();
								log.logging("info", "Selected Delivery window Start date");
								Thread.sleep(1000);
								// Select Delivery window End date
								flag = webDB.isElementDisplayed(CreateOrderPageLocators.DELIVERY_WINDOW_ENDDATE_CALENDER, ElementType.Id);
								if(flag)
								{
									webDB.clickAnElement(CreateOrderPageLocators.DELIVERY_WINDOW_ENDDATE_CALENDER, ElementType.Id);
									Thread.sleep(1000);
//									webDB.clickAnElement(CreateOrderPageLocators.DELIVERY_WINDOW_ENDDATE, ElementType.Xpath);
//									Thread.sleep(1000);
//									webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
//									Thread.sleep(1000);
//									webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
//									Thread.sleep(1000);
//									webDB.clickAnElement(CreateOrderPageLocators.NEXTHOUR_INCREMENT_BTN, ElementType.Xpath);
//									Thread.sleep(1000);
									webDB.pressEscapeKey();
									log.logging("info", "Selected Delivery window End date");
									Thread.sleep(1000);
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
	 * This method is used to set Items to Transit
	 * @throws InterruptedException
	 */
	public boolean set_Item_To_Transit() throws InterruptedException
	{
		//Enter quantity in the input field
		flag = webDB.scrollToAnElement(CreateOrderPageLocators.INPUT_QUANTITY, ElementType.Xpath);
		if(flag)
		{
			flag = webDB.sendTextToAnElement(CreateOrderPageLocators.INPUT_QUANTITY,"20", ElementType.Xpath);
			if(flag) 
			{
				log.logging("info", "Entered quantity in input field");
			}
		}
		
			
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on submit or create order button
	 * @throws InterruptedException
	 */
	public boolean submit_Order() throws InterruptedException
	{
		//click on submit or create order button
		flag = webDB.scrollToAnElement(CreateOrderPageLocators.CREATE_SUBMIT_ORDER_BUTTON, ElementType.Id);
		if(flag)
		{
			webDB.clickAnElement(CreateOrderPageLocators.CREATE_SUBMIT_ORDER_BUTTON, ElementType.Id);
			Thread.sleep(12000);
//			String ordernumberfromorderdetailspage = webDB.getTextFromElement(BOL_Number, null);
//			log.logging("info", "The order number is "+ordernumberfromorderdetailspage);
			webDB.isElementDisplayed(CreateOrderPageLocators.ADD_ORDER_TO_BOL_BUTTON, ElementType.Xpath);
			if(flag) 
			{
				log.logging("info", "Order is created successfully");
			}
		}
		
			
		return flag;
	}
	
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to verify the complete create order flow
	 * @throws InterruptedException
	 */
	public boolean complete_CreateOrderFlow() throws InterruptedException
	{
		flag = navigate_CreateOrderPage();
		if(flag)
		{
			flag = set_General_Info_Details();
			if(flag)
			{
				flag = set_Transit_Details();
				if(flag)
				{
					flag = set_Item_To_Transit();
					if(flag)
					{
						submit_Order();
					}
				}
			}
		}
		
		return flag;
	}
	
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to verify the complete multiple order flow
	 * @throws InterruptedException
	 */
	public boolean complete_MultipleOrderFlow() throws InterruptedException
	{
		webDB.navigateToRefresh();
		Thread.sleep(1500);
		flag = navigate_CreateOrderPage();
		if(flag)
		{
			flag = set_General_Info_Details();
			if(flag)
			{
				flag = set_Transit_Details_For_MultipleOrders();
				if(flag)
				{
					flag = set_Item_To_Transit();
					if(flag)
					{
						submit_Order();
					}
				}
			}
		}
		
		return flag;
	}
	
	
}
