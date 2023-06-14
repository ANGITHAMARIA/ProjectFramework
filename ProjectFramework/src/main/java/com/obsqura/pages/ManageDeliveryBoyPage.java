package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManageDeliveryBoyPage {

	public WebDriver driver;
	PageUtility pageutility=new PageUtility();
	public ManageDeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy'])[2]") WebElement ManageDeliveryBoyButtonInDashBoard;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement newButtonInManageDeliveryBoyPage;
	@FindBy(xpath = "//input[@id='name']") WebElement nameField;
	@FindBy(xpath = "//input[@id='email']") WebElement emailField;
	@FindBy(xpath = "//input[@id='phone']") WebElement phoneNumberField;
	@FindBy(xpath = "//textarea[@id='address']") WebElement addressField;
	@FindBy(xpath = "//input[@id='username']") WebElement userNameField;
	@FindBy(xpath = "//input[@id='password']") WebElement passwordField;
	@FindBy(xpath = "//button[@class='btn btn-danger']") WebElement saveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement addDeliveryBoySuccessAlert;
	
	public ManageDeliveryBoyPage clickOnManageDeliveryBoyButtonInDashboard()
	{
		ManageDeliveryBoyButtonInDashBoard.click();
		return this;
	}
	public ManageDeliveryBoyPage clickOnNewButtonInManageDeliveryBoyPage()
	{
		newButtonInManageDeliveryBoyPage.click();
		return this;
	}
	public ManageDeliveryBoyPage enterValueForNameFieldInAddDeliveryBoyPage(String name)
	{
		nameField.sendKeys(name);
		return this;
	}
	public ManageDeliveryBoyPage enterValueForEmailFieldInAddDeliveryBoyPage(String email)
	{
		emailField.sendKeys(email);
		return this;
	}
	public ManageDeliveryBoyPage enterValueForPhoneNumberFieldInAddDeliveryBoyPage(String phoneNumber)
	{
		phoneNumberField.sendKeys(phoneNumber);
		return this;
	}
	public ManageDeliveryBoyPage enterValueForAddressFieldInAddDeliveryBoyPage(String address)
	{
		addressField.sendKeys(address);
		return this;
	}
	public ManageDeliveryBoyPage enterValueForUserNameFieldInAddDeliveryBoyPage(String userName)
	{
		userNameField.sendKeys(userName);
		return this;
	}
	public ManageDeliveryBoyPage enterValueForPasswordFieldInAddDeliveryBoyPage(String password)
	{
		passwordField.sendKeys(password);
		return this;
	}
	public ManageDeliveryBoyPage clickOnSaveButtonInAddDeliveryBoyPage()
	{
		pageutility.scrollToElement(driver, saveButton);
		pageutility.toClickButton(driver, saveButton);
		return this;
	}
	public boolean isAddDeliveryBoySuccessAlertDisplayed()
	{
		boolean addDeliveryBoySuccessAlertIsDisplayed=addDeliveryBoySuccessAlert.isDisplayed();
		return addDeliveryBoySuccessAlertIsDisplayed;
	}
	
}
