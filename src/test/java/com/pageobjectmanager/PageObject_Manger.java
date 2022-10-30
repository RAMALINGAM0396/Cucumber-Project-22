package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.Adatin.pom.Book_Hotel;
import com.Adatin.pom.Search_Hotel;
import com.Adatin.pom.Select_Hotel;
import com.Adatin.pom.Sign_Inpage;

public class PageObject_Manger {
	
   public WebDriver driver;
   
     private Book_Hotel bh;
     
     private Search_Hotel sh;
     
     private Select_Hotel hotel;
	
	private Sign_Inpage signin;

	public PageObject_Manger(WebDriver driver2) {
          this.driver = driver2;
	
	}

	public Book_Hotel getBh() {
		if (bh==null) {
			bh=new Book_Hotel(driver);
		}
		return bh;
	}

	public Search_Hotel getSh() {
		if (sh==null) {
			sh=new Search_Hotel(driver);
		}
		
		return sh;
	}

	public Select_Hotel getHotel() {
		if (hotel==null) {
			hotel=new Select_Hotel(driver);
		}
		
		return hotel;
	}

	public Sign_Inpage getSignin() {
		if (signin==null) {
			signin=new Sign_Inpage(driver);
		}
		
		return signin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
