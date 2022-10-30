package com.Adatin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement Lastname;
	
	@FindBy(xpath="//textarea[@class='txtarea']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement Creditno;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement Credittype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement Validity1;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement Validity2;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow;
	
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement myorder;
	
	@FindBy(xpath="//input[@id='search_hotel']")
	private WebElement searchhotel;
	
	@FindBy(xpath="//input[@value='Logout']")
	private WebElement logout;


	public Book_Hotel(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCreditno() {
		return Creditno;
	}

	public WebElement getCredittype() {
		return Credittype;
	}

	public WebElement getValidity1() {
		return Validity1;
	}

	public WebElement getValidity2() {
		return Validity2;
	}

	public WebElement getCvv() {
		return cvv;
	}
     
	public WebElement getBooknow() {
		return booknow;
	}
	
	public WebElement getMyorder() {
		return myorder;
	}
	public WebElement getSearchhotel() {
		return searchhotel;
	}
	public WebElement getLogout() {
		return logout;
	}

	
}
