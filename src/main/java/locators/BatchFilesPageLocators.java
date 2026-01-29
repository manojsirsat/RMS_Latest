package locators;

import org.openqa.selenium.By;

public class BatchFilesPageLocators {

	/** XPATH */
	public static final String BATCHFILESPAGE_HEADING = "//div[text()='Batch Files']";

	// Sorting
	/** By */
	public static final By BY_BATCHFILEID_COLHEADER = By.xpath("//th[contains(.,'Batch File ID')]");
	/** By */
	public static final By BY_BATCHFILEID_COLDATA = By.xpath("//table/tbody/tr/td[1]");
	/** XPATH */
	public static final String STRING_BATCHFILEID_COLDATA = "//table/tbody/tr/td[1]";
	/** XPATH */
	public static final String STRING_BATCHFILEID_COLHEADER = "//th[contains(.,'Batch File ID')]";

	/** By */
	public static final By BY_FILENAME_COLHEADER = By.xpath("//th[contains(.,'File Name')]");
	/** By */
	public static final By BY_FILENAME_COLDATA = By.xpath("//table/tbody/tr/td[3]");
	/** XPATH */
	public static final String STRING_FILENAME_COLDATA = "//table/tbody/tr/td[3]";
	/** XPATH */
	public static final String STRING_FILENAME_COLHEADER = "//th[contains(.,'File Name')]";

	/** By */
	public static final By BY_FILESTATUS_COLHEADER = By.xpath("//th[contains(.,'File Status')]");
	/** By */
	public static final By BY_FILESTATUS_COLDATA = By.xpath("//table/tbody/tr/td[4]");
	/** XPATH */
	public static final String STRING_FILESTATUS_COLDATA = "//table/tbody/tr/td[4]";
	/** XPATH */
	public static final String STRING_FILESTATUS_COLHEADER = "//th[contains(.,'File Status')]";

	/** By */
	public static final By BY_ACTIONTYPE_COLHEADER = By.xpath("//th[contains(.,'Action Type')]");
	/** By */
	public static final By BY_ACTIONTYPE_COLDATA = By.xpath("//table/tbody/tr/td[5]");
	/** XPATH */
	public static final String STRING_ACTIONTYPE_COLDATA = "//table/tbody/tr/td[5]";
	/** XPATH */
	public static final String STRING_ACTIONTYPE_COLHEADER = "//th[contains(.,'Action Type')]";

	/** By */
	public static final By BY_BATCHFILELINES_COLHEADER = By.xpath("//th[contains(.,'Batch File Lines')]");
	/** By */
	public static final By BY_BATCHFILELINES_COLDATA = By.xpath("//table/tbody/tr/td[6]");
	/** XPATH */
	public static final String STRING_BATCHFILELINES_COLDATA = "//table/tbody/tr/td[6]";
	/** XPATH */
	public static final String STRING_BATCHFILELINES_COLHEADER = "//th[contains(.,'Batch File Lines')]";

	/** By */
	public static final By BY_RECORDSLOADED_COLHEADER = By.xpath("//th[contains(.,'Records Loaded')]");
	/** By */
	public static final By BY_RECORDSLOADED_COLDATA = By.xpath("//table/tbody/tr/td[7]");
	/** XPATH */
	public static final String STRING_RECORDSLOADED_COLDATA = "//table/tbody/tr/td[7]";
	/** XPATH */
	public static final String STRING_RECORDSLOADED_COLHEADER = "//th[contains(.,'Records Loaded')]";

	/** By */
	public static final By BY_RECORDSPROCESSED_COLHEADER = By.xpath("//th[contains(.,'Records Processed')]");
	/** By */
	public static final By BY_RECORDSPROCESSED_COLDATA = By.xpath("//table/tbody/tr/td[8]");
	/** XPATH */
	public static final String STRING_RECORDSPROCESSED_COLDATA = "//table/tbody/tr/td[8]";
	/** XPATH */
	public static final String STRING_RECORDSPROCESSED_COLHEADER = "//th[contains(.,'Records Processed')]";

	/** By */
	public static final By BY_TOTALQUANTITY_COLHEADER = By.xpath("//th[contains(.,'Total Quantity')]");
	/** By */
	public static final By BY_TOTALQUANTITY_COLDATA = By.xpath("//table/tbody/tr/td[10]");
	/** XPATH */
	public static final String STRING_TOTALQUANTITY_COLDATA = "//table/tbody/tr/td[10]";
	/** XPATH */
	public static final String STRING_TOTALQUANTITY_COLHEADER = "//th[contains(.,'Total Quantity')]";

	/** By */
	public static final By BY_LOCCOUNT_COLHEADER = By.xpath("//th[contains(.,'Loc Count')]");
	/** By */
	public static final By BY_LOCCOUNT_COLDATA = By.xpath("//table/tbody/tr/td[11]");
	/** XPATH */
	public static final String STRING_LOCCOUNT_COLDATA = "//table/tbody/tr/td[11]";
	/** XPATH */
	public static final String STRING_LOCCOUNT_COLHEADER = "//th[contains(.,'Loc Count')]";

	/** By */
	public static final By BY_UPLOADED_COLHEADER = By.xpath("//th[contains(.,'Uploaded')]");
	/** By */
	public static final By BY_UPLOADED_COLDATA = By.xpath("//table/tbody/tr/td[12]");
	/** XPATH */
	public static final String STRING_UPLOADED_COLDATA = "//table/tbody/tr/td[12]";
	/** XPATH */
	public static final String STRING_UPLOADED_COLHEADER = "//th[contains(.,'Uploaded')]";

	/** By */
	public static final By BY_UPDATED_COLHEADER = By.xpath("//th[contains(.,'Updated')]");
	/** By */
	public static final By BY_UPDATED_COLDATA = By.xpath("//table/tbody/tr/td[13]");
	/** XPATH */
	public static final String STRING_UPDATED_COLDATA = "//table/tbody/tr/td[13]";
	/** XPATH */
	public static final String STRING_UPDATED_COLHEADER = "//th[contains(.,'Updated')]";

	/** By */
	public static final By BY_USER_COLHEADER = By.xpath("//th[contains(.,'User')]");
	/** By */
	public static final By BY_USER_COLDATA = By.xpath("//table/tbody/tr/td[14]");
	/** XPATH */
	public static final String STRING_USER_COLDATA = "//table/tbody/tr/td[14]";
	/** XPATH */
	public static final String STRING_USER_COLHEADER = "//th[contains(.,'User')]";

	// Batch file upload
	/** XPATH */
	public static final String BATCHFILEUPLOAD_LINK = "//a[@href='/batch-file-upload']";
	/** XPATH */
	public static final String ACCOUNT_INPUTFIELD = "//div[@id='account-autocomplete']/input";
	/** XPATH */
	public static final String BATCHACTIONTYPE_INPUTFIELD = "//div[@id='batch-action-type-autocomplete']/input";
	/** XPATH */
	public static final String CHOOSE_BTN = "//span[@class='p-button p-component p-fileupload-choose']";
	/** XPATH */
	public static final String UPLOAD_BTN = "//button[@class='p-button p-component' and @aria-label='Upload']";
	/** XPATH */
	public static final String PROCESSTHISBATCH_BTN = "//button[@id='modal-process-batch-button']";
	/** XPATH */
	public static final String ERRORMESSAGE = "(//span[@class='p-toast-summary' and text()='Error!'])[1]";
	/** XPATH */
	public static final String SUCCESSMESSAGE = "(//span[@class='p-toast-summary' and text()='Batch Process Queued!'])[1]";
	/** XPATH */
	public static final String DETAILED_ERRORMESSAGE = "(//div[@class='p-toast-detail'])[1]";

}
