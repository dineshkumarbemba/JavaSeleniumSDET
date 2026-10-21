package selenium.basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
public static void main(String[]args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement windowHandleClick = driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
	//windowHandleClick.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", windowHandleClick);
	
	WebElement browserWindow=driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]"));
	browserWindow.click();
	WebElement newTab=driver.findElement(By.xpath("//button[contains(text(),'New Window Message')]"));
	newTab.click();
	String parentWindow = driver.getWindowHandle();
	Set<String> allWindows = driver.getWindowHandles();
	List<String>l=new ArrayList<String>(allWindows);
	String childWindow=l.get(1);
	driver.switchTo().window(childWindow);
	WebElement textFromWindow = driver.findElement(By.tagName("body"));
	String text = textFromWindow.getText();
	System.out.println(text);
	driver.close();
	driver.switchTo().window(parentWindow);
	

//	for(String childWindow:allWindows) {
//		if(!childWindow.equals(parentWindow)) {
//			driver.switchTo().window(childWindow);
//		}
//	}
	
	
	
}
}
