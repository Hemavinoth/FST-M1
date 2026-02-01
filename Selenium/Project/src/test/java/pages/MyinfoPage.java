package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyinfoPage {

	 WebDriver driver;

	    public MyinfoPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    By myInfoMenu = By.id("menu_pim_viewMyDetails");
	    By editBtn = By.id("btnSave");
	    By firstName = By.id("personal_txtEmpFirstName");
	    By saveBtn = By.id("btnSave");

	    By qualificationsTab = By.linkText("Qualifications");
	    By addWorkExp = By.id("addWorkExperience");
	    By employer = By.id("experience_employer");
	    By workSave = By.id("btnWorkExpSave");
	    
	    By applyleave = By.id("//span[text()=\"Apply Leave\"]");
	    WebElement leaveType=driver.findElement(By.id("applyleave_txtLeaveType"));
	    
	    Select option = new Select(leaveType);
	    By fromdate=By.id("id=applyleave_txtFromDate");
	    By todate=By.id("applyleave_txtToDate");
	    By applybtn = By.id("applyBtn");
	    
	  //  By myleavepage=By.id("//a[text()='My Leave']");
	    
	    By myleavedatesearch = By.id("calFromDate");
	    By mytodatesearch =By.id("calToDate");
	    
	   By btnSearch =By.id("btnSearch");
	    
	    //option.selectByVisibleText("DayOff");
	    
	    
	    

	    By emergencyContacts = By.linkText("Emergency Contacts");

	    public void editPersonalInfo(String name) {
	        driver.findElement(myInfoMenu).click();
	        driver.findElement(editBtn).click();
	        driver.findElement(firstName).clear();
	        driver.findElement(firstName).sendKeys(name);
	        driver.findElement(saveBtn).click();
	    }

	    public void addQualification(String company) {
	        driver.findElement(qualificationsTab).click();
	        driver.findElement(addWorkExp).click();
	        driver.findElement(employer).sendKeys(company);
	        driver.findElement(workSave).click();
	    }
	    
		/*
		 * public void applyLeave() { leaveType.click();
		 * option.selectByVisibleText("DayOff");
		 * driver.findElement(fromdate).sendKeys("2026-01-29");
		 * driver.findElement(todate).sendKeys("2026-01-29");
		 * driver.findElement(applybtn).click();
		 * driver.findElement(myleavepage).click();
		 * driver.findElement(myleavedatesearch).sendKeys("2026-01-29");
		 * driver.findElement(mytodatesearch).sendKeys("2026-01-29");
		 * driver.findElement(btnSearch).click();
		 * 
		 * }
		 */
	    
	    

	    public void openEmergencyContacts() {
	        driver.findElement(emergencyContacts).click();
	    }

}
