package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Tasks extends TestBase {
	@FindBy(xpath = "//div[contains(text(),'Add New')] ")
	WebElement addNewLabel;
	
	@FindBy(xpath="//div[text()='ShuhsanthRam1' and @class = 'title']")
	WebElement newCustomerTitle;
	

	@FindBy(xpath="//div[@class='item createNewCustomer']")
	WebElement newCustomerButton;
	
	public Tasks() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean tasksPageLabel() {
		return addNewLabel.isDisplayed();
	}
	
	public void selectTasks(String name) throws InterruptedException {
	
		driver.findElement(By.xpath("//div[contains(text(),'"+name+"')]/../../../../..//div[@class='img']")).click();
	}
	public boolean verifyNewCustomer() {
		System.out.println(newCustomerTitle.isDisplayed());
		return newCustomerTitle.isDisplayed();
		
	}
	public CreateNewCustomerPage addNewCustomer() {
		addNewLabel.click();
		newCustomerButton.click();
		return new CreateNewCustomerPage();
	
}
}
