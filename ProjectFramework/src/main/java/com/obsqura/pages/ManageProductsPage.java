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
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']") WebElement manageProductLink;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement addNewProductButton;
	@FindBy(xpath="//input[@id='title']") WebElement titleTextBoxInAddProductPage;
	public void clickOnManageProductLinkFromDashBoard()
	{
		manageProductLink.click();
	}
	
	public void clickOnAddNewProductButtonInManageProductPage()
	{
		addNewProductButton.click();
	}
	
	public void enterValueForTitleInTitleTextBoxInAddProductPage(String title)
	{
		titleTextBoxInAddProductPage.sendKeys(title);
	}
	
	
}
