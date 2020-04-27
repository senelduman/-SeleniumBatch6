package com.syntax.class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases01 {
	  public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.name("firstname")).sendKeys("Senel");
	        driver.findElement(By.name("lastname")).sendKeys("Duman");
	        driver.findElement(By.id("u_0_r")).sendKeys("12345678");
	        driver.findElement(By.name("websubmit")).click();
	    }

}
