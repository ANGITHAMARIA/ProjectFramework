package com.obsqura.testscripts;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageProductsPage;
import com.obsqura.utilities.ExcelUtility;

public class ManageProductsTest extends Base {
	
@Test
public void verifyAddNewProductFunctionalityAfterClickingAddButtonInManageProductPage()
{
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
	ManageProductsPage manageproductpage=new ManageProductsPage(driver);
	manageproductpage.clickOnManageProductLinkFromDashBoard();
	manageproductpage.clickOnAddNewProductButtonInManageProductPage();
	manageproductpage.enterValueForTitleInTitleTextBoxInAddProductPage(ExcelUtility.getString(1, 0, "ManageProductsPage"));
	manageproductpage.selectProductTypeOptionInAddProductsPage();
	manageproductpage.enterValueForTagFieldInAddProductsPage(ExcelUtility.getString(1, 1, "ManageProductsPage"));
	manageproductpage.selectGroupValueInAddProductsPage();
	manageproductpage.selectPriceTypeInAddProductsPage();
	//manageproductpage.enterValueForWeightValueFieldInAddProductsPage(ExcelUtility.getNumeric(1, 2, "C:\\Users\\angit\\git\\ProjectFramework\\ProjectFramework\\src\\main\\resources\\TestData.xlsx", "ManageProductsPage"));
	manageproductpage.selectWeightUnitValueInAddProductsPage();
	//manageproductpage.enterValueForMaximumQuantityCanOrderFieldInAddProductsPage(ExcelUtility.getString(1, 3, "ManageProductsPage"));
	//manageproductpage.enterValueForPriceFieldInAddProductsPage(ExcelUtility.getString(1, 4, "ManageProductsPage"));
	//manageproductpage.enterValueForMRPInAddProductsPage(ExcelUtility.getString(1, 5, "ManageProductsPage"));
	//manageproductpage.enterValueForStockAvailabilityFieldInAddProductsPage(ExcelUtility.getString(1, 6, "ManageProductsPage"));
	//manageproductpage.enterValueForPurchasePriceInAddProductsPage(ExcelUtility.getString(1, 7, "ManageProductsPage"));
	manageproductpage.enterTextForDescriptionFieldInAddProductsPage(ExcelUtility.getString(1, 8, "ManageProductsPage"));
	manageproductpage.uploadImageForImageFieldInAddProductsPage(ExcelUtility.getString(1, 9, "ManageProductsPage"));
	manageproductpage.selectValueForFeaturedFieldInAddProductsPage();
	manageproductpage.selectValueForComboFieldInAddProductsPage();
	manageproductpage.saveTheSelectedValuesForNewProdcutInAddProductsPage();
}

}
