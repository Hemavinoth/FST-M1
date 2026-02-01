package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) 
	{
	
	this.driver=driver;
	}
	
	By welcome = By.id("welcome");
	By directoryMenu =By.id("menu_directory_viewDirectory");
	
	public boolean isDashboardDisplayed()
	{
		return driver.findElement(welcome).isDisplayed();
	}
	public void clickDirectory()
	{
		 driver.findElement(directoryMenu).click();
	}
}
