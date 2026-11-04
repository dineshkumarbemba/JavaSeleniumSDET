package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.creatio.crm.application.elements.SelectHotelElements;

public class SelectHotelSteps  extends SelectHotelElements{
public SelectHotelSteps(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void verifySelectHotelHeaderisDisplayed() {
	waitForElement(selectHotelPageHeader,10);
	log("info","Adactin Select Hotel Page Header is displayed..");		
}
public void clickSelectHotelRadioButton() {
	waitForElement(selectHotelRadiobutton,10);
	click(selectHotelRadiobutton);
	log("info","Hotel is Selected from Radio Button..");	
}

public void clickContinueButton() {
	waitForElement(continueButton,10);
	click(continueButton);
	log("info","Continue button is clicked..");	
}
}
