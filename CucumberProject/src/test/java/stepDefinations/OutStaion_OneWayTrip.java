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

import PageObjects.OutStationPage;
import PageObjects.Outstation1;
import PageObjects.Sigin;
import Resources.Base;



@RunWith(Cucumber.class)
public class OutStaion_OneWayTrip extends Base{

	@Given("^initialize the browser and open site1$")
	public void Initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
	    
	}

	 @Given("^User enters From City (.+) & tocity (.+)$")
	    public void Navigate_to_Site(String Fromcity , String Tocity) throws Throwable {
		 Logger log = LogManager.getLogger(OutStaion_OneWayTrip .class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		 Outstation1 q = new Outstation1(driver);
		 q.Click().click();
		 q.OneWay().click();
		 log.info("oneway clicked");
		 q.From().click();
		 q.From().sendKeys(Fromcity);
		 Thread.sleep(2000);
		 q.From().sendKeys(Keys.ARROW_DOWN);
		 q.From().sendKeys(Keys.ARROW_DOWN);
		 q.From().sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 q.To().click();
		 q.To().sendKeys(Tocity);
		 log.info("city selected");
		 Thread.sleep(2000);
		 q.To().sendKeys(Keys.ENTER);;
			
	 }
	 
	 
	 @Given("^User select the time for travel and click on summit button$")
	    public void Click_on_login_link_in_home_page_to_land_on_sign_in_page() throws Throwable {
		 Logger log = LogManager.getLogger(OutStaion_OneWayTrip .class);
	        PropertyConfigurator.configure("log4j.properties");
		 Outstation1 q = new Outstation1(driver);
		 q.Time().click();
		 log.info("time selected");
		 q.selectcar().click();
		log.info("selected car");
		      
		
	}
	 

	 @When("^Display the title of the selected car and select the summit$")
	public void User_enters_and_and_logs_in() throws Throwable {
		 Logger log = LogManager.getLogger(OutStaion_OneWayTrip .class);
	        PropertyConfigurator.configure("log4j.properties");
		 Outstation1 q = new Outstation1(driver);
		System.out.println("Title is Selected");
		log.info("title selected");
	}


 
    
    @And("^Close browsers2$")
    public void Close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver.quit();
    }
}