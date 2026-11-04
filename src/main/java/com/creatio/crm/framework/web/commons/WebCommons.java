package com.creatio.crm.framework.web.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.creatio.crm.framework.base.BasePage;
import com.creatio.crm.framework.reports.Reports;
import com.creatio.crm.framework.utilities.PropUtil;

public class WebCommons {
	public WebDriver driver=BasePage.getDriver();
	Properties prop=PropUtil.readData("Config.properties");

	//common method to launch the application and verify the title of the application

	public void launchApplication() {
		driver.get(prop.getProperty("APP_URL"));
		String expectedTitle=prop.getProperty("APP_TITLE");
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)){
			System.out.println("Application launched successfully and title is verified:  "+actualTitle);
		}else {
			Assert.fail("Application title verification failed. Expected : "+expectedTitle+" but got: "+actualTitle);
		}
	}

	//common method to scroll to the element
	public void scrollToElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}

	//common method to click on the element
	public void click(WebElement element) {
		scrollToElement(element);
		element.click();
	}

	//common method to click hidden element
	public void jsclick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}

	//common method to double click element
	public void doubleClick(WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
	}
	//common method to right click element
	public void rightClick(WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	//common method to mousehover element
	public void mouseHover(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}

	//common method to enter text into the field

	public void enterText(WebElement element,String text) {
		scrollToElement(element);
		element.clear();
		element.sendKeys(text);
	}

	//common method to select checkbox
	public void selectCheckBox(WebElement element,boolean status) {
		scrollToElement(element);
		if(element.isSelected()!=status) {
			element.click();
		}
	}

	//common method to select optoin from dropdown

	public void selectDropdownOption(WebElement element,String selectBy,String option) {
		scrollToElement(element);
		Select select=new Select(element);
		switch(selectBy.toLowerCase()) {
		case "value":select.selectByValue(option);
		break;
		case "visibletext":select.selectByVisibleText(option);
		break;
		case "index":select.selectByIndex(Integer.parseInt(option));
		break;
		default:Assert.fail("Invalid selectby option");
		}
	}

	//common method to get the text of the element
	public String getElementText(WebElement element) {
		scrollToElement(element);
		return element.getText();

	}

	//common method to get the attribute of the element
	public String getElementAttribute(WebElement element,String attribute) {
		scrollToElement(element);
		return element.getAttribute(attribute);
	}

	//common method to get current url	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	//common method to refresh the page
	public void refreshPage() {
		driver.navigate().refresh();
	}
	//common method to check element is displayed

	public boolean isElementDisplayed(WebElement element) {
		try {
			scrollToElement(element);
			return element.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}

	//common method to verify element enabled

	public boolean isElementEnabled(WebElement element) {
		try {
			scrollToElement(element);
			return element.isEnabled();
		}catch(Exception e) {
			return false;
		}
	}
	//common method to wait by Java wait

	public void wait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//common method to wait for element
	public void waitForElement(WebElement element,int seconds) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));		
	}
	//common method to wait for element
	public void waitForElement(By locator,int seconds) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, 0));		
	}

	//common method to wait for element is disappeared
	public void waitForElementToDisappear(WebElement element,int seconds) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.invisibilityOf(element));		
	}

	// Common method to switch to frame by WebElement.
	public void switchToFrame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	// Common method to switch to frame by name or id.
	public void switchToFrame(String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}

	// Common method to switch back to the default content from the frame.
	public void switchToMainWindow() {
		driver.switchTo().defaultContent();
	}
	
//	Common method to capture the screenshot of entire browser window.
	public static String getWindowScreenshot(WebDriver driver, String screenshotName) {
		String filePath = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName + ".png";
		File file=new File(filePath);
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(screenshotFile, new File(filePath));
			FileUtils.copyFile(screenshotFile, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filePath;
	}
	
//	Common Method to Capture screenshot of web element.
	public static String getElementScreenshot(WebElement element, String screenshotName) throws IOException {
		String filePath = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName + ".png";
		File file=new File(filePath);
		try {
			File screenshotFile = element.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filePath;
	}
	
	// Common method to switch to the alert.
		public Alert getAlert() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			return driver.switchTo().alert();
		}
		
		// Common method to accept /dismiss the alert.
		public void handleAlert(boolean accept) {
			Alert alert = getAlert();
			if(accept) {
				alert.accept();
			} else {
				alert.dismiss();
			}
		}
		
		// Method to print the messages
		public static void log(String status, String message) {
			if (status.equalsIgnoreCase("pass")) {
				Reports.logger.pass(message);
			} else if (status.equalsIgnoreCase("fail")) {
				Reports.logger.fail(message);
			} else if (status.equalsIgnoreCase("info")) {
				Reports.logger.info(message);
			} else if (status.equalsIgnoreCase("warning")) {
				Reports.logger.warning(message);
			}
		}
		
		public void switchToWindow(WebElement element) {
			scrollToElement(element);
			element.click();
			String parentWindow=driver.getWindowHandle();
			Set<String>allWindow=driver.getWindowHandles();
			for(String childWindow:allWindow) {
				if(!childWindow.equals(parentWindow)) {
					driver.switchTo().window(childWindow);
				}
			}
			
			
		}
		
		public static String readTestData(String sheetName, int rowNo, int cellNo) throws IOException {
			String value = null;
			File f = new File(System.getProperty("user.dir") + "\\TestData\\" + "Adactin" + ".xlsx");
			FileInputStream fs = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fs);
			Sheet sheet = wb.getSheet(sheetName);

			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row row = sheet.getRow(rowNo);
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(cellNo);
					CellType cellType = cell.getCellType();
					switch (cellType) {
					case STRING:
						value = cell.getStringCellValue();
						// System.out.println(value);
						break;

					case NUMERIC:
						if (DateUtil.isCellDateFormatted(cell)) {
							SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
							value = dateformat.format(cell.getDateCellValue());
							// System.out.println(value);
						} else {
							double numericCellValue = cell.getNumericCellValue();
							long l = (long) numericCellValue;
							value = String.valueOf(numericCellValue);
							// System.out.println(value);
						}
						break;
					default:
						break;
					}

				}

			}
			return value;

		}
	}


