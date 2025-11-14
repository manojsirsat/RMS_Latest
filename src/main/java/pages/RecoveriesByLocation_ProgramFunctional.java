package pages;

import commonfunctions.CommonFunctions;
import utils.ReportLoger;
import utils.WebDriverBase;

public class RecoveriesByLocation_ProgramFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Recoveries By Location-Program page
	 * @throws InterruptedException
	 */
	public boolean navigate_Locations_ProgramsListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnRecoveriesPage();
		if(flag)
		{
			flag = commonfunction.clickOnRecoveriesByLocations_ProgramsPage();
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
}
