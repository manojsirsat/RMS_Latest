package pages;

import commonfunctions.CommonFunctions;
import locators.BatchFilesPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

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
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath, CommonFunctionsLocators.ORDERSANDBOLS_PAGE_LEFTNAV, ElementType.Xpath, CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		if(flag)
		{
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.BATCHFILES_PAGE, ElementType.Xpath, BatchFilesPageLocators.BATCHFILESPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}
	
	public boolean verifypagination() throws InterruptedException
	{
		commonfunction.verifyPagination();
		return flag;
	}
	
	public boolean BatchFileID_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_BATCHFILEID_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILEID_COLHEADER, BatchFilesPageLocators.STRING_BATCHFILEID_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILEID_COLDATA);
		return flag;
	}
	
	public boolean BatchFileID_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_BATCHFILEID_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILEID_COLHEADER, BatchFilesPageLocators.STRING_BATCHFILEID_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILEID_COLDATA);
		return flag;
	}
	
	public boolean FileName_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_FILENAME_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_FILENAME_COLHEADER, BatchFilesPageLocators.STRING_FILENAME_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_FILENAME_COLDATA);
		return flag;
	}
	
	public boolean FileName_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_FILENAME_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_FILENAME_COLHEADER, BatchFilesPageLocators.STRING_FILENAME_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_FILENAME_COLDATA);
		return flag;
	}
	
	public boolean FileStatus_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_FILESTATUS_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_FILESTATUS_COLHEADER, BatchFilesPageLocators.STRING_FILESTATUS_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_FILESTATUS_COLDATA);
		return flag;
	}
	
	public boolean FileStatus_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_FILESTATUS_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_FILESTATUS_COLHEADER, BatchFilesPageLocators.STRING_FILESTATUS_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_FILESTATUS_COLDATA);
		return flag;
	}
	
	public boolean ActionType_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_ACTIONTYPE_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_ACTIONTYPE_COLHEADER, BatchFilesPageLocators.STRING_ACTIONTYPE_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_ACTIONTYPE_COLDATA);
		return flag;
	}
	
	public boolean ActionType_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_ACTIONTYPE_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_ACTIONTYPE_COLHEADER, BatchFilesPageLocators.STRING_ACTIONTYPE_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_ACTIONTYPE_COLDATA);
		return flag;
	}
	
	public boolean BatchFileLines_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_BATCHFILELINES_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILELINES_COLHEADER, BatchFilesPageLocators.STRING_BATCHFILELINES_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILELINES_COLDATA);
		return flag;
	}
	
	public boolean BatchFileLines_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_BATCHFILELINES_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILELINES_COLHEADER, BatchFilesPageLocators.STRING_BATCHFILELINES_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILELINES_COLDATA);
		return flag;
	}
	
	public boolean RecordsLoaded_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_RECORDSLOADED_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSLOADED_COLHEADER, BatchFilesPageLocators.STRING_RECORDSLOADED_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSLOADED_COLDATA);
		return flag;
	}
	
	public boolean RecordsLoaded_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_RECORDSLOADED_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSLOADED_COLHEADER, BatchFilesPageLocators.STRING_RECORDSLOADED_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSLOADED_COLDATA);
		return flag;
	}
	
	public boolean RecordsProcessed_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_RECORDSPROCESSED_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSPROCESSED_COLHEADER, BatchFilesPageLocators.STRING_RECORDSPROCESSED_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSPROCESSED_COLDATA);
		return flag;
	}
	
	public boolean RecordsProcessed_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_RECORDSPROCESSED_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSPROCESSED_COLHEADER, BatchFilesPageLocators.STRING_RECORDSPROCESSED_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSPROCESSED_COLDATA);
		return flag;
	}
	
	public boolean TotalQuantity_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_TOTALQUANTITY_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_TOTALQUANTITY_COLHEADER, BatchFilesPageLocators.STRING_TOTALQUANTITY_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_TOTALQUANTITY_COLDATA);
		return flag;
	}
	
	public boolean TotalQuantity_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_TOTALQUANTITY_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_TOTALQUANTITY_COLHEADER, BatchFilesPageLocators.STRING_TOTALQUANTITY_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_TOTALQUANTITY_COLDATA);
		return flag;
	}
	
	public boolean LocCount_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_LOCCOUNT_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_LOCCOUNT_COLHEADER, BatchFilesPageLocators.STRING_LOCCOUNT_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_LOCCOUNT_COLDATA);
		return flag;
	}
	
	public boolean LocCount_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_LOCCOUNT_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_LOCCOUNT_COLHEADER, BatchFilesPageLocators.STRING_LOCCOUNT_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_LOCCOUNT_COLDATA);
		return flag;
	}
	
	public boolean Uploaded_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(BatchFilesPageLocators.BY_UPLOADED_COLHEADER, BatchFilesPageLocators.BY_UPLOADED_COLDATA);
		return flag;
	}
	
	public boolean Uploaded_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(BatchFilesPageLocators.BY_UPLOADED_COLHEADER, BatchFilesPageLocators.BY_UPLOADED_COLDATA);
		return flag;
	}
	
	
	public boolean Updated_DecendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingDescending(BatchFilesPageLocators.BY_UPDATED_COLHEADER, BatchFilesPageLocators.BY_UPDATED_COLDATA);
		return flag;
	}
	
	public boolean Updated_AscendingSorting() throws InterruptedException
	{
		commonfunction.verifyDateSortingAscending(BatchFilesPageLocators.BY_UPDATED_COLHEADER, BatchFilesPageLocators.BY_UPDATED_COLDATA);
		return flag;
	}
	
	public boolean User_DecendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_USER_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_USER_COLHEADER, BatchFilesPageLocators.STRING_USER_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_USER_COLDATA);
		return flag;
	}
	
	public boolean User_AscendingSorting() throws InterruptedException
	{
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_USER_COLHEADER, ElementType.Xpath, BatchFilesPageLocators.BY_USER_COLHEADER, BatchFilesPageLocators.STRING_USER_COLDATA, ElementType.Xpath, BatchFilesPageLocators.BY_USER_COLDATA);
		return flag;
	}
	
	
	
	
	
}
