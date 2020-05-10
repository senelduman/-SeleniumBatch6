package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	/*
	 * Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
	 * valid username and password Click on login button Then verify Syntax Logo is
	 * displayed.
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		WebElement webelement=driver.findElement(By.xpath("//img[contains@src,'images/syntax')]"));
		
		boolean isDisplay=webelement.isDisplayed();
		if(isDisplay==true) {
			System.out.println("Logo is Display,Test Case Passed");
		}else {
			System.out.println("Logo is Not Display,Test Case Failed");
		}
		
	}
}
