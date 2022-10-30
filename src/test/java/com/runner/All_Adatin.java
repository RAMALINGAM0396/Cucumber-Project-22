package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Sep.Project_Sep_22.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="F:\\Java Workspace\\Cucumber_Sep30\\Feature\\All_Adatin.feature",
	glue = "com.All_Adatin",
	dryRun = false,
	monochrome = true,
	plugin = {"html:Reports/All_Adatin.html"}
	)
public class All_Adatin {
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
		
		driver = Base_Class.get_Browser("chrome");
	    driver.get("https://adactinhotelapp.com/");
		
	}
	
	@AfterClass
	public static void tear_Down() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
