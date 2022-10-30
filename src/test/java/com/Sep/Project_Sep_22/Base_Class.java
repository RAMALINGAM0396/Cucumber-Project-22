package com.Sep.Project_Sep_22;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
          public static WebDriver driver;
          public static String value;
       public static WebDriver get_Browser(String type) {

    	if (type.equalsIgnoreCase("chrome")) {
			
    	  System.setProperty("webdriver.chrome.driver",
    			  System.getProperty("user.dir")+"\\Driver2\\chromedriver.exe");
    		driver = new ChromeDriver();
    }   
    	 else if (type.equalsIgnoreCase("firefox")) {
			
	}
    	     
    	 driver.manage().window().maximize();  
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	  return driver;
    	   
	}
	    
      public static void click(WebElement element) {
        element.click();
	}
      public static void clear(WebElement element) {
          element.clear();
  	}
      public static void close(WebDriver driver) {
           driver.close();
	}
      
		public static void get_Url(String link) {
             driver.get(link);
    }
		public static void send_Keys(WebElement element, String send) {
          element.sendKeys(send);
	}
		
	    public static void select_ByI(WebElement element, int value) {
	    Select refname = new Select(element);
	    refname.selectByIndex(value);
    }
	     
	    public static void  select_ByT(WebElement element, String value) {
		    Select refname = new Select(element);
		    refname.selectByVisibleText(value);
    }
	    public static void select_ByV(WebElement element, String value) {
		    Select refname = new Select(element);
		    refname.selectByValue(value);
	}
	public static void TakesScreenshot_t() throws IOException  {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Ramu\\eclipse-workspace\\Project_Sep_22\\Photos2/pompic.png");
		FileUtils.copyFile(source, destination);    
	}
	
	public static void scroll_Down() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
	}
	
     public static void actions(WebDriver x, WebElement y ) {
    	 Actions a = new Actions(x);
         a.moveToElement(y).perform();
	}
	public static void actions_Click(WebElement y,WebDriver x) {
        Actions m = new Actions(x);
        m.click(y).perform();
	}
		public static void Frames(WebElement element) {
        driver.switchTo().frame(element);
	}
		public static void frames_exit() {
			driver.switchTo().defaultContent();
		}
	
	
	//Data Driven Read (All Data)
	public static String all_Data(String path, int sheet,int row, int cell) throws IOException {

		File f = new File("C:\\Users\\Ramu\\eclipse-workspace\\Project_Sep_22\\Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++)
{
			      Row row2 = s.getRow(i);
		for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) 
{
			Cell cell2= row2.getCell(j);
			CellType type = cell2.getCellType();
		if (type.equals(CellType.STRING)) 
		{
			 value = cell2.getStringCellValue();
		}
		else if (type.equals(CellType.NUMERIC)) 
		{
			double d = cell2.getNumericCellValue();
			int a = (int) d;
		      value = String.valueOf(a);
     	}
}
}
		wb.close();
		return value;
}
	
     // Particular Data
	
	public static String particular_Data(int sheet,int row, int column) throws IOException {

		File f = new File("F:\\Java Workspace\\Project_Sep_22\\Adatin Hotel Sample TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(column);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
		   value = c.getStringCellValue();
		}
		else if (type.equals(CellType.NUMERIC)) {
				
		double d = c.getNumericCellValue();
		int a = (int) d;
				
		    value = String.valueOf(a);
		}
			wb.close();
			return value;
	}	
}
