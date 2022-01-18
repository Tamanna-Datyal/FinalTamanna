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

import PageObjects.AboutUs;
import Resources.Base;




@RunWith(Cucumber.class)
public class About_us extends Base{

	@Given("^initialize the browser and open site4$")
	public void Initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
	    
	}
	 @Given("^Click on Aboutus$")
	    public void click() throws Throwable {
		    
		 Logger log = LogManager.getLogger(About_us.class);
	        PropertyConfigurator.configure("log4j.properties");
	    	
	    	AboutUs Au = new AboutUs(driver);
			Au.Aboutus().click();
			log.info("Clicked on the about us linked");
			Set<String> ids=driver.getWindowHandles();
			Iterator<String>it=ids.iterator();
			it.next();
			String Childid=it.next();
			driver.switchTo().window(Childid);
			
	 }

	 @Given("^print CEO name$")
	    public void CEO_name() throws Throwable {
		 Logger log = LogManager.getLogger(About_us.class);
	        PropertyConfigurator.configure("log4j.properties");
		    // Write code here that turns the phrase above into concrete actions
		 AboutUs Au = new AboutUs(driver);
		 System.out.println("The CEO of the savaari.com is = "+Au.CEOName().getText());
		log.info("print text");
			Assert.assertEquals(Au.CEOName().getText(), "Gaurav Aggarwal");
			
	 }
	 
	@And("^Close browsers5$")
    public void Close_browsers4() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    	driver.quit();
    }
}