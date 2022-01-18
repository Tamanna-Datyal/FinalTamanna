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

import PageObjects.Sigin;
import Resources.Base;



@RunWith(Cucumber.class)
public class SignIn_Details extends Base{

	@Given("^Initialize the browser with chrome$")
	public void Initialize_the_browser_with_chrome() throws Throwable {
	
	    // Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();
	    
	}

	 @Given("^Navigate to \"([^\"]*)\" Site$")
	    public void Navigate_to_Site(String arg1) throws Throwable {
		 Logger log = LogManager.getLogger(SignIn_Details.class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		 driver.get(arg1);
		 log.info("navigate to page");
			
	 }
	 
	 
	 @Given("^Click on login link in home page to land on sign in page$")
	    public void Click_on_login_link_in_home_page_to_land_on_sign_in_page() throws Throwable {
		 Logger log = LogManager.getLogger(SignIn_Details.class);
	        PropertyConfigurator.configure("log4j.properties");
		 Sigin s = new  Sigin(driver);
		 s.ClickForsigin().click();
		 log.info("sigin clicked");
		
		      
		
	}
	 

	 @When("^User enters (.+) and (.+) and logs in$")
	public void User_enters_and_and_logs_in(String arg1 , String arg2) throws Throwable {
		 Logger log = LogManager.getLogger(SignIn_Details.class);
	        PropertyConfigurator.configure("log4j.properties");
	      
		 Sigin s = new  Sigin(driver);
		 s.Email().sendKeys(arg1);
		 log.info("entered email");
		 s.Password().sendKeys(arg2);
		 log.info("entered password");
		 s.ToLogin().click();
	}


    @Then("^display error message$")
    public void Verify_user_is_successfully_logged_in() throws Throwable {
    	Logger log = LogManager.getLogger(SignIn_Details.class);
        PropertyConfigurator.configure("log4j.properties");
	    // Write code here that turns the phrase above into concrete actions
    	 Sigin s = new  Sigin(driver);
    	 System.out.println(s.ToVerify().isDisplayed());
    	 log.info("text displayed");
		 System.out.println(s.ToVerify().getText());  
               
    }
    
    @And("^Close browsers$")
    public void Close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver.quit();
    }
}