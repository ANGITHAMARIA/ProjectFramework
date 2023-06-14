package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class ManageProductsPage {

	public WebDriver driver;
	public ManageProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']") WebElement manageProductLinkInDashBoard;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement addNewProductButton;
	@FindBy(xpath = "//input[@id='title']") WebElement titleTextBoxInAddProductPage;
	@FindBy(xpath = "//input[@value='Nonveg']") WebElement productTypeNonVegButton;
	@FindBy(xpath = "//input[@id='tag']") WebElement tagField;
	@FindBy(xpath = "//select[@id='cat_id']") WebElement categoryField;
	@FindBy(xpath = "//select[@id='sub_id']") WebElement subCategoryField;
	@FindBy(xpath = "//select[@id='grp_id']") WebElement groupField;
	@FindBy(xpath = "//input[@id='purpose']") WebElement priceTypeWeightButton;
	@FindBy(xpath = "//input[@id='m_weight']") WebElement weightValueField;
	@FindBy(xpath = "//select[@id='w_unit']") WebElement weightUnitField;
	@FindBy(xpath = "//input[@id='max_weight']") WebElement maximumQuantityCanOrderField;
	@FindBy(xpath = "//input[@id='w_price']") WebElement priceField;
	@FindBy(xpath = "//input[@id='w_mrp']") WebElement mrpField;
	@FindBy(xpath = "//input[@id='w_stock']") WebElement stockAvailabilityField;
	@FindBy(xpath = "//input[@id='w_pp']") WebElement purchasePriceField;
	@FindBy(xpath = "//div[@class='note-editable card-block']") WebElement descriptionField;
	@FindBy(xpath = "//input[@name=\"stock\" and @value='yes']") WebElement stockField;
	@FindBy(xpath = "//input[@id='main_img']") WebElement chooseImageButton;
	@FindBy(xpath = "//input[@name='featured' and @value='yes']") WebElement featuredSelectionButton;
	@FindBy(xpath = "//input[@name='combo' and @value='yes']") WebElement comboPackSelectionButton;
	@FindBy(xpath = "//button[@class='btn btn-danger']") WebElement saveButton;
	
	public void clickOnManageProductLinkFromDashBoard()
	{
		manageProductLinkInDashBoard.click();
	}
	public void clickOnAddNewProductButtonInManageProductPage()
	{
		addNewProductButton.click();
	}
	public void enterValueForTitleInTitleTextBoxInAddProductPage(String title)
	{
		titleTextBoxInAddProductPage.sendKeys(title);
	}
	public void selectProductTypeOptionInAddProductsPage()
	{
		productTypeNonVegButton.click();
	}
	public void enterValueForTagFieldInAddProductsPage(String tag)
	{
		tagField.sendKeys(tag);
	}
	public void selectGroupValueInAddProductsPage()
	{
		Select select=new Select(groupField);
		select.selectByVisibleText("discount");
	}
	public void selectPriceTypeInAddProductsPage()
	{
		priceTypeWeightButton.click();
	}
	public void enterValueForWeightValueFieldInAddProductsPage(String weightValue)
	{
		weightValueField.sendKeys(weightValue);
	}
	public void selectWeightUnitValueInAddProductsPage()
	{
		Select select=new Select(weightUnitField);
		select.selectByValue("kg");
	}
	public void enterValueForMaximumQuantityCanOrderFieldInAddProductsPage(String maximumQuantity)
	{
		maximumQuantityCanOrderField.sendKeys(maximumQuantity);
	}
	public void enterValueForPriceFieldInAddProductsPage(String price)
	{
		priceField.sendKeys(price);
	}
	public void enterValueForMRPInAddProductsPage(String mrp)
	{
		mrpField.sendKeys(mrp);
	}
	public void enterValueForStockAvailabilityFieldInAddProductsPage(String stockAvailability)
	{
		stockAvailabilityField.sendKeys(stockAvailability);
	}
	public void enterValueForPurchasePriceInAddProductsPage(String purchasePrice)
	{
		purchasePriceField.sendKeys(purchasePrice);
	}
	public void enterTextForDescriptionFieldInAddProductsPage(String description)
	{
		descriptionField.sendKeys(description);
	}
	public void uploadImageForImageFieldInAddProductsPage(String imageLocation)
	{
		chooseImageButton.sendKeys(imageLocation);
	}
	public void selectValueForFeaturedFieldInAddProductsPage()
	{
		featuredSelectionButton.click();
	}
	public void selectValueForComboFieldInAddProductsPage()
	{
		comboPackSelectionButton.click();
	}
	public void saveTheSelectedValuesForNewProdcutInAddProductsPage()
	{
		saveButton.click();
	}
}
