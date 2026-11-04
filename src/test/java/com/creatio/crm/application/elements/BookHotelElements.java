package com.creatio.crm.application.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.creatio.crm.framework.web.commons.WebCommons;

public class BookHotelElements extends WebCommons {
	@FindBy (id="first_name")
	public WebElement firstName;
	
	@FindBy (id="last_name")
	public WebElement lastName;
	
	@FindBy(id="address")
	public WebElement address;
	
	@FindBy(id="cc_num")
	public WebElement ccno;
	
	@FindBy(xpath="//select[@id='cc_type']")
	public WebElement cctype;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	public WebElement ccexpmonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	public WebElement ccexpyear;
	
	@FindBy(id="cc_cvv")
	public WebElement cvvno;
	
	@FindBy(id="book_now")
	public WebElement booknow;
	
	@FindBy(id="order_no")
	public WebElement orderno;
}
