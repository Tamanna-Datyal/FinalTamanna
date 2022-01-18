package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CabBooking {
	public WebDriver driver;
	By Booking = By.xpath("//a[@href='https://www.savaari.com/mobile-app']");
	By verify = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-download-app/div/div/div/div/div[2]/div[1]/div[1]/h1");
	public CabBooking(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver = driver;
	}
    public WebElement bookingCab()
    {
   	 return driver.findElement(Booking);
  
    }
    public WebElement Toverify()
    {
   	 return driver.findElement(verify);
  
    }
}
