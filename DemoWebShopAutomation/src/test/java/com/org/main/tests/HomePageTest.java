package com.org.main.tests;

import org.testng.annotations.Test;

import com.org.main.base.BaseTest;

public class HomePageTest extends BaseTest{
	@Test
	public void verifyHomePageLoads() {
		String expectedTitle = "Demo Web Shop";
		String actualTitle = driver.getTitle();
		assert actualTitle.contains(expectedTitle) : "Title mismatch!";
	}
}
