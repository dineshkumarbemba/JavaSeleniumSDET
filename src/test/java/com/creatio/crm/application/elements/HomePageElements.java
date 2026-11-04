package com.creatio.crm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.creatio.crm.framework.web.commons.WebCommons;

public class HomePageElements extends WebCommons {

	
	@FindBy(xpath="//td[@class='welcome_menu']")
	public WebElement homePageHeader;
	
	@FindBy(xpath="//select[@id='location']")
	public WebElement locationDropDown;
	
	@FindBy(xpath="//select[@id='room_nos']")
	public WebElement roomDropDown;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	public WebElement checkInDate;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	public WebElement checkOutDate;
	
	@FindBy(xpath="//select[@id='adult_room']")
	public WebElement adultPerRoom;
	
	@FindBy(xpath="//input[@id='Submit']")
	public WebElement submitButton;
	
	
	
	
	
	
}
