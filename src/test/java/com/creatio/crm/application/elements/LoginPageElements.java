package com.creatio.crm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.creatio.crm.framework.web.commons.WebCommons;

public class LoginPageElements extends WebCommons {

	@FindBy(xpath="//img[@class='logo']")
	public WebElement adactinLogo;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement passWord;
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	public WebElement forgotPasswordLink;
	
	@FindBy(xpath="//td[@class='login_title']")
	public WebElement forgotPasswordPage;
	
	@FindBy(xpath="//input[@id='login']")
	public WebElement loginButton;
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	public WebElement newUserRegistrationPage;
	
	


}
