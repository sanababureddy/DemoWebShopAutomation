package com.org.main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;
	private By emailField = By.id("Email");
	private By passwordField = By.id("Password");
	private By loginButton = By.cssSelector("input.login-button");
	private By rememberMe = By.id("RememberMe");
	private By errorText = By.className("message-error");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterEmail(String email) {
		WebElement emailElement = driver.findElement(emailField);
		emailElement.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		WebElement passwordElement = driver.findElement(passwordField);
		passwordElement.sendKeys(password);
	}
	public void clickOnLogin() {
		WebElement loginElement = driver.findElement(loginButton);
		loginElement.click();
	}
	public void clickOnRememberMe() {
		WebElement rememberMeElement = driver.findElement(rememberMe);
		rememberMeElement.click();
	}
	public String getErrorText() {
		WebElement errorTextElement = driver.findElement(errorText);
		String errorText = errorTextElement.getText();
		return errorText;
	}
	

}
