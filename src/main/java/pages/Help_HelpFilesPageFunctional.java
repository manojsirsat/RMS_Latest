package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Help_HelpFilesPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Help_HelpFilesPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Help Files page
	 * @throws InterruptedException
	 */
	public boolean navigate_Help_HelpFilesListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.HELP_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.HELP_HELPFILESPAGE_LEFTNAV, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.HELP_HELPFILESPAGE_LEFTNAV, ElementType.Xpath, Help_HelpFilesPageLocators.HELP_HELPFILESPAGE_HEADING, ElementType.Xpath);
			if(flag)
			{
				log.logging("info", "Help files listing page is displayed");
			}
		}
		
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
}
