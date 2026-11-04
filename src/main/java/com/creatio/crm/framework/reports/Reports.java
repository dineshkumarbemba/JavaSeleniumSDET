package com.creatio.crm.framework.reports;

import org.testng.annotations.BeforeSuite; 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter; // Upgraded to modern 5.x Spark Reporter

public class Reports {
	
	// Central tracking variables aligned with version 5.1.1
	public static ExtentSparkReporter spark; // The report file layout configuration
	public static ExtentReports extent;      // The engine that prints the logs
	public static ExtentTest logger;          // The step logger for the active test
	
	// Method to setup the report infrastructure at suite level
	@BeforeSuite(alwaysRun = true)
	public static void setupReport() {
		String reportLocation = System.getProperty("user.dir") + "\\Reports\\AutomationTestReport.html";
		spark = new ExtentSparkReporter(reportLocation);
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		// Optional metadata configuration for your execution dashboard
		extent.setSystemInfo("Environment", "QA Application Server");
		extent.setSystemInfo("Framework Stack", "Java / TestNG / ExtentReports 5.x");
	}
	
	// Method to start tracking steps for a specific test scenario execution case
	public static void startReporting(String testName) {
		logger = extent.createTest(testName);
	}
	
	// Method to write all logged execution states down onto your disk report file
	public static void endReport() {
		if (extent != null) {
			extent.flush();
		}
	}	
	
	// Method to attach captured browser window states cleanly inside test failure steps
	public static void attachScreenshot(String screenshotPath) {
		try {
			if (logger != null) {
				logger.addScreenCaptureFromPath(screenshotPath);
			} else {
				System.err.println("[REPORTS ERROR] Cannot attach screenshot. Logger mapping context is empty.");
			}
		} catch (Exception e) {
			System.err.println("[REPORTS COMPONENT EXCEPTION] Failed processing attachment logic: " + e.getMessage());
			e.printStackTrace();
		}
	}
}