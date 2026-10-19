package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserActions {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--incognito");
	option.addArguments("--headless");
	WebDriver driver= new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().deleteAllCookies();
	System.out.println(driver.getCurrentUrl());
}
}
