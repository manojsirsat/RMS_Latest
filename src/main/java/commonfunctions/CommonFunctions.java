package commonfunctions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import locators.BOLPageLocators;
import locators.CommonFunctionsLocators;
import utils.ReportLoger;
import utils.WebDriverBase;
import utils.WebDriverBase.ElementType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonFunctions {

	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	boolean flag;
	public String actlink = new String();
	public String acttext = new String();
	public String expectedtext_link = new String();
	Faker faker = new Faker();
	WebDriverWait wait = new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(60));
	SoftAssert softAssert = new SoftAssert();
	
	/**
	 * @author sonam
	 * @return flag This method is used to click on main page link from left
	 *         navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnMainPage(String profilename, ElementType elementtype, String mainpage,
			ElementType elementtype1, String internalpage, ElementType elementtype2) throws InterruptedException {
		flag = webDB.waitForElement(profilename, elementtype);
		if (flag) {
			webDB.javaScriptClickAnElement(mainpage, elementtype1);
			Thread.sleep(9000);
			flag = webDB.waitForElement(internalpage, elementtype2);
//			log.logging("info", "Listing page is displayed");
		}

		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to click on internal page link from left
	 *         navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnInternalPage(String internalpagename, ElementType elementtype, String internalpageheading,
			ElementType elementtype1) throws InterruptedException {
		flag = webDB.waitForElement(internalpagename, elementtype);
		if (flag) {
			webDB.javaScriptClickAnElement(internalpagename, elementtype);
			Thread.sleep(10000);
			flag = webDB.waitForElement(internalpageheading, elementtype1);
		}

		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to click on BOL link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnBOLSPage() throws InterruptedException {
		flag = webDB.waitForElement(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		if (flag) {
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
			Thread.sleep(9000);
			flag = webDB.waitForElement(BOLPageLocators.BOLPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "BOL listing page is displayed");
		}

		return flag;
	}
	
	/**
	 * @author sonam
	 * @return flag This method is used to navigate to BOL link from left navigation
	 * @throws InterruptedException
	 */
	public boolean navigateBOLSPage() throws InterruptedException {
		
		String SiteUrl = webDB.getDataFromProperties("url");
		webDB.navigateToUrl(SiteUrl+"/bills-of-lading");
		Thread.sleep(9000);
			flag = webDB.waitForElement(BOLPageLocators.BOLPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "BOL listing page is displayed");
		
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to get the last number part
	 * @throws InterruptedException
	 */
	public static String getLastNumber(String input) {

	    try {

	        // Null or empty check
	        if (input == null || input.trim().isEmpty()) {

	            return "0";
	        }

	        // Remove extra spaces
	        input = input.trim();

	        // Split by spaces
	        String[] parts = input.split("\\s+");

	        // Traverse from end and return first numeric value
	        for (int i = parts.length - 1; i >= 0; i--) {

	            // Remove non-numeric characters
	            String value = parts[i].replaceAll("[^0-9]", "");

	            // Return first valid number found
	            if (!value.isEmpty()) {

	                return value;
	            }
	        }

	    } catch (Exception e) {

	        System.out.println(
	                "Exception in getLastNumber : "
	                        + e.getMessage());
	    }

	    // Default fallback
	    return "0";
	}

//	/**
//	 * @author sonam
//	 * @return flag This method is used to verify the pagination functionality
//	 * @throws InterruptedException
//	 */
	public boolean verifyPagination() throws InterruptedException {

		Thread.sleep(60000);
	    flag = webDB.waitForElement(
	            CommonFunctionsLocators.SHOWINGRESULTBOTTOM,
	            ElementType.Xpath);

	    if (flag) {

	        int count = 0;

	        WebDriverWait wait = new WebDriverWait(
	                webDB.getDriver(),
	                Duration.ofSeconds(60));

	        // Wait for pagination text visibility
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath(CommonFunctionsLocators.SHOWINGRESULTBOTTOM)));

	        String totalTest = webDB.getTextFromElement(
	                CommonFunctionsLocators.SHOWINGRESULTBOTTOM,
	                ElementType.Xpath);

	        String lastNumber = getLastNumber(totalTest);

	        log.logging("info",
	                "The total records count is " + lastNumber);

	        int totalrecordscount = Integer.parseInt(lastNumber);

	        if (totalrecordscount > 20) {

	            log.logging("info", "Pagination is available");

	            // Open show filter dropdown
	            webDB.clickAnElement(
	                    CommonFunctionsLocators.SHOWFILTER,
	                    ElementType.Xpath);

	            wait.until(ExpectedConditions.elementToBeClickable(
	                    By.xpath(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_500)));

	            // Select 500 records
	            webDB.clickAnElement(
	                    CommonFunctionsLocators.SHOWFILTERSELECTVALUE_500,
	                    ElementType.Xpath);

	            // Wait loader appear
	            try {

	                wait.until(ExpectedConditions.presenceOfElementLocated(
	                        By.xpath(
	                                "//div[contains(@class,'loading-overlay')]")));

	            } catch (Exception e) {

	                log.logging("info",
	                        "Loader did not appear after selecting 500");
	            }

	            // Wait loader disappear
	            wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                    By.xpath(
	                            "//div[contains(@class,'loading-overlay')]")));

	            // Wait paginator visible
	            wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath(CommonFunctionsLocators.SHOWINGRESULTBOTTOM)));

	            int actualpagination = totalrecordscount / 500;

	            int remainder = totalrecordscount % 500;

	            if (remainder > 0) {

	                actualpagination++;
	            }

	            log.logging("info",
	                    "The actual pagination count is "
	                            + actualpagination);

	            try {

	                int totalRecordsFromAllPages = 0;

	                while (true) {

	                    count++;

	                    webDB.scrollBottom();

	                    Thread.sleep(2000);

	                    // Get pagination text
	                    String pageText = webDB.getTextFromElement(
	                            CommonFunctionsLocators.SHOWINGRESULTBOTTOM,
	                            ElementType.Xpath);

	                    log.logging("info",
	                            "Pagination text : " + pageText);

	                    // Example:
	                    // Showing 1 to 500 of 36925 entries

	                    Pattern pattern = Pattern.compile(
	                            "(\\d+)\\s*(?:to|-)?\\s*(\\d+)");

	                    Matcher matcher = pattern.matcher(pageText);

	                    int startRecord = 0;
	                    int endRecord = 0;

	                    if (matcher.find()) {

	                        startRecord = Integer.parseInt(
	                                matcher.group(1));

	                        endRecord = Integer.parseInt(
	                                matcher.group(2));
	                    }

	                    int recordsOnCurrentPage =
	                            (endRecord - startRecord) + 1;

	                    log.logging("info",
	                            "Records on current page : "
	                                    + recordsOnCurrentPage);

	                    totalRecordsFromAllPages =
	                            totalRecordsFromAllPages
	                                    + recordsOnCurrentPage;

	                    log.logging("info",
	                            "Total records counted so far : "
	                                    + totalRecordsFromAllPages);

	                    // Next enabled button
	                    By nextButtonLocator = By.xpath(
	                            "//button[contains(@class,'p-paginator-next') and not(contains(@class,'p-disabled'))]");

	                    List<WebElement> nextButtons =
	                            webDB.getDriver()
	                                    .findElements(nextButtonLocator);

	                    // Last page reached
	                    if (nextButtons.size() == 0) {

	                        log.logging("info",
	                                "Last page reached");

	                        break;
	                    }

	                    WebElement nextButton =
	                            nextButtons.get(0);

	                    // Scroll next button into view
	                    ((JavascriptExecutor) webDB.getDriver())
	                            .executeScript(
	                                    "arguments[0].scrollIntoView({block: 'center'});",
	                                    nextButton);

	                    Thread.sleep(1000);

	                    wait.until(
	                            ExpectedConditions.elementToBeClickable(
	                                    nextButton));

	                    try {

	                        nextButton.click();

	                    } catch (Exception e) {

	                        log.logging("info",
	                                "Normal click failed. Using JS click.");

	                        ((JavascriptExecutor) webDB.getDriver())
	                                .executeScript(
	                                        "arguments[0].click();",
	                                        nextButton);
	                    }

	                    log.logging("info",
	                            "Clicked on next button");

	                    // Wait loader appear
	                    try {

	                        wait.until(ExpectedConditions.presenceOfElementLocated(
	                                By.xpath(
	                                        "//div[contains(@class,'loading-overlay')]")));

	                    } catch (Exception e) {

	                        log.logging("info",
	                                "Loader did not appear");
	                    }

	                    // Wait loader disappear
	                    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                            By.xpath(
	                                    "//div[contains(@class,'loading-overlay')]")));

	                    // Wait paginator refresh
	                    wait.until(ExpectedConditions.visibilityOfElementLocated(
	                            By.xpath(
	                                    CommonFunctionsLocators.SHOWINGRESULTBOTTOM)));

	                    Thread.sleep(3000);
	                }

	                // Final records verification
	                if (totalRecordsFromAllPages
	                        == totalrecordscount) {

	                    log.logging("info",
	                            "Total records matched : "
	                                    + totalRecordsFromAllPages);

	                    flag = true;

	                } else {

	                    log.logging("info",
	                            "Total records mismatch. Expected : "
	                                    + totalrecordscount
	                                    + " Actual : "
	                                    + totalRecordsFromAllPages);

	                    flag = false;
	                }

	            } catch (Exception e) {

	                log.logging("info",
	                        "Exception occurred : "
	                                + e.getMessage());

	                flag = false;
	            }

	            // Final pagination verification
	            log.logging("info",
	                    "The total pagination count is "
	                            + count);

	            if (actualpagination == count) {

	                log.logging("info",
	                        "Actual and expected pagination count matched : "
	                                + count);

	                flag = true;

	            } else {

	                log.logging("info",
	                        "Actual and expected pagination count mismatch. Expected : "
	                                + actualpagination
	                                + " Actual : "
	                                + count);

	                flag = false;
	            }

	        } else {

	            flag = webDB.isElementDisplayed(
	                    "//div[@class='p-datatable-loading-overlay p-component-overlay']",
	                    ElementType.Xpath);

	            if (flag) {

	                log.logging("info",
	                        "Records are not getting loaded");

	                flag = false;

	            } else {
	            	
	                log.logging("info",
	                        "No pagination available");

	                flag = true;
	            }
	        }

	    } else {

	        log.logging("info",
	                "Pagination is not present on webpage");

	        flag = false;
	    }

	    return flag;
	}
	

//	================= Sorting ==================================================
	/**
	 * @author sonam
	 * @return flag This method is used to get the paginated string column data
	 * @throws InterruptedException
	 */
	public List<String> getPaginatedStringColumn(By columnLocator, By nextBtn) throws InterruptedException {

		List<String> fullList = new ArrayList<>();
		boolean hasNext = true;
		fullList.clear();
		while (hasNext) {

			List<WebElement> elements = webDB.getDriver().findElements(columnLocator);

			if (elements.isEmpty()) {
				throw new RuntimeException("No records found in column!");
			}

			for (WebElement el : elements) {
				String value = el.getText().trim();
				fullList.add(value);
			}

			WebElement next = webDB.getDriver().findElement(nextBtn);

			if (next.isEnabled()) {

				next.click();
				Thread.sleep(45000); // wait for next page data to load
//				new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(60))
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Next Page']")));

//				Thread.sleep(8000); // wait for next page data to load

			} else {
				hasNext = false;
			}
		}
		return fullList;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to get the paginated string descending order
	 *         data
	 * @throws InterruptedException
	 */
	public boolean verifyPaginatedStringDescending(By column, By nextBtn) throws InterruptedException {

		List<String> actualList = getPaginatedStringColumn(column, nextBtn);

		List<String> expectedList = new ArrayList<>(actualList);

		// match desc order
		expectedList.sort((s1, s2) -> {

			String[] a1 = s1.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
			String[] a2 = s2.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

			int len = Math.min(a1.length, a2.length);

			for (int i = 0; i < len; i++) {
				String p1 = a1[i];
				String p2 = a2[i];

				int result;

				if (p1.matches("\\d+") && p2.matches("\\d+")) {
					// DESC numeric compare
					result = Integer.compare(Integer.parseInt(p2), Integer.parseInt(p1));
				} else {
					// DESC string compare (case-insensitive)
					result = p2.compareToIgnoreCase(p1);
				}

				if (result != 0)
					return result;
			}
			return Integer.compare(a2.length, a1.length);
		});

		softAssert.assertEquals(actualList, expectedList);

		if (actualList.equals(expectedList)) {
			log.logging("info", "The Descending order sorting is correct");
			flag = true;
		} else {
			log.logging("info", "The Descending order sorting is incorrect");
			log.logging("info", "The actual data is " + actualList);
			log.logging("info", "The expected data is " + expectedList);
			flag = false;
		}

		softAssert.assertAll();
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to get the paginated string ascending order
	 *         data
	 * @throws InterruptedException
	 */
	public boolean verifyPaginatedStringAscending(By column, By nextBtn) throws InterruptedException {

		List<String> actualList = getPaginatedStringColumn(column, nextBtn);

		List<String> expectedList = new ArrayList<>(actualList);

		// match with asc order
		expectedList.sort((s1, s2) -> {

			String[] a1 = s1.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
			String[] a2 = s2.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

			int len = Math.min(a1.length, a2.length);

			for (int i = 0; i < len; i++) {
				String p1 = a1[i];
				String p2 = a2[i];

				int result;

				if (p1.matches("\\d+") && p2.matches("\\d+")) {
					// compare
					result = Integer.compare(Integer.parseInt(p1), Integer.parseInt(p2));
				} else {
					// String compare (case-insensitive)
					result = p1.compareToIgnoreCase(p2);
				}

				if (result != 0)
					return result;
			}
			return Integer.compare(a1.length, a2.length);
		});

		softAssert.assertEquals(actualList, expectedList);

		if (actualList.equals(expectedList)) {
			log.logging("info", "The Ascending order sorting is correct");
			flag = true;
		} else {
			log.logging("info", "The Ascending order sorting is incorrect");
			log.logging("info", "The actual data is " + actualList);
			log.logging("info", "The expected data is " + expectedList);
			flag = false;
		}

		softAssert.assertAll();
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the paginated string descending
	 *         sorting
	 * @throws InterruptedException
	 */
	public boolean validatePaginatedStringDecendingSorting(String ColumnHeader, ElementType elementtypecolumnheader,
			By ColumnHeader1, String columndata, ElementType elementtypecolumndata, By columndata1)
			throws InterruptedException {
		webDB.navigateToRefresh();
		Thread.sleep(9000);
//		new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(60))
//		.until(ExpectedConditions.elementToBeClickable(By.xpath(CommonFunctionsLocators.VIEWRESULT_BUTTON)));

		webDB.clickAnElement(CommonFunctionsLocators.VIEWRESULT_BUTTON, ElementType.Xpath);
		Thread.sleep(60000);
//		new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(120))
//		.until(ExpectedConditions.elementToBeClickable(By.xpath(CommonFunctionsLocators.SHOWINGRESULTBOTTOM)));

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CommonFunctionsLocators.SHOWINGRESULTBOTTOM)));
		flag = webDB.waitForElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
		if (flag) {
			String totalTest = webDB.getTextFromElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
			String lastNumber = getLastNumber(totalTest);
			log.logging("info", "The total records count is " + lastNumber);
			int totalrecordscount = Integer.parseInt(lastNumber);
			if (totalrecordscount > 1) {
//				log.logging("info", "Pagination is available as total records count is greater than 20.");
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTER, ElementType.Xpath);
				Thread.sleep(2000);
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_500, ElementType.Xpath);
				Thread.sleep(15000);
//				new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(60))
//						.until(ExpectedConditions.elementToBeClickable(By.xpath("//table/tbody/tr/td[1]")));

				webDB.getDriver().findElement(ColumnHeader1).click();
//				Thread.sleep(1500);
				
				new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//table/tbody/tr/td[1])[1]")));

//				new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(60))
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//table/tbody/tr/td[1])[1]")));

				Thread.sleep(30000); // allow table to reload
				flag = verifyPaginatedStringDescending(columndata1, CommonFunctionsLocators.nextBtn);
			}
			else
			{
				flag = webDB.isElementDisplayed("//div[@class='p-datatable-loading-overlay p-component-overlay']", ElementType.Xpath);
//				flag = webDB.waitForClickElement("//td[contains(.,'No') and contains(.,'data found')]", ElementType.Xpath);
				if(flag)
				{
				log.logging("info", "Records are not getting load");
				flag = false;
				}
				else
				{
					log.logging("info", "0 records displayed on page");
					flag = true;
				}
			}
		}
		return flag;
		
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the paginated string ascending
	 *         sorting
	 * @throws InterruptedException
	 */
	public boolean validatePaginatedStringAscendingSorting(String ColumnHeader, ElementType elementtypecolumnheader,
			By ColumnHeader1, String columndata, ElementType elementtypecolumndata, By columndata1)
			throws InterruptedException {
		// Get back to Page 1
//		WebDriverWait wait = new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(20));
//		new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(60))
//				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='First Page']")));
//		webDB.clickAnElementWithoutException("//button[@aria-label='First Page']", ElementType.Xpath);
//		
		webDB.navigateToRefresh();
		Thread.sleep(15000);
		
		webDB.clickAnElement(CommonFunctionsLocators.VIEWRESULT_BUTTON, ElementType.Xpath);
		Thread.sleep(45000);
//		new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(120))
//		.until(ExpectedConditions.elementToBeClickable(By.xpath(CommonFunctionsLocators.SHOWINGRESULTBOTTOM)));

		flag = webDB.waitForElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
		if (flag) {
			String totalTest = webDB.getTextFromElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
			String lastNumber = getLastNumber(totalTest);
			log.logging("info", "The total records count is " + lastNumber);
			int totalrecordscount = Integer.parseInt(lastNumber);
			if (totalrecordscount > 1) {
//				log.logging("info", "Pagination is available as total records count is greater than 20.");
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTER, ElementType.Xpath);
				Thread.sleep(2000);
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_500, ElementType.Xpath);
				Thread.sleep(45000);
				new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(ColumnHeader)));
		
		// Ascending order
		webDB.getDriver().findElement(ColumnHeader1).click();
		Thread.sleep(45000); // allow table to reload
		
		webDB.getDriver().findElement(ColumnHeader1).click();
		Thread.sleep(45000); // allow table to reload
		
		webDB.waitForClickElement("(//table/tbody/tr/td[1])[1]", ElementType.Xpath);
//		webDB.waitForClickElement(columndata, elementtypecolumndata);

		flag = verifyPaginatedStringAscending(columndata1, CommonFunctionsLocators.nextBtn);
			}
			else
			{
				flag = webDB.isElementDisplayed("//div[@class='p-datatable-loading-overlay p-component-overlay']", ElementType.Xpath);
//				flag = webDB.waitForClickElement("//td[contains(.,'No') and contains(.,'data found')]", ElementType.Xpath);
				if(flag)
				{
				log.logging("info", "Records are not getting load");
				flag = false;
				}
				else
				{
					log.logging("info", "0 records displayed on page");
					flag = true;
				}
			}
				
		
			}
		return flag;
	}

//	===================================================== Date Sorting ===================================================

	private int compareDatesAsc(String d1, String d2) {

		if (d1 == null || d1.isBlank())
			return 1;
		if (d2 == null || d2.isBlank())
			return -1;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

		LocalDate date1 = LocalDate.parse(d1, formatter);
		LocalDate date2 = LocalDate.parse(d2, formatter);

		return date1.compareTo(date2);
	}

	/**
	 * @author sonam
	 * @return flag This method is used to get the paginated date ascending order
	 *         data
	 * @throws InterruptedException
	 */
	public boolean verifyPaginatedDateAscending(By dateColumn, By nextBtn) throws InterruptedException {

		softAssert = new SoftAssert(); // Reset for each
		flag = false;

		List<String> actualList = getPaginatedStringColumn(dateColumn, nextBtn);

		List<String> expectedList = new ArrayList<>(actualList);

		// Ascending Date Sort
		expectedList.sort(this::compareDatesAsc);

		softAssert.assertEquals(actualList, expectedList);

		if (actualList.equals(expectedList)) {
			log.logging("info", "Date Ascending sorting is correct");
			flag = true;
		} else {
			log.logging("info", "Date Ascending sorting is incorrect");
			log.logging("info", "Actual Data  : " + actualList);
			log.logging("info", "Expected Data: " + expectedList);
		}

		softAssert.assertAll();
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to get the paginated date descending order
	 *         sorting
	 * @throws InterruptedException
	 */
	public boolean verifyPaginatedDateDescending(By dateColumn, By nextBtn) throws InterruptedException {

		softAssert = new SoftAssert(); // Reset
		flag = false;

		List<String> actualList = getPaginatedStringColumn(dateColumn, nextBtn);

		List<String> expectedList = new ArrayList<>(actualList);

		// Descending Date Sort
		expectedList.sort((d1, d2) -> compareDatesAsc(d2, d1));

		softAssert.assertEquals(actualList, expectedList);

		if (actualList.equals(expectedList)) {
			log.logging("info", "Date Descending sorting is correct");
			flag = true;
		} else {
			log.logging("info", "Date Descending sorting is incorrect");
			log.logging("info", "Actual Data  : " + actualList);
			log.logging("info", "Expected Data: " + expectedList);
		}
		softAssert.assertAll();
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the paginated date descending
	 *         order sorting
	 * @throws InterruptedException
	 */
	public boolean verifyDateSortingDescending(By dateHeader, By dateColumn) throws InterruptedException {
		webDB.navigateToRefresh();
		Thread.sleep(15000);
		flag = webDB.waitForElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
		if (flag) {
			String totalTest = webDB.getTextFromElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
			String lastNumber = getLastNumber(totalTest);
			log.logging("info", "The total records count is " + lastNumber);
			int totalrecordscount = Integer.parseInt(lastNumber);
			if (totalrecordscount > 20) {
				log.logging("info", "Pagination is available as total records count is greater than 20.");
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTER, ElementType.Xpath);
				Thread.sleep(1500);
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_500, ElementType.Xpath);
				Thread.sleep(9000);

				webDB.getDriver().findElement(dateHeader).click();
				Thread.sleep(4000); // Allow table to reload

				boolean result = verifyPaginatedDateDescending(dateColumn, CommonFunctionsLocators.nextBtn);

				Assert.assertTrue(result, "Date column is NOT sorted in DESCENDING order");
			}
			else
			{
				webDB.getDriver().findElement(dateHeader).click();
				Thread.sleep(4000);
				List<String> actualList = getPaginatedStringColumn(dateColumn, CommonFunctionsLocators.nextBtn);
				List<String> expectedList = new ArrayList<>(actualList);

				// Descending Date Sort
				expectedList.sort((d1, d2) -> compareDatesAsc(d2, d1));

				softAssert.assertEquals(actualList, expectedList);

				if (actualList.equals(expectedList)) {
					log.logging("info", "Date Descending sorting is correct");
					flag = true;
				} else {
					log.logging("info", "Date Descending sorting is incorrect");
					log.logging("info", "Actual Data  : " + actualList);
					log.logging("info", "Expected Data: " + expectedList);
				}
				flag = true;
			}
		
		}
		return flag;
	}

	// Ascending Date Sort
	/**
	 * @author sonam
	 * @return flag This method is used to verify the paginated date descending
	 *         order sorting
	 * @throws InterruptedException
	 */
	public boolean verifyDateSortingAscending(By dateHeader, By dateColumn) throws InterruptedException {

		webDB.clickAnElementWithoutException("//button[@aria-label='First Page']", ElementType.Xpath);
		Thread.sleep(8000);

		webDB.getDriver().findElement(dateHeader).click();
		Thread.sleep(4000);

		boolean result = verifyPaginatedDateAscending(dateColumn, CommonFunctionsLocators.nextBtn);

		Assert.assertTrue(result, "Date column is NOT sorted in ASCENDING order");
		return flag;
	}

	/**
	 * @author sonam
	 * @return flag This method is used to verify the input field filter
	 *         functionality
	 * @throws InterruptedException
	 */
	public boolean applyTextFilter(String columndata, String getactualtext, ElementType getactualtextelementtype,
			String inputfield, ElementType inputfieldelementtype) throws InterruptedException {

		int datacount = webDB.getDriver().findElements(By.xpath(columndata)).size(); // Pass column data xpath which
																						// need to search
		if (datacount >= 1) {
			String value = webDB.getTextFromElement(getactualtext, getactualtextelementtype); // Take the input data
																								// which needs to be
																								// searched from data
																								// displayed
			webDB.clearTextField(inputfield, inputfieldelementtype); // clear input field xpath
			webDB.sendTextToAnElement(inputfield, value, inputfieldelementtype); // Pass input field xpath data
			log.logging("info", "Entered value in input field is: " + value);
			clickViewResult();
			int resultdatacount = webDB.getDriver().findElements(By.xpath(getactualtext)).size(); // Check for the
																									// result data is
																									// present or not
			if (resultdatacount >= 1) {
				String actualValue = webDB.getTextFromElement(getactualtext, getactualtextelementtype); // Get the data
																										// from results
				if (value.equalsIgnoreCase(actualValue)) {
					log.logging("info", "The search result is as expected i.e. " + actualValue);
					flag = true;
				} else {
					log.logging("info", "The search result is as not expected i.e. the actual value displayed is "
							+ actualValue + " and the expected is " + value);
					flag = false;
				}
			} else {
				log.logging("info", "No results found message displayed");
				flag = false;
			}
		}
		return flag;

	}

	/**
	 * @author sonam
	 * @return flag This method is used to click on view result button
	 * @throws InterruptedException
	 */
	public void clickViewResult() throws InterruptedException {
		webDB.getDriver().findElement(By.xpath("//*[@id='view_result_button']")).click();
		Thread.sleep(4000);
	}

}
