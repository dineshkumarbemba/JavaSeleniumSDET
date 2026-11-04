package com.creatio.crm.framework.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchSessionException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestListeners implements ITestListener {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> extentTestMap = new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {
        String reportPath = System.getProperty("user.dir") + "/Reports/";
        try {
            Files.createDirectories(Paths.get(reportPath));
        } catch (IOException e) {
            System.err.println("[REPORTS DIR FAILED] Could not create folders: " + e.getMessage());
        }

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath + "AutomationReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Target Application", "Adactin Hotel Reservation");
        extent.setSystemInfo("Framework Context", "Thread-Safe / SDET Execution");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("On Test start method name: " + result.getMethod().getMethodName());
        ExtentTest testNode = extent.createTest(result.getMethod().getMethodName());
        extentTestMap.set(testNode);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("On Test Success method name: " + result.getMethod().getMethodName());
        ExtentTest currentTest = extentTestMap.get();
        if (currentTest != null) {
            currentTest.pass("Test completed successfully.");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String methodName = result.getMethod().getMethodName();
        System.err.println("On Test Failure method name: " + methodName);
        
        ExtentTest currentTest = extentTestMap.get();

        // Fallback protection if an Excel sheet error or Config failure crashes execution before onTestStart
        if (currentTest == null) {
            currentTest = extent.createTest(methodName + " [Initialization Failure]");
            extentTestMap.set(currentTest);
        }

        Throwable throwable = result.getThrowable();
        String errorMessage = (throwable != null) ? throwable.toString() : "Unknown structural framework error.";
        currentTest.fail("<b>Test Failed at Runtime:</b><br>" + errorMessage);
        
        if (throwable != null) {
            currentTest.fail(throwable);
        }

        // Defensively capture screenshots safely if browser driver is still active
        ITestContext context = result.getTestContext();
        String threadKey = "WebDriver_" + Thread.currentThread().getId();
        Object driverObject = context.getAttribute(threadKey);

        if (driverObject instanceof WebDriver) {
            WebDriver driver = (WebDriver) driverObject;
            try {
                if (driver.getWindowHandles() != null && !driver.getWindowHandles().isEmpty()) {
                    System.out.println("[LISTENERS] Active session verified. Calling screenshot capture...");
                    // Add your explicit call here, e.g.:
                    // com.creatio.crm.framework.web.commons.WebCommons.getWindowScreenshot(driver);
                }
            } catch (NoSuchSessionException e) {
                System.err.println("[SCREENSHOT SKIPPED] Browser session closed prior to listener screenshot execution.");
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTest currentTest = extentTestMap.get();
        if (currentTest == null) {
            currentTest = extent.createTest(result.getMethod().getMethodName() + " [Skipped]");
            extentTestMap.set(currentTest);
        }
        currentTest.skip("Test skipped by execution scheduling engine.");
    }

    @Override
    public void onFinish(ITestContext context) {
        if (extent != null) {
            extent.flush();
        }
        extentTestMap.remove();
    }
}