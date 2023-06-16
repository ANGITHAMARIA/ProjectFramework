package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;



public class ManageLocationpage {

	public WebDriver driver;
	PageUtility pageutility=new PageUtility();
	public ManageLocationpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-location'])[2]") WebElement manageLocationButtonInDashboard;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement newButtonInManageLocationPage;
	@FindBy(xpath = "//select[@id='country_id']") WebElement countryDropDownField;
	@FindBy(xpath = "//select[@id='st_id']") WebElement stateDropDownField;
	@FindBy(xpath = "//input[@id='location']") WebElement locationField;
	@FindBy(xpath = "//input[@id='delivery']") WebElement deliveryChargeField;
	@FindBy(xpath = "//button[@class='btn btn-danger']") WebElement saveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement addLocationSuccessAlert;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") WebElement searchButtonInManageLocationsPage;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix align-center']") WebElement searchButtonInSearchLocationPage;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//child::td[1]") WebElement locationNameFromSearchResultTable;
	
	
	public ManageLocationpage clickOnManageLocationButtonInDashboard()
	{
		manageLocationButtonInDashboard.click();
		return this;
	}
	public ManageLocationpage clickOnNewButtonInManageLocationPage()
	{
		newButtonInManageLocationPage.click();
		return this;
	}
	public ManageLocationpage selectValueForCountryDropDownInAddLocationPage(String country)
	{
		pageutility.selectDropdownbyText(countryDropDownField,country);
		return this;
	}
	public ManageLocationpage selectValueForStateDropDownFieldInAddLocationPage(String value)
	{
		pageutility.selectDropdownbyValue(stateDropDownField, value);
		return this;
	}
	public ManageLocationpage enterValueForLocationFieldInAddLocationPage(String location)
	{
		locationField.sendKeys(location);
		return this;
	}
	public ManageLocationpage enterValueForDeliveryChargeFieldInAddLocationPage(String deliveryCharge)
	{
		deliveryChargeField.sendKeys(deliveryCharge);
		return this;
	}
	public ManageLocationpage clickOnAddButtonInAddLocationPage()
	{
		saveButton.click();
		return this;
	}
	public boolean isAddLocationSuccessAlertDisplayed()
	{
		boolean addLocationSuccessAlertIsDisplayed=addLocationSuccessAlert.isDisplayed();
		return addLocationSuccessAlertIsDisplayed;
	}
	public ManageLocationpage clickOnSearchButtonInManageLocationsPage()
	{
		searchButtonInManageLocationsPage.click();
		return this;
	}
	public ManageLocationpage clickOnSearchButtonInSearchLocationsPage()
	{
		searchButtonInSearchLocationPage.click();
		return this;
	}
	public String getLocationNameFromSearchResultTable()
	{
		String locationName=locationNameFromSearchResultTable.getText();
		return locationName;
	}	
}
