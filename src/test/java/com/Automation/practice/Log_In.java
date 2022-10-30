package com.Automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_In {
    	public  WebDriver driver;
    	
	   @FindBy(xpath="//a[@class='login']")
	   private WebElement signin;
	   
	   @FindBy(xpath="//input[@id='email']")
	   private WebElement username;
	   
	   @FindBy(xpath="//input[@type='password']")
	   private WebElement password;
	   
	   @FindBy(xpath="//button[@id='SubmitLogin']")
	   private WebElement login;

	public Log_In(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	   
	
	
}
