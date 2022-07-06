package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.Tasks;

public class TasksPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	Tasks tasksPage;

	public TasksPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		intialization();
		loginPage = new LoginPage();
		tasksPage = new Tasks();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		tasksPage = homePage.clickOnTasksLink();

	}

	@Test(priority = 1)
	public void verifyTasksPageLabel() {
		Assert.assertTrue(tasksPage.tasksPageLabel());
	}

	@Test(priority = 2)
	public void selectSingleTasksCheckBox() throws InterruptedException {
		tasksPage.selectTasks("Calls");
	}
	
	@Test(priority = 3)
	public void selectMultiTasksCheckBox() throws InterruptedException {
		tasksPage.selectTasks("Calls");
		tasksPage.selectTasks("Invoicing");
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
