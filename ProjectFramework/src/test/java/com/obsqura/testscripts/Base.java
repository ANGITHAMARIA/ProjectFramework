package com.obsqura.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	
		public WebDriver driver;
		
		@BeforeMethod
	    public void initializeBrowser()
	    {
			System.setProperty("webdriver.chrome.driver","C:\\javanewwork\\ProjectFramework\\src\\main\\resources\\chromedriver.exe");
	        driver =new ChromeDriver();
	        driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	        driver.manage().window().maximize();
	    }
	    public void driverClose()
	    {
	        driver.close();
	    }
	    
	 //   @AfterMethod
	    public void driverQuit()
	    {
	        driver.quit();
	    }
	   
}
