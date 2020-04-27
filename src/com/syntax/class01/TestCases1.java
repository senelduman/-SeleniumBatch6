package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	String url=driver.getCurrentUrl();
	driver.getTitle();
	driver.navigate().to("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
}
}
