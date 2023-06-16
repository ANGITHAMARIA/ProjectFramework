package com.obsqura.testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.obsqura.pages.LoginPage;
import com.obsqura.utilities.ExcelUtility;

import retry.Retry;

public class LoginTest extends Base {

	@Test(retryAnalyzer = Retry.class,description="Verify whether user is able to login using valid username and password",groups = {"regression"})
	public void verifyTheUserCanAbletoLoginwithValidusernameandValidPasswordWhileClickonSignInButton()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		boolean contentSectionIsDisplayed=loginpage.isContentSectionDisplayed();
		assertTrue(contentSectionIsDisplayed,"Unable to login with valid username and password");
	}
	
	@Test(retryAnalyzer = Retry.class,description="Verify whether user is not able to login using valid username and invalid password")
	public void verifyTheUserCannotLoginwithValidusernameandInvalidPasswordWhileClickonSignInButton()
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(2, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(2, 1, "LoginPage")).clickOnSignInButton();
		boolean invalidUsernameOrPasswordAlertMessageIsDisplayed=loginpage.isInvalidUsernameOrPasswordAlertMessageDisplayed();
		assertTrue(invalidUsernameOrPasswordAlertMessageIsDisplayed, "Able to login with valid username and invalid password");
	}
	
	@Test(dataProvider = "LoginProvider",retryAnalyzer = Retry.class,description="Verify whether user is not able to login using invalid username and valid password")
	public void verifyTheUserCannotLoginwithInvalidusernameandValidPasswordWhileClickonSignInButton(String username,String password)
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		boolean invalidUsernameOrPasswordAlertMessageIsDisplayed=loginpage.isInvalidUsernameOrPasswordAlertMessageDisplayed();
		assertTrue(invalidUsernameOrPasswordAlertMessageIsDisplayed, "Able to login with invalid username and valid password");
	}
	
	@Test(retryAnalyzer = Retry.class,description="Verify whether user is not able to login using invalid username and invalid password")
	@Parameters({"username","password"})
	public void verifyTheUserCannotLoginwithInvalidusernameandInvalidPasswordWhileClickonSignInButton(String username,String password)
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickOnSignInButton();
		boolean invalidUsernameOrPasswordAlertMessageIsDisplayed=loginpage.isInvalidUsernameOrPasswordAlertMessageDisplayed();
		assertTrue(invalidUsernameOrPasswordAlertMessageIsDisplayed, "Able to login with invalid username and invalid password");
	}
	
	@DataProvider(name = "LoginProvider")
	public Object[][] getDataFromTestData() {
		return new Object[][] { { ExcelUtility.getString(3, 0, "LoginPage"), ExcelUtility.getString(3, 1, "LoginPage") },

		};
}
}
