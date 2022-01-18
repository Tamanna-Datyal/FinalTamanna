package TestCases;

import Resources.Base;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Sigin;

public class SiginHomepage extends Base{
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void intializeDriver() throws IOException
	{
		driver =initializeDriver();
	}
	
	@Test
	public void MainHomePage()
	{
		
		Logger log = LogManager.getLogger(SiginHomepage.class);
         PropertyConfigurator.configure("log4j.properties");


		driver.get(prop.getProperty("url"));
		 Sigin s = new  Sigin(driver);
		 s.ClickForsigin().click();
		 log.info("click for sigin");
		 s.Email().sendKeys("tamannathakur@gmail.com");
		 log.info("click for email");
		 s.Password().sendKeys("6721e878");
		 log.info("enter password");
		 s.ToLogin().click();
		 System.out.println(s.ToVerify().isDisplayed());
		 System.out.println(s.ToVerify().getText());
		 
		 
	}
	
	@AfterTest
	public void teardown() 
	{
		driver.quit();
		driver = null;
	}
	
	

}
