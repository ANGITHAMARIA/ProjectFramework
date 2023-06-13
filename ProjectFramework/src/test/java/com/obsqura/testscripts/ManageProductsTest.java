package com.obsqura.testscripts;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageProductsPage;
import com.obsqura.utilities.ExcelUtility;

public class ManageProductsTest extends Base {
	
@Test
public void addNewProductViaManageProductPage()
{
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
	ManageProductsPage manageproductpage=new ManageProductsPage(driver);
	manageproductpage.clickOnManageProductLinkFromDashBoard();
	manageproductpage.clickOnAddNewProductButtonInManageProductPage();
	manageproductpage.enterValueForTitleInTitleTextBoxInAddProductPage(ExcelUtility.getString(0, 0, "ManageProductsPage"));
	
}
}
