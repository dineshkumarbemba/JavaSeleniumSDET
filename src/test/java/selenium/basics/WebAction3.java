package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAction3 {
	
	public static void main(String[]args) {
//	Assignment-3
//	===========
//
//	1.Launch Chrome Browser 
		WebDriver driver=new ChromeDriver();
		
//	2.Maximize the browser window  
		driver.manage().window().maximize();
//	3.Launch the application  ( https://demoqa.com/alerts ) 
		driver.get(" https://demoqa.com/alerts");
//	4.Locate Alert buttons
		WebElement infoAlert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement infoAlertTimeDelay=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		WebElement confirmAlert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		WebElement promptAlert =driver.findElement(By.xpath("//button[@id='promtButton']"));
		
//	5.Launch Information alert   
		infoAlertTimeDelay.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
//	6.Print Alert message        
		String infoAlertText = alert.getText();
		System.out.println(infoAlertText);
//	7.Click on OK button     
		alert.accept();
//	8.Launch confirmation alert
		confirmAlert.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert1=driver.switchTo().alert();
//	9.Print Alert me1ssage   
		String confirmAlertText = alert1.getText();
		System.out.println(confirmAlertText);
//	10.Click on Cancel button    
		alert1.dismiss();
//	11.Launch prompt alert with dialog box alert
		promptAlert.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert2=driver.switchTo().alert();
		
//	12.Print message
		String promptAlertText = alert2.getText();
		System.out.println(promptAlertText);
//	13.Enter Text in Alert 
		alert2.sendKeys("HEY ALERT HOW ARE YOU!.");
//	14.Click on OK button
		alert2.accept();
//	15.Close browser window
}
}
