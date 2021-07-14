package com.linkedin.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.linkedin.qa.base.Testbase;
import com.linkedin.qa.pages.LoginPage;

public class LoginPageTest extends Testbase {
	
LoginPage loginPage;
	
	public LoginPageTest() throws IOException{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
		
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "LinkedIn Login, Sign in | LinkedIn");
	}
	
	@Test(priority = 2)
	public void loginTest() {
		loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
