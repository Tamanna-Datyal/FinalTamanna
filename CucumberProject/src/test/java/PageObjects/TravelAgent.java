package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelAgent {
public  WebDriver driver;
By click = By.xpath("//*[@id=\"sv_header\"]/div/div[3]/div/a[2]");
By login = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-landing-page/div/div[3]/div/div[1]/button/div");
By Email = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-landing-page/div/div[5]/div/div[2]/form/input[1]");
By Password = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-landing-page/div/div[5]/div/div[2]/form/input[2]");
By Login = By.xpath("//*[@id=\"login1\"]");
By errormessageprint = By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-landing-page/div/div[5]/div/div[2]/form/div[3]/div");
 
public TravelAgent(WebDriver driver)
{
	this.driver = driver;
}
public WebElement clickfornextpg()
{
	return driver.findElement(click);
}
public WebElement login()
{
	return driver.findElement(login);
}
public WebElement Email()
{
	return driver.findElement(Email);
}
public WebElement Password()
{
	return driver.findElement(Password);
}
public WebElement Login()
{
	return driver.findElement(Login);
}
public WebElement ToVerify()
{
	return driver.findElement(errormessageprint);
}

}
