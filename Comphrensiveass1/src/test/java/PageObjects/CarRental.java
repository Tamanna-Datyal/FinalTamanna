package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarRental {
public WebDriver driver;
By click = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/app-footer/footer/div[2]/div[2]/div/a[4]");
By verify = By.xpath("//*[@id=\"headingHolder\"]/span[2]");
public CarRental(WebDriver driver) 
{
	this.driver = driver;
}
public WebElement ClickonPune()
{
return driver.findElement(click);
}

public WebElement verify()
{
return driver.findElement(verify);
}
}
