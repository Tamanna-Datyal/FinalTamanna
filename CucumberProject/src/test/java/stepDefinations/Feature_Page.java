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

import PageObjects.Featured;
import PageObjects.OutStationPage;
import PageObjects.Outstation1;
import PageObjects.Sigin;
import PageObjects.TravelAgent;
import Resources.Base;



@RunWith(Cucumber.class)
public class Feature_Page extends Base{

	@Given("^initialize the browser and open Sitee")
	public void Initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
	    
	}

	 @Given("^click on IndianExpress$")
	    public void click_on_IndianExpress() throws Throwable {
		 Logger log = LogManager.getLogger(Feature_Page.class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		 Featured F = new Featured(driver);
			F.IndianExpress().click();
			log.info("Indian express clicked");
		    Set<String> ids=driver.getWindowHandles();
			Iterator<String>it=ids.iterator();
			it.next();
			String Childid=it.next();
			driver.switchTo().window(Childid);
	 }
	 
	 
	 @Given("^diplay text and Validate1$")
	    public void text_and_validate() throws Throwable {
		 Logger log = LogManager.getLogger(Feature_Page.class);
	        PropertyConfigurator.configure("log4j.properties");
		 Featured F = new Featured(driver);
		 System.out.println(F.HeadLine().getText());
		 log.info("text displayed");
			Assert.assertEquals(F.HeadLine().getText(), "Rent a car to avoid risk of COVID-19 is what office goers seem to prefer");
		
   }
	  
    @And("^close Browsers$")
    public void Close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver.quit();
    }
}