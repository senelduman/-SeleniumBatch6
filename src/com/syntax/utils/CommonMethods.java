package com.syntax.utils;

import java.util.List;

import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass {
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}
	public static void clikRadioOrCheckbox(List<WebElement>radioOrcheckbox,String value) {
		String actualValue;
		for(WebElement el:radioOrcheckbox) {
			actualValue=el.getAttribute("value");
			if(actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}
}
