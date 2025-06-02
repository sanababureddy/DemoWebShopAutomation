package com.org.main.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.main.base.BaseTest;
import com.org.main.pages.HeaderPage;
import com.org.main.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	HeaderPage headerPage;
	LoginPage loginPage;
	
	@BeforeMethod
	public void setupPageObjects() {
		headerPage = new HeaderPage(driver);
		loginPage = new LoginPage(driver);
	}
	
	@Test
	public void TC001() {
		String userEmail = "testuser1234567@example.com";
		headerPage.clickOnLoginLink();
		loginPage.enterEmail(userEmail);
		loginPage.enterPassword("Test@123");
		loginPage.clickOnLogin();
		String actualEmail = headerPage.getAccountIdText();
		assert actualEmail.contains(userEmail) : "Email mismatch!";
		headerPage.clickOnLogOutLink();
		
		
		
		
	}
	

}
