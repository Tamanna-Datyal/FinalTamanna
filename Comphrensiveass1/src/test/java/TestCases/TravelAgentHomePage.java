package TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.TravelAgent;
import Resources.Base;

public class TravelAgentHomePage extends Base {
	public static Logger Log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = initializeDriver();
	}
	@Test
	public void MainHomePage() {
		Logger log = LogManager.getLogger(TravelAgentHomePage.class);
        PropertyConfigurator.configure("log4j.properties");
        
		driver.get(prop.getProperty("url"));
		
		TravelAgent A = new TravelAgent(driver);
		A.clickfornextpg().click();
	   log.info("click on next page");
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		it.next();
		String Childid=it.next();
		driver.switchTo().window(Childid);
		A.login().click();
		log.info("click on login");
		A.Email().sendKeys("tamannathakur@gmail.com");
		log.info("enter email");
		A.Password().sendKeys("5678908");
		log.info("enter password");
		A.Login().click();
		log.info("click");
		System.out.println(A.ToVerify().isDisplayed());
		System.out.println(A.ToVerify().getText());
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
		driver=null;
	}
}

