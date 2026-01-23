package com.activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/login-form/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//form//button[normalize-space()='Submit']")).click();
		String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println(message);
		driver.quit();

	}

}
