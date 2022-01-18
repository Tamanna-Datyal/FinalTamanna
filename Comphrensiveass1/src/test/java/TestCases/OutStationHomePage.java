package TestCases;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.OutStationPage;
import Resources.Base;

public class OutStationHomePage extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializeDriver();
	}
	@Test
	public void MainHomePage () throws InterruptedException
	{
		Logger log = LogManager.getLogger(OutStationHomePage.class);
        PropertyConfigurator.configure("log4j.properties");
        
		driver.get(prop.getProperty("url"));
		OutStationPage l = new OutStationPage(driver);
		l.roundtrip().click();
		log.info("click on round trip");
		l.from().sendKeys("banglore");
		log.info("enter city");
		Thread.sleep(2000);
		l.from().sendKeys(Keys.ARROW_DOWN);
		l.from().sendKeys(Keys.ARROW_DOWN);
		l.from().sendKeys(Keys.ENTER);
		l.Tocity().sendKeys("pune");
		log.info("enter tocity");
		Thread.sleep(2000);
		l.Tocity().sendKeys(Keys.ARROW_DOWN);
		l.Tocity().sendKeys(Keys.ENTER);
		l.returnDate().click();
		l.selectcar().click();
		log.info("car selected");
		
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
		driver = null;
	}
	

}
