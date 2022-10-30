package com.Adatin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype;
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement nroom;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement indate;
	@FindBy(xpath="//input[@name='datepick_out'] ")
	private WebElement outdate;
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adult;
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	
	public Search_Hotel(WebDriver driver2) {
            this.driver = driver2;
            PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNroom() {
		return nroom;
	}
	public WebElement getIndate() {
		return indate;
	}
	public WebElement getOutdate() {
		return outdate;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

