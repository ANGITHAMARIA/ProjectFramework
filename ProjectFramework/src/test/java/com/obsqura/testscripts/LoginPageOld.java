package com.obsqura.ProjectFramework;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage extends Base{

	@Test
	public void toLoginTo7rmartSupermarket()
	{
		String username="admin";
		String password="admin";
		WebElement usernameTxtBox=driver.findElement(By.xpath("//input[@name='username']"));
		usernameTxtBox.sendKeys(username);
		WebElement passwordTxtBox=driver.findElement(By.xpath("//input[@name='password']"));
		passwordTxtBox.sendKeys(password);
		WebElement signinButton=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
		signinButton.click();
//		WebElement title=driver.findElement(By.xpath("//span[@class='brand-text font-weight-light']"));
//		boolean isTitleDisplayed=title.isDisplayed();
//		assertTrue(isTitleDisplayed,"Login not successful");
	}
}
