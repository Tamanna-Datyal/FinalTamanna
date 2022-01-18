package TestCases;

import Resources.Base;


import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.AboutUs;
import PageObjects.AirportTab;
import PageObjects.AboutUs;

public class AboutUsHomePage extends Base {
	public static Logger Log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializeDriver();
	}
    @Test
    public void MainHomePage() throws InterruptedException
    {
    	Logger log = LogManager.getLogger(AboutUsHomePage.class);
        PropertyConfigurator.configure("log4j.properties");
        
    	driver.get(prop.getProperty("url"));      //We defined it here just because we have to access 2 time this site for different set of credentials 
    	
		AboutUs Au = new AboutUs(driver);
		Au.Aboutus().click();
		log.info("click on aboutus");
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		System.out.println("The CEO of the savaari.com is = "+Au.CEOName().getText());
		log.info("Print text");
		Assert.assertEquals(Au.CEOName().getText(), "Gaurav Aggarwal");
     
    }
    @AfterTest
    public void teardown()
    {
    	driver.quit();;
    	driver = null;
    }
}
