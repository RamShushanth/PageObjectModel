package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CreateNewCustomerPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.Tasks;

public class createNewCustomerTest extends TestBase {
LoginPage loginPage;
Tasks tasksPage;
HomePage homePage;
CreateNewCustomerPage createNewCustomerPage;

	public createNewCustomerTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		intialization();
		loginPage = new LoginPage();
		tasksPage = new Tasks();
		createNewCustomerPage=new CreateNewCustomerPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		tasksPage = homePage.clickOnTasksLink();
		

	}
	
	@Test(priority=1)
	public void addCustomerTest() {
		createNewCustomerPage=tasksPage.addNewCustomer();
		createNewCustomerPage.addCustomer("ShuhsanthRam1", "Employee","Big Bang Company");
		Assert.assertTrue(tasksPage.verifyNewCustomer());
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
