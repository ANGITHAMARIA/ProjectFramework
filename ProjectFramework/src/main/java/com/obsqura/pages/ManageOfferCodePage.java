package com.obsqura.pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageOfferCodePage {

	public WebDriver driver;
	public ManageOfferCodePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-offercode\"]") WebElement manageOfferCodeButtonInDashBoard;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement addNewOfferCodeButton;
	@FindBy(xpath = "//input[@id='offer_code']") WebElement offerCode;
	@FindBy(xpath = "//input[@name='type' and @value='yes']") WebElement firstOrderUserSelectionButton;
	@FindBy(xpath = "//input[@id='offer_per']") WebElement percentageField;
	@FindBy(xpath = "//input[@id='offer_price']") WebElement amountField;
	@FindBy(xpath = "//div[@class='note-editable card-block']") WebElement descriptionTextBox;
	@FindBy(xpath = "//input[@id='main_img']") WebElement chooseImageButton;
	@FindBy(xpath = "//button[@class='btn btn-danger']") public WebElement saveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement newOfferCodeCreatedSuccessAlert;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") WebElement searchButtonInManageOfferCodePage;
	@FindBy(xpath = "//input[@name='un']") WebElement offerCodeInSearchOfferCodePage;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']") WebElement searchButtonInSearchOfferCodePage;
	@FindAll({@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//child::td")}) List<WebElement> searchResultElements;
	@FindBy(xpath = "//div[@id='imagePreview']") WebElement imagePreview;	
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-primary btncss']") WebElement editButtonInManageOffersPage;
	@FindBy(xpath = "//button[@class='btn btn-danger']") WebElement updateButtoninEditOfferCodePage;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement updateOfferCodeSuccessAlert;
	
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-danger btncss']") WebElement deleteButtonInManageOfferCodesPage;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement deleteOfferCodeSuccessAlert;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement offerCodeAlreadyExistAlert;
	
	public ManageOfferCodePage clickOnManageOfferCodeLinkFromDashBoard()
	{
		manageOfferCodeButtonInDashBoard.click();
		return this;
	}
	public ManageOfferCodePage clickOnAddNewOfferCodeButtonInManageOfferCodePage()
	{
		addNewOfferCodeButton.click();
		return this;
	} 
	public ManageOfferCodePage enterValueForOfferCodeInAddOfferCodePage(String offercode)
	{
		offerCode.sendKeys(offercode);
		return this;
	}
	public ManageOfferCodePage selectFirstOrderUserField()
	{
		firstOrderUserSelectionButton.click();
		return this;
	}
	public ManageOfferCodePage enterValueForPercentageFieldInAddOfferCodePage(String percentage)
	{
		percentageField.sendKeys(percentage);
		return this;
	}
	public ManageOfferCodePage enterValueForAmountFieldInAddOfferCodePage(String amount)
	{
		amountField.sendKeys(amount);
		return this;
	}
	public ManageOfferCodePage enterValueForAmountFieldInEditOfferCodePage(String amount)
	{
		amountField.clear();
		amountField.sendKeys(amount);
		return this;
	}
	public ManageOfferCodePage enterValueForDescriptionTextBoxInAddOfferCodePage(String description)
	{
		descriptionTextBox.sendKeys(description);
		return this;
	}
	public ManageOfferCodePage enterValueForDescriptionTextBoxInEditOfferCodePage(String description)
	{
		descriptionTextBox.clear();
		descriptionTextBox.sendKeys(description);
		return this;
	}
	public ManageOfferCodePage selectImageInAddOfferCodePage(String location)
	{
		chooseImageButton.sendKeys(location);
		return this;
	}
	public boolean isNewOfferCodeCreatedSuccessAlertDisplayed()
	{
		boolean newOfferCodeSuccessAlertDisplayed=newOfferCodeCreatedSuccessAlert.isDisplayed();
		return newOfferCodeSuccessAlertDisplayed;
	}
	public ManageOfferCodePage clickOnSearchButtonInManageOfferCodePage()
	{
		searchButtonInManageOfferCodePage.click();
		return this;
	}
	public ManageOfferCodePage enterValueForOfferCodeInSearchOfferCodePage(String offerCode)
	{
		offerCodeInSearchOfferCodePage.sendKeys(offerCode);
		return this;
	}
	public ManageOfferCodePage clickOnSearchButtonInSearchOfferCodePage()
	{
		searchButtonInSearchOfferCodePage.click();
		return this;
	}
	public String verifyTheOfferCodeInSearchResultWithEnteredValue()
	{
		List <String> rowValuesList=new ArrayList<String>();
		for(WebElement offercode:searchResultElements)
		{
			String rowValue=offercode.getText();
			rowValuesList.add(rowValue);
		}
		return rowValuesList.get(0);
	}
	public ManageOfferCodePage clickOnEditButtonInManageOffersPage()
	{
		editButtonInManageOffersPage.click();
		return this;
	}
	public ManageOfferCodePage scrollToUpdateButtonAndClickOnUpdateButtonInEditOffersPage()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", updateButtoninEditOfferCodePage);
		js.executeScript("arguments[0].click();", updateButtoninEditOfferCodePage);
		return this;
	}
	public boolean isUpdateOfferCodeSuccessAlertDisplayed()
	{
		boolean updateOfferCodeSuccessAlertDisplayed=updateOfferCodeSuccessAlert.isDisplayed();
		return updateOfferCodeSuccessAlertDisplayed;
	}
	public ManageOfferCodePage scrollToSaveButtonInAddOffersPage()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", saveButton);
		js.executeScript("arguments[0].click();", saveButton);
		return this;
	}
	public ManageOfferCodePage clickOnDeleteButtonInManageOfferCodesPage()
	{
		deleteButtonInManageOfferCodesPage.click();
		return this;
	}
	public ManageOfferCodePage acceptDeleteAlertInManageOfferCodesPage()
	{
		driver.switchTo().alert().accept();
		return this;
	}
	public boolean isDeleteOfferCodeSuccessAlertDisplayed() 
	{
		boolean deleteOfferCodeSuccessAlertIsDisplayed= deleteOfferCodeSuccessAlert.isDisplayed();
		return deleteOfferCodeSuccessAlertIsDisplayed;
	}
	
	
}
