package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageOfferCodePage;
import com.obsqura.utilities.ExcelUtility;


import retry.Retry;

public class ManageOfferCodeTest extends Base {
	
	LoginPage loginpage;
	ManageOfferCodePage manageoffercodepage;
	
	@Test(retryAnalyzer = Retry.class,description="Verify add new offercode functionality from manage offercode page")
	public void verifyAddNewOfferCodeFunctionalityInManageOfferCodePage()
	{
	loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
	manageoffercodepage=new ManageOfferCodePage(driver);
	manageoffercodepage.clickOnManageOfferCodeLinkFromDashBoard().clickOnAddNewOfferCodeButtonInManageOfferCodePage().enterValueForOfferCodeInAddOfferCodePage(ExcelUtility.getString(1, 0, "AddOffercode")).selectFirstOrderUserField().enterValueForPercentageFieldInAddOfferCodePage(ExcelUtility.getNumeric(1, 1, "AddOffercode")).enterValueForAmountFieldInAddOfferCodePage(ExcelUtility.getNumeric(1, 2, "AddOffercode")).enterValueForDescriptionTextBoxInAddOfferCodePage(ExcelUtility.getString(1, 3, "AddOffercode")).scrollToSaveButtonInAddOffersPage();
	boolean offerCodeAddedSuccessAlertDisplayed=manageoffercodepage.isNewOfferCodeCreatedSuccessAlertDisplayed();
	assertTrue(offerCodeAddedSuccessAlertDisplayed, "Error occured while adding new offer code");
	}
	
	@Test(retryAnalyzer = Retry.class,description="Verify search offercode functionality from manage offercode page")
	public void verifySearchFunctionalityInManageOfferCodePageByEnteringAnOfferCode()
	{
		String ExpectedOfferCode=ExcelUtility.getString(1, 0, "SearchOfferCode");
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		manageoffercodepage=new ManageOfferCodePage(driver);
		manageoffercodepage.clickOnManageOfferCodeLinkFromDashBoard().clickOnSearchButtonInManageOfferCodePage().enterValueForOfferCodeInSearchOfferCodePage(ExcelUtility.getString(1, 0, "SearchOfferCode")).clickOnSearchButtonInSearchOfferCodePage();
		String offerCodeInSearchResult=(manageoffercodepage.verifyTheOfferCodeInSearchResultWithEnteredValue()).substring(0,4);
		assertEquals(ExpectedOfferCode, offerCodeInSearchResult, " OfferCode searched and result returned are different");	
	}
	
	@Test(retryAnalyzer = Retry.class,description="Verify edit offercode functionality from manage offercode page after searching for an offercode")
	public void verifyEditFunctionalityAfterSearchingForAnOfferCodeInManageOfferPage()
	{
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		manageoffercodepage=new ManageOfferCodePage(driver);
		manageoffercodepage.clickOnManageOfferCodeLinkFromDashBoard().clickOnSearchButtonInManageOfferCodePage().enterValueForOfferCodeInSearchOfferCodePage(ExcelUtility.getString(1, 0, "EditOfferCode")).clickOnSearchButtonInSearchOfferCodePage().clickOnEditButtonInManageOffersPage().enterValueForAmountFieldInEditOfferCodePage(ExcelUtility.getNumeric(1, 2, "EditOfferCode")).enterValueForDescriptionTextBoxInEditOfferCodePage(ExcelUtility.getString(1, 1, "EditOfferCode")).scrollToUpdateButtonAndClickOnUpdateButtonInEditOffersPage();
		boolean updateOfferCodeSuccessAlertDisplayed=manageoffercodepage.isUpdateOfferCodeSuccessAlertDisplayed();
		assertTrue(updateOfferCodeSuccessAlertDisplayed, "Error occured while updating description and amount for the given offercode");
	}
	
	@Test(retryAnalyzer = Retry.class,description="Verify delete offercode functionality from manage offercode page after searching for an offercode")
	public void verifyDeleteFunctionalityAfterSearchingForAnOfferCodeInManageOfferPage()
	{
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		manageoffercodepage=new ManageOfferCodePage(driver);
		manageoffercodepage.clickOnManageOfferCodeLinkFromDashBoard().clickOnSearchButtonInManageOfferCodePage().enterValueForOfferCodeInSearchOfferCodePage(ExcelUtility.getString(1, 0, "DeleteOfferCode")).clickOnSearchButtonInSearchOfferCodePage().clickOnDeleteButtonInManageOfferCodesPage().acceptDeleteAlertInManageOfferCodesPage();
		boolean deleteOfferCodeSuccessAlertIsDisplayed=manageoffercodepage.isDeleteOfferCodeSuccessAlertDisplayed();
		assertTrue(deleteOfferCodeSuccessAlertIsDisplayed, "Error occured while deleteing the given offer code");
	}
	
	
}
