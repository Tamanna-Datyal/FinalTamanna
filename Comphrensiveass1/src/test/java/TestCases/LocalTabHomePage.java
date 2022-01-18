package TestCases;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LocalTab;
import Resources.Base;

public class LocalTabHomePage extends Base {
	 public static Logger Log = LogManager.getLogger(Base.class.getName());
	 @BeforeTest
	 public void intialize() throws IOException
	 {
		 driver = initializeDriver();
	 }
	 @Test
	 public void MainHomePage() throws InterruptedException
	 {
		 Logger log = LogManager.getLogger(LocalTabHomePage.class);
	        PropertyConfigurator.configure("log4j.properties");
	        
		 driver.get(prop.getProperty("url"));
		 LocalTab lt = new LocalTab(driver);
		 log.info("click on LocalTab");
		 lt.local().click();
		 lt.localcity().sendKeys("New Delhi");
		 log.info("enter city");
		 Thread.sleep(3000);
		 lt.localcity().sendKeys(Keys.ARROW_DOWN);
		 lt.localcity().sendKeys(Keys.ENTER);
	//	 lt.clickForcity().click();
		/* lt.clickForDate().click();
		 lt.Date().click();
		 Thread.sleep(5000);*/
		 log.info("select time");
		 lt.Time().click();
		 lt.Time().sendKeys(Keys.ARROW_DOWN);
		 lt.Time().sendKeys(Keys.ARROW_DOWN);
		 lt.Time().sendKeys(Keys.ARROW_DOWN);
		 lt.Time().sendKeys(Keys.ARROW_DOWN);
		 lt.Time().sendKeys(Keys.ARROW_DOWN);
		 lt.SelectCar().click();
		 log.info("select car");
		 System.out.println(lt.CarNameDisplay().getText());
		 lt.CarName().click();
		 log.info("print car name");
		 Assert.assertEquals(lt.CarVerify().getText(), "SUV (6+1 seater)");
		 System.out.println(lt.CarVerify().getText());
	 }
	@AfterTest
	 public void teardown()
	 {
		 driver.quit();
		 driver = null;
	 }
	 
}
