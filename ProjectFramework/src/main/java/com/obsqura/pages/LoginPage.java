package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']") WebElement usernameField;
	@FindBy(xpath="//input[@name='password']") WebElement passwordField;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']") WebElement signInButton;
	@FindBy(xpath="//section[@class='content']") WebElement contentsSection;
	
	public void enterUsernameOnUsernameField(String userName)
	{
		usernameField.sendKeys(userName);
	}
	public void enterPasswordOnPasswordField(String password)
	{
		passwordField.sendKeys(password);
	}
	public void clickOnSignInButton()
	{
		signInButton.click();
	}
	public boolean isContentSectionDisplayed()
	{
		boolean contentSectionIsDisplayed=contentsSection.isDisplayed();
		return contentSectionIsDisplayed;
	}
	
}


