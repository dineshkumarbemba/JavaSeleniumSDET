package selenium.basics;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebAction1 {
	public static WebDriver driver;
	public static void dataAccessMode(String mode) {
		WebElement dataAccessMode=driver.findElement(By.xpath("//input[@value='"+mode+"']"));
		dataAccessMode.click();
	}
	public static void columnHeader(int row,int column) {
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				WebElement columnHeader=driver.findElement(By.xpath("//span[contains(text(),'Bookstore services:')]/following::table[1]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(columnHeader.getText()+" ");
			}
			System.out.println();
		}
	}

	public static void main(String []args) {
		//	Assignment - 1
		//	============
		//	1. Launch the Chrome browser window
		driver= new ChromeDriver();
		//	2. Maximize the browser window
		driver.manage().window().maximize();
		//	3. Delete all the cookies
		driver.manage().deleteAllCookies();
		//	4. Enter URL "https://parabank.parasoft.com/parabank&quot; and Launch the application
		driver.get("https://parabank.parasoft.com/");
		//	5. Verify application title
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		String actualTitle="ParaBank | Welcome | Online Banking";
		Assert.assertEquals(title, actualTitle,"FAILED:Title is not matching!");
		//	6. Verify application logo
		WebElement logo = driver.findElement(By.cssSelector("img.logo"));
		Assert.assertTrue(logo.isDisplayed(),"FAILED:Logo is not visible");
		//	7. Verify application caption " Experience the difference"
		WebElement caption=driver.findElement(By.xpath("//p[contains(text(),'Experience')]"));
		String captionText = caption.getText();
		String expectedCaptionText="Experience the difference";
		Assert.assertEquals(captionText, expectedCaptionText,"FAILED:Caption Text is not matched!.");

		//	8. Enter Invalid credentials in Username (Invalid User) and Password (Empty) textboxes
		WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passWord=driver.findElement(By.xpath("//input[@name='password']"));
		userName.clear();
		passWord.clear();
		userName.sendKeys("HELO");
		passWord.sendKeys("HI");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//	9. Click on Login Button
		WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
		//loginButton.click();
		//	10. Verify error message is displayed (The username and password could not be verified.)

		//WebElement errorMessage=driver.findElement(By.xpath("//p[@class='error']"));
		//String errorMessageText = errorMessage.getText();
		String actualErrorMessageText="The username and password could not be verified.";
		WebDriverWait waits= new WebDriverWait(driver,Duration.ofSeconds(20));
		//waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error']")));
		//Assert.assertEquals(errorMessageText, actualErrorMessageText,"FAILED:Error message is not matched!.");			
		//	11. Click on Adminpage link
		WebElement adminPageLink = driver.findElement(By.xpath("//a[contains(text(),'Admin Page')]"));
		adminPageLink.click();
		//	12. Wait for admin page
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Administration')]")));		
		//	13. Select Data access mode as ' SOAP'
		dataAccessMode("soap");

		//	14. Scrolldown till Loan provider
		WebElement loanProvider=driver.findElement(By.xpath("//select[@id='loanProvider']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", loanProvider);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='loanProvider']")));


		//	15. Select Loanprovider as 'Web Service'
		Select select= new Select(loanProvider);
		select.selectByVisibleText("Web Service");
		//	16. Click on Submit button
		WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']"));
		js.executeScript("arguments[0].scrollIntoView(true)", submit);
		submit.click();
		//	17.wait for Successful submission message
		WebElement successMessage=driver.findElement(By.xpath("//b[contains(text(),'Settings saved successfully.')]"));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[contains(text(),'Settings saved successfully.')]"), 0));
		String successMessageText = successMessage.getText();
		String actualSuccessMessage="Settings saved successfully.";
		Assert.assertEquals(successMessageText, actualSuccessMessage,"FAILED:Success message is not matched!.");
		//	18.Click on Services Link
		WebElement services=driver.findElement(By.xpath("//ul[@class='leftmenu']/child::li[3]/a[contains(text(),'Services')]"));
		
		services.click();
		//	19.Wait for Services page
		WebElement servicesPage=driver.findElement(By.xpath("//span[contains(text(),'Available Bookstore SOAP services:')]"));
		
		wait.until(ExpectedConditions.visibilityOf(servicesPage));
		//	20.Scrolldown till Bookstore services
		WebElement bookStoreService = driver.findElement(By.xpath("//span[contains(text(),'Bookstore services:')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//span[contains(text(),'Bookstore services:')]")));
		
		//	21.Get total rows, columns in the bookstore service table
		List<WebElement> rowCount=driver.findElements(By.xpath("//span[contains(text(),'Bookstore services:')]/following::table[1]/tbody/tr"));
		System.out.println(rowCount.size());
		List<WebElement> columnCount = driver.findElements(By.xpath("//span[contains(text(),'Bookstore services:')]/following::table[1]/tbody/tr[1]/td"));
		System.out.println(columnCount.size()); 
		//	22.Get Column headers of book store services table
		columnHeader(rowCount.size(),columnCount.size());   
		//	23.Get all the data from book store service table
		//	24.Close browser window
		driver.quit();
	}

}
