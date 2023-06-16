package com.obsqura.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ManageProductsPage;
import com.obsqura.utilities.ExcelUtility;

import retry.Retry;

public class ManageProductsTest extends Base {
	
	LoginPage loginpage;
	ManageProductsPage manageproductspage;
	
@Test(retryAnalyzer = Retry.class,dataProvider="ProductsTitleProvider",description="Verify search product functionality from manage products page")
public void verifySearchFunctionalityInManageProductsPage(String title)
{
	String expectedTitle=title;
	loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
	manageproductspage=new ManageProductsPage(driver);
	manageproductspage.clickOnManageProductLinkFromDashBoard().clickOnSearchButtonInManageProductPage().enterValueForTitleFieldInSearchProductPage(title).clickOnSearchButtonInSearchProductPage();
	String titleInSearchResultTable=(manageproductspage.getTitleFromSearchResultTableAfterClickingOnSearchButton()).substring(0,9);
	assertEquals(titleInSearchResultTable,expectedTitle,"Title from search result is not matching with given tile");
}

@Test(retryAnalyzer = Retry.class,description="Verify delete product functionality from manage products page")
@Parameters("title")
public void verifyDeleteFunctionalityInManageProductsPage(String title)
{
	loginpage=new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(ExcelUtility.getString(1, 0, "LoginPage")).enterPasswordOnPasswordField(ExcelUtility.getString(1, 1, "LoginPage")).clickOnSignInButton();
	manageproductspage=new ManageProductsPage(driver);
	manageproductspage.clickOnManageProductLinkFromDashBoard().clickOnSearchButtonInManageProductPage().enterValueForTitleFieldInSearchProductPage(title).clickOnSearchButtonInSearchProductPage().clickOnDeleteButtonInSearchProductPage().acceptProductDeleteAlertInSearchProductPage();
	boolean productDeleteSuccessAlertIsDisplayed=manageproductspage.isProductDeleteSuccessAlertDisplayed();
	assertTrue(productDeleteSuccessAlertIsDisplayed,"Error occured while deleting the given product");
}

@DataProvider(name = "ProductsTitleProvider")
public Object[][] getDataFromTestData() {
	
	return new Object[][] 
	    	{
	            { "Product 6" },
	            { "Home" }
	           
	        };

	};

}

