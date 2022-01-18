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

import PageObjects.CarRental;
import Resources.Base;

public class CarRentalHomePage extends Base{
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void intialize() throws IOException
	{
         driver = initializeDriver();			
	}
	
	@Test
	public void NavigationPage()  throws IOException, InterruptedException
	{
		Logger log = LogManager.getLogger(CarRentalHomePage.class);
        PropertyConfigurator.configure("log4j.properties");
		driver.get(prop.getProperty("url"));      //We defined it here just because we have to access 2 time this site for different set of credentials 
	
		CarRental F = new CarRental(driver);
		Thread.sleep(2000);
		log.info("click on link");
		F.ClickonPune().click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		
		System.out.println(F.verify().getText());
		log.info("display text");
		Assert.assertEquals(F.verify().getText(),"Pune");
	}
		@AfterTest
		public void  teardown()
		{
			driver.quit();
			driver = null;
		}	

}
