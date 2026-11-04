package com.creatio.crm.application.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.creatio.crm.application.elements.BookHotelElements;

public class BookHotelSteps extends BookHotelElements {
	
	public BookHotelSteps(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void enterFirstName(String firstname) {
		waitForElement(firstName,10);
		enterText(firstName,firstname);
		log("info","First Name is entered..");		
	}
	public void enterLastName(String lastname) {
		waitForElement(lastName,10);
		enterText(lastName,lastname);
		log("info","Last Name is Entered..");
	}
	public void enterAddress(String Address) {
		waitForElement(address,10);
		enterText(address,Address);
		log("info","Address is Entered...");
	}
	
	public void enterCreditCardNo(String no) {
		waitForElement(ccno,10);
		enterText(ccno,no);
		log("info","CreditCard No is Entered...");
	}
	public void selectCreditCardType(String option) {
		waitForElement(cctype,10);
		selectDropdownOption(cctype,"visibletext",option);
		log("info","CreditCard Types is Selected as ... "+option);
	}
	public void selectCreditCardExpMonth(String option) {
		waitForElement(ccexpmonth,10);
		selectDropdownOption(ccexpmonth,"visibletext",option);
		log("info","CreditCard ExpMonth is Selected as ... "+option);
	}
	public void selectCreditCardExpyear(String option) {
		waitForElement(ccexpyear,10);
		selectDropdownOption(ccexpyear,"visibletext",option);
		log("info","CreditCard Expyear is Selected as ... "+option);
	}
	public void enterCVVNo(String cvv) {
		waitForElement(cvvno,10);
		enterText(cvvno,cvv);
		log("info","CreditCard No is entered... ");
	}
	public void clickBookNow() {
		waitForElement(booknow,10);
		click(booknow);
		log("info","Book Now button is clicked... ");
		
	}
	
	
}
