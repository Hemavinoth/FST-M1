package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
	
	WebDriver driver;

	public PIMPage(WebDriver driver) {
        this.driver = driver;
    }

    By pimMenu = By.id("menu_pim_viewPimModule");
    By addBtn = By.id("btnAdd");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By saveBtn = By.id("btnSave");

    public void addEmployee(String fName, String lName) {
        driver.findElement(pimMenu).click();
        driver.findElement(addBtn).click();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(saveBtn).click();
    }

}
