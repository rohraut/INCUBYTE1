package com.yahoopages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage {
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

	public void clickOnComposeLnk() {
		ComposeLnk.click();

	}

	public void enterEmailID() {
		ToLnk.sendKeys("rohanraut31097@gmail.com");

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

}
