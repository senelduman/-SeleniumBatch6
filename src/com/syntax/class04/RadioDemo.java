package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
	public static String url = "https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement maleRadioB = driver.findElement(By.xpath("//input[@id='sex-0']"));
		System.out.println(maleRadioB.getAttribute("class"));
		System.out.println(maleRadioB.isDisplayed());
		System.out.println(maleRadioB.isEnabled());
		System.out.println("Radio Btn is Selected:: " + maleRadioB.isSelected());
		System.out.println("******");

		maleRadioB.click();
		System.out.println("Radio Btn is Selected:: " + maleRadioB.isSelected());
		List<WebElement> proList = (List<WebElement>) driver.findElement(By.xpath("//input[@name='persofession']"));
		int listSize = proList.size();
		System.out.println("Size of CheckBoxes are ::" + listSize);
		String valueToBeSelected = "Manual Tester";

		for (WebElement profession : proList) {
			String value = profession.getAttribute("value");
			System.out.println(value);
			if (value.equals(valueToBeSelected)) {
				profession.click();
				break;

			}
		}

	}
}
