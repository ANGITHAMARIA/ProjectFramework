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
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement invalidusernameorpasswordalertmsg;
	
	public LoginPage enterUsernameOnUsernameField(String userName)
	{
		usernameField.sendKeys(userName);
		return this;
	}
	public LoginPage enterPasswordOnPasswordField(String password)
	{
		passwordField.sendKeys(password);
		return this;
	}
	public LoginPage clickOnSignInButton()
	{
		signInButton.click();
		return this;
	}
	public boolean isContentSectionDisplayed()
	{
		boolean contentSectionIsDisplayed=contentsSection.isDisplayed();
		return contentSectionIsDisplayed;
	}
	
	public boolean isInvalidUsernameOrPasswordAlertMessageDisplayed()
	{
		boolean invalidUsernameOrPasswordAlertMessageIsDisplayed=invalidusernameorpasswordalertmsg.isDisplayed();
		return invalidUsernameOrPasswordAlertMessageIsDisplayed;
	}
	
	
	
}


