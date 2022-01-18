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
import Resources.Base;



@RunWith(Cucumber.class)
public class OutStaion_RoundTRip extends Base{

	@Given("^Initialize the browser and open site$")
	public void Initialize_the_browser_with_chrome() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();
	    
	}

	 @Given("^Select the Round Trip checkBox$")
	    public void Navigate_to_Site() throws Throwable {
		 Logger log = LogManager.getLogger( OutStaion_RoundTRip.class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		 OutStationPage l = new OutStationPage(driver);
		 l.roundtrip().click();
		 log.info("roundtrip clicked");
			
	 }
	 
	 
	 @Given("^User enters From City (.+) and tocity (.+)$")
	    public void Click_on_login_link_in_home_page_to_land_on_sign_in_page(String fromCity , String tocity) throws Throwable {
		 Logger log = LogManager.getLogger(OutStaion_RoundTRip.class);
	        PropertyConfigurator.configure("log4j.properties");
		 OutStationPage l = new OutStationPage(driver);
		 l.roundtrip().click();
			l.from().sendKeys(fromCity);
			log.info("fromcity selected");
			Thread.sleep(2000);
			l.from().sendKeys(Keys.ARROW_DOWN);
			l.from().sendKeys(Keys.ARROW_DOWN);
			l.from().sendKeys(Keys.ENTER);
			l.Tocity().sendKeys(tocity);
			log.info("tocity");
			Thread.sleep(2000);
			l.Tocity().sendKeys(Keys.ARROW_DOWN);
			l.Tocity().sendKeys(Keys.ENTER);
		
		      
		
	}
	 

	 @When("^User select the time for travel and click to summit button$")
	public void User_enters_and_and_logs_in() throws Throwable {
		 Logger log = LogManager.getLogger(OutStaion_RoundTRip.class);
	        PropertyConfigurator.configure("log4j.properties");
	      
		 OutStationPage l = new OutStationPage(driver);
		 l.returnDate().click();
			l.selectcar().click();
			log.info("date selected");
	}


    @Then("^Display the title of the selected car and select the summit button$")
    public void Verify_user_is_successfully_logged_in() throws Throwable {
    	Logger log = LogManager.getLogger(OutStaion_RoundTRip.class);
        PropertyConfigurator.configure("log4j.properties");
	    // Write code here that turns the phrase above into concrete actions
    	OutStationPage l = new OutStationPage(driver);
    	 System.out.println("Car Is Selected");
    	 log.info("text displayed");
		 
               
    }
    
    @And("^Close browsers1$")
    public void Close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver.quit();
    }
}