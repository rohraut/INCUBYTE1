package com.test;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.configuration.BaseTest;
import com.main.YahooKeywords;
import com.yahoopages.SecondPage;
import com.yahoopages.SignInPage;
import com.yahoopages.ThirdPage;

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

		SecondPage s = PageFactory.initElements(YahooKeywords.driver, SecondPage.class);
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

		SecondPage s = PageFactory.initElements(YahooKeywords.driver, SecondPage.class);
		s.clickOnMailLnk();

		ThirdPage t = PageFactory.initElements(YahooKeywords.driver, ThirdPage.class);
		t.clickOnComposeLnk();
		YahooKeywords.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		t.enterEmailID();
		t.typeSubject();
		t.enterMessageBody();
		t.clickOnSendLnk();

	}

}
