package com.obsqura.testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;

public class LoginTest extends Base {

	@Test
	public void verifyTheUserCanAbletoLoginwithValidusernameandValidPasswordWhileClickonSignInButton()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField("admin");
		loginpage.enterPasswordOnPasswordField("admin");
		loginpage.clickOnSignInButton();
		boolean contentSectionIsDisplayed=loginpage.isContentSectionDisplayed();
		assertTrue(contentSectionIsDisplayed,"Unable to login with correct username and password");
	}
}
