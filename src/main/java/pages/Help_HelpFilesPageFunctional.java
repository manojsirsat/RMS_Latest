package pages;

import java.io.File;

import org.openqa.selenium.By;

import com.github.javafaker.Faker;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import locators.Help_HelpFilesPageLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class Help_HelpFilesPageFunctional {

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	Faker faker = new Faker();

	/**
	 * @author
	 * @return flag This method is used to navigate to Help Files page
	 * @throws InterruptedException
	 */
	public boolean navigate_Help_HelpFilesListingPage() throws InterruptedException {
		flag = commonfunction.clickOnMainPage(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath,
				CommonFunctionsLocators.HELP_PAGE_LEFTNAV, ElementType.Xpath,
				CommonFunctionsLocators.HELP_HELPFILESPAGE_LEFTNAV, ElementType.Xpath);
		if (flag) {
			flag = commonfunction.clickOnInternalPage(CommonFunctionsLocators.HELP_HELPFILESPAGE_LEFTNAV,
					ElementType.Xpath, Help_HelpFilesPageLocators.HELP_HELPFILESPAGE_HEADING, ElementType.Xpath);
			if (flag) {
				log.logging("info", "Help files listing page is displayed");
			}
		}

		return flag;
	}

	/**
	 * @author
	 * @return flag This method is used to click on download document button
	 * @throws InterruptedException
	 */
	public boolean click_DownloadDocumentBtn() throws InterruptedException {
		flag = webDB.isElementDisplayed(Help_HelpFilesPageLocators.HELP_HELPFILESPAGE_HEADING, ElementType.Xpath);
		if (flag) {
			int totalcount = webDB.getDriver()
					.findElements(By.xpath(Help_HelpFilesPageLocators.HELP_HELPFILES_DOWNLOADLINK)).size();
			String downloadPath = System.getProperty("user.dir") + "\\resources";
			File folder = new File(downloadPath);
			// File folder = new File("D:\\RMS Automation\\RMS_Latest\\resources");
			if (!folder.exists()) {
				System.out.println("Download folder does not exist!");
			}
			for (int i = 1; i <= totalcount; i++) {

				File[] files = folder.listFiles();
				int beforeDownload = (files == null) ? 0 : files.length;
				System.out.println("Path: " + folder.getAbsolutePath());
				System.out.println("Folder exists: " + folder.exists());
				System.out.println("Is directory: " + folder.isDirectory());
				log.logging("info", "Files before download are " + beforeDownload);
				flag = webDB.clickAnElement(Help_HelpFilesPageLocators.HELP_HELPFILES_DOWNLOADLINK + "[" + i + "]",
						ElementType.Xpath);
				Thread.sleep(5000);
				int afterDownload = folder.listFiles().length;
				log.logging("info", "Files after download are " + afterDownload);
				if (afterDownload > beforeDownload) {
					log.logging("info", "File downloaded successfully");
					flag = true;
				} else {
					log.logging("info", "File is not downloaded");
					flag = false;
				}
			}

		}
		return flag;
	}

}
