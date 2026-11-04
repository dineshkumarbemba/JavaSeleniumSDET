package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.creatio.crm.application.elements.HomePageElements;

public class HomePageSteps extends HomePageElements {
	
public HomePageSteps(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void verifyHomePageHeaderisDisplayed() {
	waitForElement(homePageHeader,10);
	log("info","Adactin Home Page Header is displayed..");	
}

public void selectLocationFromDropDown(String option) {
	waitForElement(locationDropDown,10);
	selectDropdownOption(locationDropDown,"visibletext",option);
	log("info","Location is selected from Dropdown as .. " +option);	
}
public void selectNoOfRoomFromDropDown(String option) {
	waitForElement(roomDropDown,10);
	selectDropdownOption(roomDropDown,"visibletext",option);
	log("info","Room is selected from Dropdown as .. " +option);	
}
public void selectRoomTypeFromDropDown(String option) {
	waitForElement(roomDropDown,10);
	selectDropdownOption(roomDropDown,"visibletext",option);
	log("info","Room is selected from Dropdown as .. " +option);	
}

public void clickSearchButton() {
	waitForElement(submitButton,10);
	click(submitButton);
	log("info","Search Button is clicked .. " );		
}



}
