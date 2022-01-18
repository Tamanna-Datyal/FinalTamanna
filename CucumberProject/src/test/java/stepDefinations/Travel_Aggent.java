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

import PageObjects.OutStationPage;
import PageObjects.Outstation1;
import PageObjects.Sigin;
import PageObjects.TravelAgent;
import Resources.Base;



@RunWith(Cucumber.class)
public class Travel_Aggent extends Base{

	@Given("^initialize the browser and open site2$")
	public void Initialize_the_browser_with_chrome() throws Throwable {
	
	    // Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
	    
	}

	 @Given("^click on Loginbutton$")
	    public void click_on_login_button() throws Throwable {
			Logger log = LogManager.getLogger(Travel_Aggent.class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		 TravelAgent A = new TravelAgent(driver);
			A.clickfornextpg().click();
			log.info("clicked on next page");
			Set<String> ids=driver.getWindowHandles();
			Iterator<String>it=ids.iterator();
			it.next();
			String Childid=it.next();
			driver.switchTo().window(Childid);
			A.login().click();
			log.info("login clicked");
	 }
	 
	 
	 @Given("^User enters (.+) and (.+) and login1$")
	    public void enters_username_password(String arg1,String arg2) throws Throwable {
			Logger log = LogManager.getLogger(Travel_Aggent.class);
	        PropertyConfigurator.configure("log4j.properties");
		 TravelAgent A = new TravelAgent(driver);
			A.Email().sendKeys(arg1);
			log.info("email entered");
			A.Password().sendKeys(arg2);
			log.info("password entered");
			A.Login().click();
		
		      
		
	}
	 

	 @When("^Display error1 message$")
	public void display_error_message() throws Throwable {
			Logger log = LogManager.getLogger(Travel_Aggent.class);
	        PropertyConfigurator.configure("log4j.properties");
	      
		 TravelAgent A = new TravelAgent(driver);
			System.out.println(A.ToVerify().isDisplayed());
			log.info("text displayed");
			System.out.println(A.ToVerify().getText());
	}


 
    
    @And("^Close browsers3$")
    public void Close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver.quit();
    }
}