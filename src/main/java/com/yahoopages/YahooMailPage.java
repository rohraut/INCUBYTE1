package com.yahoopages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class YahooMailPage {
	@FindBy(css = "a[role=\"button\"]")
	public WebElement ComposeLnk;
	@FindBy(css = "#message-to-field")
	public WebElement ToLnk;
	@FindBy(css = "input[data-test-id=\"compose-subject\"]")
	public WebElement SubjectLnk;
	@FindBy(css = "div[data-test-id=\"rte\"]")
	public WebElement BodyLnk;
	@FindBy(css = "#mail-app-component > div > div > div > div.em_N.D_F.ek_BB.p_R.o_h > div:nth-child(2) > div > button > span")
	public WebElement SendLnk;
	@FindBy(css = "span[data-test-folder-name=\"Sent\"]")
	public WebElement SentLnk;
	@FindBy(xpath = "//span[text()=\"2:52 pm\"]")
	public WebElement SentParticipantLnk;

	public void clickOnComposeLnk() {
		ComposeLnk.click();

	}

	public void enterEmailID() {
		ToLnk.sendKeys("damu.dhote@gmail.com");

	}

	public void typeSubject() {
		SubjectLnk.sendKeys("Application for QA Automation Engineer");

	}

	public void enterMessageBody() {
		BodyLnk.sendKeys("Good Morning to All");

	}

	public void clickOnSendLnk() {
		SendLnk.click();

	}

	public void clickOnSentLink() {
		SentLnk.click();
	}

	public void getTextOfSentParticipant() {
		String actualTitle = SentParticipantLnk.getText();
		String expectedTitle = "2:52 pm";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
