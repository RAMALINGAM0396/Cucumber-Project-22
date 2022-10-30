package com.Automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
        public WebDriver driver;
        
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	private WebElement EveningDress;
	
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement image;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	public Home_Page(WebDriver driver1) {
			this.driver = driver1;
			PageFactory.initElements(driver, this);
	}
	
	public WebElement getDresses() {
		return Dresses;
	}

	public WebElement getEveningDress() {
		return EveningDress;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getFrame() {
		return frame;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
