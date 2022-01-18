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
import org.testng.Assert;

import PageObjects.LocalTab;
import PageObjects.OutStationPage;
import PageObjects.Outstation1;
import PageObjects.Sigin;
import PageObjects.TravelAgent;
import Resources.Base;



@RunWith(Cucumber.class)
public class Local_Tab extends Base{

	@Given("^initialize the browser and open site5$")
	public void Initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
	    
	}

	 @Given("^click on localTab$")
	    public void click_on_local_tab() throws Throwable {
		 Logger log = LogManager.getLogger(Local_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		 LocalTab lt = new LocalTab(driver);
		 lt.local().click();
		 log.info("localTab clicked");
		
	 }
	 
	 
	 @Given("^select city (.+)$")
	    public void select_city(String arg1) throws Throwable {
		 Logger log = LogManager.getLogger(Local_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
		 LocalTab lt = new LocalTab(driver);
		 lt.localcity().sendKeys(arg1);
		 log.info("city selected");
		 Thread.sleep(3000);
		 lt.localcity().sendKeys(Keys.ARROW_DOWN);
		 lt.localcity().sendKeys(Keys.ENTER);
		      
		
	}
	 

	 @When("^select Time$")
	public void select_time() throws Throwable {
		 Logger log = LogManager.getLogger(Local_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
	      
		 LocalTab lt = new LocalTab(driver);
		 lt.Time().click();
		 log.info("time selected");
		 lt.Time().sendKeys(Keys.ARROW_DOWN);
		 lt.Time().sendKeys(Keys.ARROW_DOWN);
		 lt.Time().sendKeys(Keys.ARROW_DOWN);
		 lt.Time().sendKeys(Keys.ARROW_DOWN);
		 lt.Time().sendKeys(Keys.ARROW_DOWN);
	}


	   @And("^user select car$")
	    public void select_car() throws Throwable {
		   Logger log = LogManager.getLogger(Local_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		   LocalTab lt = new LocalTab(driver);
		   lt.SelectCar().click();
		   log.info("car selected");
	    }
	  
    @And("^display car name$")
    public void display_car_name() throws Throwable {
    	 Logger log = LogManager.getLogger(Local_Tab.class);
	        PropertyConfigurator.configure("log4j.properties");
	    // Write code here that turns the phrase above into concrete actions
    	 LocalTab lt = new LocalTab(driver);
    	 System.out.println(lt.CarNameDisplay().getText());
		 lt.CarName().click();
		 Assert.assertEquals(lt.CarVerify().getText(), "SUV (6+1 seater)");
		 System.out.println(lt.CarVerify().getText());
		 log.info("displayed carname");
    }

    @And("^Close browsers6$")
    public void Close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver.quit();
    }
}