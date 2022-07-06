package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//PageFactory - ObjectRepository
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(id="loginButton")
	WebElement login;
	
	@FindBy(xpath="//div[@class='atLogoImg']")
	WebElement actiTimeLogo;
	
	//Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean validateActiTimeLogo() {
		return actiTimeLogo.isDisplayed();
	}
	public HomePage login(String un,String pwd) throws InterruptedException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		Thread.sleep(1000);
		
		
		return new HomePage();
		
	}

}
