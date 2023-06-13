package com.obsqura.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	
		public WebDriver driver;
		
		@BeforeMethod
		@Parameters("browser")
	    public void initializeBrowser(String browser) throws Exception
	    {
			if (browser.equalsIgnoreCase("firefox")) {
				driver = WebDriverManager.firefoxdriver().create();

			}

			else if (browser.equalsIgnoreCase("chrome")) {
				driver=WebDriverManager.chromedriver().create();
			
			}

			else if (browser.equalsIgnoreCase("edge")) 
			{	
				driver=WebDriverManager.edgedriver().create();
			} 
			else 
			{
				throw new Exception("Browser is not correct");
			}
	        driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	        driver.manage().window().maximize();
	    }
	    public void driverClose()
	    {
	        driver.close();
	    }	    
	    @AfterMethod
	    public void driverQuit()
	    {
	        driver.quit();
	    }
	   
}
