package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.Base;

public class AirportTab {
	public WebDriver driver;
	By selectAirport = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[1]/div[3]/a");
	By cityTab = By.id("fromCityList");
	By triptab = By.xpath("//select[@formcontrolname='frmLocalSubTripType']");
	By dropAddress = By.id("search_places");
	By calendar = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[4]/div[1]/div/p-calendar[1]/span/input");
	By Time = By.xpath("//*[@id=\"pickUpTime\"]");
	By selectcar = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[5]/div/button");
    By carSelect = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-select-car/div[2]/div/div/div[1]/div/div[4]/div/button");
    By carverify = By.xpath("//*[@id=\"static-1\"]/div/div/div[4]/div[2]/div");
     public AirportTab(WebDriver driver)
     {
    	 this.driver = driver;
     }
     public WebElement AirportTab1()
     {
    	 return driver.findElement(selectAirport);
   
     }
     public WebElement CityTab()
     {
    	 return driver.findElement(cityTab);
   
     }
     public WebElement TripTab()
     {
    	 return driver.findElement(triptab);
   
     }
     public WebElement AddressTab()
     {
    	 return driver.findElement(dropAddress);
   
     }
     public WebElement AirportTab()
     {
    	 return driver.findElement(selectAirport);
   
     }
     public WebElement Calendar()
     {
    	 return driver.findElement(calendar);
   
     }
     public WebElement Time()
     {
    	 return driver.findElement(Time);
   
     }
     public WebElement Car()
     {
    	 return driver.findElement(selectcar);
   
     }
     public WebElement Carselect()
     {
    	 return driver.findElement(carSelect);
   
     }
     public WebElement Verify()
     {
    	 return driver.findElement(carverify);
   
     }

}
