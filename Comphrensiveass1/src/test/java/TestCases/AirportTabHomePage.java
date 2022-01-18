package TestCases;

import Resources.Base;


import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AirportTab;

public class AirportTabHomePage extends Base {
	public static Logger Log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializeDriver();
	}
    @Test
    public void MainHomePage() throws InterruptedException
    {
    	Logger log = LogManager.getLogger(AirportTabHomePage.class);
        PropertyConfigurator.configure("log4j.properties");
    	driver.get(prop.getProperty("url"));
    	AirportTab At = new AirportTab(driver);
    	At.AirportTab().click();
    	log.info("click on link");
    	At.CityTab().sendKeys("New Delhi");
    	log.info("enter city");
    	Thread.sleep(2000);
    	At.CityTab().sendKeys(Keys.ARROW_DOWN);
    	At.CityTab().sendKeys(Keys.ARROW_DOWN);
    	At.CityTab().sendKeys(Keys.ARROW_DOWN);
    	At.CityTab().sendKeys(Keys.ENTER);
    	
    	At.TripTab().click();
    	Log.info("enter trip");
    	Thread.sleep(2000);
    	At.TripTab().sendKeys(Keys.ARROW_DOWN);
    	At.TripTab().sendKeys(Keys.ARROW_DOWN);
    	At.TripTab().sendKeys(Keys.ENTER);
    	
    	log.info("add address");
    	At.AddressTab().sendKeys("Delhi railway station");
    	
    	Thread.sleep(2000);
    	At.AddressTab().sendKeys(Keys.ARROW_DOWN);
    	At.AddressTab().sendKeys(Keys.ARROW_DOWN);
    	At.AddressTab().sendKeys(Keys.ENTER);
    	
    	log.info("click on calendar");
    	At.Calendar().click();
    	Thread.sleep(2000);
    	log.info("click on time");
    	At.Time().click();
    	log.info("select car");
    	At.Car().click();
    	At.Carselect().click();
  	 Assert.assertEquals(At.Verify().getText(),"Toyota Etios or Equivalent");
     System.out.println(At.Verify().getText());
     
    }
    @AfterTest
    public void teardown()
    {
    	driver.quit();
    	driver = null;
    }
}
