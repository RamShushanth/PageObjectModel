package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class CreateNewCustomerPage extends TestBase {

	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField' and @placeholder = 'Enter Customer Name']")
	WebElement enterCustomerName;
	
	@FindBy(xpath="//textarea[@placeholder = 'Enter Customer Description']")
	WebElement enterCustomerDescription;
	
	@FindBy(xpath="//div[contains(text(),'                Copy Projects from an Existing Customer:            ')]/..//div[contains(text(),'- Select Customer -') and @class='emptySelection']")
	WebElement selectCustomer;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	WebElement createCustomer;
	
	@FindBy(xpath="//div[contains(text(),'                Copy Projects from an Existing Customer:            ')]/..//input[@type='text']\"")
	WebElement enterCustomer;
	
	
	
	public CreateNewCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public Tasks addCustomer(String cn,String cd,String companyName) {
		enterCustomerName.sendKeys(cn);
		enterCustomerDescription.sendKeys(cd);
		
		//selectCustomer.click();
		//selectCustomer.sendKeys(companyName);
		
		//TestUtil testUtil=new TestUtil();
		//testUtil.explicitTimeOut(enterCustomer);
		//enterCustomer.sendKeys(companyName);
		
		createCustomer.click();
		return new Tasks();
		
		
		
	}
	
}
