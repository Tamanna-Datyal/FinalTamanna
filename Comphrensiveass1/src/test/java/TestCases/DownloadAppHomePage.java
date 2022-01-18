package TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.DownloadApp;
import Resources.Base;




public class DownloadAppHomePage extends Base {
public static Logger Log = LogManager.getLogger(Base.class.getName());
@BeforeTest
public void intialize() throws IOException 
{
	driver = initializeDriver();
	
}
@Test
public void MainHomePage() throws InterruptedException
{
	Logger log = LogManager.getLogger( DownloadAppHomePage.class);
    PropertyConfigurator.configure("log4j.properties");
    
	driver.get(prop.getProperty("url"));
	DownloadApp a = new DownloadApp(driver);
	log.info("click on download app");
	a.ClickonDownloadApp().click();
	Set<String> ids=driver.getWindowHandles();
	Iterator<String>it=ids.iterator();
	it.next();
	String Childid=it.next();
	driver.switchTo().window(Childid);
    System.out.println(a.Verify().isDisplayed());
    log.info("display text");
	System.out.println(a.Verify().getText());
	Assert.assertEquals(a.Verify().getText(),"Savaari - Outstation Car Rental & Airport Taxi App");
}
@AfterTest
public void  teardown()
{
	driver.quit();
	driver = null;
}	

}
