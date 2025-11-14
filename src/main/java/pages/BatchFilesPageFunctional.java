package pages;

import commonfunctions.CommonFunctions;
import utils.ReportLoger;
import utils.WebDriverBase;

public class BatchFilesPageFunctional 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to navigate to Batch Files page
	 * @throws InterruptedException
	 */
	public boolean navigate_BatchFilesListingPage () throws InterruptedException
	{
		flag = commonfunction.clickOnBOLSPage();
		if(flag)
		{
			flag = commonfunction.clickOnBatchFilesPage();
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
}
