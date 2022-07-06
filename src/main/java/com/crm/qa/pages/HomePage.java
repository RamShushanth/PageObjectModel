package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@class='userProfileLink username ']")
	WebElement userNameLabel;

	@FindBy(id = "container_tasks")
	WebElement tasksLink;

	@FindBy(id = "container_reports")
	WebElement reportsLink;

	@FindBy(id = "container_users")
	WebElement usersLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}

	public Tasks clickOnTasksLink() {
		tasksLink.click();
		return new Tasks();

	}

	public ReportsPage clickOnReportsLink() {
		reportsLink.click();
		return new ReportsPage();

	}

	public UsersPage clickOnUsersLink() {
		usersLink.click();
		return new UsersPage();

	}

}
