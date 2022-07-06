package com.crm.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.Tasks;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	Tasks tasksPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		intialization();
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homePageTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "actiTIME - Enter Time-Track");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		Assert.assertTrue(homePage.verifyCorrectUserName());
		
	}
	@Test(priority=3)
	public void verifyTasksLink() {
		tasksPage=homePage.clickOnTasksLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
