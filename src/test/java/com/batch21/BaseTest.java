package com.batch21;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.batch21.util.Log;
import com.batch21.util.ReadConfig;

public class BaseTest {
	
	public static WebDriver driver;
	public static ReadConfig readConfig= new ReadConfig();
	
	
	@Parameters("browser")
	@BeforeTest
	public void setup(@Optional("chrome")String browser) {
		
		 if (browser.equalsIgnoreCase("chrome")) {
			 driver= new ChromeDriver();
			 Log.info("chrome launched");
		} else if (browser.equalsIgnoreCase("firefox")) {
			 driver= new FirefoxDriver();
			 Log.info("firefox launched");
		} else if (browser.equalsIgnoreCase("edge")){
			driver= new EdgeDriver();
			Log.info("MS Edge launched");
		} else {
			driver= new SafariDriver();
			Log.info("Safari launched");
		}
		 
		 driver.get(readConfig.getTestSite());
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		 Log.info("Welcome to  "+ driver.getTitle());
		 
	}
	
	
	
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		if (driver!=null) {
			Thread.sleep(4000);
			driver.close();
			Log.info("driver quit");
		}
	}
	
	
	
	
}
