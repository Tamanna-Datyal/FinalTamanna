package TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Featured;
import Resources.Base;

public class FeaturedHomePage extends Base{

	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void intialize() throws IOException
	{
         driver = initializeDriver();			
	}
	
	@Test
	public void NavigationPage()  throws IOException
	{
		Logger log = LogManager.getLogger( FeaturedHomePage.class);
        PropertyConfigurator.configure("log4j.properties");
        
		driver.get(prop.getProperty("url"));      //We defined it here just because we have to access 2 time this site for different set of credentials 
	
		Featured F = new Featured(driver);
		log.info("click on Indian Express");
		F.IndianExpress().click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		log.info("print headline");
		System.out.println(F.HeadLine().getText());
		Assert.assertEquals(F.HeadLine().getText(), "Rent a car to avoid risk of COVID-19 is what office goers seem to prefer");
	}
		@AfterTest
		public void  teardown()
		{
			driver.quit();
			driver = null;
		}	
	}

