package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadApp {
	public WebDriver driver;
	 
	By click = By.xpath("//*[@id=\"sv_header\"]/div/div[3]/div/a[1]");
	
	By verify = By.className("AHFaub");
	
	 
	public DownloadApp(WebDriver driver) 
	{
		this.driver = driver;
	}
public WebElement ClickonDownloadApp()
{
	return driver.findElement(click);
}


public WebElement Verify()
{
	return driver.findElement(verify);
}
}
