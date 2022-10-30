package com.Adatin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Inpage {
      public WebDriver driver;
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
    @FindBy(xpath="//input[@id='password']")
    private WebElement password;
    @FindBy(xpath="//input[@class='login_button']")
    private WebElement login;
    
    
	public Sign_Inpage(WebDriver driver) {
           this.driver = driver;
	PageFactory.initElements(driver,this);
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getUsername() {
		return username;
	}
	
	
	
	
	
}
