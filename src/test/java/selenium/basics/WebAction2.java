package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAction2 {
	static WebDriver driver;
	public static void gender(String gender) {
		WebElement genderRadio=driver.findElement(By.xpath("//input[@value='"+gender+"']"));
		genderRadio.click();
	}
	public static void dob(String day,String month,String year) {
		//click dob to visible calender
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();

		//select month dropdown

		WebElement monthDrpDwn=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select select= new Select(monthDrpDwn);
		select.selectByVisibleText(month);

		//select year dropdown
		WebElement yearDrpDwn=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select select1= new Select(yearDrpDwn);
		select1.selectByVisibleText(year);

		//select date

		WebElement dateSelect= driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"') and text()='"+day+"']"));
		dateSelect.click();
	}
	public static void selectSubject(String... subject) {


		Actions action =new Actions(driver);
		for(String sub:subject) {
			WebElement subjects=driver.findElement(By.xpath("//input[@id='subjectsInput']"));
			//action.sendKeys(subjects,sub).perform();
			subjects.sendKeys(sub);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[contains(text(),'"+sub+"') and contains(@class,'subjects')]"), 0));
			WebElement subjectOption=driver.findElement(By.xpath("//div[contains(text(),'"+sub+"') and contains(@class,'subjects')]"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", subjectOption);
		}
	}

	public static void hobbiesSelection(String[] hobbies) {
		for(String hobby:hobbies) {
			WebElement hobbycheckbox= driver.findElement(By.xpath("//label[contains(text(),'"+hobby+"')]"));
			if(!hobbycheckbox.isSelected()) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", hobbycheckbox);
				//hobbycheckbox.click();
			}
		}
	}
	public static void main(String []args) {
		//	Assignment -2
		//	============
		//	1. Launch browser window
		driver = new ChromeDriver();
		//	2. Maximize the browser window
		driver.manage().window().maximize();
		//	3. Delete all the cookies
		driver.manage().deleteAllCookies();
		//	4. Enter URL and Launch the application(https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");
		//	5. Wait for Pageload
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Practice Form')]"), 0));


		//	6. Enter Firstname and Lastname
		WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Dinesh");
		WebElement lastName=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Kumar");
		//	7. Enter Email
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("test@emailme.com");
		//	8. Select Gender 'Male'
		gender("Male");
		//	9. Enter mobile number
		WebElement mobileNumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNumber.sendKeys("9876543210");
		//	10.Select DOB (14-Feb-1991)
		dob("27","July","1993");
		//	11.Search and Select Computer Science
		selectSubject("Computer Science","Maths");
		//	12.Select Hobbies as Sports and Reading
		String[] hobbies= {"Sports","Reading"};
		hobbiesSelection(hobbies);
		//	13.Upload any photo
		WebElement uploadPhoto=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", uploadPhoto);
		uploadPhoto.sendKeys(System.getProperty("user.dir")+"\\Files\\d.png");
		//	14.Submit Details
		WebElement submitButton=driver.findElement(By.xpath("//button[@id='submit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",submitButton);
		//	15.Wait for successful submission message
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[contains(text(),'Thanks for submitting the form')]"), 0));
		
		//	16. Close browser window
		driver.quit();
	}
}