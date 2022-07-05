package com.configuration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.main.YahooKeywords;

public class BaseTest {
	@BeforeMethod
	public static void m1() {
		YahooKeywords.openBrowser("chrome");
		YahooKeywords.launchURL("https://login.yahoo.com/");

	}

	@AfterMethod
	public static void m2() {
		YahooKeywords.closeBrowser();

	}

}
