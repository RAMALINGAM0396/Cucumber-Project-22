package com.Adatin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel{
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radio;
	
	@FindBy(xpath= "//input[@type='submit']")
	private WebElement next;

	public Select_Hotel(WebDriver driver) {
              this.driver = driver;
             PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getNext() {
		return next;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
