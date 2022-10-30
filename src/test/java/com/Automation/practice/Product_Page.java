package com.Automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {
			public WebDriver driver;
	
	@FindBy(xpath="//p [@id='quantity_wanted_p']//a[@data-field-qty='qty'][2]")
	private WebElement quantity;
	
	@FindBy(xpath="//select[@name='group_1']")
	private WebElement size;
	
	@FindBy(xpath="//a[@name='Pink']")
	private WebElement color;
	
	@FindBy(xpath="//form[@id='buy_block']/div/div/div/p/button")
	private WebElement add2cart;
	
	public Product_Page(WebDriver driver5) {
			this.driver = driver5;
			PageFactory.initElements(driver, this);
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAdd2cart() {
		return add2cart;
	}
	
	
	
	
	
	
	
	
}
