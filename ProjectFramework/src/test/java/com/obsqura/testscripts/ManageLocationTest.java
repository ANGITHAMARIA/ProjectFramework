package com.obsqura.testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageLocationpage;
import com.obsqura.utilities.ExcelUtility;

public class ManageLocationTest extends Base {

	LoginPage loginpage;
	ManageLocationpage managelocationpage;
	
	@Test(description="Verify add location functionality from manage loaction page")
	public void verifyAddLocationFunctionalityByClickingNewButtonInManageLocationPage()
	{
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		managelocationpage=new ManageLocationpage(driver);
		managelocationpage.clickOnManageLocationButtonInDashboard().clickOnNewButtonInManageLocationPage().selectValueForCountryDropDownInAddLocationPage(ExcelUtility.getString(1, 0, "AddLocation")).selectValueForStateDropDownFieldInAddLocationPage(ExcelUtility.getNumeric(1, 1, "AddLocation")).enterValueForLocationFieldInAddLocationPage(ExcelUtility.getString(1, 2, "AddLocation")).enterValueForDeliveryChargeFieldInAddLocationPage(ExcelUtility.getNumeric(1, 3, "AddLocation")).clickOnAddButtonInAddLocationPage();
		boolean addLocationSuccessAlertIsDisplayed=managelocationpage.isAddLocationSuccessAlertDisplayed();
		assertTrue(addLocationSuccessAlertIsDisplayed, "Error occured while adding new location from manage location page");
	}
}

