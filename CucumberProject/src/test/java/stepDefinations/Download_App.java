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

import PageObjects.DownloadApp;
import PageObjects.OutStationPage;
import PageObjects.Outstation1;
import PageObjects.Sigin;
import PageObjects.TravelAgent;
import Resources.Base;



@RunWith(Cucumber.class)
public class Download_App extends Base{

	@Given("^initialize the browser and open sitee$")
	public void Initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
	    
	}

	 @Given("^click on download$")
	    public void click_on_downloads() throws Throwable {
		 Logger log = LogManager.getLogger(Download_App.class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		 DownloadApp a = new DownloadApp(driver);
		   a.ClickonDownloadApp().click();
		   log.info("clicked on download");
		 Set<String> ids=driver.getWindowHandles();
			Iterator<String>it=ids.iterator();
			it.next();
			String Childid=it.next();
			driver.switchTo().window(Childid);
	 }
	 
	 
	 @Given("^diplay text and Validate$")
	    public void display_text_and_VALIDATE() throws Throwable {
		 Logger log = LogManager.getLogger(Download_App.class);
	        PropertyConfigurator.configure("log4j.properties");
		 DownloadApp a = new DownloadApp(driver);
		 System.out.println(a.Verify().isDisplayed());
			System.out.println(a.Verify().getText());
			log.info("text displayed");
			Assert.assertEquals(a.Verify().getText(),"Savaari - Outstation Car Rental & Airport Taxi App");
		      
		
	}
	  @And("^Close Browsers$")
    public void Close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver.quit();
    }
}