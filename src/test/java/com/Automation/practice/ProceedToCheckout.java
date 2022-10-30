package com.Automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckout {

				public  WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement ckot;
	
	@FindBy(xpath="//span[.='Proceed to checkout']")
	private WebElement ptoc;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement tick;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit2;

	
	public ProceedToCheckout(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCkot() {
		return ckot;
	}

	public WebElement getPtoc() {
		return ptoc;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getTick() {
		return tick;
	}

	public WebElement getSubmit2() {
		return submit2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
