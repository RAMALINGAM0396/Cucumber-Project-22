package com.helper.files;

import java.io.IOException;

public class Test_Data_Manager {
     private Test_Data_Manager() {
    
     }
	  public static Test_Data_Manager get_Instance_FRI() {
		  Test_Data_Manager tdm = new Test_Data_Manager();
		  return tdm;
	}
	 public Test_Data_Reader get_Instance_Reader() throws IOException {
 	 Test_Data_Reader reader = new Test_Data_Reader();
	    return reader;
	   }
	
}
