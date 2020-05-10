package com.syntax.hw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4 {
	/*
	 * Radio Buttons Practice Open chrome browser Go to
	 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
	 * Forms” links Click on “Radio Buttons Demo” links Click on any radio button in
	 * “Radio Button Demo” section. Verify correct radio is clicked Click on any
	 * radio button in “Group Radio Buttons Demo” section. Verify correct checkbox
	 * is clicked Quit browser
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Radio Buttons Demo')]")).click();
		List<WebElement>radio=(List<WebElement>) driver.findElement(By.cssSelector("input[type='radio'"));
		for(WebElement radioButton:radio) {
			//if(button.getAttribute)
		}

}
}