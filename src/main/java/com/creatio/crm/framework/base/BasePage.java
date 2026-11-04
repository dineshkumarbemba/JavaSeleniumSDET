package com.creatio.crm.framework.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.creatio.crm.framework.utilities.PropUtil;

public class BasePage {
private static WebDriver driver;
Properties prop=PropUtil.getDataFromPropertiesFile("Config.properties");

//common method to launch browser
@BeforeMethod(alwaysRun=true)
public void setupBrowser() {
	String browserName=prop.getProperty("Browser");
	if(browserName.equalsIgnoreCase("chrome")){
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();	
	}
	else {
		Assert.fail("Please pass right browser");
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}

//common method to close browser session
@AfterMethod(alwaysRun=true)
public void tearDown() {
	if(driver!=null) {
		driver.quit();
	}
}
//Common method to share browser session details to all other classes
public static WebDriver getDriver() {
	return driver;
}
//common method to update browser session details from other classess
public static void setDriver(WebDriver driverref) {
	driver=driverref;
	
}
}
