package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	public static WebDriver driver;

	@FindBy(xpath = "(//a[contains(@title,'Proceed to checkout')])[2]")
	private WebElement prod;

	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement addchk;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement chkbox;

	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement nxtpg;

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement pmtpg;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement finpg;

	public PlaceOrder(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getProd() {
		return prod;
	}

	public WebElement getAddchk() {
		return addchk;
	}

	public WebElement getNxtpg() {
		return nxtpg;
	}

	public WebElement getChkbox() {
		return chkbox;
	}

	public WebElement getPmtpg() {
		return pmtpg;
	}

	public WebElement getFinpg() {
		return finpg;
	}

}
