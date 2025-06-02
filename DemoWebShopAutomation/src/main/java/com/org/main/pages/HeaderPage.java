package com.org.main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {
	private WebDriver driver;
	private By registerLink = By.className("ico-register");
	private By loginLink = By.className("ico-login");
	private By shoppingCartLink = By.cssSelector("a.ico-cart span.cart-label");
	private By cartQuantity = By.className("cart-qty");
	private By wishListLink = By.cssSelector(".ico-wishlist span.cart-label");
	private By wishListQuantity = By.className("wishlist-qty");
	private By accountIDLink = By.className("account");
	private By logOutLink = By.className("ico-logout");
	
	public HeaderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnLoginLink() {
		WebElement loginLinkElement = driver.findElement(loginLink);
		loginLinkElement.click();
	}
	public void clickOnRegisterLink() {
		WebElement registerLinkElement = driver.findElement(registerLink);
		registerLinkElement.click();
	}
	public void clickOnLogOutLink() {
		WebElement logOutLinkElement = driver.findElement(logOutLink);
		logOutLinkElement.click();
	}
	public String getAccountIdText() {
		WebElement accountIdLinkElement = driver.findElement(accountIDLink);
		String accountId = accountIdLinkElement.getText();
		return accountId;
	}
	public void clickonAccountIdLink() {
		WebElement accountIdLinkElement = driver.findElement(accountIDLink);
		accountIdLinkElement.click();
	}

}
