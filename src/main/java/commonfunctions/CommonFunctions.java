package commonfunctions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
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


public class CommonFunctions 
{
	
	WebDriverBase webDB = new WebDriverBase();
	static ReportLoger log = new ReportLoger();
	boolean flag;
	public String actlink = new String();
	public String acttext = new String();
	public String expectedtext_link = new String();
	Faker faker = new Faker();
	WebDriverWait wait = new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(15));
	SoftAssert softAssert = new SoftAssert();
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on main page link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnMainPage (String profilename, ElementType elementtype, String mainpage, ElementType elementtype1, String internalpage, ElementType elementtype2) throws InterruptedException
	{
		flag = webDB.isElementDisplayed(profilename, elementtype);
		if(flag)
		{
			webDB.javaScriptClickAnElement(mainpage, elementtype1);
			Thread.sleep(9000);
			flag = webDB.isElementDisplayed(internalpage, elementtype2);
			log.logging("info", "Listing page is displayed");
		}
		
		return flag;
	}
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on internal page link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnInternalPage (String internalpagename, ElementType elementtype, String internalpageheading, ElementType elementtype1) throws InterruptedException
	{
		flag = webDB.isElementDisplayed(internalpagename, elementtype);
		if(flag)
		{
			webDB.javaScriptClickAnElement(internalpagename, elementtype);
			Thread.sleep(10000);
			flag = webDB.isElementDisplayed(internalpageheading, elementtype1);
		}
		
		return flag;
	}
	
	
	/**
	 * @author 
	 * @return flag
	 * This method is used to click on BOL link from left navigation
	 * @throws InterruptedException
	 */
	public boolean clickOnBOLSPage () throws InterruptedException
	{
		flag = webDB.isElementDisplayed(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
		if(flag)
		{
			webDB.javaScriptClickAnElement(CommonFunctionsLocators.BOLS_PAGE, ElementType.Xpath);
			Thread.sleep(9000);
			flag = webDB.isElementDisplayed(BOLPageLocators.BOLPAGE_HEADING, ElementType.Xpath);
			log.logging("info", "BOL listing page is displayed");
		}
		
		return flag;
	}
	
	
	public static String getLastNumber(String input) 
	{
        // Split the string by spaces
        String[] parts = input.split(" ");
        // The last number is in the last part after "of"
        return parts[parts.length - 1];
    }

	/**
	 * @author 
	 * @return flag
	 * This method is used to verify the pagination functionality
	 * @throws InterruptedException
	 */
	public boolean verifyPagination() throws InterruptedException
	{
		flag = webDB.waitForElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
		if(flag)
		{
			int count =0;
			String totalTest = webDB.getTextFromElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
			String lastNumber = getLastNumber(totalTest);
			log.logging("info", "The total records count is "+lastNumber);
			int totalrecordscount = Integer.parseInt(lastNumber);
			if(totalrecordscount>20)
			{
				log.logging("info", "Pagination is available as total records count is greater than 500.");
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTER, ElementType.Xpath);
				Thread.sleep(1500);
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_500, ElementType.Xpath);
				Thread.sleep(6000);
				
				int actualpagination = totalrecordscount / 500;
				int remainder = totalrecordscount % 500;
				if(remainder>=1)
				{
					actualpagination++;
					log.logging("info", "The actual pagination count is "+actualpagination);
				}
				
				try {
					int allpages = webDB.getDriver().findElements(By.xpath(CommonFunctionsLocators.NEXTBUTTON)).size();
					int recordsonpage1 = 0;
					
					for(int j = 0; allpages>0; j++)
					{
						webDB.scrollBottom();
						Thread.sleep(750);
						int recordsonparticularpage = webDB.getDriver().findElements(By.xpath(CommonFunctionsLocators.TOTALRECORDSCOUNT)).size();
						recordsonpage1 = recordsonpage1 + recordsonparticularpage;
						log.logging("info", "The records are "+recordsonpage1);
						webDB.clickAnElement(CommonFunctionsLocators.NEXTBUTTON, ElementType.Xpath);
						System.out.println("Clicked on next button as its enabled");
						Thread.sleep(3000);
						count++;
						boolean nextbutton = webDB.isElementEnabled(CommonFunctionsLocators.NEXTBUTTON, ElementType.Xpath);
						if(nextbutton==true)
						{
							log.logging("info", "Next button is enabled");
						}
						else
						{
							log.logging("info", "Next button is in disabled state");
							break;
						}
					}
					int recordsonparticularpage1 = webDB.getDriver().findElements(By.xpath(CommonFunctionsLocators.TOTALRECORDSCOUNT)).size();
					int recordsonpage= recordsonpage1+recordsonparticularpage1;
					if(recordsonpage==totalrecordscount)
					{
						log.logging("info", "Total records on page are same i.e. "+recordsonpage);
						flag = true;
					}
					else
					{
						log.logging("info", "Total records on page are different i.e. "+recordsonpage);
						flag = false;
					}
					
					}
					catch(Exception e)
					{
						
					}
				
				count = count+1;
				log.logging("info", "The total pagination count is "+count);
				if(actualpagination == count ==true)	
				{
					log.logging("info", "The Actual and expected pagination count is same i.e. "+count);
					System.out.println(" ");
					flag = true;
				}
				
				else
					{
					log.logging("info", "The Actual and expected pagination count is Different i.e. "+count);
					System.out.println(" ");
						flag = false;
					}
					
				count =0;
				}
				
			else
			{
				log.logging("info", "No pagination is available as total records count is less than 500.");
			}
				}
				else
				{
					log.logging("info", "The pagination is not present on webpage");
				}
		

		return flag;
}
	
//	================= Sorting ==================================================
	
	public List<String> getPaginatedStringColumn(By columnLocator, By nextBtn)
	        throws InterruptedException {

		List<String> fullList = new ArrayList<>();
		boolean hasNext = true;
		fullList.clear(); 
	    while (hasNext) {

	        List<WebElement> elements =
	                webDB.getDriver().findElements(columnLocator);

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
	            Thread.sleep(8000);   // wait for next page data to load

	        } else {
	            hasNext = false;
	        }
	    }
	    return fullList;
	}

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
	                result = Integer.compare(
	                        Integer.parseInt(p2),
	                        Integer.parseInt(p1)
	                );
	            } else {
	                // DESC string compare (case-insensitive)
	                result = p2.compareToIgnoreCase(p1);
	            }

	            if (result != 0) return result;
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

	public boolean verifyPaginatedStringAscending(By column, By nextBtn)
	        throws InterruptedException {

	    List<String> actualList =
	            getPaginatedStringColumn(column, nextBtn);

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
	                result = Integer.compare(
	                        Integer.parseInt(p1),
	                        Integer.parseInt(p2)
	                );
	            } else {
	                // String compare (case-insensitive)
	                result = p1.compareToIgnoreCase(p2);
	            }

	            if (result != 0) return result;
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


//	public boolean verifyPaginatedStringDescending(By column, By nextBtn) throws InterruptedException {
//
//	    List<String> actualList = getPaginatedStringColumn(column, nextBtn);
//
//	    List<String> expectedList = new ArrayList<>(actualList);
//	    Collections.sort(expectedList, Collections.reverseOrder());
//	    
//	    softAssert.assertEquals(actualList, expectedList);
////	    Assert.assertEquals(actualList, expectedList, "Column NOT sorted in DESC order");
//	    if(actualList.equals(expectedList))
//	    {
//	    	log.logging("info", "The Descending order sorting is correct");
//	    	flag = true;
//	    }
//	    else
//	    {
//	    	log.logging("info", "The Descending order sorting is incorrect");
//	    	log.logging("info", "The actual data is "+actualList);
//	    	log.logging("info", "The expected data is "+expectedList);
//	    	flag = false;
//	    }
//	    softAssert.assertAll();
//	    return flag;
//	}

//	public boolean verifyPaginatedStringAscending(By column, By nextBtn) throws InterruptedException {
//
//	    List<String> actualList =
//	    		getPaginatedStringColumn(column, nextBtn);
//
//	    List<String> expectedList = new ArrayList<>(actualList);
//	    Collections.sort(expectedList);
//
//	    softAssert.assertEquals(actualList, expectedList);
////	    Assert.assertEquals(actualList, expectedList,  "Column NOT sorted in ASC order");
//	    if(actualList.equals(expectedList))
//	    {
//	    	log.logging("info", "The Ascending order sorting is correct");
//	    	flag = true;
//	    }
//	    else
//	    {
//	    	log.logging("info", "The Ascending order sorting is incorrect");
//	    	log.logging("info", "The actual data is "+actualList);
//	    	log.logging("info", "The expected data is "+expectedList);
//	    	flag = false;
//	    }
//	    softAssert.assertAll();
//	    return flag;
//	}


	
	
	
	public void validatePaginatedStringDecendingSorting(String ColumnHeader, ElementType elementtypecolumnheader, By ColumnHeader1, String columndata, ElementType elementtypecolumndata, By columndata1) throws InterruptedException 
	{
		webDB.navigateToRefresh();
		Thread.sleep(4000);
		
		flag = webDB.waitForElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
		if(flag)
		{
			String totalTest = webDB.getTextFromElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
			String lastNumber = getLastNumber(totalTest);
			log.logging("info", "The total records count is "+lastNumber);
			int totalrecordscount = Integer.parseInt(lastNumber);
			if(totalrecordscount>20)
			{
				log.logging("info", "Pagination is available as total records count is greater than 20.");
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTER, ElementType.Xpath);
				Thread.sleep(1500);
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_500, ElementType.Xpath);
				Thread.sleep(2000);
				new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath(ColumnHeader)));
				
//				webDB.waitForClickElement(ColumnHeader, elementtypecolumnheader);
			    webDB.getDriver().findElement(ColumnHeader1).click();
			    
			    Thread.sleep(8000);   // allow table to reload
//			    new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ColumnHeader)));
				
//			    webDB.waitForClickElement(columndata, elementtypecolumndata);
			    
			    verifyPaginatedStringDescending(columndata1, CommonFunctionsLocators.nextBtn);
			}
		}
	}
	
	public void validatePaginatedStringAscendingSorting(String ColumnHeader, ElementType elementtypecolumnheader, By ColumnHeader1, String columndata, ElementType elementtypecolumndata, By columndata1) throws InterruptedException 
	{
		    // Get back to Page 1
//		WebDriverWait wait = new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(20));
		new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='First Page']")));
		webDB.clickAnElementWithoutException("//button[@aria-label='First Page']", ElementType.Xpath);
		Thread.sleep(2000);
//			    flag = webDB.isElementEnabled("//button[@aria-label='First Page']", ElementType.Xpath);
//			    if(flag)
//			    {
//			    	webDB.clickAnElement("//button[@aria-label='First Page']", ElementType.Xpath);
//				    Thread.sleep(8000);
//			    }
//			    else
//			    {
//			    	log.logging("info", "First page is not displayed");
//			    }
		new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath(ColumnHeader)));
		
			    // Ascending order
			    webDB.getDriver().findElement(ColumnHeader1).click();
			    Thread.sleep(8000);   // allow table to reload
//			    new WebDriverWait(webDB.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(columndata)));
				
			    webDB.waitForClickElement(columndata, elementtypecolumndata);
			    
			    verifyPaginatedStringAscending(columndata1, CommonFunctionsLocators.nextBtn);
	}
	
//	===================================================== Date Sorting ===================================================
	
	private int compareDatesAsc(String d1, String d2) {

	    if (d1 == null || d1.isBlank()) return 1;
	    if (d2 == null || d2.isBlank()) return -1;

	    DateTimeFormatter formatter =
	            DateTimeFormatter.ofPattern("MM/dd/yyyy");

	    LocalDate date1 = LocalDate.parse(d1, formatter);
	    LocalDate date2 = LocalDate.parse(d2, formatter);

	    return date1.compareTo(date2);
	}
	
	public boolean verifyPaginatedDateAscending(By dateColumn, By nextBtn)
	        throws InterruptedException {

	    softAssert = new SoftAssert();   // Reset for each 
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

	public boolean verifyPaginatedDateDescending(By dateColumn, By nextBtn)
	        throws InterruptedException {

	    softAssert = new SoftAssert();   // Reset
	    flag = false;

	    List<String> actualList =
	    		getPaginatedStringColumn(dateColumn, nextBtn);

	    List<String> expectedList =
	            new ArrayList<>(actualList);

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

	public void verifyDateSortingDescending(By dateHeader, By dateColumn) throws InterruptedException 
	{
		webDB.navigateToRefresh();
		Thread.sleep(4000);
		flag = webDB.waitForElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
		if(flag)
		{
			String totalTest = webDB.getTextFromElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
			String lastNumber = getLastNumber(totalTest);
			log.logging("info", "The total records count is "+lastNumber);
			int totalrecordscount = Integer.parseInt(lastNumber);
			if(totalrecordscount>20)
			{
				log.logging("info", "Pagination is available as total records count is greater than 20.");
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTER, ElementType.Xpath);
				Thread.sleep(1500);
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_500, ElementType.Xpath);
				Thread.sleep(8000);
				
				webDB.getDriver().findElement(dateHeader).click();
				Thread.sleep(4000);   // Allow table to reload
				
				boolean result = verifyPaginatedDateDescending(dateColumn, CommonFunctionsLocators.nextBtn);
				
				Assert.assertTrue(result, "Date column is NOT sorted in DESCENDING order");
			}
		}
    }

    // Ascending Date Sort
   
    public void verifyDateSortingAscending(By dateHeader, By dateColumn) throws InterruptedException 
    {

    	webDB.clickAnElementWithoutException("//button[@aria-label='First Page']", ElementType.Xpath);
    	Thread.sleep(8000);
//    	 flag = webDB.isElementEnabled("//button[@aria-label='First Page']", ElementType.Xpath);
//		    if(flag)
//		    {
//		    	webDB.clickAnElement("//button[@aria-label='First Page']", ElementType.Xpath);
//			    Thread.sleep(8000);
//		    }
		    
        webDB.getDriver().findElement(dateHeader).click();
        Thread.sleep(4000);

        boolean result = verifyPaginatedDateAscending(dateColumn, CommonFunctionsLocators.nextBtn);

        Assert.assertTrue(result,
                "Date column is NOT sorted in ASCENDING order");
    }
	
    

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	=================================================================================================
			
	public List<Integer> getPaginatedNumericColumn(By columnLocator, By nextBtn)
	        throws InterruptedException {

		List<Integer> fullList = new ArrayList<>();
		boolean hasNext = true;

	    while (hasNext) {

	        List<WebElement> elements =
	                webDB.getDriver().findElements(columnLocator);

	        if (elements.isEmpty()) {
	            throw new RuntimeException("❌ No records found in column!");
	        }

	        for (WebElement el : elements) {
	            String value = el.getText().trim();
	            fullList.add(Integer.parseInt(value));
	        }

	        WebElement next = webDB.getDriver().findElement(nextBtn);

	        if (next.isEnabled()) {

	            next.click();
	            Thread.sleep(8000);   // wait for next page data to load

	        } else {
	            hasNext = false;
	        }

	    }
	    return fullList;
	}

	

	public boolean verifyPaginatedNumericAscending(By column, By nextBtn) throws InterruptedException {

	    List<Integer> actualList =
	    		getPaginatedNumericColumn(column, nextBtn);

	    List<Integer> expectedList = new ArrayList<>(actualList);
	    Collections.sort(expectedList);

	    softAssert.assertEquals(actualList, expectedList);
//	    Assert.assertEquals(actualList, expectedList,  "Column NOT sorted in ASC order");
	    if(actualList.equals(expectedList))
	    {
	    	log.logging("info", "The Ascending order sorting is correct");
	    	flag = true;
	    }
	    else
	    {
	    	log.logging("info", "The Ascending order sorting is incorrect");
	    	log.logging("info", "The actual data is "+actualList);
	    	log.logging("info", "The expected data is "+expectedList);
	    	flag = false;
	    }
	    softAssert.assertAll();
	    return flag;
	}


	
	public boolean verifyPaginatedNumericDescending(By column, By nextBtn) throws InterruptedException {

	    List<Integer> actualList =
	            getPaginatedNumericColumn(column, nextBtn);

	    List<Integer> expectedList = new ArrayList<>(actualList);
	    Collections.sort(expectedList, Collections.reverseOrder());

	    softAssert.assertEquals(actualList, expectedList);
//	    Assert.assertEquals(actualList, expectedList, "Column NOT sorted in DESC order");
	    if(actualList.equals(expectedList))
	    {
	    	log.logging("info", "The Descending order sorting is correct");
	    	flag = true;
	    }
	    else
	    {
	    	log.logging("info", "The Descending order sorting is incorrect");
	    	log.logging("info", "The actual data is "+actualList);
	    	log.logging("info", "The expected data is "+expectedList);
	    	flag = false;
	    }
	    softAssert.assertAll();
	    return flag;
	}
	
	public void validatePaginatedNumericDecendingSorting(String ColumnHeader, ElementType elementtypecolumnheader, By ColumnHeader1, String columndata, ElementType elementtypecolumndata, By columndata1) throws InterruptedException 
	{
		webDB.navigateToRefresh();
		Thread.sleep(4000);
		flag = webDB.waitForElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
		if(flag)
		{
			String totalTest = webDB.getTextFromElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
			String lastNumber = getLastNumber(totalTest);
			log.logging("info", "The total records count is "+lastNumber);
			int totalrecordscount = Integer.parseInt(lastNumber);
			if(totalrecordscount>20)
			{
				log.logging("info", "Pagination is available as total records count is greater than 20.");
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTER, ElementType.Xpath);
				Thread.sleep(1500);
				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_1000, ElementType.Xpath);
				Thread.sleep(8000);
				
				webDB.waitForClickElement(ColumnHeader, elementtypecolumnheader);
			    webDB.getDriver().findElement(ColumnHeader1).click();
			    Thread.sleep(5000);   // allow table to reload
			    webDB.waitForClickElement(columndata, elementtypecolumndata);
			    
			    verifyPaginatedNumericDescending(columndata1, CommonFunctionsLocators.nextBtn);
			}
		}
	}
	
	public void validatePaginatedNumericAscendingSorting(String ColumnHeader, ElementType elementtypecolumnheader, By ColumnHeader1, String columndata, ElementType elementtypecolumndata, By columndata1) throws InterruptedException 
	{
		    // Get back to Page 1
			    flag = webDB.isElementEnabled("//button[@aria-label='First Page']", ElementType.Xpath);
			    if(flag)
			    {
			    	webDB.clickAnElement("//button[@aria-label='First Page']", ElementType.Xpath);
				    Thread.sleep(4000);
			    }
	   
			    // Ascending order
			    webDB.getDriver().findElement(ColumnHeader1).click();
			    Thread.sleep(5000);   // allow table to reload
			    webDB.waitForClickElement(columndata, elementtypecolumndata);
			    
			    verifyPaginatedNumericAscending(columndata1, CommonFunctionsLocators.nextBtn);
	}
	
	
//============================================================================================= 
//	Filter Functionality
	public boolean applyTextFilter(String columndata, String getactualtext, ElementType getactualtextelementtype, String inputfield, ElementType inputfieldelementtype) throws InterruptedException 
	{

		int datacount = webDB.getDriver().findElements(By.xpath(columndata)).size(); // Pass column data xpath which need to search
		if(datacount>=1)
		{
			String value = webDB.getTextFromElement(getactualtext, getactualtextelementtype); // Take the input data which needs to be searched from data displayed
			webDB.clearTextField(inputfield, inputfieldelementtype); // clear input field xpath
			webDB.sendTextToAnElement(inputfield, value, inputfieldelementtype); // Pass input field xpath data
			log.logging("info", "Entered value in input field is: "+value);
			clickViewResult();
			int resultdatacount = webDB.getDriver().findElements(By.xpath(getactualtext)).size(); // Check for the result data is present or not
			if(resultdatacount>=1)
			{
				String actualValue = webDB.getTextFromElement(getactualtext, getactualtextelementtype); // Get the data from results
				if(value.equalsIgnoreCase(actualValue))
				{
					log.logging("info", "The search result is as expected i.e. "+actualValue);
					flag = true;
				}
				else
				{
					log.logging("info", "The search result is as not expected i.e. the actual value displayed is "+actualValue+ " and the expected is "+value);
					flag = false;
				}
			}
			else
			{
				log.logging("info", "No results found message displayed");
				flag = false;
			}
			}
		return flag;
	   
	}
	
//	public boolean applyTextFilter(String columndata, String getactualtext, ElementType getactualtextelementtype, String inputfield, ElementType inputfieldelementtype,  ) throws InterruptedException 
//	{
//
//		int datacount = webDB.getDriver().findElements(By.xpath("//table/tbody/tr/td[2]")).size(); // Pass column data which need to search
//		if(datacount>=1)
//		{
//			String value = webDB.getTextFromElement("(//table/tbody/tr/td[2])[1]", ElementType.Xpath); // Take the input data which needs to be searched from data displayed
////			WebElement element = webDB.getDriver().findElement(By.xpath("//*[@id='lading-bill-filter-input']")); // Pass input field xpath
//			webDB.clearTextField(inputfield, inputfieldelementtype); // clear input field xpath
//			webDB.sendTextToAnElement(inputfield, value, inputfieldelementtype); // Pass input field xpath data
////		    element.clear();
////		    element.sendKeys(value);
//			log.logging("info", "Entered value in input field is: "+value);
//			clickViewResult();
//			
//			int resultdatacount = webDB.getDriver().findElements(By.xpath("(//table/tbody/tr/td[2])[1]")).size(); // Check for the result data is present or not
//			if(resultdatacount>=1)
//			{
//				String actualValue = webDB.getTextFromElement("(//table/tbody/tr/td[2])[1]", ElementType.Xpath); // Get the data from results
//				if(value.equalsIgnoreCase(actualValue))
//				{
//					log.logging("info", "The search result is as expected i.e. "+actualValue);
//					flag = true;
//				}
//				else
//				{
//					log.logging("info", "The search result is as not expected i.e. the actual value displayed is "+actualValue+ " and the expected is "+value);
//					flag = false;
//				}
//			}
//			else
//			{
//				log.logging("info", "No results found message displayed");
//				flag = false;
//			}
//			}
//		return flag;
//	   
//	}

	
	

	public void clickViewResult() throws InterruptedException {
		webDB.getDriver().findElement(By.xpath("//*[@id='view_result_button']")).click();
		Thread.sleep(4000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	============================================================ ignore for now
	
//	public List<Integer> getPaginatedNumericColumn(By columnLocator, By nextBtn)
//	        throws InterruptedException {
//
//		List<Integer> fullList = new ArrayList<>();
//	    boolean hasNext = true;
//
//	    while (hasNext) {
//
//	        List<WebElement> elements =
//	                webDB.getDriver().findElements(columnLocator);
//
//	        if (elements.isEmpty()) {
//	            throw new RuntimeException("❌ No records found in column!");
//	        }
//
//	        for (WebElement el : elements) {
//	            String value = el.getText().trim();
//	            fullList.add(Integer.parseInt(value));
//	           
//	        }
//
//	        WebElement next = webDB.getDriver().findElement(nextBtn);
//
//	        if (next.isEnabled()) {
//
////	        	webDB.scrollToAnElement(CommonFunctionsLocators.NEXTBUTTON_PAGINATION, ElementType.Xpath);
////	        	Thread.sleep(1500);
//	        	
//	            next.click();
//	            Thread.sleep(8000);   // wait for next page data to load
//
//	        } else {
//	            hasNext = false;
//	        }
////	        for (String record : fullList) 
////	        {
////	            System.out.println(record);
////	        }
////	        System.out.println("Total Records = " + fullList.size());
//	    }
//	    return fullList;
//	}
//
//	
//
//	public void verifyPaginatedAscending(By column, By nextBtn) throws InterruptedException {
//
//	    List<Integer> actualList =
//	    		getPaginatedNumericColumn(column, nextBtn);
//
//	    List<Integer> expectedList = new ArrayList<>(actualList);
//	    Collections.sort(expectedList);
//
//	    Assert.assertEquals(actualList, expectedList,
//	            "❌ Column NOT sorted in ASC order");
//	}
//
//
//	
//	public void verifyPaginatedDescending(By column, By nextBtn) throws InterruptedException {
//
//	    List<Integer> actualList =
//	            getPaginatedNumericColumn(column, nextBtn);
//
//	    List<Integer> expectedList = new ArrayList<>(actualList);
//	    Collections.sort(expectedList, Collections.reverseOrder());
//
//	    Assert.assertEquals(actualList, expectedList,
//	            "❌ Column NOT sorted in DESC order");
//	}
//	
//	public void validatePaginatedNumericSorting() throws InterruptedException {
//
//		flag = webDB.waitForElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
//		if(flag)
//		{
//			
//			String totalTest = webDB.getTextFromElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
//			String lastNumber = getLastNumber(totalTest);
//			log.logging("info", "The total records count is "+lastNumber);
//			int totalrecordscount = Integer.parseInt(lastNumber);
//			if(totalrecordscount>20)
//			{
//				log.logging("info", "Pagination is available as total records count is greater than 20.");
//				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTER, ElementType.Xpath);
//				Thread.sleep(1500);
//				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_1000, ElementType.Xpath);
//				Thread.sleep(8000);
//				
//	    // Descending order
////				webDB.scrollToAnElement(CommonFunctionsLocators.BOLHEADER, ElementType.Xpath);
////				Thread.sleep(1500);
//				webDB.waitForClickElement(CommonFunctionsLocators.BOLHEADER, ElementType.Xpath);
//	    webDB.getDriver().findElement(CommonFunctionsLocators.bolHeader).click();
//	    Thread.sleep(2000);   // allow table to reload
//	    webDB.waitForClickElement(CommonFunctionsLocators.BOLCOLUMN, ElementType.Xpath);
//	    
//	    verifyPaginatedDescending(CommonFunctionsLocators.bolColumn, CommonFunctionsLocators.nextBtn);
////	    verifyPaginatedAscending(CommonFunctionsLocators.bolColumn, CommonFunctionsLocators.nextBtn);
//	    
//	    // Get back to Page 1
//
//
//	    // Ascending order
////	    webDB.scrollToAnElement(CommonFunctionsLocators.BOLHEADER, ElementType.Xpath);
////		Thread.sleep(1500);
//	    webDB.getDriver().findElement(CommonFunctionsLocators.bolHeader).click();
//	    Thread.sleep(2000);   // allow table to reload
//	    webDB.waitForClickElement(CommonFunctionsLocators.BOLCOLUMN, ElementType.Xpath);
//	    
//	    verifyPaginatedAscending(CommonFunctionsLocators.bolColumn,
//                CommonFunctionsLocators.nextBtn);
//
////	    verifyPaginatedDescending(CommonFunctionsLocators.bolColumn, CommonFunctionsLocators.nextBtn);
//	}
//		}
//	}
//
//	
//	
//	
//	
//	
//	
//		
//	
//	
////	public void validatePaginatedStringDecendingSorting(String ColumnHeader, ElementType elementtypecolumnheader, By ColumnHeader1, String columndata, ElementType elementtypecolumndata, By columndata1) throws InterruptedException 
////	{
////		webDB.navigateToRefresh();
////		Thread.sleep(4000);
////		flag = webDB.waitForElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
////		if(flag)
////		{
////			
////			String totalTest = webDB.getTextFromElement(CommonFunctionsLocators.SHOWINGRESULTBOTTOM, ElementType.Xpath);
////			String lastNumber = getLastNumber(totalTest);
////			log.logging("info", "The total records count is "+lastNumber);
////			int totalrecordscount = Integer.parseInt(lastNumber);
////			if(totalrecordscount>20)
////			{
////				log.logging("info", "Pagination is available as total records count is greater than 20.");
////				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTER, ElementType.Xpath);
////				Thread.sleep(1500);
////				webDB.clickAnElement(CommonFunctionsLocators.SHOWFILTERSELECTVALUE_1000, ElementType.Xpath);
////				Thread.sleep(8000);
////				
////				webDB.waitForClickElement(ColumnHeader, elementtypecolumnheader);
////			    webDB.getDriver().findElement(ColumnHeader1).click();
////			    Thread.sleep(2000);   // allow table to reload
////			    webDB.waitForClickElement(columndata, elementtypecolumndata);
////			    
////			    verifyPaginatedStringDescending(columndata1, CommonFunctionsLocators.nextBtn);
////			    
////			    // Get back to Page 1
////			    flag = webDB.isElementEnabled("//button[@aria-label='First Page']", ElementType.Xpath);
////			    if(flag)
////			    {
////			    	webDB.clickAnElement("//button[@aria-label='First Page']", ElementType.Xpath);
////				    Thread.sleep(4000);
////			    }
////	    
////
////			    // Ascending order
////			    webDB.getDriver().findElement(ColumnHeader1).click();
////			    Thread.sleep(2000);   // allow table to reload
////			    webDB.waitForClickElement(columndata, elementtypecolumndata);
////			    
////			    verifyPaginatedStringAscending(columndata1, CommonFunctionsLocators.nextBtn);
////			}
////		}
////	}
//
//	
//	
//	
	
	
	
	
	
	
	
	
}

	
