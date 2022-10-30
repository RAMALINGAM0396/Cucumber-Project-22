package com.helper.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Data_Reader {
	public static Properties p;
     public Test_Data_Reader() throws IOException {
       File f = new File("F:\\Java Workspace\\Project_Sep_22\\src\\main\\java\\com\\helper\\files\\Test_Data.properties");
  	   FileInputStream fis = new FileInputStream(f);
  	   p = new Properties();
  	   p.load(fis);
     }
	public String get_Browser() throws IOException {
	
	   String browser = p.getProperty("browser");
	   return browser;
	}
	 
	public String get_Url(){
		String url = p.getProperty("url");
		   return url;
	}	
	public String get_Username() {
		String username = p.getProperty("username");
		   return username;
	}
	public String get_Password() {
		String pass = p.getProperty("password");
		   return pass;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
