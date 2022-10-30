package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Sep.Project_Sep_22.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
    @CucumberOptions(features =".\\Feature" ,
    
    			glue = "com.stepdef",
    			monochrome= true,
    			plugin= {"html:Reports/Adatin.html"}
    			
    		)
public class Adatin_Runner {

	 public static WebDriver driver;
	 
	 @BeforeClass
	 public static void set_Up() {
          driver = Base_Class.get_Browser("chrome");
		 
	}
	 
	@AfterClass
	public static void tear_Down() {

    	driver.close();
	}
	
	
}
