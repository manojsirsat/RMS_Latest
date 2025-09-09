package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class loginPage 
{

	boolean flag;
	private WebDriverBase webDB;
	ReportLoger log = new ReportLoger();

	public loginPage(WebDriverBase webDB) {
		this.webDB = webDB;
	}
	
	/**
	 * This method is used to perform user valid login 
	 * @return boolean flag
	 * @throws InterruptedException
	 */
	public boolean validLogin() throws InterruptedException {

		// First, wait for the username field to be ready.
		flag = webDB.waitForElement(CommonFunctionsLocators.USERNAME_FIELD, ElementType.Xpath);

		if (flag) {
			log.logging("info", "Login page is displayed");
			String Username = webDB.getDataFromProperties("username");
			webDB.sendTextToAnElement(CommonFunctionsLocators.USERNAME_FIELD, Username, ElementType.Xpath);

			// Wait for password field
			flag = webDB.waitForElement(CommonFunctionsLocators.PASSWORD_FIELD, ElementType.Xpath);
			if (flag) {
				String Password = webDB.getDataFromProperties("password");
				webDB.sendTextToAnElement(CommonFunctionsLocators.PASSWORD_FIELD, Password, ElementType.Xpath);

				// Wait for sign-in button
				flag = webDB.waitForElement(CommonFunctionsLocators.SIGNIN_BUTTON, ElementType.Xpath);
				if (flag) {
					webDB.clickAnElement(CommonFunctionsLocators.SIGNIN_BUTTON, ElementType.Xpath);
					log.logging("info", "Clicked on Sign in button");

					// Wait for profile name to appear after login to confirm success
					flag = webDB.waitForElement(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath);
					if(flag){
						log.logging("info", "Logged in as a User successfully");
					}
				}
			}
		}

		return flag;
	}
}