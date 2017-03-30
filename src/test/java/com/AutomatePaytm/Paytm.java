package com.AutomatePaytm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Paytm {
	
	
		WebDriver driver;
		@BeforeTest
		public void launchBrowser() {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://paytm.com/");
		}
		@Test
		public void login() {
			
		
		}

	

}
