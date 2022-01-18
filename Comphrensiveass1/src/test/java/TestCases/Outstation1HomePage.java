package TestCases;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LocalTab;
import PageObjects.Outstation1;
import Resources.Base;

public class Outstation1HomePage extends Base {
	 public static Logger Log = LogManager.getLogger(Base.class.getName());
	 @BeforeTest
	 public void intialize() throws IOException
	 {
		 driver = initializeDriver();
	 }
	 @Test
	 public void MainHomePage() throws InterruptedException
	 {
		 Logger log = LogManager.getLogger(Outstation1HomePage.class);
	        PropertyConfigurator.configure("log4j.properties");
		 driver.get(prop.getProperty("url"));
		 Outstation1 q = new Outstation1(driver);
		 q.Click().click();
		 q.OneWay().click();
		 q.From().click();
		 log.info("click on oneway");
		 q.From().sendKeys("New Delhi");
		 log.info("enter fromcity");
		 Thread.sleep(2000);
		 q.From().sendKeys(Keys.ARROW_DOWN);
		 q.From().sendKeys(Keys.ARROW_DOWN);
		 q.From().sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 q.To().click();
		 q.To().sendKeys("Patiala,Punjab");
		 log.info("enter tocity");
		 Thread.sleep(2000);
		 q.To().sendKeys(Keys.ENTER);
		 q.Time().click();
		 q.selectcar().click();
		 log.info("select car");
		 
		 
	 }
	@AfterTest
	 public void teardown()
	 {
		 driver.quit();
		 driver = null;
	 }
	 
}


