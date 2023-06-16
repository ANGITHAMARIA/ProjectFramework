package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProductsPage {

	public WebDriver driver;
	public ManageProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']") WebElement manageProductLinkInDashBoard;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") WebElement searchButtonInManageProductPage;
	@FindBy(xpath = "//input[@name='un']") WebElement titleField;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']") WebElement searchButtonInSearchProductPage;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//child::td[1]") WebElement titleInSearchResultTable;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-danger btncss']") WebElement deleteButtonInSearchProductPage;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement productDeleteSuccessAlert;
	
	public ManageProductsPage clickOnManageProductLinkFromDashBoard()
	{
		manageProductLinkInDashBoard.click();
		return this;
	}
	public ManageProductsPage clickOnSearchButtonInManageProductPage()
	{
		searchButtonInManageProductPage.click();
		return this;
	}
	public ManageProductsPage enterValueForTitleFieldInSearchProductPage(String title)
	{
		titleField.sendKeys(title);
		return this;
	}
	public ManageProductsPage clickOnSearchButtonInSearchProductPage()
	{
		searchButtonInSearchProductPage.click();
		return this;
	}
	public String getTitleFromSearchResultTableAfterClickingOnSearchButton()
	{
		String title=titleInSearchResultTable.getText();
		return title;
	}
	public ManageProductsPage clickOnDeleteButtonInSearchProductPage()
	{
		deleteButtonInSearchProductPage.click();
		return this;
	}
	public ManageProductsPage acceptProductDeleteAlertInSearchProductPage()
	{
		driver.switchTo().alert().accept();
		return this;
	}
	public boolean isProductDeleteSuccessAlertDisplayed()
	{
		boolean productDeleteSuccessAlertIsDisplayed=productDeleteSuccessAlert.isDisplayed();
		return productDeleteSuccessAlertIsDisplayed;
	}	
}
