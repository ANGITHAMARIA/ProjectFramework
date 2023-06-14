package com.obsqura.testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageDeliveryBoyPage;
import com.obsqura.utilities.ExcelUtility;
import com.obsqura.utilities.RandomDataUtility;

public class ManageDeliveryBoyTest extends Base{
	LoginPage loginpage;
	ManageDeliveryBoyPage managedeliveryboypage;

	@Test(description="Verify add new delivery boy functionality from manage delivery boy page")
	public void verifyAddNewDeliveryBoyFunctionalityFromMangeDeliveryBoyPage()
	{
		loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
		managedeliveryboypage=new ManageDeliveryBoyPage(driver);
		RandomDataUtility randomdatautility=new RandomDataUtility();
		managedeliveryboypage.clickOnManageDeliveryBoyButtonInDashboard().clickOnNewButtonInManageDeliveryBoyPage().enterValueForNameFieldInAddDeliveryBoyPage(randomdatautility.togetFullname()).enterValueForEmailFieldInAddDeliveryBoyPage(randomdatautility.togetemail()).enterValueForPhoneNumberFieldInAddDeliveryBoyPage(randomdatautility.togetPhoneNo()).enterValueForAddressFieldInAddDeliveryBoyPage(randomdatautility.togetstreetAddress()).enterValueForUserNameFieldInAddDeliveryBoyPage(randomdatautility.togetFirstname()).enterValueForPasswordFieldInAddDeliveryBoyPage(randomdatautility.togetpass()).clickOnSaveButtonInAddDeliveryBoyPage();
		boolean addDeliveryBoySuccessAlertIsDisplayed=managedeliveryboypage.isAddDeliveryBoySuccessAlertDisplayed();
		assertTrue(addDeliveryBoySuccessAlertIsDisplayed,"Error occured while adding new delivery boy from manage delivery boy page");
	}
	
}