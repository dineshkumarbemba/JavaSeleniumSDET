package com.creatio.crm.framework.base; // Make sure this package matches your file exactly

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.creatio.crm.framework.utilities.PropUtil;

public class BasePage {
    
    // ThreadLocal completely prevents the 'Session ID is null' error during execution
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    
    protected Properties prop = PropUtil.getDataFromPropertiesFile("Config.properties");

    // Common method to launch browser dynamically based on configuration selection
    @BeforeMethod(alwaysRun = true)
    public void setupBrowser(ITestContext context) {
        String browserName = prop.getProperty("Browser");
        WebDriver driver = null;

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.silentOutput", "true");
            driver = new ChromeDriver();
        } 
        else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();    
        } 
        else {
            Assert.fail("Please pass the right browser. Provided browser layout does not exist.");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        // Save driver instance directly inside ThreadLocal storage
        threadDriver.set(driver);

        // Bind the current driver session to TestNG context so your Listeners can see it safely
        String threadKey = "WebDriver_" + Thread.currentThread().getId();
        context.setAttribute(threadKey, driver);
        
        // Auto-navigate to your target application url configuration step
        String appUrl = prop.getProperty("Url");
        if (appUrl != null) {
            driver.get(appUrl);
        }
    }

    // Common method to close browser session safely at completion stage
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        WebDriver driver = threadDriver.get();
        if (driver != null) {
            driver.quit();
        }
        threadDriver.remove(); // Protects system resources from memory leakages
    }

    // Thread-safe replacement for your original getDriver method
    public static WebDriver getDriver() {
        return threadDriver.get();
    }

    // Thread-safe replacement for your original setDriver method
    public static void setDriver(WebDriver driverref) {
        threadDriver.set(driverref);
    }
}