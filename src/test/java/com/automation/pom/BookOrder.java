package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookOrder {
	public static WebDriver driver;

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;

	@FindBy(xpath = "//a[@title='T-shirts']")
	private WebElement tshirt;

	@FindBy(xpath = "//a[@class='product_img_link']")
	private WebElement img;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement cart;

	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement checkout;

	public BookOrder(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * public static WebDriver getDriver() { return driver; }
	 */
	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
}
