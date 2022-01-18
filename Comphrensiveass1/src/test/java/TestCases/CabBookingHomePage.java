package TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AboutUs;
import PageObjects.CabBooking;
import Resources.Base;

public class CabBookingHomePage extends Base {
	public static Logger Log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializeDriver();
	}
    @Test
    public void MainHomePage() throws InterruptedException
    {
    	Logger log = LogManager.getLogger(CabBookingHomePage .class);
        PropertyConfigurator.configure("log4j.properties");
        
    	driver.get(prop.getProperty("url"));
    	log.info("click on booking");
    //We defined it here just because we have to access 2 time this site for different set of credentials 
    	CabBooking c = new CabBooking(driver);
    	Thread.sleep(10000);
    	c.bookingCab().click();
    	
    	Thread.sleep(2000);
    	Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		
    	System.out.println(c.Toverify().isDisplayed());
    	log.info("display text");
    	System.out.println(c.Toverify().getText());
	
     
    }
    @AfterTest
    public void teardown()
    {
    	driver.quit();;
    	driver = null;
    }
}
