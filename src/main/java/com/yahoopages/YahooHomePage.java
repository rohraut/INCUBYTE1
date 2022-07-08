package com.yahoopages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.main.YahooKeywords;

public class YahooHomePage {
	@FindBy(css = "div.mail")
	public WebElement MailLnk;

	public void clickOnMailLnk() {
		MailLnk.click();
		String actualTitle = YahooKeywords.driver.getTitle();
		String expectedTitle = "(1 unread) - rohanraut123@yahoo.com - Yahoo Mail";
		Assert.assertEquals(actualTitle, expectedTitle);

	}

}
