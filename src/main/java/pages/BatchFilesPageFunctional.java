package pages;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import commonfunctions.CommonFunctions;
import locators.BatchFilesPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class BatchFilesPageFunctional {

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();
	String projectPath = System.getProperty("user.dir");
	String selectedoption = "";

	/**
	 * @author
	 * @return flag This method is used to navigate to Batch Files page
	 * @throws InterruptedException
	 */
	public boolean navigate_BatchFilesListingPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.ORDERSANDBOLS_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.BATCHFILES_PAGE, ElementType.Xpath,
					BatchFilesPageLocators.BATCHFILESPAGE_HEADING, ElementType.Xpath);
		}
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to navigate to batch files internal listing
	 *         page
	 * @throws InterruptedException
	 */
	public boolean navigate_BatchFilesInternalListingPage() throws InterruptedException {
		flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.BATCHFILES_PAGE, ElementType.Xpath,
				BatchFilesPageLocators.BATCHFILESPAGE_HEADING, ElementType.Xpath);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the pagination functionality
	 * @throws InterruptedException
	 */
	public boolean verifypagination() throws InterruptedException {
		commonfunction.verifyPagination();
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean BatchFileID_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_BATCHFILEID_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILEID_COLHEADER,
				BatchFilesPageLocators.STRING_BATCHFILEID_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_BATCHFILEID_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean BatchFileID_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_BATCHFILEID_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILEID_COLHEADER,
				BatchFilesPageLocators.STRING_BATCHFILEID_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_BATCHFILEID_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean FileName_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_FILENAME_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_FILENAME_COLHEADER,
				BatchFilesPageLocators.STRING_FILENAME_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_FILENAME_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean FileName_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_FILENAME_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_FILENAME_COLHEADER,
				BatchFilesPageLocators.STRING_FILENAME_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_FILENAME_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean FileStatus_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_FILESTATUS_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_FILESTATUS_COLHEADER,
				BatchFilesPageLocators.STRING_FILESTATUS_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_FILESTATUS_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean FileStatus_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_FILESTATUS_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_FILESTATUS_COLHEADER,
				BatchFilesPageLocators.STRING_FILESTATUS_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_FILESTATUS_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean ActionType_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_ACTIONTYPE_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_ACTIONTYPE_COLHEADER,
				BatchFilesPageLocators.STRING_ACTIONTYPE_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_ACTIONTYPE_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean ActionType_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_ACTIONTYPE_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_ACTIONTYPE_COLHEADER,
				BatchFilesPageLocators.STRING_ACTIONTYPE_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_ACTIONTYPE_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean BatchFileLines_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_BATCHFILELINES_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILELINES_COLHEADER,
				BatchFilesPageLocators.STRING_BATCHFILELINES_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_BATCHFILELINES_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean BatchFileLines_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_BATCHFILELINES_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_BATCHFILELINES_COLHEADER,
				BatchFilesPageLocators.STRING_BATCHFILELINES_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_BATCHFILELINES_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean RecordsLoaded_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_RECORDSLOADED_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSLOADED_COLHEADER,
				BatchFilesPageLocators.STRING_RECORDSLOADED_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_RECORDSLOADED_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean RecordsLoaded_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_RECORDSLOADED_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSLOADED_COLHEADER,
				BatchFilesPageLocators.STRING_RECORDSLOADED_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_RECORDSLOADED_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean RecordsProcessed_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_RECORDSPROCESSED_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSPROCESSED_COLHEADER,
				BatchFilesPageLocators.STRING_RECORDSPROCESSED_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_RECORDSPROCESSED_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean RecordsProcessed_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_RECORDSPROCESSED_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_RECORDSPROCESSED_COLHEADER,
				BatchFilesPageLocators.STRING_RECORDSPROCESSED_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_RECORDSPROCESSED_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean TotalQuantity_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_TOTALQUANTITY_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_TOTALQUANTITY_COLHEADER,
				BatchFilesPageLocators.STRING_TOTALQUANTITY_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_TOTALQUANTITY_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean TotalQuantity_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_TOTALQUANTITY_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_TOTALQUANTITY_COLHEADER,
				BatchFilesPageLocators.STRING_TOTALQUANTITY_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_TOTALQUANTITY_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean LocCount_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_LOCCOUNT_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_LOCCOUNT_COLHEADER,
				BatchFilesPageLocators.STRING_LOCCOUNT_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_LOCCOUNT_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean LocCount_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_LOCCOUNT_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_LOCCOUNT_COLHEADER,
				BatchFilesPageLocators.STRING_LOCCOUNT_COLDATA, ElementType.Xpath,
				BatchFilesPageLocators.BY_LOCCOUNT_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Uploaded_AscendingSorting() throws InterruptedException {
		commonfunction.verifyDateSortingAscending(BatchFilesPageLocators.BY_UPLOADED_COLHEADER,
				BatchFilesPageLocators.BY_UPLOADED_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Uploaded_DecendingSorting() throws InterruptedException {
		commonfunction.verifyDateSortingDescending(BatchFilesPageLocators.BY_UPLOADED_COLHEADER,
				BatchFilesPageLocators.BY_UPLOADED_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean Updated_DecendingSorting() throws InterruptedException {
		commonfunction.verifyDateSortingDescending(BatchFilesPageLocators.BY_UPDATED_COLHEADER,
				BatchFilesPageLocators.BY_UPDATED_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean Updated_AscendingSorting() throws InterruptedException {
		commonfunction.verifyDateSortingAscending(BatchFilesPageLocators.BY_UPDATED_COLHEADER,
				BatchFilesPageLocators.BY_UPDATED_COLDATA);
		return flag;
	}

	/**
	 * @author Sonam
	 * @return flag This method is used to verify the descending order functionality
	 * @throws InterruptedException
	 */
	public boolean User_DecendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringDecendingSorting(BatchFilesPageLocators.STRING_USER_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_USER_COLHEADER, BatchFilesPageLocators.STRING_USER_COLDATA,
				ElementType.Xpath, BatchFilesPageLocators.BY_USER_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the ascending order functionality
	 * @throws InterruptedException
	 */
	public boolean User_AscendingSorting() throws InterruptedException {
		commonfunction.validatePaginatedStringAscendingSorting(BatchFilesPageLocators.STRING_USER_COLHEADER,
				ElementType.Xpath, BatchFilesPageLocators.BY_USER_COLHEADER, BatchFilesPageLocators.STRING_USER_COLDATA,
				ElementType.Xpath, BatchFilesPageLocators.BY_USER_COLDATA);
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to select the account and batch file type
	 * @throws InterruptedException
	 */
	public boolean uploadBatchFile() throws InterruptedException, AWTException {
		flag = webDB.waitForClickElement(BatchFilesPageLocators.BATCHFILEUPLOAD_LINK, ElementType.Xpath);
		if (flag) {
			webDB.clickAnElement(BatchFilesPageLocators.BATCHFILEUPLOAD_LINK, ElementType.Xpath);
			Thread.sleep(1500);

			flag = webDB.waitForClickElement(BatchFilesPageLocators.ACCOUNT_INPUTFIELD, ElementType.Xpath);
			log.logging("info", "Navigated to Batch file upload page");
			if (flag) {
				webDB.clickAnElement(BatchFilesPageLocators.ACCOUNT_INPUTFIELD, ElementType.Xpath);
				webDB.sendTextToAnElement(BatchFilesPageLocators.ACCOUNT_INPUTFIELD, "THKGHASTNE", ElementType.Xpath);
				Thread.sleep(1500);
				webDB.pressDownArrowKey();
				Thread.sleep(750);
				flag = webDB.pressEnterKey();
				Thread.sleep(1500);
				if (flag) {
					log.logging("info", "Selected the Account");
				}

				webDB.clickAnElement(BatchFilesPageLocators.BATCHACTIONTYPE_INPUTFIELD, ElementType.Xpath);
				Thread.sleep(1000);
				int totaloptions = webDB.getDriver()
						.findElements(By.xpath("//ul[@id='batch-action-type-autocomplete_list']//li")).size();
//				log.logging("info", "Total options are "+totaloptions);
				if (totaloptions >= 0) {
					int oneoption = faker.number().numberBetween(1, totaloptions);
					webDB.clickAnElement("//ul[@id='batch-action-type-autocomplete_list']//li" + "[" + oneoption + "]",
							ElementType.Xpath);
					Thread.sleep(1500);

					selectedoption = webDB.getAttributeFromElement(BatchFilesPageLocators.BATCHACTIONTYPE_INPUTFIELD,
							ElementType.Xpath, "value");
					log.logging("info", "Batch action type is selected as: " + selectedoption);

				}
			}
		}

		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to upload a batch file
	 * @throws InterruptedException
	 */
	public boolean chooseValidBatchFileToUpload() throws InterruptedException, AWTException {
		webDB.clickAnElement(BatchFilesPageLocators.CHOOSE_BTN, ElementType.Xpath);
		Thread.sleep(1500);
		String filePath;
		Robot robot = new Robot();
		switch (selectedoption) {
		case "Notification":

			filePath = projectPath + "/Test_Data/batchfile_notification_thermoking.csv";
			flag = webDB.sendTextToAnElement("//input[@type='file']", filePath, ElementType.Xpath);

			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(1500);
			if (flag) {
				log.logging("info", "Uploaded the Notification batch file");
				flag = webDB.clickAnElement(BatchFilesPageLocators.UPLOAD_BTN, ElementType.Xpath);
				Thread.sleep(1500);
				if (flag) {
					log.logging("info", "Clicked on upload button after uploading the file");
					flag = click_ProcessThisBatchBtn();
				}

			}

			break;

		case "Adjustment":
			filePath = projectPath + "/Test_Data/batchfile_Adjustment_thermoking.csv";
			flag = webDB.sendTextToAnElement("//input[@type='file']", filePath, ElementType.Xpath);
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(1500);
			if (flag) {
				log.logging("info", "Uploaded the Adjustment batch file");
				flag = webDB.clickAnElement(BatchFilesPageLocators.UPLOAD_BTN, ElementType.Xpath);
				Thread.sleep(1500);
				if (flag) {
					log.logging("info", "Clicked on upload button after uploading the file");
					flag = click_ProcessThisBatchBtn();
				}

			}
			break;

		case "Capex":
			filePath = projectPath + "/Test_Data/batchfile_capex_thermoking.csv";
			flag = webDB.sendTextToAnElement("//input[@type='file']", filePath, ElementType.Xpath);
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(1500);
			if (flag) {
				log.logging("info", "Uploaded the Adjustment batch file");
				flag = webDB.clickAnElement(BatchFilesPageLocators.UPLOAD_BTN, ElementType.Xpath);
				Thread.sleep(1500);
				if (flag) {
					log.logging("info", "Clicked on upload button after uploading the file");
					flag = click_ProcessThisBatchBtn();
				}

			}
			break;
		}

		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to click on process this batch button
	 * @throws InterruptedException
	 */
	public boolean click_ProcessThisBatchBtn() throws InterruptedException {
		flag = webDB.isElementDisplayed(BatchFilesPageLocators.PROCESSTHISBATCH_BTN, ElementType.Xpath);
		if (flag) {
			flag = webDB.clickAnElement(BatchFilesPageLocators.PROCESSTHISBATCH_BTN, ElementType.Xpath);
			Thread.sleep(1500);
			if (flag) {
				log.logging("info", "Clicked on process this batch button and batch file is processed");
				flag = webDB.isElementDisplayed(BatchFilesPageLocators.SUCCESSMESSAGE, ElementType.Xpath);
				if (flag) {
					log.logging("info", "Batch file is processed successfully");
				} else {
					log.logging("info", "Batch file is not processed error occured");
					flag = false;
				}
			}
		} else {
			log.logging("info", "Process this batch button not displayed");
			flag = false;
		}
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the valid batch file upload
	 *         functionality
	 * @throws InterruptedException
	 */
	public boolean upload_ValidBatchFile() throws InterruptedException, AWTException {
		webDB.navigateToRefresh();
		Thread.sleep(2000);
		flag = navigate_BatchFilesListingPage();
		if (flag) {
			flag = uploadBatchFile();
			if (flag) {
				flag = chooseValidBatchFileToUpload();
			}
		}
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to upload invalid batch file
	 * @throws InterruptedException
	 */
	public boolean chooseInvalidBatchFileToUpload() throws InterruptedException, AWTException {
		webDB.clickAnElement(BatchFilesPageLocators.CHOOSE_BTN, ElementType.Xpath);
		Thread.sleep(1500);
		String filePath;
		Robot robot = new Robot();
		switch (selectedoption) {
		case "Notification":

			filePath = projectPath + "/Test_Data/Invalid_batchfile_notification_thermoking.csv";
			flag = webDB.sendTextToAnElement("//input[@type='file']", filePath, ElementType.Xpath);

			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(1500);
			if (flag) {
				log.logging("info", "Uploaded the Notification batch file");
				flag = webDB.clickAnElement(BatchFilesPageLocators.UPLOAD_BTN, ElementType.Xpath);
				Thread.sleep(1000);
				if (flag) {
					log.logging("info", "Clicked on upload button after uploading the file");
					flag = webDB.isElementDisplayed(BatchFilesPageLocators.ERRORMESSAGE, ElementType.Xpath);
					String errordetails = webDB.getTextFromElement(BatchFilesPageLocators.DETAILED_ERRORMESSAGE,
							ElementType.Xpath);
					if (flag) {
						log.logging("info", "Error message is displayed with details: " + errordetails);
					}
				}

			}

			break;

		case "Adjustment":
			filePath = projectPath + "/Test_Data/Invalid_batchfile_Adjustment_thermoking.csv";
			flag = webDB.sendTextToAnElement("//input[@type='file']", filePath, ElementType.Xpath);
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(1500);
			if (flag) {
				log.logging("info", "Uploaded the Adjustment batch file");
				flag = webDB.clickAnElement(BatchFilesPageLocators.UPLOAD_BTN, ElementType.Xpath);
				Thread.sleep(1500);
				if (flag) {
					log.logging("info", "Clicked on upload button after uploading the file");
					flag = webDB.isElementDisplayed(BatchFilesPageLocators.ERRORMESSAGE, ElementType.Xpath);
					String errordetails = webDB.getTextFromElement(BatchFilesPageLocators.DETAILED_ERRORMESSAGE,
							ElementType.Xpath);
					if (flag) {
						log.logging("info", "Error message is displayed with details: " + errordetails);
					}
				}

			}
			break;

		case "Capex":
			filePath = projectPath + "/Test_Data/Invalid_batchfile_capex_thermoking.csv";
			flag = webDB.sendTextToAnElement("//input[@type='file']", filePath, ElementType.Xpath);
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(1500);
			if (flag) {
				log.logging("info", "Uploaded the Adjustment batch file");
				flag = webDB.clickAnElement(BatchFilesPageLocators.UPLOAD_BTN, ElementType.Xpath);
				Thread.sleep(1500);
				if (flag) {
					log.logging("info", "Clicked on upload button after uploading the file");
					flag = webDB.isElementDisplayed(BatchFilesPageLocators.ERRORMESSAGE, ElementType.Xpath);
					String errordetails = webDB.getTextFromElement(BatchFilesPageLocators.DETAILED_ERRORMESSAGE,
							ElementType.Xpath);
					if (flag) {
						log.logging("info", "Error message is displayed with details: " + errordetails);
					}
				}

			}
			break;
		}

		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the invalid batch file upload
	 *         functionality
	 * @throws InterruptedException
	 */
	public boolean upload_InvalidBatchFile() throws InterruptedException, AWTException {
		webDB.navigateToRefresh();
		Thread.sleep(2000);
		flag = navigate_BatchFilesListingPage();
		if (flag) {
			flag = uploadBatchFile();
			if (flag) {
				flag = chooseInvalidBatchFileToUpload();
			}
		}
		return flag;
	}

}
