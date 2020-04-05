package com.autotest.baseclass;

import java.awt.Desktop.Action;
import java.security.cert.PKIXRevocationChecker.Option;
import java.sql.Driver;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserOpen(String broswerNam) {
		try {
			if (broswerNam.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\arun\\eclipse-workspace\\Cucumberpr\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (broswerNam.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\arun\\eclipse-workspace\\SeleniumPractice\\driver\\IEdriverserver.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invallid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void sendkeys(WebElement element, String str) {
		element.sendKeys(str);
	}

	public static void mouseClick(WebElement element) {
		element.click();
	}

	public static void naviback() {
		driver.navigate().back();
	}

	public static void naviforward() {
		driver.navigate().forward();
	}

	public static void navito(String url) {
		driver.navigate().to(url);
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void close() {
		driver.close();
	}

	public static void dropdownMethod(WebElement element, String value, String option) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("visibleText")) {
			s.deselectByVisibleText(value);
		} else if (option.equalsIgnoreCase("index")) {
			int i = Integer.parseInt(value);
			s.selectByIndex(i);
		}
	}

	public static void actionMethod(WebElement element, WebElement element1, String option) {
		Actions ac = new Actions(driver);
		if (option.equalsIgnoreCase("Element")) {
			ac.moveToElement(element).perform();
			ac.click(element1).perform();
		} else if (option.equalsIgnoreCase("context")) {
			ac.contextClick(element).perform();
		}
	}
}
