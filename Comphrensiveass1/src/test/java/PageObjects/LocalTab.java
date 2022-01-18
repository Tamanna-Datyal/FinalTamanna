package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocalTab {
public WebDriver driver; 
By local = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[1]/div[2]/a/span");
By localcity = By.id("fromCityList");
//By cityclick = By.xpath("//*[@id=\\\"ngb-typeahead-2-3\\\"]/ngb-highlight/span[1]");
By pickupclick = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[2]/div/div/p-calendar[1]/span/input");
By selectDate = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[2]/div/div/p-calendar[1]/span/div/div/div/div[2]/table/tbody/tr[2]/td[5]/span");
By Time = By.id("pickUpTime");
By SelectCar = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[4]/div/button");
By carname = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-select-car/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div[1]/span");
By carselection = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-select-car/div[2]/div/div/div[3]/div/div[4]/div/button");
By carverify = By.xpath("//*[@id=\"static-1\"]/div/div/div[4]/div[2]/div");

public LocalTab(WebDriver driver)
{
	this.driver = driver;
}
public WebElement local()
{
	return driver.findElement(local);
	
}
public WebElement localcity()
{
	return driver.findElement(localcity);
	
}
/*public WebElement clickForcity()
{
	return driver.findElement(cityclick);
	
}*/
public WebElement clickForDate()
{
	return driver.findElement(pickupclick);
	
}
public WebElement Date()
{
	return driver.findElement(selectDate);
	
}
public WebElement Time()
{
	return driver.findElement(Time);
	
}
public WebElement SelectCar()
{
	return driver.findElement(SelectCar);
	
}
public WebElement CarName()
{
	return driver.findElement(carselection);
	
}
public WebElement CarNameDisplay()
{
	return driver.findElement(carname);
	
}
public WebElement CarVerify()
{
	return driver.findElement(carverify);
	
}


}
