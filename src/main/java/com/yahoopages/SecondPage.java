package com.yahoopages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {
	@FindBy(css="div.mail")
	public WebElement MailLnk;
	
	public void clickOnMailLnk() {
		MailLnk.click();

	}

}
