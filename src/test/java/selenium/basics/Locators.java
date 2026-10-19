package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
}
}
