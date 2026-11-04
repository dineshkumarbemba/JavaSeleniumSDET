package com.creatio.crm.application.tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.creatio.crm.application.steps.BookHotelSteps;
import com.creatio.crm.application.steps.HomePageSteps;
import com.creatio.crm.application.steps.LoginPageSteps;
import com.creatio.crm.application.steps.SelectHotelSteps;
import com.creatio.crm.framework.base.BasePage;
import com.creatio.crm.framework.web.commons.WebCommons;
import com.creatio.crm.framework.utilities.PropUtil;



public class ApplicationTest extends BasePage {
	public LoginPageSteps loginPage;
	public HomePageSteps homePage;
	public SelectHotelSteps selecthotelpage;
	public BookHotelSteps bookhotelPage;
	
	
	@BeforeMethod(alwaysRun = true, dependsOnMethods = "setupBrowser")
	public void initializePages() {
		WebDriver driver = BasePage.getDriver();
		loginPage = new LoginPageSteps(driver);
		homePage = new HomePageSteps(driver);
		selecthotelpage = new SelectHotelSteps(driver);
		bookhotelPage = new BookHotelSteps(driver);
	}	
	
	@Test(priority=1)
	public void verifyLogoDisplayed() {
		loginPage.launchTheApplication();
		loginPage.verifyLogoDisplayed();
	}
	
	@Test(priority=2)
	public void verifyForgotPasswordLinkDisplayed() throws IOException {
		loginPage.launchTheApplication();		
		//String expectedText=WebCommons.readTestData("Login",1,13);
		loginPage.clickForgotPasswordLink("Forgot Password Form ");
	}
	
	@Test(priority=3)
	public void enterUserNameandPasswordandLogin(String username,String password) {
		loginPage.launchTheApplication();
		Properties prop= PropUtil.readData("Config.properties");
		String uName = prop.getProperty("APP_USERNAME");
	    String pWord = prop.getProperty("APP_PASSWORD");
		loginPage.enterUserNameandPassword(uName, pWord);
		loginPage.clickLoginButton();		
	}
	
	@Test(priority=4)	
	public void verifyHomePageHeaderisDisplayed() {
		loginPage.launchTheApplication();
		Properties prop= PropUtil.readData("Config.properties");
		String uName = prop.getProperty("APP_USERNAME");
	    String pWord = prop.getProperty("APP_PASSWORD");
		loginPage.enterUserNameandPassword(uName, pWord);
		loginPage.clickLoginButton();
		homePage.verifyHomePageHeaderisDisplayed();		
	}
	
	@Test(priority=5)
	public void selectLocationDropDown() throws IOException {
		loginPage.launchTheApplication();
		Properties prop= PropUtil.readData("Config.properties");
		String uName = prop.getProperty("APP_USERNAME");
	    String pWord = prop.getProperty("APP_PASSWORD");
		loginPage.enterUserNameandPassword(uName, pWord);
		loginPage.clickLoginButton();
		homePage.verifyHomePageHeaderisDisplayed();	
		//String option=WebCommons.readTestData("Login",1,2);
		homePage.selectLocationFromDropDown("Melbourne");
	}
	
	@Test(priority=6)
	public void selectNoOfRooms() throws IOException {
		loginPage.launchTheApplication();
		Properties prop= PropUtil.readData("Config.properties");
		String uName = prop.getProperty("APP_USERNAME");
	    String pWord = prop.getProperty("APP_PASSWORD");
		loginPage.enterUserNameandPassword(uName, pWord);
		loginPage.clickLoginButton();
		homePage.verifyHomePageHeaderisDisplayed();	
		String option=WebCommons.readTestData("Login",1,2);
		homePage.selectLocationFromDropDown(option);
		String option1=WebCommons.readTestData("Login",1,4);
		homePage.selectNoOfRoomFromDropDown(option1);
	}
	
	@Test(priority=7)
	public void selectRoomType() throws IOException {
		loginPage.launchTheApplication();
		Properties prop= PropUtil.readData("Config.properties");
		String uName = prop.getProperty("APP_USERNAME");
	    String pWord = prop.getProperty("APP_PASSWORD");
		loginPage.enterUserNameandPassword(uName, pWord);
		loginPage.clickLoginButton();
		homePage.verifyHomePageHeaderisDisplayed();	
		String option=WebCommons.readTestData("Login",1,2);
		homePage.selectLocationFromDropDown(option);
		String option1=WebCommons.readTestData("Login",1,4);
		homePage.selectNoOfRoomFromDropDown(option1);
		String option2=WebCommons.readTestData("Login",1,3);
		homePage.selectRoomTypeFromDropDown(option2);
	}
	
	@Test(priority=8)
	public void clickSearchSelect() throws IOException {
		loginPage.launchTheApplication();
		Properties prop= PropUtil.readData("Config.properties");
		String uName = prop.getProperty("APP_USERNAME");
	    String pWord = prop.getProperty("APP_PASSWORD");
		loginPage.enterUserNameandPassword(uName, pWord);
		loginPage.clickLoginButton();
		homePage.verifyHomePageHeaderisDisplayed();	
		String option=WebCommons.readTestData("Login",1,2);
		homePage.selectLocationFromDropDown(option);
		String option1=WebCommons.readTestData("Login",1,4);
		homePage.selectNoOfRoomFromDropDown(option1);
		String option2=WebCommons.readTestData("Login",1,3);
		homePage.selectRoomTypeFromDropDown(option2);
		homePage.clickSearchButton();
	}
	
	@Test(priority=9)
	public void selectHotel() throws IOException {
		loginPage.launchTheApplication();
		Properties prop= PropUtil.readData("Config.properties");
		String uName = prop.getProperty("APP_USERNAME");
	    String pWord = prop.getProperty("APP_PASSWORD");
		loginPage.enterUserNameandPassword(uName, pWord);
		loginPage.clickLoginButton();
		homePage.verifyHomePageHeaderisDisplayed();	
		String option=WebCommons.readTestData("Login",1,2);
		homePage.selectLocationFromDropDown(option);
		String option1=WebCommons.readTestData("Login",1,4);
		homePage.selectNoOfRoomFromDropDown(option1);
		String option2=WebCommons.readTestData("Login",1,3);
		homePage.selectRoomTypeFromDropDown(option2);
		homePage.clickSearchButton();
		selecthotelpage.verifySelectHotelHeaderisDisplayed();
		selecthotelpage.clickSelectHotelRadioButton();
		selecthotelpage.clickContinueButton();
	}
	
	
}
