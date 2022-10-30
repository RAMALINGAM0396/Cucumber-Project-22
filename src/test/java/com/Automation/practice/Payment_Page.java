package com.Automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
           public WebDriver driver;
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement paymode;
	
	@FindBy(xpath="//span[.='I confirm my order']")
	private WebElement oko;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement bco;
	
	@FindBy(xpath="//span[text()=' Home']")
	private WebElement home;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signout;

	
	public Payment_Page(WebDriver driver3) {
		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPaymode() {
		return paymode;
	}

	public WebElement getOko() {
		return oko;
	}

	public WebElement getBco() {
		return bco;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	
	
	
	
	
	
	
	
	
}
