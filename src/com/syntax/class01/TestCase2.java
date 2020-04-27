package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redfin.com");
		String actual = driver.getCurrentUrl();
		String expected = ("https://www.redfin.com/");
		if (actual.equals(expected)) {
		
			
			System.out.println("Correct URL, Verification is successful");
		} else {
			System.out.println("Wrong Url is returned. Verification failed");
		}
		
		driver.close();

	}
}
