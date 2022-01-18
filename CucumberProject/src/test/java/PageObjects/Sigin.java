package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sigin {
	
public WebDriver driver;

By Siginclick = By.xpath("//*[@id=\"sv_header\"]/div/div[3]/div/a[3]/div");
By username = By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/input[1]");
By Password = By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/input[2]");
By Login = By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/div[2]/button[1]/div/span");
By errormessageprint = By.xpath("//*[@id=\"approot\"]/app-navbar/div[2]/div/div[2]/form/div[3]/div");

public Sigin(WebDriver driver)
{
	this.driver = driver;

}
 public WebElement ClickForsigin()
 {
	 return driver.findElement(Siginclick);
 
}
 public WebElement Email()
 {
	 return driver.findElement(username);
 
}
 public WebElement Password()
 {
	 return driver.findElement(Password);
 
}
 public WebElement ToLogin()
 {
	 return driver.findElement(Login);
 
 }
 public WebElement ToVerify()
 {
	 return driver.findElement(errormessageprint);
 
}

 
}
 
 
 
 
 
 
 

 