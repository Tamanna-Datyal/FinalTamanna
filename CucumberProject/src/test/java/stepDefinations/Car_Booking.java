package stepDefinations;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;

import PageObjects.CabBooking;
import PageObjects.OutStationPage;
import PageObjects.Outstation1;
import PageObjects.Sigin;
import PageObjects.TravelAgent;
import Resources.Base;



@RunWith(Cucumber.class)
public class Car_Booking extends Base{

	@Given("^initialize the Browser1 and Open Site$")
	public void Initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
	    
	}

	 @Given("^click on Booking$")
	    public void click_on_Booking() throws Throwable {
		 Logger log = LogManager.getLogger(Car_Booking.class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		 CabBooking c = new CabBooking(driver);
		 Thread.sleep(10000);
	    	c.bookingCab().click();
	    	log.info("car booked");
	    	
	    	Thread.sleep(2000);
	    	Set<String> ids=driver.getWindowHandles();
			Iterator<String>it=ids.iterator();
			it.next();
			String Childid=it.next();
			driver.switchTo().window(Childid);
	 }
	 
	 
	 

	 @When("^ diplay text1 and Validate$")
	public void display_error_message() throws Throwable {
		 Logger log = LogManager.getLogger(Car_Booking.class);
	        PropertyConfigurator.configure("log4j.properties");
		 CabBooking c = new CabBooking(driver);
		 System.out.println(c.Toverify().isDisplayed());
		 log.info("verified");
	    	System.out.println(c.Toverify().getText());
	}


 
    
    @And("^close Browsers11$")
    public void Close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver.quit();
    }
}