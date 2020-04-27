package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
public static void main(String[] args) {
	//ChromeDriver chrome = new ChromeDriver();
	
	System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
}
}
