package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.Automation.practice.Home_Page;
import com.Automation.practice.Log_In;
import com.Automation.practice.Payment_Page;
import com.Automation.practice.ProceedToCheckout;
import com.Automation.practice.Product_Page;

public class Automation_Pom {

	public WebDriver driver;
	    
	   private Home_Page hp;
	   
	   private Log_In li;
	   
	   private Payment_Page pay;
	   
	   private ProceedToCheckout ptc;
	   
	   private Product_Page pp;
	   
	   public Automation_Pom(WebDriver driver2) {
	          this.driver = driver2;
		
		}
	public Home_Page getHp() {
	if (hp==null) {
		hp= new Home_Page(driver);
	}
		return hp;
	}

	public Log_In getLi() {
    if (li==null) {
		li=new Log_In(driver);
	}
		return li;
	}

	public Payment_Page getPay() {
	if (pay==null) {
		pay=new Payment_Page(driver);
	}	
	
		return pay;
	}

	public ProceedToCheckout getPtc() {
	if (ptc==null) {
		ptc=new ProceedToCheckout(driver); 
	}	
		
		return ptc;
	}

	public Product_Page getPp() {
	if (pp==null) {
		pp=new Product_Page(driver);
	}	
		
		return pp;
	}
	   
	   
	
	
	
	
	
	
	
	
	
	
}
