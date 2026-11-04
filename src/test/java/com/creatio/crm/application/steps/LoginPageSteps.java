package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.creatio.crm.application.elements.LoginPageElements;

public class LoginPageSteps extends LoginPageElements {
	
	public LoginPageSteps(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}

	public void launchTheApplication() {
		launchApplication();
	}
	
	public void verifyLogoDisplayed() {
		//launchApplication();
		waitForElement(adactinLogo, 10);
		log("info","Adactin Logo is displayed..");
	}
	
	public void enterUserNameandPassword(String username,String password) {
		waitForElement(userName,10);
		enterText(userName,username);
		log("info","User name is Entered..");
		waitForElement(passWord,10);
		enterText(passWord,password);
		log("info","PassWord is Entered..");		
	}
	public void clickForgotPasswordLink(String expectedText) {
		waitForElement(forgotPasswordLink,10);
		log("info","Forgotpassowrd link is available..");
		click(forgotPasswordLink);
		log("info","Forgotpassowrd link is clicked..");
		waitForElement(forgotPasswordPage,10);
		String actualText = getElementText(forgotPasswordPage);
		Assert.assertEquals(actualText, expectedText,"Failed:Expected Text is not matched with Actual Text..");
		log("info","Forgot Password Header Text is validated...");				
	}
	public void clickLoginButton() {
		waitForElement(loginButton,10);
		log("info","LoginButton is available..");
		click(loginButton);
		log("info","Login Button is clicked successfully...");			
	}
	
	
}
