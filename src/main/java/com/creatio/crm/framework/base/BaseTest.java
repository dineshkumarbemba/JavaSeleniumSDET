package com.creatio.crm.framework.base; // Update package statement if your path differs slightly

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

    public WebDriver getDriver() {
        return threadDriver.get();
    }

    @BeforeMethod
    public void setUp(ITestContext context) {
        // Suppress tedious CDP warnings in modern Chrome versions
        System.setProperty("webdriver.chrome.silentOutput", "true");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        threadDriver.set(driver);

        // Bind the exact running driver to the active thread key inside the TestNG context
        String threadKey = "WebDriver_" + Thread.currentThread().getId();
        context.setAttribute(threadKey, driver);
        
        // Launch target app
        driver.get("http://adactin.com");
    }

    @AfterMethod
    public void tearDown() {
        WebDriver driver = getDriver();
        if (driver != null) {
            driver.quit();
        }
        threadDriver.remove();
    }
}