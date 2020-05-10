package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
	/*
	 * HRMS Application Negative Login: Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” 
	 * Enter valid username 
	 * Leave password field empty 
	 * Verify error message with text
	 * “Password cannot be empty” is displayed.
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		WebElement webelement=driver.findElement(By.xpath("//span[@id='spanMessage')]"));
		
		boolean isDisplay=webelement.isDisplayed();
		if(isDisplay==true) {
			System.out.println("Password cannot be empty");
		}else {
			System.out.println("Password enterd Successfully");
		}
		
		
		
		
		
}
}