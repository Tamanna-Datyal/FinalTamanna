package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUs {
public WebDriver driver;
	
	By aboutus = By.linkText("2000+ cities across India");
    By ceoname=By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-about-us/div[3]/div/div[3]");
	
	
	public AboutUs(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver = driver;
	}


	public WebElement Aboutus()
	{
		return driver.findElement(aboutus);
	}
	
	public WebElement CEOName()
	{
		return driver.findElement(ceoname);
	}
}
