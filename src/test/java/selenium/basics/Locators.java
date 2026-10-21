package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Locators {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	WebElement paraBankLogo = driver.findElement(By.xpath("//img[@title='ParaBank']"));
	WebElement logoText = driver.findElement(By.xpath("//p[text()='Experience the difference']"));
	String text = logoText.getText();
	System.out.println(text);
	
	Actions action = new Actions(driver);
	action.doubleClick(logoText).perform();
	action.moveToElement(logoText).perform();
	action.contextClick(logoText).perform();
	action.dragAndDrop(paraBankLogo, logoText).perform();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",logoText);
	logoText.click();
	
	Select select = new Select(logoText);
	select.selectByVisibleText("VisibleTest");
	select.selectByValue("SelectbyValue");
	select.selectByIndex(1);
	List<WebElement> options = select.getOptions();
	for(WebElement a:options) {
		System.out.println(a.getText());		
	}
	
	WebElement upload = driver.findElement(By.xpath("Upload"));
	upload.sendKeys("C:\\Users\\admin\\Pictures");
	
}
}
