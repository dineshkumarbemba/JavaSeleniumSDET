package com.creatio.crm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.creatio.crm.framework.web.commons.WebCommons;

public class SelectHotelElements extends WebCommons {

	@FindBy(xpath="//td[@class='login_title']")
	public WebElement selectHotelPageHeader;
	
	@FindBy(xpath="//input[@id='radiobutton_4']")
	public WebElement selectHotelRadiobutton;
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continueButton;
	
	
	
	
}
