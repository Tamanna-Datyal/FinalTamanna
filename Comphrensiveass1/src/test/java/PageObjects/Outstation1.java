package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Outstation1 {
	public WebDriver driver;
	By click = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[1]/div[1]/a/span");
	By oneway = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/div[1]/label");
	By from = By.xpath("//*[@id=\"fromCityList\"]");
	By To = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[2]/div/input");
	By Time = By.id("pickUpTime");
	By selectCar = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[4]/div/button");
	public Outstation1(WebDriver driver) 
	{
		this.driver = driver;
	}
public WebElement Click()
{
	return driver.findElement(click);
}
public WebElement OneWay()
{
	return driver.findElement(oneway);
}
public WebElement From()
{
	return driver.findElement(from);
}
public WebElement To()
{
	return driver.findElement(To);
}
public WebElement Time()
{
	return driver.findElement(Time);
}
public WebElement selectcar()
{
	return driver.findElement(selectCar);
}

}
