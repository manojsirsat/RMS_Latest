package commonfunctions;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import locators.BOLPageLocators;
import locators.CommonFunctionsLocators;
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
	 * This method is used to click on main page link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnMainPage (String profilename, ElementType elementtype, String mainpage, ElementType elementtype1, String internalpage, ElementType elementtype2) throws InterruptedException
	{
		flag = webDB.isElementDisplayed(profilename, elementtype);
		if(flag)
		{
			webDB.javaScriptClickAnElement(mainpage, elementtype1);
			Thread.sleep(9000);
			flag = webDB.isElementDisplayed(internalpage, elementtype2);
			log.logging("info", "Listing page is displayed");
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on internal page link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnInternalPage (String internalpagename, ElementType elementtype, String internalpageheading, ElementType elementtype1) throws InterruptedException
	{
		flag = webDB.isElementDisplayed(internalpagename, elementtype);
		if(flag)
		{
			webDB.javaScriptClickAnElement(internalpagename, elementtype);
			Thread.sleep(10000);
			flag = webDB.isElementDisplayed(internalpageheading, elementtype1);
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
				log.logging("info", "Pagination is available as total records count is greater than 500.");
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
				log.logging("info", "No pagination is available as total records count is less than 500.");
			}
				}
				else
				{
					log.logging("info", "The pagination is not present on webpage");
				}
		

		return flag;
}
}

	
