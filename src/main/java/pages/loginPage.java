package pages;

import commonfunctions.CommonFunctions;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;

public class loginPage 
{

	boolean flag;
	static CommonFunctions commonfunction = new CommonFunctions();
	WebDriverBase webDB = new WebDriverBase();
	ReportLoger log = new ReportLoger();

	
	/**
	 * This method is used to check the about us page header nav link redirections
	 * @return boolean flag
	 * @throws InterruptedException
	 */
	public boolean validLogin() throws InterruptedException {

		flag = webDB.isElementDisplayed(CommonFunctionsLocators.USERNAME_FIELD, ElementType.CssSelector);
		if (flag) {
			log.logging("info", "Login page is displayed");
			flag = webDB.waitForElement(CommonFunctionsLocators.USERNAME_FIELD, ElementType.CssSelector);
			if (flag) {
				String Username = webDB.getDataFromProperties("username");
				webDB.sendTextToAnElement(CommonFunctionsLocators.USERNAME_FIELD, Username,
						ElementType.CssSelector);
				flag = webDB.waitForElement(CommonFunctionsLocators.PASSWORD_FIELD, ElementType.CssSelector);
				if (flag) {
					String Password = webDB.getDataFromProperties("password");
					webDB.sendTextToAnElement(CommonFunctionsLocators.PASSWORD_FIELD, Password,
							ElementType.CssSelector);
					Thread.sleep(2000);
					flag = webDB.waitForElement(CommonFunctionsLocators.SIGNIN_BUTTON, ElementType.CssSelector);
					if (flag) {
						webDB.clickAnElement(CommonFunctionsLocators.SIGNIN_BUTTON, ElementType.CssSelector);
						log.logging("info", "Clicked on Sign in button");
						Thread.sleep(3000);
						flag = webDB.waitForElement(CommonFunctionsLocators.PROFILENAME, ElementType.Xpath);
						log.logging("info", "Logged in as a User successfully");
						Thread.sleep(2000);
////							
					}
				}
			}
		}

		return flag;
	}
	
	

	
		
}
