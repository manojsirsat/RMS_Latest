package pages;

import commonfunctions.CommonFunctions;
import utils.ReportLoger;
import utils.WebDriverBase;

public class ReplenishmentsByComponentFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Recoveries By Components page
	 * @throws InterruptedException
	 */
	public boolean navigate_ComponentsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnReplenishmentsPage();
		if(flag)
		{
			flag = commonfunction.clickOnReplenishmentsByComponentsPage();
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
}
