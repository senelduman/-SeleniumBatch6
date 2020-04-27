package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
//	Open chrome browser
//	Go to “http://newtours.demoaut.com/”
//	Click on Register Link
//	Fill out all required info
//	Click Submit
//	User successfully registered
//	(Create 2 scripts using different locators)
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://newtours.demoaut.com/");
	//String url=driver.getCurrentUrl();
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("senel");
}
}
