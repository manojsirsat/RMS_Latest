package commonfunctions;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import locators.BOLPageLocators;
import locators.BatchFilesPageLocators;
import locators.CommonFunctionsLocators;
import locators.CreateOrderPageLocators;
import locators.OrdersAndBOLS_OrdersPageLocators;
import locators.RecoveriesByComponentPageLocators;
import locators.RecoveriesByLocationPageLocators;
import locators.RecoveriesByLocation_ProgramPageLocators;
import locators.RecoveriesByZonesPageLocators;
import locators.ReplenishmentsByComponentPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class CommonFunctions 
{
	
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	boolean flag;
	public String actlink = new String();
	public String acttext = new String();
	public String expectedtext_link = new String();
	Faker faker = new Faker();
	
		
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Orders and BOLs link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnOrdersAndBolsPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath);
		if(flag)
		{
			webDB.clickAnElement(CommonFunctionsLocators.ORDERSANDBOLS_PAGE_LEFTNAV, ElementType.Xpath);
			Thread.sleep(2000);
			flag = webDB.isElementDisplayed(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
			
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on BOL link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnBOLSPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
			Thread.sleep(9000);
			flag = webDB.isElementDisplayed(BOLPageLocators.BOLPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "BOL listing page is displayed");
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Create order link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnCreateOrderPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.CREATEORDER_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.CREATEORDER_PAGE, ElementType.Xpath);
			Thread.sleep(6000);
			flag = webDB.isElementDisplayed(CreateOrderPageLocators.CREATEORDER_PAGE_HEADING, ElementType.Xpath);
			log.logging("info", "Create order page is displayed");
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Orders and BOLs orders link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnOrdersAndBOLs_OrdersPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.ORDERSANDBOLS_ORDERS_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.ORDERSANDBOLS_ORDERS_PAGE, ElementType.Xpath);
			Thread.sleep(6000);
			flag = webDB.isElementDisplayed(OrdersAndBOLS_OrdersPageLocators.ORDERSPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "Create order page is displayed");
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Batch files link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnBatchFilesPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.BATCHFILES_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.BATCHFILES_PAGE, ElementType.Xpath);
			Thread.sleep(6000);
			flag = webDB.isElementDisplayed(BatchFilesPageLocators.BATCHFILESPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "Create order page is displayed");
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Recoveries link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnRecoveriesPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath);
		if(flag)
		{
			webDB.clickAnElement(CommonFunctionsLocators.RECOVERIES_PAGE_LEFTNAV, ElementType.Xpath);
			Thread.sleep(2000);
			flag = webDB.isElementDisplayed(CommonFunctionsLocators.RECOVERIESBYZONES_PAGE, ElementType.Xpath);
			
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Zones link from left navigation under Recoveries
	 * @throws InterruptedException
	 */
	public boolean clickOnRecoveriesByZonesPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.RECOVERIESBYZONES_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.RECOVERIESBYZONES_PAGE, ElementType.Xpath);
			Thread.sleep(9000);
			flag = webDB.isElementDisplayed(RecoveriesByZonesPageLocators.RECOVERIESBYZONESPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "Zones listing page is displayed");
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Recoveries By Locations link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnRecoveriesByLocationsPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.RECOVERIESBYLOCATIONS_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.RECOVERIESBYLOCATIONS_PAGE, ElementType.Xpath);
			Thread.sleep(9000);
			flag = webDB.isElementDisplayed(RecoveriesByLocationPageLocators.RECOVERIESBYLOCATIONSPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "Recoveries By Locations listing page is displayed");
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Recoveries By Locations-Program link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnRecoveriesByLocations_ProgramsPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.RECOVERIESBYLOCATIONS_PROGRAMS_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.RECOVERIESBYLOCATIONS_PROGRAMS_PAGE, ElementType.Xpath);
			Thread.sleep(9000);
			flag = webDB.isElementDisplayed(RecoveriesByLocation_ProgramPageLocators.RECOVERIESBYLOCATIONS_PROGRAMPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "Recoveries By Locations-Programs listing page is displayed");
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Recoveries By Components link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnRecoveriesByComponentsPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.RECOVERIESBYCOMPONENTS_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.RECOVERIESBYCOMPONENTS_PAGE, ElementType.Xpath);
			Thread.sleep(9000);
			flag = webDB.isElementDisplayed(RecoveriesByComponentPageLocators.RECOVERIESBYCOMPONENTSPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "Recoveries By Components listing page is displayed");
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Replenishments link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnReplenishmentsPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath);
		if(flag)
		{
			webDB.clickAnElement(CommonFunctionsLocators.REPLENISHMENTS_PAGE_LEFTNAV, ElementType.Xpath);
			Thread.sleep(2000);
			flag = webDB.isElementDisplayed(CommonFunctionsLocators.REPLENISHMENTS_COMPONENTS_PAGE, ElementType.Xpath);
			
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on Replenishments By Components link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnReplenishmentsByComponentsPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.REPLENISHMENTS_COMPONENTS_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.REPLENISHMENTS_COMPONENTS_PAGE, ElementType.Xpath);
			Thread.sleep(9000);
			flag = webDB.isElementDisplayed(ReplenishmentsByComponentPageLocators.REPLENISHMENTSBYCOMPONENTSPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "Recoveries By Components listing page is displayed");
		}
		
		return flag;
	}
	
	
	
	
	
	public static String getLastNumber(String input) 
	{
        // Split the string by spaces
        String[] parts = input.split(" ");
        // The last number is in the last part after "of"
        return parts[parts.length - 1];
    }

	/**
	 * @author 
	 * @return flag
	 * This method is used to verify the pagination functionality
	 * @throws InterruptedException
	 */
	public boolean verifyPagination() throws InterruptedException
	{
		flag = webDB.waitForElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
		if(flag)
		{
			int count =0;
			String totalTest = webDB.getTextFromElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
			String lastNumber = getLastNumber(totalTest);
			log.logging("info", "The total records count is "+lastNumber);
			int totalrecordscount = Integer.parseInt(lastNumber);
			if(totalrecordscount>20)
			{
				log.logging("info", "Pagination is available as total records count is greater than 20.");
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTER, ElementType.Xpath);
				Thread.sleep(1500);
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_500, ElementType.Xpath);
				Thread.sleep(6000);
				
				int actualpagination = totalrecordscount / 500;
				int remainder = totalrecordscount % 500;
				if(remainder>=1)
				{
					actualpagination++;
					log.logging("info", "The actual pagination count is "+actualpagination);
				}
				
				try {
					int allpages = webDB.getDriver().findElements(By.xpath(CommonFunctionsLocators.NEXTBUTTON)).size();
					int recordsonpage1 = 0;
					
					for(int j = 0; allpages>0; j++)
					{
						webDB.scrollBottom();
						Thread.sleep(750);
						int recordsonparticularpage = webDB.getDriver().findElements(By.xpath(CommonFunctionsLocators.TOTALRECORDSCOUNT)).size();
						recordsonpage1 = recordsonpage1 + recordsonparticularpage;
						log.logging("info", "The records are "+recordsonpage1);
						webDB.clickAnElement(CommonFunctionsLocators.NEXTBUTTON, ElementType.Xpath);
						System.out.println("Clicked on next button as its enabled");
						Thread.sleep(3000);
						count++;
						boolean nextbutton = webDB.isElementEnabled(CommonFunctionsLocators.NEXTBUTTON, ElementType.Xpath);
						if(nextbutton==true)
						{
							log.logging("info", "Next button is enabled");
						}
						else
						{
							log.logging("info", "Next button is in disabled state");
							break;
						}
					}
					int recordsonparticularpage1 = webDB.getDriver().findElements(By.xpath(CommonFunctionsLocators.TOTALRECORDSCOUNT)).size();
					int recordsonpage= recordsonpage1+recordsonparticularpage1;
					if(recordsonpage==totalrecordscount)
					{
						log.logging("info", "Total records on page are same i.e. "+recordsonpage);
						flag = true;
					}
					else
					{
						log.logging("info", "Total records on page are different i.e. "+recordsonpage);
						flag = false;
					}
					
					}
					catch(Exception e)
					{
						
					}
				
				count = count+1;
				log.logging("info", "The total pagination count is "+count);
				if(actualpagination == count ==true)	
				{
					log.logging("info", "The Actual and expected pagination count is same i.e. "+count);
					System.out.println(" ");
					flag = true;
				}
				
				else
					{
					log.logging("info", "The Actual and expected pagination count is Different i.e. "+count);
					System.out.println(" ");
						flag = false;
					}
					
				count =0;
				}
				
			else
			{
				log.logging("info", "No pagination is available as total records count is less than 10.");
			}
				}
				else
				{
					log.logging("info", "The pagination is not present on webpage");
				}
		

		return flag;
}
}

	
