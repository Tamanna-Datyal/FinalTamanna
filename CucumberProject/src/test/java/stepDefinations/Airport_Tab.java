package stepDefinations;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import PageObjects.AirportTab;
import Resources.Base;



@RunWith(Cucumber.class)
public class Airport_Tab extends Base{

	@Given("^initialize the browser and open site3$")
	public void Initialize_the_browser_with_chrome() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
	    
	}

	 @Given("^User enters city (.+)$")
	    public void enters_city(String arg1) throws Throwable {
		 Logger log = LogManager.getLogger(Airport_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		 AirportTab At = new AirportTab(driver);
	    	At.AirportTab().click();
	    	log.info("click on airport");
	    	At.CityTab().sendKeys(arg1);
	    	log.info("city selected");
	    	Thread.sleep(2000);
	    	At.CityTab().sendKeys(Keys.ARROW_DOWN);
	    	At.CityTab().sendKeys(Keys.ARROW_DOWN);
	    	At.CityTab().sendKeys(Keys.ARROW_DOWN);
	    	At.CityTab().sendKeys(Keys.ENTER);
			
	 }
	 
	 
	 @Given("^select trip$")
	    public void select_trip() throws Throwable {
		 Logger log = LogManager.getLogger(Airport_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
		 AirportTab At = new AirportTab(driver);
			At.TripTab().click();
			log.info("clicked on trip");
	    	Thread.sleep(2000);
	    	
	    	At.TripTab().sendKeys(Keys.ARROW_DOWN);
	    	At.TripTab().sendKeys(Keys.ARROW_DOWN);
	    	At.TripTab().sendKeys(Keys.ENTER);
		      
		
	}
	 

	 @When("^user enters address (.+)$")
	public void enters_address(String arg3) throws Throwable {
		 Logger log = LogManager.getLogger(Airport_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
	      
		 AirportTab At = new AirportTab(driver);
		 
			At.AddressTab().sendKeys(arg3);
			log.info("entered address");
	    	Thread.sleep(2000);
	    	At.AddressTab().sendKeys(Keys.ARROW_DOWN);
	    	At.AddressTab().sendKeys(Keys.ARROW_DOWN);
	    	At.AddressTab().sendKeys(Keys.ENTER);
	}


	 @When("^select time$")
	public void select_time() throws Throwable {
		 Logger log = LogManager.getLogger(Airport_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
	      
		 AirportTab At = new AirportTab(driver);
		 
		 At.Calendar().click();
		 log.info("date selcted");
	    	Thread.sleep(2000);
	    	At.Time().click();
	}

	 @When("^user click on car and select car$")
	public void click_on_car_and_select_car() throws Throwable {
		 Logger log = LogManager.getLogger(Airport_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
		 AirportTab At = new AirportTab(driver);
		 At.Car().click();
		 log.info("car selected");
	    	At.Carselect().click();
	}
	 @When("^Validate the text$")
	public void Validate_text() throws Throwable {
		 Logger log = LogManager.getLogger(Airport_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
		 AirportTab At = new AirportTab(driver);
	 	 Assert.assertEquals(At.Verify().getText(),"Toyota Etios or Equivalent");
	 	 log.info("text displayed");
	     System.out.println(At.Verify().getText());
	}
    @And("^Close browsers4$")
    public void Close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver.quit();
    }
}