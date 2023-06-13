package com.obsqura.testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.obsqura.pages.LoginPage;
import com.obsqura.utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test
	public void verifyTheUserCanAbletoLoginwithValidusernameandValidPasswordWhileClickonSignInButton()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		boolean contentSectionIsDisplayed=loginpage.isContentSectionDisplayed();
		assertTrue(contentSectionIsDisplayed,"Unable to login with valid username and password");
	}
	
	@Test
	public void verifyTheUserCannotLoginwithValidusernameandInvalidPasswordWhileClickonSignInButton()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(2, 0, "LoginPage"));
		loginpage.enterPasswordOnPasswordField(ExcelUtility.getString(2, 1, "LoginPage"));
		loginpage.clickOnSignInButton();
		boolean invalidUsernameOrPasswordAlertMessageIsDisplayed=loginpage.isInvalidUsernameOrPasswordAlertMessageDisplayed();
		assertTrue(invalidUsernameOrPasswordAlertMessageIsDisplayed, "Able to login with valid username and invalid password");
	}
	
	@Test
	public void verifyTheUserCannotLoginwithInvalidusernameandValidPasswordWhileClickonSignInButton()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(3, 0, "LoginPage"));
		loginpage.enterPasswordOnPasswordField(ExcelUtility.getString(3, 1, "LoginPage"));
		loginpage.clickOnSignInButton();
		boolean invalidUsernameOrPasswordAlertMessageIsDisplayed=loginpage.isInvalidUsernameOrPasswordAlertMessageDisplayed();
		assertTrue(invalidUsernameOrPasswordAlertMessageIsDisplayed, "Able to login with invalid username and valid password");
	}
	
	@Test
	@Parameters({"username","password"})
	public void verifyTheUserCannotLoginwithInvalidusernameandInvalidPasswordWhileClickonSignInButton(String username,String password)
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean invalidUsernameOrPasswordAlertMessageIsDisplayed=loginpage.isInvalidUsernameOrPasswordAlertMessageDisplayed();
		assertTrue(invalidUsernameOrPasswordAlertMessageIsDisplayed, "Able to login with invalid username and invalid password");
	}
}
