package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.configuration.BaseTest;
import com.main.YahooKeywords;
import com.yahoopages.SignInPage;
import com.yahoopages.YahooHomePage;
import com.yahoopages.YahooMailPage;

public class RegressionTests extends BaseTest {
	@Test
	public static void m3() {

		SignInPage page = PageFactory.initElements(YahooKeywords.driver, SignInPage.class);
		YahooKeywords.waitForElement(3000);
		page.enterUserName();
		page.clickOnNextLnk();
		page.enterPassword();
		page.clickOnNextLnk2();

	}

	@Test
	public void m4() {
		SignInPage page = PageFactory.initElements(YahooKeywords.driver, SignInPage.class);
		YahooKeywords.waitForElement(3000);
		page.enterUserName();
		page.clickOnNextLnk();
		page.enterPassword();
		page.clickOnNextLnk2();

		YahooHomePage s = PageFactory.initElements(YahooKeywords.driver, YahooHomePage.class);
		s.clickOnMailLnk();

	}

	@Test
	public void m5() {
		SignInPage page = PageFactory.initElements(YahooKeywords.driver, SignInPage.class);
		YahooKeywords.waitForElement(3000);
		page.enterUserName();
		page.clickOnNextLnk();
		page.enterPassword();
		page.clickOnNextLnk2();

		YahooHomePage s = PageFactory.initElements(YahooKeywords.driver, YahooHomePage.class);
		s.clickOnMailLnk();

		YahooMailPage t = PageFactory.initElements(YahooKeywords.driver, YahooMailPage.class);
		t.clickOnComposeLnk();
		t.enterEmailID();
		t.typeSubject();
		t.enterMessageBody();
		t.clickOnSendLnk();
		t.clickOnSentLink();
		t.getTextOfSentParticipant();

	}

}
