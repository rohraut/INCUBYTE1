package com.yahoopages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	@FindBy(css = "input[name=\"username\"]")
	public WebElement UsernameLnk;

	@FindBy(css = "input#login-signin")
	public WebElement NextLnk;

	@FindBy(css = "input#login-passwd")
	public WebElement passwordLnk;
	
	@FindBy(css = "button#login-signin")
	public WebElement NextLnk2;

	public void enterUserName() {
		UsernameLnk.sendKeys("rohanraut123@yahoo.com");

	}

	public void clickOnNextLnk() {
		NextLnk.click();

	}

	public void enterPassword() {
		passwordLnk.sendKeys("Roh@123");

	}
	public void clickOnNextLnk2() {
		NextLnk2.click();

	}

}
